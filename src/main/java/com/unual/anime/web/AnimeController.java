package com.unual.anime.web;

import com.unual.anime.dto.Result;
import com.unual.anime.entity.Anime;
import com.unual.anime.entity.AnimeVideo;
import com.unual.anime.entity.Money;
import com.unual.anime.service.AnimeService;
import com.unual.anime.service.AnimeVideoService;
import com.unual.anime.service.TestService;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.unual.anime.utils.ConvertUtils.*;

@Controller
@RequestMapping("/")
public class AnimeController {

    @Autowired
    private TestService testService;

    @Autowired
    private AnimeService animeService;

    @Autowired
    AnimeVideoService animeVideoService;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private Anime getAnimeById(@PathVariable("id") int id) {
        Anime anime = animeService.getAnimeById(id);
        return anime;
    }

    @ResponseBody
    @RequestMapping(value = "tv/{id}", method = RequestMethod.GET)
    private Anime getAnimeTVById(@PathVariable("id") int id) {
        Anime anime = animeService.getTVById(id);
        return anime;
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private List<Anime> getAnimeList(@RequestParam Map<String, String> params) {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            System.out.println("entry:" + entry.getKey() + "-" + entry.getValue());
        }
        int page = toIntUnsigned(PAGE, params.get("page"));
        int limit = toIntUnsigned(LIMIT, params.get("limit"));
        String filter = toQueryString(params.get("filter"));
        List<Anime> animeList = animeService.getAnimeList(filter, page, limit);
        return new ArrayList(animeList);
    }

    @ResponseBody
    @RequestMapping(value = "tv/list", method = RequestMethod.GET)
    private List<Anime> getTVList(@RequestParam Map<String, String> params) {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            System.out.println("entry:" + entry.getKey() + "-" + entry.getValue());
        }
        int page = toIntUnsigned(PAGE, params.get("page"));
        int limit = toIntUnsigned(LIMIT, params.get("limit"));
        String filter = toQueryString(params.get("filter"));
        List<Anime> animeList = animeService.getTVList(filter, page, limit);
        return new ArrayList(animeList);
    }

    @ResponseBody
    @RequestMapping(value = "/{id}/video")
    private List<AnimeVideo> getVideoList(@PathVariable("id") int id, @RequestParam Map<String, String> params) {
        int page = toIntUnsigned(PAGE, params.get("page"));
        int limit = toIntUnsigned(LIMIT, params.get("limit"));
        List<AnimeVideo> animeList = animeVideoService.getVideoList(id, page, limit);
        return animeList;
    }

    @ResponseBody
    @RequestMapping(value = "test/money/{id}", method = RequestMethod.GET)
    private Result<Integer> getMoneyById(@PathVariable("id") int id) {
        Money money = testService.getMoneyById(id);
        Result<Integer> result = new Result<>(money.getMoney());
        return result;
    }

    static int a = 1;


    @ResponseBody
    @Options(timeout = 10000, flushCache = true)
    @RequestMapping(value = "test/money/{id}/subtract", method = RequestMethod.GET)
    @Transactional(rollbackFor = Exception.class)
    public Result<Boolean> updateMoneyById(@PathVariable("id") int id, @RequestParam("money") int money) throws Exception {
        Money origin = testService.getMoneyById(id);
        Result<Boolean> result = null;
        if (origin.getMoney() - money > 0) {
            System.err.println("" + origin.getMoney() + " - " + money);
            Thread.sleep(1000);
            testService.insertMoneyRecordById(id, "-" + money);
            int a = testService.updateMoneyById(id, origin.getMoney() - money, origin.getVersion());
            System.err.println("" + origin.getMoney() + " - " + money + " - " + a);
            if (a <= 0) {
                throw new Exception("请勿频繁操作!");
            }
            result = new Result<Boolean>(true);
        } else {
            result = new Result<Boolean>("金额不够！");
        }
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public boolean checkMoney(int origin, int id) {

        return true;
    }

}
