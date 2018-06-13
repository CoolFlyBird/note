package com.unual.anime.service.impl;

import com.unual.anime.dao.AnimeVideoDao;
import com.unual.anime.entity.AnimeVideo;
import com.unual.anime.service.AnimeVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeVideoServiceImpl implements AnimeVideoService {
    @Autowired
    AnimeVideoDao animeVideoDao;

    @Override
    public List<AnimeVideo> getVideoList(int id, int page, int limit) {
        return animeVideoDao.queryById(id, page, limit);
    }
}
