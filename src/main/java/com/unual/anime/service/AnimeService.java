package com.unual.anime.service;

import com.unual.anime.entity.Anime;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimeService {
    Anime getAnimeById(int id);

    Anime getTVById(int id);

    List<Anime> getAnimeList(String filter, int page, int limit);

    List<Anime> getTVList(String filter, int page, int limit);

}
