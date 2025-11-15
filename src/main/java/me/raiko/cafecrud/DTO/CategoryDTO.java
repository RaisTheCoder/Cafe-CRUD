package me.raiko.cafecrud.DTO;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private String name;
    private List<MenuItemDTO> menuItems;
}
