package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.autoho.Authorities;
import com.example.demo.exeption.InvalidCredentials;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new ArrayList<>();
        Map<String, String> users = new HashMap<>();
        users.put("abc", "111");
        users.put("def", "222");
        if (users.containsKey(user) && users.get(user).equals(password)) {
            if ("abc".equals(user)) {
                list.add(Authorities.READ);
            }
        } else {
            throw new InvalidCredentials("Username or password invalid");
        }

        return list;
    }
}