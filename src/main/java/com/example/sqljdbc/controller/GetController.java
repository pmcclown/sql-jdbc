package com.example.sqljdbc.controller;

import com.example.sqljdbc.service.ServiceOrderImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetController {
    private final ServiceOrderImp serviceOrderImp;
    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name") String name) {
        return serviceOrderImp.getProductName(name);
    }
}