package com.ipiecoles.java.java240;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "com.ipiecoles.java.java240")

public class SpringConfig {

    @Bean
    //    @Scope(value = "singleton") facultatif car défaut singleton
    public BitcoinService bitcoinServiceWithoutCache(){
        BitcoinService b = new BitcoinService();
        b.setForceRefresh(true);
//Injection de WepPageManager
        //b.setWebPageManager(webPageManager());
        return b;
    }

}
