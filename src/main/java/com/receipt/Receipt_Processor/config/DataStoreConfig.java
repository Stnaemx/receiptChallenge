package com.receipt.Receipt_Processor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataStoreConfig {

    // spring will inject and handle the lifecycle of the hashmap
    @Bean
    public Map<String, Integer> getDataStore() {
        return new HashMap<>();
    }
}
