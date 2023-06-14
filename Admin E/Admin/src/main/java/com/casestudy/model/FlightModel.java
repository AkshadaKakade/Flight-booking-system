package com.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="trainsdata")
public class FlightModel {
	
	@Id
	public String flightNo;
	public String flightName;
	public String flightFrom;
	public String flightTo;
	public int fare;
	public int seats;
	public String time;
	
	
	public FlightModel() {
		super();
	}
	
	public FlightModel(String flightNo, String flightName, String flightFrom, String flightTo, int fare, int seats,
			String time) {
		super();
		
		this.flightNo = flightNo;
		this.flightName = flightName;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.fare = fare;
		this.seats = seats;
		this.time = time;
	}
	

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightFrom() {
		return flightFrom;
	}

	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}

	public String getFlightTo() {
		return flightTo;
	}

	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

	@Override
	public String toString() {
		return "FlightModel [flightNo=" + flightNo + ", flightName=" + flightName + ", flightFrom="
				+ flightFrom + ", flightTo=" + flightTo + ", fare=" + fare + ", seats=" + seats + ", time=" + time + "]";
	}

}

