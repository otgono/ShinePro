package lab3;

import java.util.ArrayList;

public class HolidayLightsWindow {
    public static void main(String[] args) {
        // ArrayList классыг импортлох
        ArrayList<LightJava> lightList = new ArrayList<>();

        // Light объектүүдийг нэмэх
        lightList.add(new LightJava());
        lightList.add(new LightJava());
        lightList.add(new LightJava());

     
        HolidayLights holidayLights = new RunningHolidayLights(lightList);

      
        ArrayList<LightJava> sequence = (ArrayList<LightJava>) holidayLights.next();

        for (LightJava light : sequence) {
            System.out.println("Light is on: " + light.isOn());
        }
    }
}
