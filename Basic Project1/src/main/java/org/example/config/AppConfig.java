package org.example.config;

//this file will replace XML ocnifg

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

   @Bean
   @Scope("prototype")
   // @Bean(name ={"deskt","com3", "pos"} )
    public Desktop desktop(){
        return new Desktop();
    }
}
