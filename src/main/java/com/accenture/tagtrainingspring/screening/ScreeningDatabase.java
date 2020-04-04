package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScreeningDatabase {

    public List<Screening> screenings() {
        Patient patient = new Patient("Joe", 1, LocalDate.of(1994, 1, 1), Gender.MALE);
        Screening screeningJoe = new Screening(1, patient, LocalDate.of(2020, 4, 1), false);

        Patient debbie = new Patient("Debbie", 1, LocalDate.of(1944, 1, 1), Gender.FEMALE);
        Screening screeningDebbie = new Screening(1, debbie, LocalDate.of(2020, 4, 1), false);

        Patient bob = new Patient("Bob", 1, LocalDate.of(1954, 1, 1), Gender.MALE);
        Screening screeningBob = new Screening(1, bob, LocalDate.of(2020, 4, 1), true);

        Patient cathy = new Patient("Cathy", 1, LocalDate.of(1984, 1, 1), Gender.FEMALE);
        Screening screeningCathy = new Screening(1, cathy, LocalDate.of(2020, 4, 1), false);

        List<Screening> screeningList = new ArrayList<>();
        screeningList.add(screeningJoe);
        screeningList.add(screeningDebbie);
        screeningList.add(screeningBob);
        screeningList.add(screeningCathy);

        return screeningList;
    }

}
