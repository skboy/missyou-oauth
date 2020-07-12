package com.missyou.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 认证与授权
 *
 * @author Lusifer
 * @since v1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.missyou")
@MapperScan(basePackages = "com.missyou.repository.core.mapper")
public class AuthApplication {
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}