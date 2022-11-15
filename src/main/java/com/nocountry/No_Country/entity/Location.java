package com.nocountry.No_Country.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long location_id;
    @NotNull
    private String streetName;
    @NotNull
    private String city;
    @NotNull
    private String state;
    @OneToMany(mappedBy = "location")
    @JoinColumn(name="shop_id")
    private List<Shop> shopList;
}
