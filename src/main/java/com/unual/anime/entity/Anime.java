package com.unual.anime.entity;

public class Anime {
    private String animeId;
    private String animeName;
    private String animeUrl;
    private String animeImg;

    public String getAnimeId() {
        return animeId;
    }

    public void setAnimeId(String animeId) {
        this.animeId = animeId;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getAnimeUrl() {
        return animeUrl;
    }

    public void setAnimeUrl(String animeUrl) {
        this.animeUrl = animeUrl;
    }

    public String getAnimeImg() {
        return animeImg;
    }

    public void setAnimeImg(String animeImg) {
        this.animeImg = animeImg;
    }

    @Override
    public String toString() {
        return "{no." + animeId + ", animeName:" + animeName + ", animeUrl:" + animeUrl + "}";
    }

}
