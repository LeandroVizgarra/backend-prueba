package com.nocountry.No_Country.controller;

import com.nocountry.No_Country.dtos.BasicLocationDTO;
import com.nocountry.No_Country.dtos.UserDTO;
import com.nocountry.No_Country.service.LocationService;
import com.nocountry.No_Country.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final LocationService locationService;
    @Autowired
    public UserController(UserService userService, LocationService locationService) {

        this.userService = userService;
        this.locationService = locationService;
    }


    //Funcion creada solo a fines de test :)
    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> users = this.userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/location/{id}")
    public ResponseEntity<BasicLocationDTO> getLocationById(@PathVariable Long id){
        return ResponseEntity.ok().body(this.locationService.getBasicLocationById(id));
    }
}
