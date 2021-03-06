package com.fjz.misc.android.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.fjz.misc.android.dao.ConfigurationMapper;
import com.fjz.misc.android.entity.AndroidEntity;
import com.fjz.misc.android.entity.Configurations;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TransferService {

    @Autowired
    private ConfigurationMapper configurationMapper;

    public List<Configurations> getAllConf() {
        List<Configurations> configurationsList = configurationMapper.selectList(null);
        return configurationsList;
    }


    public int insertOneConfiguration(String key, String value) {

        int count = 0;

        Configurations conf = getValueByKey(key);
        if (conf == null) {
            conf = new Configurations();
            conf.setId(null);
            conf.setKey(key);
            conf.setValue(value);
            count = configurationMapper.insert(conf);
        } else {
            conf.setValue(value);
            configurationMapper.updateById(conf);
        }

        return count;
    }

    public int delByKey(String key) {
        Configurations config = getValueByKey(key);
        if (config != null) {
            configurationMapper.deleteById(config);
        }
        return 0;
    }

    public Configurations getValueByKey(String key) {

        QueryWrapper<Configurations> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("key", key)
                .select("id", "key", "value");

        Configurations config = configurationMapper.selectOne(queryWrapper);

        return config;

    }
}
