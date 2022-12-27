/*
 * Copyright (c) 12/4/2022 . Amey Bhilegaonkar. All rights reserved.
 * AUTHOR: Amey Bhilegoankar
 * PORTFOLIO: https://ameyportfolio.netlify.app/
 * FILE CREATION DATE: 12/4/2022
 */
package com.shopping.application.productservice.dto;


import lombok.*;
import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponse {

    private String Id;
    private String name;
    private String description;
    private BigDecimal price;

}
