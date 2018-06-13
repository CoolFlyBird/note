package com.unual.anime.service;

import com.unual.anime.entity.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimeService {
    Anime getAnimeById(int id);

    List<Anime> getAnimeList(int page, int limit);
}
