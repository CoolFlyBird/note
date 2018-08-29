package com.unual.anime.service;

import com.unual.anime.entity.Money;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    Money getMoneyById(int id);

    int updateMoneyById(int id, int money, int version);

    void insertMoneyRecordById(int id, String money);
}
