package com.cat.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public void login() {
        System.out.println("login");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        list.forEach(i -> System.out.println(i + 1));
    }
}
