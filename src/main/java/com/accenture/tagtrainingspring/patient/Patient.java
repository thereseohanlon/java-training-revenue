package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {

    private String name;

    private int id;

    private LocalDate dateOfBirth;

    private Gender gender;

    public Patient(String name, int id, LocalDate dateOfBirth, Gender gender) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

}
