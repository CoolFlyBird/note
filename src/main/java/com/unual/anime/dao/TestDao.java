package com.unual.anime.dao;

import com.unual.anime.entity.Money;

public interface TestDao {

    Money getMoneyById(int id);

    int updateMoneyById(int id, int money, int version);

    void insertMoneyRecordById(int id, String money);
}
