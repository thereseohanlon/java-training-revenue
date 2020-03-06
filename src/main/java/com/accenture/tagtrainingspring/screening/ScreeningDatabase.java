package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class ScreeningDatabase {

    public ScreeningDatabase() {

    }

    public List<Screening> screeningStore() {
        Patient joe = new Patient("Joe", LocalDate.of(1901, Month.FEBRUARY, 20), Gender.MALE);
        Patient debbie = new Patient("Debbie", LocalDate.of(1994, Month.APRIL, 13), Gender.FEMALE);
        Patient john = new Patient("John", LocalDate.of(1995, Month.OCTOBER, 18), Gender.MALE);
        Patient cathy = new Patient("Cathy", LocalDate.of(1968, Month.DECEMBER, 29), Gender.FEMALE);
        Patient bob = new Patient("Bob", LocalDate.of(1957, Month.APRIL, 1), Gender.MALE);

        Screening screening1 = new Screening(joe, LocalDate.now(), false);
        Screening screening2 = new Screening(debbie, LocalDate.now(), false);
        Screening screening3 = new Screening(john, LocalDate.now(), true);
        Screening screening4 = new Screening(cathy, LocalDate.now(), true);
        Screening screening5 = new Screening(bob, LocalDate.now(), false);

        List<Screening> screenings = new ArrayList<>();
        screenings.add(screening1);
        screenings.add(screening2);
        screenings.add(screening3);
        screenings.add(screening4);
        screenings.add(screening5);

        return screenings;
    }

}
