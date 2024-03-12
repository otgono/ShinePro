import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ArrayList классыг импортлох
        ArrayList<ColoredLight> lightList = new ArrayList<>();

        // ColoredLight объектүүдийг нэмэх
        lightList.add(new ColoredLight("red")); // colored light 0
        lightList.add(new ColoredLight("green")); // colored light 1
        lightList.add(new ColoredLight("blue")); // colored light 2
        
        // Get a random index of a specific colored light
        Random random = new Random();
        int randomIndex = random.nextInt(lightList.size()); // Get a random index within the range of lightList size
        
        // Perform an operation on the randomly selected colored light
        ColoredLight randomColoredLight = lightList.get(randomIndex);
        randomColoredLight.setColor("yellow"); // For example, set the color of the randomly selected colored light
        
        // Add a new colored light to the list
        lightList.add(new ColoredLight("purple"));

        // RunningHolidayLights классыг үүсгэж, хэрэгжүүлэх
        HolidayLights holidayLights = new RunningHolidayLights(lightList);

        // HolidayLights объектын next() методыг дуудаж, бүх гэрлийг үүсгэх
        ArrayList<ColoredLight> sequence = (ArrayList<ColoredLight>) holidayLights.next();

        // Үүсгэсэн гэрлийн дарааллыг хэвлэх
        for (ColoredLight coloredLight : sequence) {
            System.out.println("Colored light color: " + coloredLight.getColor());
        }
    }
}


