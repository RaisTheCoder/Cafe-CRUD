package me.raiko.cafecrud.DTO;

import jakarta.validation.constraints.DecimalMax;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private BranchDTO branch;
    private LocalDateTime orderDate;
    private List<OrderItemDTO> orderItems;
    private String orderStatus;
    private Double price;
}
