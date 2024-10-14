package com.api.crud.Controllers;

import com.api.crud.Models.UserModel;
import com.api.crud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService ;

    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers() ;
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUsers(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id){
        return this.userService.getById(id) ;
    }

    @PutMapping(path = "/{id}")
    public UserModel editUser(@RequestBody UserModel request , Long id) {
        return this.userService.updateUser(request, id) ;
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser( @PathVariable("id") Long id) {
        Boolean ok = this.userService.deleteUser(id) ;
        if( ok ) {
            return "User with id " + id + "delete" ;
        } else {
            return "User not found" ;
        }
    }


}
