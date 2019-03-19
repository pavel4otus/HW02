package ru.pavel2107.otus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

public class TranslatorServiceImpl implements TranslatorService {

    private MessageSource messageSource;
    private Locale locale;

    @Autowired
    public TranslatorServiceImpl(MessageSource messageSource, Locale locale){
        this.messageSource = messageSource;
        this.locale        = locale;
    }

    @Override
    public String translate( String str, String[] arr){
        return messageSource.getMessage(str,  arr,  locale);
    }

    @Override
    public String translate( String str){
        return messageSource.getMessage(str,  new String[]{},  locale);
    }

}
