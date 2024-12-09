package com.example.place_service.domain;

import com.example.place_service.api.PlaceRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(null, placeRequest.name(), placeRequest.slug(), placeRequest.state(), placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
