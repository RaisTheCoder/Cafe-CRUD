package me.raiko.cafecrud.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {
    private String name;
    private Double price;
    private CategoryDTO category;
}
