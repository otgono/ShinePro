package lab3;
import java.awt.Color;


public class ColoredLight extends LightJava{
	private Color color;
	 
	    public ColoredLight(Color color) {
	        super(); 
	        this.color = color; 
	    }

	    public void randomChange() {
	        super.randomChange();
	        this.color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
	    }

		

}
