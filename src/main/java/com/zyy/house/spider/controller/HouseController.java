package com.zyy.house.spider.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyy.house.spider.common.Result;
import com.zyy.house.spider.entity.HouseEntity;
import com.zyy.house.spider.service.HouseService;

/**
* @author: HelloWroldController
* @version:
* @date: 2018/8/30
* @desc: 提供实现了REST API，可以服务JSON,XML或者其他
*/
@RestController
// mapper 接口类扫描包配置
@MapperScan("com.zyy.house.spider.dao")
@RequestMapping("/house")
public class HouseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HouseController.class);
    @Autowired
    HouseService houseService;

    @RequestMapping("/all")
    public Result getAllHouse() {
        try {
            List<HouseEntity> result =  houseService.queryAll();
            return Result.ok().put("result", result);
        } catch(Exception e) {
            LOGGER.error("请求错误！");
            e.printStackTrace();
        }
        return Result.error();
    }
}
