package com.ipiecoles.java.java240;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;



@Configuration
public class SpringConfig {
    @Bean
    @Scope() //facultatif car par défaut = singleton
    public BitcoinService bitcoinService() {
        BitcoinService b = new BitcoinService();
        b.setWebPageManager(webPageManager());
        return b;

    }

    @Bean
    public ProduitManager produitManager(){
        ProduitManager p = new ProduitManager();
        // Injection de BitcoinService
        p.setBitcoinService(bitcoinService());
        // Injection de WepPageManager
        p.setWebPageManager(webPageManager());
        return p;
    }

    @Bean
    public WebPageManager webPageManager(){
        System.out.println("Initialisation du WebpageManager");
        return new WebPageManager();
    }
}
