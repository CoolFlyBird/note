package com.unual.anime.service;

import org.springframework.stereotype.Service;

@Service
public interface TestService {
    int getMoneyById(int id);

    void updateMoneyById(int id, int money);

    void insertMoneyRecordById(int id, String money);
}
