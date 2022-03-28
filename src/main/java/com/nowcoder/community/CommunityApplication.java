package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {


//	@PostConstruct
//	public void init(){
//		//解决netty启动冲突的方法(隐藏的坑)
//		// see Netty4Utils.setAvailableProcessors(
//		System.setProperty("es.set.nett.runtime.available.processors","false");
//	}

	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
