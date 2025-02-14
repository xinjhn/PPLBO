package com.microservices.product.controller.dto;

import com.microservices.product.model.Product;

import java.math.BigDecimal;

public record ProductResponse (String id, String name, String description, BigDecimal price) {

}
