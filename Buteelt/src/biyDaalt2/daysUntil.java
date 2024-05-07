package biyDaalt2;
import javax.swing.*;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Scanner;

public class daysUntil {
	int year;
	int month;
	int day;
	daysUntil(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	LocalDate june1 = LocalDate.of(year, month, day);
    DayOfWeek currentDayOfWeek = june1.getDayOfWeek();
    int daysUntilMonday = currentDayOfWeek.compareTo(DayOfWeek.MONDAY);
    LocalDate previousMonday = june1.minusDays(daysUntilMonday);
    long daysDifference = java.time.temporal.ChronoUnit.DAYS.between(previousMonday, june1);

}