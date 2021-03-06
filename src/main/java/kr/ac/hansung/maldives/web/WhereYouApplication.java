package kr.ac.hansung.maldives.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WhereYouApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WhereYouApplication.class, args);
	}
}
