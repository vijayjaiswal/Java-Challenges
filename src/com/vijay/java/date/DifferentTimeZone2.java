package com.vijay.java.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZone2 {
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter
				.ofPattern("HHmm, dd MMM yyyy");
		// Convert String to LocalDateTime
		String date = "2016-08-22 14:30";
		LocalDateTime ldt = LocalDateTime.parse(date,
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		System.out.println("LocalDateTime : " + format.format(ldt));
		// Paris, 2016 Apr-Oct = DST, UTC+2, other months UTC+1
		// UTC+2
		ZonedDateTime parisDateTime = ldt.atZone(ZoneId.of("Europe/Paris"));
		System.out.println("Depart : " + format.format(parisDateTime));
		// hard code a zoneoffset like this, UTC-5
		ZoneOffset nyOffSet = ZoneOffset.of("-05:00");
		ZonedDateTime nyDateTime = parisDateTime.withZoneSameInstant(nyOffSet)
				.plusHours(8).plusMinutes(10);
		System.out.println("Arrive : " + format.format(nyDateTime));
		System.out.println("\n---Detail---");
		System.out.println("Depart : " + parisDateTime);
		System.out.println("Arrive : " + nyDateTime);
	}
}
