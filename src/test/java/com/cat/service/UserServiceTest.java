package com.cat.service;

import com.cat.config.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void login() throws Exception {
        userService.login();
    }

}