package com.waseem.command.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khan on 12/28/17.
 */
@Data
@Builder
@Document
public class Cart {
  @Id
  private String id;

  private List<CartItem> items = new ArrayList<>();

  public List<CartItem> getCartItems() {
    if (items == null) {
      items = new ArrayList<>();
    }
    return items;
  }

}
