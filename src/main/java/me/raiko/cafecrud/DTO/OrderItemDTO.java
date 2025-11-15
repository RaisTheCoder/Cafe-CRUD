package me.raiko.cafecrud.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private Long menuItemId;
    private String name;
    private Integer quantity;
    private Double price;
}
