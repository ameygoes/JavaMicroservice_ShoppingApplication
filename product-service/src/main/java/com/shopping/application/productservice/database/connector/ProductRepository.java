package com.shopping.application.productservice.database.connector;
/*
 * Copyright (c) 12/4/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 12/4/2022
 */

import com.shopping.application.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

// Identifier in MongoRepository<Product, String> is Product Model class and String is basically indicates the
// Data type of @Id value field which is String in our case
public interface ProductRepository extends MongoRepository<Product, String> {
}
