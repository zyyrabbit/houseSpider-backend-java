package com.zyy.house.spider.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zyy.house.spider.entity.HouseEntity;

@Repository
public interface HouseDao {
    /**
     * 查询所有房源信息
     */
    List<HouseEntity> queryAll();
}
