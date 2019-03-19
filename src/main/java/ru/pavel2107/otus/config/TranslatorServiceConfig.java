package ru.pavel2107.otus.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import ru.pavel2107.otus.service.TranslatorService;
import ru.pavel2107.otus.service.TranslatorServiceImpl;

import java.util.Locale;

@Configuration
public class TranslatorServiceConfig {

    @Bean
    public TranslatorService translatorService( MessageSource messageSource,
            @Value("${locale.language}") String lang,
            @Value("${locale.country}") String country){

        Locale locale = new Locale( lang, country);

        TranslatorServiceImpl translatorService = new TranslatorServiceImpl( messageSource, locale);
        return translatorService;
    }



    @Bean
    public MessageSource messageSource( ){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename( "/i18n/bundle");
        messageSource.setDefaultEncoding( "UTF-8");
        return messageSource;
    }
}
