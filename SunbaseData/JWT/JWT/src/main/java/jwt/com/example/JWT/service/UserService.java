package jwt.com.example.JWT.service;

import jwt.com.example.JWT.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store =new ArrayList<>();

      public  UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Sanjit Yadav", "sanjit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Nikesh Singh", "nikesh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Aditya Yadav", "aditya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Vikash Jaiswal", "vikash@gmail.com"));

      }
      public  List<User> getUsers(){
          return this.store;
    }

}
