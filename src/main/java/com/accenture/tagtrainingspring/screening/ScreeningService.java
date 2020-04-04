package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.util.List;

public class ScreeningService {

    private ScreeningDatabase screeningDatabase;

    public ScreeningService(ScreeningDatabase screeningDatabase) {
        this.screeningDatabase = screeningDatabase;
    }

    public boolean isPatientScreening(Screening screening, Patient patient) {
        return screening.getPatient().getId().equals(patient.getId());
    }

    public List<Screening> getScreenings() {
        return this.screeningDatabase.screenings();
    }

}
