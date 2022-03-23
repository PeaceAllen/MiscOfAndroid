package com.fjz.misc.android.service;

import com.fjz.misc.android.dao.ConfigurationMapper;
import com.fjz.misc.android.entity.AndroidEntity;
import com.fjz.misc.android.entity.Configurations;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {

    @Autowired
    private ConfigurationMapper configurationMapper;

    public String getAndroid() {
        List<Configurations> configurationsList = configurationMapper.selectList(null);


        return new Gson().toJson(configurationsList);
    }

    public String insertOneConfiguration() {

        Configurations conf = new Configurations();

        conf.setId(null);
        conf.setKey("common_config");
        conf.setValue("common_value");

        int count = configurationMapper.insert(conf);


        return new Gson().toJson(new AndroidEntity("Hello" + count));
    }
}
