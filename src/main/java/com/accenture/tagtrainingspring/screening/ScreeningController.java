package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningService screeningService;

    @RequestMapping("/screening")
    public String getScreening(@RequestParam int id) {
        Screening screening = screeningService.getScreening(id);

        if (screening != null) {
            return (id + " does have a screening with a result of " + screening.getDiagnosis());
        } else {
            return (id + " does not have a screening");
        }
    }

}
