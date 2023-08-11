package Springboot.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
    @Bean
    public CommandLineRunner CommandLineRunner(ApplicationContext ctx) {
    	return args -> {
    		System.out.println("lets inspect the beans provoided by spring boot");
    		
    		String[] beanNames = ctx.getBeanDefinitionNames();
    		Arrays.sort(beanNames);
    		for (String beanName: beanNames ) {
    		System.out.println(beanName);
    	}
    };
    
}}
