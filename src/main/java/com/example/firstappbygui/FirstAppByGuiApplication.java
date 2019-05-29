package com.example.firstappbygui;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FirstAppByGuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppByGuiApplication.class, args);
	}


	@EventListener(WebServerInitializedEvent.class)
	public void onWebServerReady( WebServerInitializedEvent event){

		System.out.println("webserver的实现类："+event.getWebServer().getClass().getName());
	}


	@Bean
	public ApplicationRunner runner(WebServerApplicationContext context){

		return args -> {
			System.out.println("web："+context.getWebServer().getClass().getName());
		};
	}
}
