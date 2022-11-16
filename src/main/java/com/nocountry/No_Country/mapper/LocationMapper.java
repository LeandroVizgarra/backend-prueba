package com.nocountry.No_Country.mapper;

import com.nocountry.No_Country.dtos.LocationDTO;
import com.nocountry.No_Country.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper {
    private final ShopMapper shopMapper;
    @Autowired
    public LocationMapper(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    public LocationDTO locationEntity2DTO(Location location){
        LocationDTO dto = new LocationDTO();
        dto.setLocation_id(location.getLocation_id());
        dto.setCity(location.getCity());
        dto.setShopList(shopMapper.shopEntityList2DTOList(location.getShops()));
        dto.setState(location.getState());
        return dto;
    }

    public Location locationDTO2Entity(LocationDTO dto){
        Location location = new Location();
        location.setState(dto.getState());
        location.setCity(dto.getCity());
        return location;
    }
}
