package biyDaalt2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    	final int semesterOne = 122; //9.1-12.31
        final int semesterTwo = 152; //1.1-6.1 
        final int minor_total_min = TotalMin(minorSubj,times_week,Year);
        final int middle_total_min = TotalMin(middleSubj, times_week,Year);
        final int high_total_min = TotalMin(highSubj, times_week ,Year);
        int UniSubjHour = 3;
        int par = 90;
        int UniSubj = UniSubjHour * par;
        int Uni_total_min = UniSubj * times_week * Year;
        
        
        int fullWeek = (Year / 7) - 1;  // 1978=32 1978=32 1979=32 1980=30 1981=30 82=31 83=30 84=32 85=31 86=31 87=30 88=31 == 
        int interestedSubj = 4 * one_hour;
        int interestedTotal = interestedSubj * fullWeek;
 
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
        
        model.addColumn("Үйлдвэрлэлийн дадлага");
        
        Object[] row1 = {"1978-1981","Сурагч","1-3",1981-1978,amralt,Year,"",minorSubjHour,minorSubjHour,one_hour,minorSubj,minorSubj,times_week,"",minor_total_min/60,};
        Object[] row2 = {"1981-1986","Сурагч","4-8",1986-1981,amralt,Year,38+38+38+38+38,middleSubjHour,middleSubjHourTwo,one_hour,middleSubj,middleSubj2,times_week,interestedTotal,(middle_total_min/60) + interestedTotal};
        Object[] row3 = {"1986-1988","Сурагч","9-10",1988-1986,amralt,Year,"",highSubjHour,highSubjHour,one_hour,highSubj,highSubj,times_week,"",high_total_min/60,};
        Object[] row4 = {"1988-1993","Оюутан","I-V",1993-1988,amralt,Year,"",UniSubjHour,UniSubjHour,par,UniSubj,UniSubj,times_week,"",Uni_total_min/60};
        Object[] row5 = {"","","","","","","","","","","","","","",((Uni_total_min/60)+(minor_total_min/60)+((middle_total_min/60) + interestedTotal)+(high_total_min)/60)};
        Object[] row6 = {"2006-2011","Сурагч","1-5",2011-2006,amralt,Year,"",4,0,30,4*30,0,5,"",(5*273)*2};
        Object[] row7 = {"2011-2018","Сурагч","6-12",2018-2011,amralt,Year,422,6,0,35,6*35,0,5,"",(7*273)*2};
        
       // Object[] row9 = {"","","","","","","","","","","","","","",(};
        model.addRow(row1);
        model.addRow(row2);
        model.addRow(row3); 
        model.addRow(row4);
        model.addRow(row5);
        model.addRow(row6);
        model.addRow(row7);
      //  model.addRow(row8);
       // model.addRow(row9);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JFrame frame = new JFrame("Subject Hours");
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
