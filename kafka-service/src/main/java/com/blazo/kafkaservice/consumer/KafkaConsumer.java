package com.blazo.kafkaservice.consumer;

import com.blazo.kafkaservice.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "one", groupId = "myGroup")
    public void consumeStudent(Student student){
        log.info("Consuming student from topic ONE:: {}", student.toString());
    }
}
