package com.sam.jpa.controller;


import com.sam.jpa.dao.Customer;
import com.sam.jpa.dto.OrderRequest;
import com.sam.jpa.dto.OrderResponse;
import com.sam.jpa.repository.CustomerRepository;
import com.sam.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){

         return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/orders")
    public List<Customer> findAllOrders(){

        return customerRepository.findAll();
    }

    @GetMapping("/orderInfo")
    public List<OrderResponse> getOrderInfo(){

        return customerRepository.getOrderInfo();
    }
}
