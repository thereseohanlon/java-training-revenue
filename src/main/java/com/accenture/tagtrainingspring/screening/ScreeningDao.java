package com.accenture.tagtrainingspring.screening;

import java.util.List;

public interface ScreeningDao {

    Screening get(int patientId);

    List<Screening> get();

}
