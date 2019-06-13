package com.zzq.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zhou Zhong Qing
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/6/13 9:42
 */
@Configuration
public class GenericConfiguration {


	public GenericConfiguration(){
		System.out.println("initialize GenericConfiguration");
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}