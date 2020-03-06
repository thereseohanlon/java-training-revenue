package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.util.List;

public class ScreeningService {

    ScreeningDatabase screeningDatabase;

    public ScreeningService(ScreeningDatabase screeningDatabase) {
        this.screeningDatabase = screeningDatabase;
    }

    public boolean checkScreening(Screening screening, Patient patient) {
        if (screening.getPatient() == patient) {
            return true;
        } else {
            return false;
        }
    }

    public List<Screening> getScreenings() {
        List<Screening> screenings = screeningDatabase.screeningStore();

        return screenings;
    }

    public Screening getScreening(String name) {
        List<Screening> screenings = screeningDatabase.screeningStore();

        for (Screening screening : screenings) {
            if (screening.getPatient().getName().equals(name)) {
                return screening;
            }
        }

        return null;
    }

    public void printScreeningResult(Screening screening) {
        System.out.println("Screening for patient " + screening.getPatient().getName() + ", returned a malignant result of " + screening.isMalignant());
    }

}
