package lab3;
import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
    private List<LightJava> lights;
    private int currentIndex;

    public RunningHolidayLights(List<LightJava> lights) {
        this.lights = lights;
        this.currentIndex = 0;
    }

    @Override
    public int getLength() {
        return lights.size();
    }

    @Override
    public List<LightJava> next() {
        List<LightJava> sequence = new ArrayList<>();

       
        if (currentIndex < lights.size()) {
          
            for (int i = 0; i < getLength(); i++) {
                sequence.add(lights.get((currentIndex + i) % getLength())); 
            }
            currentIndex++; 
        }

        return sequence;
    }
}
