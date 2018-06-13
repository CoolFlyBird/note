package com.unual.anime.dao;

import com.unual.anime.entity.AnimeVideo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeVideoDao {
    List<AnimeVideo> queryById(@Param("animeId") int id, @Param("page") int page, @Param("limit") int limit);
}
