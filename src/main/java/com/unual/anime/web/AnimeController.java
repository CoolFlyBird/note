package com.unual.anime.web;

import com.unual.anime.dto.Result;
import com.unual.anime.entity.Anime;
import com.unual.anime.entity.AnimeVideo;
import com.unual.anime.service.AnimeService;
import com.unual.anime.service.AnimeVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.unual.anime.utils.ConvertUtils.*;

@Controller
@RequestMapping("/")
public class AnimeController {

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
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private List<Anime> getAnimeList(@RequestParam Map<String, String> params) {
        int page = toIntUnsigned(PAGE, params.get("page"));
        int limit = toIntUnsigned(LIMIT, params.get("limit"));
        List<Anime> animeList = animeService.getAnimeList(page, limit);
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
}
