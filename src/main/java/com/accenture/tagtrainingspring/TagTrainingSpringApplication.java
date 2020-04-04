package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();

		Patient patient = new Patient("Joe", 1, LocalDate.of(1994, 1, 1), Gender.MALE);
		Screening screeningJoe = new Screening(1, patient, LocalDate.of(2020, 4, 1), false);

		System.out.println("Patient: " + screeningJoe.getPatient().getName() + " has a malignant diagnosis of " + screeningJoe.isMalignant());

		ScreeningService screeningService = new ScreeningService();
		boolean isMatch = screeningService.isPatientScreening(screeningJoe, patient);

		System.out.println("Screening: " + screeningJoe.getScreeningId() + " has a match of " + isMatch + " with patient: "  + patient.getName());

		Patient debbie = new Patient("Debbie", 1, LocalDate.of(1944, 1, 1), Gender.FEMALE);
		Screening screeningDebbie = new Screening(1, debbie, LocalDate.of(2020, 4, 1), false);

		Patient bob = new Patient("Bob", 1, LocalDate.of(1954, 1, 1), Gender.MALE);
		Screening screeningBob = new Screening(1, bob, LocalDate.of(2020, 4, 1), false);

		Patient cathy = new Patient("Cathy", 1, LocalDate.of(1984, 1, 1), Gender.FEMALE);
		Screening screeningCathy = new Screening(1, cathy, LocalDate.of(2020, 4, 1), false);

		List<Screening> screeningList = new ArrayList<>();
		screeningList.add(screeningJoe);
		screeningList.add(screeningDebbie);
		screeningList.add(screeningBob);
		screeningList.add(screeningCathy);

		for (Screening screening : screeningList) {
			System.out.println("Screening for patient " + screening.getPatient().getName() +  ", returned a malignant result of " +  screening.isMalignant());
		}
	}

	private static void printWelcomeMessage() {
		System.out.println("\n" +
				"  _______       _____   _______        _       _             \n" +
				" |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
				"    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
				"    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
				"    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
				"    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
				"                                                        __/ |\n" +
				"                                                       |___/ \n");
	}

}
