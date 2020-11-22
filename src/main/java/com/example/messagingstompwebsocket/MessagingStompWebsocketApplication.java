package com.example.messagingstompwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableScheduling
public class MessagingStompWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingStompWebsocketApplication.class, args);
	}


	@Controller
	class SPA {

		@GetMapping("nuxt-stomp")
		String redirect() {
			return "forward:nuxt-stomp/";
		}

		@GetMapping({ "nuxt-stomp/", "nuxt-stomp/404", "nuxt-stomp/err" })
		String entry() {
			return "/nuxt-stomp/index.html";
		}
	}
}
