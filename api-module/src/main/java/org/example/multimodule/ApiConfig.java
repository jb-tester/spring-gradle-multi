package org.example.multimodule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Bean
    public ApiBean1 apiBean1() {
        return new ApiBean1();
    }
}
