package com.minorProject.parking.Controller;

import com.minorProject.parking.Users.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.minorProject.parking.ServiceLayer.ServiceUserInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    ServiceUserInterface serviceUserInterface;


    @PostMapping("/signUp")
    public String createSignUp(@RequestBody User user)
    {
        return serviceUserInterface.createSignUpPage(user);
    }


    @GetMapping("/signUp")
    public List<User> readSignUp()
    {
        return serviceUserInterface.readSignUp();
    }

    @GetMapping("/signUp/{email}")
    public User readSignUp(@PathVariable String email)
    {
        return serviceUserInterface.readSignUp(email);
    }

    @DeleteMapping("/signUp/{email}")
    public String deleteSignUp(@PathVariable String email)
    {
        if(serviceUserInterface.deleteSignUp(email))
            return "Delete Successful";
        return "Not Found";
    }

    @PutMapping("/signUp/{email}")
    public String updateSignUp(@RequestBody User user, @PathVariable String email)
    {
        return serviceUserInterface.updateSignUp(user, email);
    }

}
