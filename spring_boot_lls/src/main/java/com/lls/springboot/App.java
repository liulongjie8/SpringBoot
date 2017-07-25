package com.lls.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.lls.springboot.bean.HomeProperties;

/**
 * Hello world!
 */
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.lls.springboot.dao")
// 开启定时任务
@EnableScheduling
public class App implements CommandLineRunner {

	@Autowired
	private HomeProperties homeProperties;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n" + homeProperties.toString());
		System.out.println();
	}
}
