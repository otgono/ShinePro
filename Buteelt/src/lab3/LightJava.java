package lab3;

import java.util.Random;

public class LightJava {
	  private boolean isOn;

	    public LightJava() {
	        isOn = false;
	    }

	    public void turnOn() {
	        isOn = true;
	    }

	    public void turnOff() {
	        isOn = false;
	    }

	    public boolean isOn() {
	        return isOn;
	    }
	    public void randomChange() {
	        Random random = new Random();
	        boolean randomState = random.nextBoolean();
	        if (randomState) {
	            turnOn();
	        } else {
	            turnOff();
	        }
}
}
