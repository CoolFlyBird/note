package com.unual.anime.service.impl;

import com.unual.anime.dao.TestDao;
import com.unual.anime.entity.Money;
import com.unual.anime.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public Money getMoneyById(int id) {
        return testDao.getMoneyById(id);
    }

    @Override
    public int updateMoneyById(int id, int money, int version) {
        return testDao.updateMoneyById(id, money, version);
    }

    @Override
    public void insertMoneyRecordById(int id, String money) {
        testDao.insertMoneyRecordById(id, money);
    }
}
