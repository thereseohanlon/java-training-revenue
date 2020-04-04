package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();

		Patient joe = new Patient("Joe", 1, LocalDate.of(1994, 1, 1), Gender.MALE);
		Screening joeScreening = new Screening(1, 1, LocalDate.of(2020, 4, 1), false);

		System.out.println("Patient: " + joe.getName() + " has a malignant diagnosis of " + joeScreening.isMalignant());
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
