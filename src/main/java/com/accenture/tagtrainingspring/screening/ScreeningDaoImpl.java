package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ScreeningDaoImpl implements ScreeningDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Screening get(int patientId) {
        return null;
    }

    @Override
    public List<Screening> get() {
        return null;
    }

}
