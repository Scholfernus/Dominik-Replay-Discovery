package com.example.feign.controller;

import com.example.feign.dto.CarApiDto;
import com.example.feign.repository.proxy.CarApiProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarApiController {
private final CarApiProxy carApiProxy;

    public CarApiController(CarApiProxy carApiProxy) {
        this.carApiProxy = carApiProxy;
    }
    @GetMapping("/start")
    public ResponseEntity<List<CarApiDto>> getCars(){
        return ResponseEntity.ok(carApiProxy.getCars());
    }
}
