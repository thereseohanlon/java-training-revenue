package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningDao screeningDao;

    @GetMapping("/screenings/{id}")
    public String getScreening(@PathVariable int id) {
        Screening screening = screeningDao.get(id);

        if (screening != null) {
            return (id + " does have a screening with a result of " + screening.getDiagnosis());
        } else {
            return (id + " does not have a screening");
        }
    }

    @GetMapping("/screenings")
    public String getScreening() {
        List<Screening> screenings = screeningDao.get();
        return screenings.toString();
    }

}
