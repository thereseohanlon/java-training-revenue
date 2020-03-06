package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {

    private Patient patient;

    private LocalDate screeningDate;

    private boolean malignant;

    public Screening(Patient patient, LocalDate screeningDate, boolean malignant) {
        this.patient = patient;
        this.screeningDate = screeningDate;
        this.malignant = malignant;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatientId(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getScreeningDate() {
        return screeningDate;
    }

    public void setScreeningDate(LocalDate screeningDate) {
        this.screeningDate = screeningDate;
    }

    public boolean isMalignant() {
        return malignant;
    }

    public void setMalignant(boolean malignant) {
        this.malignant = malignant;
    }

}