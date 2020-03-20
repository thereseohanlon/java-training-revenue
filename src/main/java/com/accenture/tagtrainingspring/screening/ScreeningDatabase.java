package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScreeningDatabase implements ScreeningDao {

    public List<Screening> screeningStore() {
        Patient joe = new Patient(842302, "Joe", LocalDate.of(1901, Month.FEBRUARY, 20), Gender.MALE);
        Patient debbie = new Patient(842517, "Debbie", LocalDate.of(1994, Month.APRIL, 13), Gender.FEMALE);
        Patient john = new Patient(84300903, "John", LocalDate.of(1995, Month.OCTOBER, 18), Gender.MALE);
        Patient cathy = new Patient(84358402, "Cathy", LocalDate.of(1968, Month.DECEMBER, 29), Gender.FEMALE);
        Patient bob = new Patient(84501001, "Bob", LocalDate.of(1957, Month.APRIL, 1), Gender.MALE);

        List<Screening> screenings = new ArrayList<>();

        return screenings;
    }

    @Override
    public Screening get(int patientId) {
        return null;
    }

    @Override
    public List<Screening> get() {
        return null;
    }

}
