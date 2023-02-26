package com.bookMyshow.bookMyshow.Controller;

import com.bookMyshow.bookMyshow.EntryDTOs.UserEntryDTO;
import com.bookMyshow.bookMyshow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody UserEntryDTO userEntryDTO){
        userService.addUser(userEntryDTO);
        return "User added successfully";

    }
}
