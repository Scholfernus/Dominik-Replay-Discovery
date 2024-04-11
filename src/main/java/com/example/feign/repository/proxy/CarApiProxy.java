package com.example.feign.repository.proxy;

import com.example.feign.dto.CarApiDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("CarsApi-Service")
public interface CarApiProxy {
@GetMapping("/cars")
    List<CarApiDto> getCars();
}
