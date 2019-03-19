package ru.pavel2107.otus.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.pavel2107.otus.domain.Student;

public class InviteStudentImpl implements InviteStudent {

    private TransmitterService transmitterService;

    @Autowired
    public InviteStudentImpl( TransmitterService transmitterService){
        this.transmitterService = transmitterService;
    }


    @Override
    public Student invite() {

        String name;
        String surname;
        transmitterService.printlnResource( "hello.user");
        transmitterService.printResource( "enter_u_name");   name    = transmitterService.getString();
        transmitterService.printResource("enter_u_surname"); surname = transmitterService.getString();

        if( name == null || surname == null){
            return null;
        }

        return new Student( name, surname);
    }
}
