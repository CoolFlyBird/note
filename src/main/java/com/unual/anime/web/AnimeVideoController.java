package com.unual.anime.web;

import com.unual.anime.entity.AnimeVideo;
import com.unual.anime.service.AnimeVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

import static com.unual.anime.utils.ConvertUtils.*;

@Controller
@RequestMapping("/animevideo")
public class AnimeVideoController {
    @Autowired
    AnimeVideoService animeVideoService;

    @ResponseBody
    @RequestMapping(value = "/{id}")
    private List<AnimeVideo> getVideoList(@PathVariable("id") int id, @RequestParam Map<String, String> params) {
        int page = toIntUnsigned(PAGE, params.get("page"));
        int limit = toIntUnsigned(LIMIT, params.get("limit"));
        List<AnimeVideo> animeList = animeVideoService.getVideoList(id, page, limit);
        return animeList;
    }
}
