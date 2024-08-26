package com.sam.jpa.dto;

import com.sam.jpa.dao.Address;
import com.sam.jpa.dao.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;
    private Address address;

}
