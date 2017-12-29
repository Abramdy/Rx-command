package com.waseem.command.model.controller;

import lombok.Builder;
import lombok.Data;

/**
 * Created by khan on 12/29/17.
 */
@Data
@Builder
public class CartUpdateProductRequest {

  private String productId;

  private Integer quantity;

}
