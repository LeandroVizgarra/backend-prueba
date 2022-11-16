package com.nocountry.No_Country.dtos;

import com.nocountry.No_Country.entity.Location;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class ShopDTO {

    private Long id;

    private String name;

    private Long phoneNumber;

    private String email;

    private String password;

    private Long locationId;


}
