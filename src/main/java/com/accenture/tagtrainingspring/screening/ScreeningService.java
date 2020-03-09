package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    @Autowired
    ScreeningDatabase screeningDatabase;

    public ScreeningService() {}

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
