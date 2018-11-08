package com.codape.winmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * WinMall-B2C网上商城启动类
 * @author Captwill
 * @version 0.0.1-SNAPSHOT 2018-11-08
 */
@ComponentScan
@EnableAutoConfiguration
public class StartApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
