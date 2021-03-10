package com.ipiecoles.java.java240;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringConfig {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfig.class, args);
    }

    @Bean
    public BitcoinService bitcoinServiceWithoutCache(){
        BitcoinService b = new BitcoinService();
        b.setForceRefresh(true);
        return b;
    }

}
