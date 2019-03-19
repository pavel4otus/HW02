package ru.pavel2107.otus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.pavel2107.otus.service.InviteStudent;
import ru.pavel2107.otus.service.InviteStudentImpl;
import ru.pavel2107.otus.service.TransmitterService;

@Configuration
public class InviteStudentConfig {

    @Bean
    public InviteStudent inviteStudent( TransmitterService transmitterService){
        InviteStudentImpl inviteStudent = new InviteStudentImpl(transmitterService);
        return inviteStudent;
    }
}
