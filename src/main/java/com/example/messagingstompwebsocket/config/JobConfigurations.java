package com.example.messagingstompwebsocket.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Getter
public class JobConfigurations {
    @Value("${rand.number.job.frequency}")
    Integer randNumberJobFrequency;

}
