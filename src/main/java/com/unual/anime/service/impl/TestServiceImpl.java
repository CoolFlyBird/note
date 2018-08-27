package com.unual.anime.service.impl;

import com.unual.anime.dao.TestDao;
import com.unual.anime.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public int getMoneyById(int id) {
        return testDao.getMoneyById(id);
    }

    @Override
    public void updateMoneyById(int id, int money) {
        testDao.updateMoneyById(id, money);
    }

    @Override
    public void insertMoneyRecordById(int id, String money) {
        testDao.insertMoneyRecordById(id, money);
    }
}
