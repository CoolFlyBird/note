package com.unual.anime.service.impl;

import com.unual.anime.dao.AnimeDao;
import com.unual.anime.entity.Anime;
import com.unual.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {
    @Autowired
    private AnimeDao animeDao;

    public Anime getAnimeById(int id) {
        return animeDao.queryById(id);
    }

    public List<Anime> getAnimeList(int page, int limit) {
        return animeDao.queryAll(page, limit);
    }
}
