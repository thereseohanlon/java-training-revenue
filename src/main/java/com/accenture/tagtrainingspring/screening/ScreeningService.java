package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    @Autowired
    ScreeningDatabase screeningDatabase;

    public List<Screening> getScreenings() {
        List<Screening> screenings = screeningDatabase.screeningStore();

        return screenings;
    }

    public Screening getScreening(int id) {
        List<Screening> screenings = screeningDatabase.screeningStore();

        for (Screening screening : screenings) {
            if (screening.getId() == id) {
                return screening;
            }
        }

        return null;
    }

}
