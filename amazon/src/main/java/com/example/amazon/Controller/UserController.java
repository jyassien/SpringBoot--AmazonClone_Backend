package com.example.amazon.COntroller;

import com.example.amazon.Entity.UserMetaData;
import com.example.amazon.Services.UserService;
import com.example.amazon.Repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/amazon/users/")
public class UserController{

//    private final UserRepo userRepo;
@Autowired
UserService userService;

// Contructoresa are needed if we are not using @Autowired annotation.
//    private final UserService userService;
//    public UserController(final UserService userService){
//        this.userService = userService;
//    }

    @GetMapping("hi")
    public String sayHi(){
        System.out.println("Hi there!");
        return "Hi there!";
    }

    @PostMapping("saveUserDetails")
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userData){
        UserMetaData user = userService.saveUserMetaDataToDB(userData);
        System.out.println(" >>>>>>>>>> Post requested.");
        return user;
    }
    @GetMapping("getUserDetails/{userId}")
    public UserMetaData getUserDetails(@PathVariable String userId){
        UserMetaData user = userService.getUserDetailsFromDB(userId);
        return user;
    }

}