package com.fifth.pillar.usercrudms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
//@Import(SpringDataRestConfiguration.class)
public class UserCrudMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCrudMsApplication.class, args);
	}

}
