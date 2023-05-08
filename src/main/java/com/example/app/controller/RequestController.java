package com.example.app.controller;

import com.example.app.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class RequestController {
    @MessageMapping("/request")
    @SendTo("/topic/responses")
    public Message sendToGroupChat(String message) {
        System.out.println(message);
        return Message.builder().content(message).build();
    }
}
