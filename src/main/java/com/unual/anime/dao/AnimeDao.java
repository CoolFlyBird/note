package com.unual.anime.dao;

import com.unual.anime.entity.Anime;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeDao {

    Anime queryById(int id);

    List<Anime> queryAll(@Param("page") int page, @Param("limit") int limit);
}
