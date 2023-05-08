package com.example.app.service;

import com.example.app.model.Message;
import com.example.app.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService extends ServiceImpl<Message, Integer> {
    @Autowired
    MessageService(MessageRepository repository) {
        super(repository);
    }
}
