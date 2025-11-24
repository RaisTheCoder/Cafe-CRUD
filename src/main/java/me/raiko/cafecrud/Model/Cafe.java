package me.raiko.cafecrud.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cafe")
@NoArgsConstructor
@AllArgsConstructor
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cafe_id")
    private Long id;

    @NotNull
    @Column(name = "cafe_name")
    private String name;

    @Column(name = "cafe_desc")
    private String description;

    @OneToMany(mappedBy = "cafe", cascade = CascadeType.ALL)
    private List<Branch> branchList;
}

