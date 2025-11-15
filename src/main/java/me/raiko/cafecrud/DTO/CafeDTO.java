package me.raiko.cafecrud.DTO;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CafeDTO {
    private String name;
    private String description;
    private List<BranchDTO> branches;
}
