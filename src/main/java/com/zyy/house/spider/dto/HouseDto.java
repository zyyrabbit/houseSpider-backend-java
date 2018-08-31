package com.zyy.house.spider.dto;

import java.util.Date;
/**
 * 房源查询Dto
 */
public class HouseDto {
    /**
     * id
     */
    private Long id;
    /**
     * 具体描述
     */
    private String title;
    /**
     * 租房价格
     */
    private Integer price;
    /**
     * 房源链接
     */
    private String url;
    /**
     * 房源发布时间
     */
    private String time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
