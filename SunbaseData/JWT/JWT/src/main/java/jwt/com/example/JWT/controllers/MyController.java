package jwt.com.example.JWT.controllers;

import jwt.com.example.JWT.models.User;
import jwt.com.example.JWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired
    private UserService userService;
 @RequestMapping("/users")
    public List<User> getUser(){
     System.out.println("getting users");
     return userService.getUsers();
 }
 @RequestMapping("current")
 public String getLoggingUSre(Principal principal){
     return principal.getName();
 }
}
