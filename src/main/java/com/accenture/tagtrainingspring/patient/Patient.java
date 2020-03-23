package com.accenture.tagtrainingspring.patient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Patient {

    private int id;

    private String name;

    private LocalDate dateOfBirth;

    private Gender gender;

}
