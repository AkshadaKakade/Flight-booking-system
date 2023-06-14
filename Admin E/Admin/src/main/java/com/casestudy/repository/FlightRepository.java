package com.casestudy.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.model.FlightModel;

@Repository
public interface FlightRepository extends MongoRepository<FlightModel, String> {

	FlightModel findByFlightFromAndFlightTo(String flightFrom, String flightTo);

	FlightModel findByFlightName(String flightName);

	Optional<FlightModel> findByFlightNo(String flightNo);
	
}
