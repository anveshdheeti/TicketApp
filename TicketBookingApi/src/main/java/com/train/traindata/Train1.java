package com.train.traindata;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Train1 {

	private String trainName;
	private Integer travelDate;
	private String from;
	private String to;
	private String pnrNumber;

		
}
