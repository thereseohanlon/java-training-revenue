package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);

		ScreeningDatabase screeningDatabase = new ScreeningDatabase();
		ScreeningService screeningService = new ScreeningService(screeningDatabase);

		List<Screening> screenings = screeningService.getScreenings();

		for (Screening screening : screenings) {
			screeningService.printScreeningResult(screening);
		}

		String name = "Joe";

		Screening screening = screeningService.getScreening(name);

		if (screening != null) {
			System.out.println(name + " does have a screening with a result of " + screening.isMalignant());
		} else {
			System.out.println(name + " does not have a screening");
		}

	}

}
