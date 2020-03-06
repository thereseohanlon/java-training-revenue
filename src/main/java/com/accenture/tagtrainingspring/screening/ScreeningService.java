package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

public class ScreeningService {

    public ScreeningService() {

    }

    public boolean checkScreening(Screening screening, Patient patient) {
        if (screening.getPatient() == patient) {
            return true;
        } else {
            return false;
        }
    }

}
