package com.sam.jpa.repository;

import com.sam.jpa.dao.Customer;
import com.sam.jpa.dto.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select new com.sam.jpa.dto.OrderResponse(c.name, p.productName, p.price) from Customer c LEFT JOIN c.products p")
    public List<OrderResponse> getOrderInfo();

    @Query(value = "select c.name as cName, c.email as email  from customer c limit 1", nativeQuery = true)
    public List<Object> getCustomerDetail();
}
