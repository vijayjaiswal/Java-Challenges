package com.vijay.java.date;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DifferentTimeZone {
	 public static void main(String[] args) {
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
	        LocalDateTime ldt = LocalDateTime.of(2016, Month.AUGUST, 22, 14, 30);
	        System.out.println("LocalDateTime : " + format.format(ldt));
	        //UTC+8
	        ZonedDateTime klDateTime = ldt.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
	        System.out.println("Depart : " + format.format(klDateTime));
	        //UTC+9 and flight duration = 7 hours
	        ZonedDateTime japanDateTime = klDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(7);
	        System.out.println("Arrive : " + format.format(japanDateTime));
	        System.out.println("\n---Detail---");
	        System.out.println("Depart : " + klDateTime);
	        System.out.println("Arrive : " + japanDateTime);
	    }
}
