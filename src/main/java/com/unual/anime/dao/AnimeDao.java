package com.unual.anime.dao;

import com.unual.anime.entity.Anime;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimeDao {

    Anime queryById(int id);

    Anime queryTVById(int id);

    List<Anime> queryAll(@Param("filter") String filter, @Param("page") int page, @Param("limit") int limit);

    List<Anime> queryTVAll(@Param("filter") String filter, @Param("page") int page, @Param("limit") int limit);
}
