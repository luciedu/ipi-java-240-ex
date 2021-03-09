package com.ipiecoles.java.java240;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.ipiecoles.java.java240")
@PropertySource("classpath:app.properties")

public class SpringConfig {

    @Bean
    public BitcoinService bitcoinServiceWithoutCache(){
        BitcoinService b = new BitcoinService();
        b.setForceRefresh(true);
        return b;
    }

}
