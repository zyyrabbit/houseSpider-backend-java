package com.zyy.house.spider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyy.house.spider.config.cache.redis.RedisUtil;
import com.zyy.house.spider.dao.HouseDao;
import com.zyy.house.spider.entity.HouseEntity;
import com.zyy.house.spider.service.HouseService;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    HouseDao houseDao;
    @Autowired
    RedisUtil redisUtil;

    @Override
    public List<HouseEntity> queryAll() {
        List<HouseEntity> allHouseList;
        if (redisUtil.hasKey("all")){
            allHouseList = (List<HouseEntity>) redisUtil.getObject("all");
        } else {
            allHouseList = houseDao.queryAll();
            redisUtil.setObject("all", allHouseList);
        }
        return allHouseList;
    }
}
