package com.zyy.house.spider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpiderApplication {
	// run方法会启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件
	public static void main(String[] args) {
		SpringApplication.run(SpiderApplication.class, args);
	}
}
