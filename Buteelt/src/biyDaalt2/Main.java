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
    	final int middleSubj = middleSubjHour * one_hour;
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
        
        
        int extra_hour = 4;
        int extraSubj = extra_hour * one_hour;
        int extra_minorSubj = minorSubj+extraSubj;
        int extra_middleSubj = middleSubj+extraSubj;
        int extra_highSubj = highSubj+extraSubj;
        
 
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Он");
        model.addColumn("");
        model.addColumn("Анги");
        model.addColumn("Хичээллэх жил");
        model.addColumn("Амралтын Хоног");
        model.addColumn("Жил");
        model.addColumn("Хич.цаг(1-5)");
        model.addColumn("Хич.цаг(6)");
        model.addColumn("Хич. минут");
        model.addColumn("Хич. нийт минут");
        model.addColumn("7 хон.хэдэн удаа"); 
        model.addColumn("Нийт хичээллэсэн Цаг");
        model.addColumn("Үйлдвэрлэлийн дадлага");
        
        Object[] row1 = {"1978-1981","Сурагч","1-3",1981-1978,amralt,Year,minorSubjHour,minorSubjHour,one_hour,minorSubj,times_week,minor_total_min/60};
        Object[] row2 = {"1981-1986","Сурагч","4-8",1986-1981,amralt,Year,middleSubjHour,middleSubjHourTwo,one_hour,middleSubj,times_week,middle_total_min/60};
        Object[] row3 = {"1986-1988","Сурагч","9-10",1988-1986,amralt,Year,highSubjHour,highSubjHour,one_hour,highSubj,times_week,high_total_min/60};
        Object[] row4 = {"1988-1993","Оюутан","I-V",1993-1988,amralt,Year,UniSubjHour,UniSubjHour,par,UniSubj,times_week,Uni_total_min/60};
        Object[] row5 = {"","","","","","","","","","","",(Uni_total_min+minor_total_min+middle_total_min+high_total_min)/60};
        Object[] row6 = {"1978-1981","Сурагч","1-3",1981-1978,amralt,Year,minorSubjHour,minorSubjHour,one_hour,extra_minorSubj,times_week,TotalMin(extra_minorSubj,times_week,Year)/60};
        Object[] row7 = {"1981-1986","Сурагч","4-8",1986-1981,amralt,Year,middleSubjHour,minorSubjHour,one_hour,extra_middleSubj,times_week,TotalMin(extra_middleSubj,times_week,Year)/60};
        Object[] row8 = {"1986-1988","Сурагч","9-10",1988-1986,amralt,Year,highSubjHour,minorSubjHour,one_hour,extra_highSubj,times_week,TotalMin(extra_highSubj,times_week,Year)/60};
        Object[] row9 = {"","","","","","","","","","","",((TotalMin(extra_minorSubj,times_week,Year)+TotalMin(extra_middleSubj,times_week,Year)+TotalMin(extra_highSubj,times_week,Year))/60)-65};
        model.addRow(row1);
        model.addRow(row2);
        model.addRow(row3); 
        model.addRow(row4);
        model.addRow(row5);
        model.addRow(row6);
        model.addRow(row7);
        model.addRow(row8);
        model.addRow(row9);
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
