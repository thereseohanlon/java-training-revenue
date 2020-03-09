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
    public String getScreening(@RequestParam String name) {
        Screening screening = screeningService.getScreening(name);

        if (screening != null) {
            return (name + " does have a screening with a result of " + screening.isMalignant());
        } else {
            return (name + " does not have a screening");
        }
    }

}
