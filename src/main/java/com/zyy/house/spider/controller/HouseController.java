package com.zyy.house.spider.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(HouseController.class);
    @Autowired
    HouseService houseService;

    @RequestMapping("/all")
    public Result getAllHouse() {
        try {
            List<HouseEntity> result =  houseService.queryAll();
            logger.info("请求陈宫");
            return Result.ok().put("result", result);
        } catch(Exception e) {
            logger.error("请求错误！");
            e.printStackTrace();
        }
        return Result.error();
    }
}
