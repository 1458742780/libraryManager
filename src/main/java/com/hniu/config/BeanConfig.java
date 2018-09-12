package com.hniu.config;

import com.hniu.entity.System;
import com.hniu.mapper.SystemMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanConfig {


    @Bean
    public System system(SystemMapper sm){
        try {
            List<System> systems = sm.selectAll();
            System system = systems.get(0);
            return system;
        }catch (Exception e){
            return new System(1, "图书管理系统","/img/icon.icon",new Byte("10"),"appid" ,"appsecret" , "HNIUBS" );
        }
    }
}
