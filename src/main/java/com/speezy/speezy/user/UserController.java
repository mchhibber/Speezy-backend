package com.speezy.speezy.user;

import com.speezy.speezy.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public static final String API_1_0_USERS = "/api/1.0/users";
    @Autowired
    UserService userService;

    @PostMapping(API_1_0_USERS)
    public GenericResponse createUser(@RequestBody User user) {
        userService.save(user);
        return new GenericResponse("User Saved Successfully :)");
    }
}
