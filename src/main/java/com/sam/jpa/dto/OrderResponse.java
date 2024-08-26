package com.sam.jpa.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class OrderResponse {

    private String name;
    private String productName;
    private int price;

    // Constructor used to ignore City column, otherwise OrderResponse will throw runtime error
    public OrderResponse(String name, String productName, int price) {
        this.name = name;
        this.productName = productName;
        this.price = price;
    }

    private String city;
}
