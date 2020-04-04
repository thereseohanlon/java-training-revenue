package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    @Autowired
    private ScreeningDatabase screeningDatabase;

    public boolean isPatientScreening(Screening screening, Patient patient) {
        return screening.getPatient().getId().equals(patient.getId());
    }

    public List<Screening> getScreenings() {
        return this.screeningDatabase.screenings();
    }

}
