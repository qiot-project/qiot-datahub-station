package io.qiot.covid19.datahub.station.util.converter;

import javax.enterprise.context.ApplicationScoped;

import io.qiot.covid19.datahub.station.domain.dto.StationDTO;
import io.qiot.covid19.datahub.station.domain.pojo.Station;

@ApplicationScoped
public class StationConverter {
    public final StationDTO convert(Station station) {

        StationDTO dto = new StationDTO();
        dto.id = station.id.toString();
        dto.serial = station.serial;
        dto.name = station.name;
        // dto.longitude = station.geometry.getX();
        // dto.latitude = station.geometry.getY();
        dto.longitude = station.longitude;
        dto.latitude = station.latitude;
        dto.city = station.city;
        dto.country = station.country;
        dto.countryCode = station.countryCode;
        dto.registeredOn = station.registeredOn;
        station = null;
        return dto;
    }
}
