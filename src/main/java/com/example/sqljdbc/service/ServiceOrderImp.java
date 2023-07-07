package com.example.sqljdbc.service;

import com.example.sqljdbc.repository.RepositoryOrderImp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceOrderImp implements ServiceOrder{
    private final RepositoryOrderImp repositoryOrders;

    @Override
    public List<String> getProductName(String name) {
        return repositoryOrders.getProductName(name);
    }
}
