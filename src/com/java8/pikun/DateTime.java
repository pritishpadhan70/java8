package com.java8.pikun;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.printf("%d-%d-%d",yy,dd,mm);
		System.out.println();
		
		LocalTime time = LocalTime.now();
		int hr = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nanosec = time.getNano();
		System.out.printf("%d:%d:%d:%d",hr,mm,sec,nanosec);
		System.out.println();
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.printf("%d-%d-%d %d:%d:%d:%d",datetime.getDayOfMonth(),datetime.getMonthValue(),
								datetime.getYear(),datetime.getHour(),datetime.getMinute(),
								datetime.getSecond(),datetime.getNano());
		System.out.println();
		
		LocalDateTime dt = LocalDateTime.of(yy,mm,dd,hr,min,sec,nanosec);
		System.out.println(dt);
		System.out.println("After 6 month :"+dt.plusMonths(6));
		System.out.println("Before 4 Month :"+dt.minusMonths(4));
		
		
		LocalDate bd = LocalDate.of(1992, 04, 25);
		LocalDate ld = LocalDate.now();
		Period dur = Period.between(bd, ld);
		System.out.println("Your age is "+dur.getYears()+" Year "+dur.getMonths()+" Months "+dur.getDays()+" Days.");
		
		
		Year  y = Year.of(bd.getYear());
		if(y.isLeap()) {
			System.out.println(y.getValue()+" is a leap Year.");
		}else
			System.out.println(y.getValue()+" is not a leap Year.");
		
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(la);
		System.out.println(zdt);
		
		
	}
}
