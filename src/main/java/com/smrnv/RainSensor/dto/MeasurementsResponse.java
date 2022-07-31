package com.smrnv.RainSensor.dto;

import java.util.List;

public class MeasurementsResponse {
    private List<MeasurementDTO> meansurement;

    public MeasurementsResponse(List<MeasurementDTO> meansurement) {
        this.meansurement = meansurement;
    }

    public List<MeasurementDTO> getMeansurement() {
        return meansurement;
    }

    public void setMeansurement(List<MeasurementDTO> meansurement) {
        this.meansurement = meansurement;
    }
}
