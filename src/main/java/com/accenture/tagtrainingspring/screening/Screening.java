package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {

    private int screeningId;

    private Patient patient;

    private LocalDate screeningDate;

    private boolean malignant;

    public Screening(int screeningId, Patient patient, LocalDate screeningDate, boolean malignant) {
        this.screeningId = screeningId;
        this.patient = patient;
        this.screeningDate = screeningDate;
        this.malignant = malignant;
    }

    public int getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(int screeningId) {
        this.screeningId = screeningId;
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