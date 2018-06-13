package com.unual.anime.service;

import com.unual.anime.entity.AnimeVideo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimeVideoService {

    List<AnimeVideo> getVideoList(int id, int page, int limit);
}
