package biyDaalt2;

import javax.swing.*;
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

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalJuly2 = 0;
        int totalSep2 = 0;
        int totalJulyUni2 = 0;
        int totalSepUni2 = 0;		
        int totalJuly = 0;
        int totalSep = 0;
        int totalWeekMin = 0;
        int totalWeekHigh2 = 0;
        int totalJulyUni = 0;
        int totalSepUni = 0;
        
        for(int i = 1; i <= 3; i++) {
        	
        	
            LocalDate date81 = LocalDate.of(1977 + i, 9, 1);
            DayOfWeek dayOfWeek = date81.getDayOfWeek();
           
            LocalDate date = LocalDate.of(1978 + i, 5, 31);
            DayOfWeek dayOfWeek1 = date.getDayOfWeek();
            int totalWeeks = date81.lengthOfYear() / 7;  
          
            
            long weeksBetween = ChronoUnit.WEEKS.between(
                    date81.withDayOfMonth(1), // First day of the start month
                    date.withDayOfMonth(date.lengthOfMonth()) // Last day of the end month
                );
           // System.out.println("19 "+weeksBetween);
            if(!dayOfWeek.toString().equals("MONDAY")) {
                totalWeeks--;
            }
            if(!dayOfWeek1.toString().equals("SUNDAY")) {
                totalWeeks--;
            }
            
            totalWeeks -= weeksBetween;
            totalWeekMin += totalWeeks;
            
            
            LocalDate date4 = LocalDate.of(2014 + i, 9, 1);
            DayOfWeek dayOfWeek2 = date4.getDayOfWeek();
            LocalDate dates = LocalDate.of(2015 + i, 5, 31);
            DayOfWeek dayOfWeek3 = dates.getDayOfWeek();
            int totalWeeks2 = date4.lengthOfYear() / 7;  
            if(!dayOfWeek2.toString().equals("MONDAY")) {
                totalWeeks2--;
            }
            if(!dayOfWeek3.toString().equals("SUNDAY")) {
                totalWeeks2--;
            }
            
            totalWeeks2 -= 13;
            totalWeekHigh2 += totalWeeks2;
            
            System.out.println((1978+i)+"-6-1: "+ daysUntilPreviousMonday(1978+i,6));
            System.out.println((1977+i)+"-9-1: "+ daysUntilPreviousMonday(1977+i,6));
           
           totalJuly += daysUntilPreviousMonday(1978+i,6);
           totalSep += daysUntilPreviousMonday(1977+i,6);
           
        }
        
        
        int totalWeekMid2 = 0;
        int totalWeekMid = 0;
        System.out.println(" ");
        for(int i = 1; i <= 4; i++) {
            LocalDate date = LocalDate.of(1980 + i, 9, 1);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            LocalDate date2 = LocalDate.of(1981 + i, 5, 31);
            DayOfWeek dayOfWeek1 = date2.getDayOfWeek();
            int totalWeeks = date.lengthOfYear() / 7;  
           
            if(!dayOfWeek.toString().equals("MONDAY")) {
                totalWeeks--;
            }
            if(!dayOfWeek1.toString().equals("SUNDAY")) {
                totalWeeks--;
            }
            totalWeeks -= 13;
            totalWeekMid += totalWeeks;
            
      
            
            LocalDate date4 = LocalDate.of(2010 + i, 9, 1);
            DayOfWeek dayOfWeek2 = date4.getDayOfWeek();
            LocalDate dates = LocalDate.of(2011 + i, 5, 31);
            DayOfWeek dayOfWeek3 = dates.getDayOfWeek();
            int totalWeeks2 = date4.lengthOfYear() / 7;  
           
            if(!dayOfWeek2.toString().equals("MONDAY")) {
                totalWeeks2--;
            }
            if(!dayOfWeek3.toString().equals("SUNDAY")) {
                totalWeeks2--;
            }
            totalWeeks2 -= 13;
            totalWeekMid2 += totalWeeks2;
            
            System.out.println((2018+i)+"-6-1: "+ daysUntilPreviousMonday(2018+i,6));
            System.out.println((2017+i)+"-9-1: "+ daysUntilPreviousMonday(2017+i,6));
           
           totalJulyUni2 += daysUntilPreviousMonday(2018+i,6);
           totalSepUni2 += daysUntilPreviousMonday(2017+i,6);
        } 
        int totalWeekHigh = 0;
        for(int i = 1; i <= 2; i++) {
            LocalDate date = LocalDate.of(1985 + i, 9, 1);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            LocalDate date2 = LocalDate.of(1986 + i, 5, 31);
            DayOfWeek dayOfWeek1 = date2.getDayOfWeek();
            int totalWeeks = date.lengthOfYear() / 7;  
           
            if(!dayOfWeek.toString().equals("MONDAY")) {
                totalWeeks--;
            }
            if(!dayOfWeek1.toString().equals("SUNDAY")) {
                totalWeeks--;
            }
            totalWeeks -= 13;
            totalWeekHigh += totalWeeks;
        }
        
        
        int totalWeekMin2 = 0;
        for(int i = 1; i <= 5; i++) {
        
            LocalDate date4 = LocalDate.of(2005 + i, 9, 1);
            DayOfWeek dayOfWeek2 = date4.getDayOfWeek();
            LocalDate dates = LocalDate.of(2006 + i, 5, 31);
            DayOfWeek dayOfWeek3 = dates.getDayOfWeek();
            int totalWeeks2 = date4.lengthOfYear() / 7;  
        
            long weeksBetween = ChronoUnit.WEEKS.between(
                    date4.withDayOfMonth(1), // First day of the start month
                    dates.withDayOfMonth(dates.lengthOfMonth()) // Last day of the end month
                );
        //    System.out.println(weeksBetween);
            if(!dayOfWeek2.toString().equals("MONDAY")) {
                totalWeeks2--;
            }
            if(!dayOfWeek3.toString().equals("SUNDAY")) {
                totalWeeks2--;
            }
            totalWeeks2 -= weeksBetween;
            totalWeekMin2 += totalWeeks2;
            
            
            LocalDate date = LocalDate.of(1987 + i, 9, 1);
            DayOfWeek dayOfWeek21 = date.getDayOfWeek();
            LocalDate dates2 = LocalDate.of(1988 + i, 5, 31);
            DayOfWeek dayOfWeek31 = dates2.getDayOfWeek();
            int totalWeeks21 = date4.lengthOfYear() / 7;  
           
            long weeksBetween2 = ChronoUnit.WEEKS.between(
                    date.withDayOfMonth(1), // First day of the start month
                    dates2.withDayOfMonth(dates2.lengthOfMonth()) // Last day of the end month
                );
           // System.out.println("Oyutan: "+weeksBetween2);
            
            if(!dayOfWeek2.toString().equals("MONDAY")) {
                totalWeeks2--;
            }
            if(!dayOfWeek3.toString().equals("SUNDAY")) {
                totalWeeks2--;
            }
            totalWeeks2 -= weeksBetween2;
            totalWeekMid2 += totalWeeks2;
            
            
            System.out.println((1988+i)+"-6-1: "+ daysUntilPreviousMonday(1988+i,6));
            System.out.println((1987+i)+"-9-1: "+ daysUntilPreviousMonday(1987+i,6));
           
           totalJulyUni += daysUntilPreviousMonday(1978+i,6);
           totalSepUni += daysUntilPreviousMonday(1977+i,6);
           
           
           
           
           System.out.println((2006+i)+"-6-1: "+ daysUntilPreviousMonday(2006+i,6));
           System.out.println((2005+i)+"-9-1: "+ daysUntilPreviousMonday(2005+i,6));
          
          totalJuly2 += daysUntilPreviousMonday(1978+i,6);
          totalSep2 += daysUntilPreviousMonday(1977+i,6);
            
        }
        
        
        
        
    	final int amralt = 30 + 31 + 31;
    	final int Year = 365 - amralt;
    	final int times_week = 6;
    	final int one_hour = 45;
    	final int minorSubjHour = 4; 
    	final int middleSubjHour = 34 / 5; //1-5
    	final int middleSubjHourTwo = middleSubjHour - 2; //6
    	final int highSubjHour = 6;
    	final int minorSubj = minorSubjHour * one_hour;
    	final int middleSubj = middleSubjHour * one_hour; //1-5 udriin hicheelleh minut
    	final int middleSubj2 = middleSubjHourTwo * one_hour; //6 udriin hicheelleh minut
    	final int highSubj = highSubjHour * one_hour;
   
        final int minor_total_min = TotalMin(minorSubj,times_week,234);
        final int middle_total_min = TotalMin(middleSubj, times_week,235);
        final int high_total_min = TotalMin(highSubj, times_week ,234);
        int UniSubjHour = 3;
        int par = 90;
        int UniSubj = UniSubjHour * par;
        int Uni_total_min = UniSubj * times_week * Year;
        
        int totalStudiedMin = totalJuly + (38*6) + totalSep;
        int totalStudiedMid = totalJuly + (39*6) + totalSep;
        int totalStudiedHigh = totalJuly + (38*6) + totalSep;
        int totalStudiedUni = totalJulyUni + (191 *6) + totalSepUni;
        
        
        int totalStudiedMid2 = totalJuly2 + (38*5) + totalSep2;
        int totalStudiedMid3= totalJuly2 + (39*5) + totalSep2;
        int totalStudiedMid4 = totalJuly2 + (38*5) + totalSep2;
        int totalStudiedMid5 = totalJuly2+ (38*5) + totalSep2;
        int totalStudiedMid6 = totalJuly2 + (38*5) + totalSep2;
        int totalStudiedUni2 = totalJulyUni2 + (191 *5) + totalSepUni2;
        
        int interestedSubj = 4 * one_hour;
        int interestedSubjMin2 = 4 * 30;
        int interestedSubj2 = 4 * 35;
        int interesTotalMin = (interestedSubj * 38)/60;
        int interesTotalMid = (interestedSubj * 39)/60;
        int interesTotalHigh = (interestedSubj * 38)/60;
        
        
        int interesTotalMin6 = (interestedSubjMin2 * 38)/60;
        int interesTotalMin61 = (interestedSubjMin2 * 39)/60;
        int interesTotalMin62 = (interestedSubjMin2 * 38)/60;
        int interesTotalMin63 = (interestedSubjMin2 * 38)/60;
        int interesTotalMin64 = (interestedSubjMin2 * 38)/60;
        int interesTotalMin65 = (interestedSubjMin2 * totalWeekMin2)/60;
        int interesTotalMid2 = (interestedSubj2 * totalWeekMid2)/60;
        int interesTotalHigh2 = (interestedSubj2 * totalWeekHigh2)/60;
       
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Он");
        model.addColumn("");
        model.addColumn("Анги");
        model.addColumn("Хичээллэх жил");
        model.addColumn("Амралтын Хоног");
        model.addColumn("Жилд");
        model.addColumn("Аж.өдрийн тоо");
        model.addColumn("Бям.өдрийн тоо");
        model.addColumn("Ням гариг");
        model.addColumn("Бүтэн 7 хоног");
        model.addColumn("Тухайн жилд хичээллэх нийт өдөр");
        model.addColumn("Хич.цаг(1-5)");
        model.addColumn("Хич.цаг(6)");
        model.addColumn("Хич. минут");
        model.addColumn("Хич.н минут(1-5)");
      //  model.addColumn("Хич.н минут(6)");
        model.addColumn("7 хон.ажиллах");
       
        model.addColumn("Аж.цаг(1-5)");  //8
        model.addColumn("Аж.цаг(6)"); //6
        model.addColumn("Х.цаг(сонирхсон)");
        model.addColumn("Нийт Сонирхсон");
        model.addColumn("Нийт Цаг");
        model.addColumn("Дадлага 1 хич.жил");
        model.addColumn("Дадлага");
        model.addColumn("Үйлдвэрлэлийн дадлага");
        
        Object[] row1 = {"1978","Сурагч","1",1,amralt,Year,195,39,38,39,234,minorSubjHour,minorSubjHour,one_hour,minorSubj,times_week,8,6,4,interesTotalMin,(minor_total_min/60)+interesTotalMin};
        Object[] row12 = {"1979","Сурагч","2",1,amralt,Year,195,40,39,38,235,minorSubjHour,minorSubjHour,one_hour,minorSubj,times_week,8,6,4,interesTotalMid,(minor_total_min/60)+interesTotalMid};
        Object[] row13 = {"1980","Сурагч","3",1,amralt,Year,195,39,38,39,234,minorSubjHour,minorSubjHour,one_hour,minorSubj,times_week,8,6,4,interesTotalHigh,(minor_total_min/60)+interesTotalHigh};
      //  Object[] row2 = {"1981-1986","Сурагч","4-8",1986-1981,amralt,Year,totalWeekMid,middleSubjHour,middleSubjHourTwo,one_hour,middleSubj,middleSubj2,times_week,interesTotalMid,(middle_total_min/60)};
        //Object[] row3 = {"1986-1988","Сурагч","9-10",1988-1986,amralt,Year,totalWeekHigh,highSubjHour,highSubjHour,one_hour,highSubj,highSubj,times_week,interesTotalHigh,high_total_min/60,};
        Object[] row4 = {"1988-1993","Оюутан","I-V",1993-1988,460,1365,975,190,195,195,totalStudiedUni,UniSubjHour,UniSubjHour,par,UniSubj,times_week,8,6,"","",Uni_total_min/60,8,40,(40.0/191.0)*100 +"%"};
        //Object[] row5 = {"","","","","","","","","","","","","",(interesTotalMin+interesTotalMid+interesTotalHigh),((Uni_total_min/60)+(minor_total_min/60)+(middle_total_min/60)+(high_total_min)/60)};
        Object[] row51 = {"","","","","","","","","","","","","",""};
        Object[] row6 = {"2006","Сурагч","1",1,amralt,Year,38,totalStudiedMid2,4,0,30,4*30,0,5,8,0,4,interesTotalMin6,((5*273)*2)+interesTotalMin6};
        Object[] row61 = {"2007","Сурагч","2",1,amralt,Year,39,totalStudiedMid3,4,0,30,4*30,0,5,8,0,4,interesTotalMin61,((5*273)*2)+interesTotalMin61};
        Object[] row62= {"2008","Сурагч","3",1,amralt,Year,38,totalStudiedMid4,4,0,30,4*30,0,5,8,0,4,interesTotalMin62,((5*273)*2)+interesTotalMin62};
        Object[] row63 = {"2009","Сурагч","4",1,amralt,Year,38,totalStudiedMid5,4,0,30,4*30,0,5,8,0,4,interesTotalMin63,((5*273)*2)+interesTotalMin63};
        Object[] row64 = {"2010","Сурагч","5",1,amralt,Year,38,totalStudiedMid6,4,0,30,4*30,0,5,8,0,4,interesTotalMin64,((5*273)*2)+interesTotalMin64};
        Object[] row52 = {"","","","","","","","","","","","","",""};
      //  Object[] row7 = {"2011-2015","Сурагч","6-9",2018-2011,amralt,Year,totalWeekMid2,6,0,35,6*35,0,5,interesTotalMid2,((4*273)*3)};
        //Object[] row8 = {"2015-2018","Сурагч","10-12",2018-2015,amralt,Year,totalWeekHigh2,6,0,35,6*35,0,5,interesTotalHigh2,(3*273)*3};
        Object[] row9 = {"2018-2022","Оюутан","1-4",2022-2018,amralt,Year,153,totalStudiedUni2,3,0,90,3*90,0,5,"","",8,0,"","",(4*273)*4,8,32,(32.0/153.0)*100};
        //Object[] row10 = {"","","","","","","","","","","","","",(interesTotalMin2+interesTotalMid2+interesTotalHigh2),((5*273)*2)+((4*273)*3)+((3*273)*3)+((4*273)*4)};
        model.addRow(row1);
        model.addRow(row12);
        model.addRow(row13);
      //  model.addRow(row2);
        //model.addRow(row3); 
        model.addRow(row4);
        //model.addRow(row5);
        model.addRow(row51);
        model.addRow(row6);
        model.addRow(row61);
        model.addRow(row62);
        model.addRow(row63);
        model.addRow(row64);
        model.addRow(row9);
        model.addRow(row52);
        //model.addRow(row7);
        //model.addRow(row8);
        
        //model.addRow(row10);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JFrame frame = new JFrame("BD2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setVisible(true);    
    }
    public static int TotalMin(int SubjHour,int times_week, int year) {
    	return SubjHour * times_week * year;
    }  
    public static long daysUntilPreviousMonday(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek currentDayOfWeek = date.getDayOfWeek();
        // Calculate the difference in days between the current day and Monday
        int daysUntilMonday = currentDayOfWeek.compareTo(DayOfWeek.MONDAY);
        // Subtract daysUntilMonday from the 1st of the month to find the previous Monday
        LocalDate previousMonday = date.minusDays(daysUntilMonday);
        // Calculate the number of days between the 1st of the month and the previous Monday
        return java.time.temporal.ChronoUnit.DAYS.between(previousMonday, date);
    }
}

