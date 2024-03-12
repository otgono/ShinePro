package lab3;

import java.util.List;
import java.util.Random;

public abstract class MyHolidayLights implements HolidayLights {
    private List<LightJava> lights;

    public MyHolidayLights(List<LightJava> lights) {
        this.lights = lights;
    }

    public void randomChange() {
        Random random = new Random();
        int index = random.nextInt(lights.size());
        LightJava light = lights.get(index);
        light.turnOn(); // or turnOff() depending on your requirements
    }

    public void multipleColors() {
        for (LightJava light : lights) {
            if (light instanceof ColoredLight) {
                ColoredLight coloredLight = (ColoredLight) light;
                coloredLight.setColor(getRandomColor());
            }
        }
    }

    private String getRandomColor() {
        String[] colors = {"red", "green", "blue", "yellow", "purple"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

    public void alternatingLights() {
        for (int i = 0; i < lights.size(); i += 2) {
            lights.get(i).turnOn(); // or turnOff() depending on your requirements
        }
    }

    public void blinkLights() {
        for (LightJava light : lights) {
            light.turnOn();
        }
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (LightJava light : lights) {
            light.turnOff();
        }
    }

    @Override
    public List<LightJava> next() {
        // Implement next() method according to the HolidayLights interface
        // For example, return the sequence of lights for the next step
        return lights;
    }
}
