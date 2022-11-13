package com.train.passenger;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

	private String firstName;
    private String trainName;
	private Integer trainNo;
	private Long travelDate;
		
}
