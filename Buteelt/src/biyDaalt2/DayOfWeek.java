package biyDaalt2;

public class DayOfWeek {
	public int year;
	public int month;
	public int day;
	public DayOfWeek(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getDayOfWeek() {
		if(month == 1 || month == 2 ) {
			year--;
			month+=12;
		}
		int dayOfWeek = (day+(13*(month+1))/5+year+year/4-year/100+year/400)%7;
		return dayOfWeek;
	}		
	}
	