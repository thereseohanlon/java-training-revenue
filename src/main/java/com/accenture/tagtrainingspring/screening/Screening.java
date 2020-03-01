package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

public class Screening {

    private int screeningId;

    private int patientId;

    private LocalDate screeningDate;

    private boolean malignant;

    public Screening(int screeningId, int patientId, LocalDate screeningDate, boolean malignant) {
        this.screeningId = screeningId;
        this.patientId = patientId;
        this.screeningDate = screeningDate;
        this.malignant = malignant;
    }

    public int getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(int screeningId) {
        this.screeningId = screeningId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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