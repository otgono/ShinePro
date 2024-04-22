package biyDaalt2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int totalWeekMin = 0;
        int totalWeekHigh2 = 0;
        for(int i = 1; i <= 3; i++) {
            LocalDate date81 = LocalDate.of(1977 + i, 9, 1);
            DayOfWeek dayOfWeek = date81.getDayOfWeek();
            LocalDate date = LocalDate.of(1978 + i, 5, 31);
            DayOfWeek dayOfWeek1 = date.getDayOfWeek();
            int totalWeeks = date81.lengthOfYear() / 7;  
            if(!dayOfWeek.toString().equals("MONDAY")) {
                totalWeeks--;
            }
            if(!dayOfWeek1.toString().equals("SUNDAY")) {
                totalWeeks--;
            }
            totalWeeks -= 13;
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
        }
        int totalWeekMid2 = 0;
        int totalWeekMid = 0;
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
        
            if(!dayOfWeek2.toString().equals("MONDAY")) {
                totalWeeks2--;
            }
            if(!dayOfWeek3.toString().equals("SUNDAY")) {
                totalWeeks2--;
            }
            totalWeeks2 -= 13;
            totalWeekMin2 += totalWeeks2;
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
   
        final int minor_total_min = TotalMin(minorSubj,times_week,Year);
        final int middle_total_min = TotalMin(middleSubj, times_week,Year);
        final int high_total_min = TotalMin(highSubj, times_week ,Year);
        int UniSubjHour = 3;
        int par = 90;
        int UniSubj = UniSubjHour * par;
        int Uni_total_min = UniSubj * times_week * Year;
        
        int interestedSubj = 4 * one_hour;
        int interestedSubjMin2 = 4 * 30;
        int interestedSubj2 = 4 * 35;
        int interesTotalMin = (interestedSubj * totalWeekMin)/60;
        int interesTotalMid = (interestedSubj * totalWeekMid)/60;
        int interesTotalHigh = (interestedSubj * totalWeekHigh)/60;
        
        
        int interesTotalMin2 = (interestedSubjMin2 * totalWeekMin2)/60;
        int interesTotalMid2 = (interestedSubj2 * totalWeekMid2)/60;
        int interesTotalHigh2 = (interestedSubj2 * totalWeekHigh2)/60;
       
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Он");
        model.addColumn("");
        model.addColumn("Анги");
        model.addColumn("Хичээллэх жил");
        model.addColumn("Амралтын Хоног");
        model.addColumn("Жилд");
        model.addColumn("Бүтэн 7 хоног");
        model.addColumn("Хич.цаг(1-5)");
        model.addColumn("Хич.цаг(6)");
        model.addColumn("Хич. минут");
        model.addColumn("Хич.н минут(1-5)");
        model.addColumn("Хич.н минут(6)");
        model.addColumn("7 хон.хэдэн удаа"); 
        model.addColumn("Нийт Сонирхсон");
        model.addColumn("Нийт Цаг");
        model.addColumn("Дадлага");
        model.addColumn("Үйлдвэрлэлийн дадлага");
        
        Object[] row1 = {"1978-1981","Сурагч","1-3",1981-1978,amralt,Year,totalWeekMin,minorSubjHour,minorSubjHour,one_hour,minorSubj,minorSubj,times_week,interesTotalMin,minor_total_min/60};
        Object[] row2 = {"1981-1986","Сурагч","4-8",1986-1981,amralt,Year,totalWeekMid,middleSubjHour,middleSubjHourTwo,one_hour,middleSubj,middleSubj2,times_week,interesTotalMid,(middle_total_min/60)};
        Object[] row3 = {"1986-1988","Сурагч","9-10",1988-1986,amralt,Year,totalWeekHigh,highSubjHour,highSubjHour,one_hour,highSubj,highSubj,times_week,interesTotalHigh,high_total_min/60,};
        Object[] row4 = {"1988-1993","Оюутан","I-V",1993-1988,amralt,Year,191,UniSubjHour,UniSubjHour,par,UniSubj,UniSubj,times_week,"",Uni_total_min/60,40,(40.0/191.0)*100 +"%"};
        Object[] row5 = {"","","","","","","","","","","","","",(interesTotalMin+interesTotalMid+interesTotalHigh),((Uni_total_min/60)+(minor_total_min/60)+(middle_total_min/60)+(high_total_min)/60)};
        Object[] row6 = {"2006-2011","Сурагч","1-5",2011-2006,amralt,Year,totalWeekMin2,4,0,30,4*30,0,5,interesTotalMin2,(5*273)*2};
        Object[] row7 = {"2011-2015","Сурагч","6-9",2018-2011,amralt,Year,totalWeekMid2,6,0,35,6*35,0,5,interesTotalMid2,((4*273)*3)};
        Object[] row8 = {"2015-2018","Сурагч","10-12",2018-2015,amralt,Year,totalWeekHigh2,6,0,35,6*35,0,5,interesTotalHigh2,(3*273)*3};
        Object[] row9 = {"2018-2022","Оюутан","1-4",2022-2018,amralt,Year,153,3,0,90,3*90,0,5,"",(4*273)*4,32,(32.0/153.0)*100};
        Object[] row10 = {"","","","","","","","","","","","","",(interesTotalMin2+interesTotalMid2+interesTotalHigh2),((5*273)*2)+((4*273)*3)+((3*273)*3)+((4*273)*4)};
        model.addRow(row1);
        model.addRow(row2);
        model.addRow(row3); 
        model.addRow(row4);
        model.addRow(row5);
        model.addRow(row6);
        model.addRow(row7);
        model.addRow(row8);
        model.addRow(row9);
        model.addRow(row10);
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
}

