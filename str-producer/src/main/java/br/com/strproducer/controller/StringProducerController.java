package br.com.strproducer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface StringProducerController {

    @PostMapping
    ResponseEntity<?> sendMessage(@RequestBody String message);
}
