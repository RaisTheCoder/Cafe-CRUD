package me.raiko.cafecrud.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "branches")
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private Long id;

    @NotNull
    @Column(name = "branch_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    @NotNull
    @Column(name = "branch_address")
    private String address;

    @NotNull
    @Column(name = "branch_phone")
    private String phoneNumber;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItem> menuItemList;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orderList;
}
