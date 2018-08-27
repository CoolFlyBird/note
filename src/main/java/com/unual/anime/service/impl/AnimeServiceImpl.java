package com.unual.anime.service.impl;

import com.unual.anime.dao.AnimeDao;
import com.unual.anime.entity.Anime;
import com.unual.anime.service.AnimeService;
import org.apache.ibatis.annotations.Param;
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

    @Override
    public Anime getTVById(int id) {
        return animeDao.queryTVById(id);
    }

    public List<Anime> getAnimeList(@Param("filter") String filter, int page, int limit) {
        return animeDao.queryAll(filter, page, limit);
    }

    @Override
    public List<Anime> getTVList(String filter, int page, int limit) {
        return animeDao.queryTVAll(filter, page, limit);
    }
}
