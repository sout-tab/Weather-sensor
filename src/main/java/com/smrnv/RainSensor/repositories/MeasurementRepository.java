package com.smrnv.RainSensor.repositories;

import com.smrnv.RainSensor.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
