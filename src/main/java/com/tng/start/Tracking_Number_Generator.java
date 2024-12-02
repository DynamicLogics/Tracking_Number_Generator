package com.tng.start;

import java.util.concurrent.Executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tng.*"})
@EntityScan("com.tng.bean")
@EnableAsync
//@EnableJpaRepositories(basePackages="com.plantManagementSystem.rest.dao_")
public class Tracking_Number_Generator {

	public static void main(String[] args) {
		SpringApplication.run(Tracking_Number_Generator.class, args);
	}

	//Here, I'm setting that maximum of 4 threads should run concurrently and the queue size is set to 500.
    @Bean
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(4);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("AsyncOpration-");
        executor.initialize();
        return executor;
    }

}
