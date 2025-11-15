package me.raiko.cafecrud.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchDTO {
    private String name;
    private String address;
    private String phoneNumber;
}
