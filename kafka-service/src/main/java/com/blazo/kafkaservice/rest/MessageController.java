package com.blazo.kafkaservice.rest;

import com.blazo.kafkaservice.payload.Student;
import com.blazo.kafkaservice.producer.KafkaJsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody Student student){
        kafkaJsonProducer.sendMessage(student);
        return ResponseEntity.ok("Student queued successfully");
    }
}
