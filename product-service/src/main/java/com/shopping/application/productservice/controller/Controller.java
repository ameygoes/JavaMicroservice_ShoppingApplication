/*
 * Copyright (c) 12/4/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 12/4/2022
 */
package com.shopping.application.productservice.controller;

import com.shopping.application.productservice.dto.ProductRequest;
import com.shopping.application.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// AS WE WILL BE EXPOSING THIS API SO WE WILL NEED TO ANNOTATE THIS WITH @RestController
// WITH RequestMapping ANNOTATION WITH THE PATH
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class Controller {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
            productService.createProduct(productRequest);
    }
}
