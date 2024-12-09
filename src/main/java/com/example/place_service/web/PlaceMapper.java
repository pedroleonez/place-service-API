package com.example.place_service.web;

import com.example.place_service.api.PlaceResponse;
import com.example.place_service.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
