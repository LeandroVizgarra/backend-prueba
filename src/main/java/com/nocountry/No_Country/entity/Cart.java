package com.nocountry.No_Country.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Item> items;
    @NotNull
    private LocalDateTime localDateTime = LocalDateTime.now();
    @NotNull
    private Double totalAmount;

    @OneToOne
    private User user;
}
