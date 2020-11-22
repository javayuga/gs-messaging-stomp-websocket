package com.example.messagingstompwebsocket.controller;

import com.example.messagingstompwebsocket.dto.ContentHolderDTO;
import com.example.messagingstompwebsocket.dto.HelloMessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public ContentHolderDTO greeting(HelloMessageDTO message) throws Exception {
		Thread.sleep(1000); // simulated delay
		return new ContentHolderDTO("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
	}

}
