package com.missyou.oauth.tests;

import com.missyou.oauth.AuthApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuthApplication.class)
public class PasswordEncoderTests {
    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void  testPasswordEncoder(){
        System.out.println(passwordEncoder.encode("123456"));
        System.out.println(passwordEncoder.encode("portal"));
    }
}
