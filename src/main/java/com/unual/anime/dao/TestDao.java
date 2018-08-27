package com.unual.anime.dao;

public interface TestDao {

    int getMoneyById(int id);

    void updateMoneyById(int id, int money);

    void insertMoneyRecordById(int id, String money);
}
