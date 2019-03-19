package ru.pavel2107.otus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.pavel2107.otus.service.TranslatorService;
import ru.pavel2107.otus.service.TransmitterService;
import ru.pavel2107.otus.service.TransmitterServiceImpl;

@Configuration
public class TransmitterServiceConfig {

    @Bean
    public TransmitterService transmitterService( TranslatorService translatorService){

        TransmitterService transmitterService = new TransmitterServiceImpl( translatorService);

        return transmitterService;
    }
}
