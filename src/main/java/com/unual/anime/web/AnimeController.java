package com.unual.anime.web;

import com.unual.anime.dto.Result;
import com.unual.anime.entity.Anime;
import com.unual.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.unual.anime.utils.ConvertUtils.*;

@Controller
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private Result getAnimeById(@PathVariable("id") int id) {
        Anime anime = animeService.getAnimeById(id);
        return new Result(anime);
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private List<Anime> getAnimeList(@RequestParam Map<String, String> params) {
        int page = toIntUnsigned(PAGE, params.get("page"));
        int limit = toIntUnsigned(LIMIT, params.get("limit"));
        List<Anime> animeList = animeService.getAnimeList(page, limit);
        return new ArrayList(animeList);
    }
}
