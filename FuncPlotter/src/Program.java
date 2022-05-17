import java.awt.Color;

import graphics.Canvas;

public class Program {
    // Canvas GUI instance providing the drawing area on which to plot the functions
    private static Canvas canvas;

    public static void main(String[] args) {
        
        // Create the canvas instance, set its range to x:[-360, 360] and y:[-240, 240] then 
        // open it on the screen. Use canvas.plot(pX, pY) to plot a point at the (pX, pY) coords
        canvas = new Canvas();
        canvas.setRange(-360, -240, 360, 240);
        canvas.open();
        
        
        
       /* Function sinY = (x) -> {return (int) (200 * Math.sin(Math.PI * x / 360));};
        Function quadY = (x) -> {return (int) ((x-200)*(x+200)/250);};
        Function logY = (x) -> {return (int) (20 * Math.log(x));};
        Function cubicY = (x) -> {return (int) (x*x*x/200000);};
        */
        
        Function sinY = new Function() {
        	public int calcY(int x) {
        		return (int) (200 * Math.sin(Math.PI * x / 360));
        	}
        	public Color getColor() {
        		return Color.RED;
        	}
        };
        Function quadY = new Function() {
        	public int calcY(int x) {
        		return (int) ((x-200)*(x+200)/250);
        	}
        	public Color getColor() {
        		return Color.BLUE;
        	}
        };
        Function logY = new Function() {
        	public int calcY(int x) {
        		return (int) (20 * Math.log(x));
        	}
        	public Color getColor() {
        		return Color.MAGENTA;
        	}
        };
        Function cubicY = new Function() {
        	public int calcY(int x) {
        		return (int) (x*x*x/200000);
        	}
        	public Color getColor() {
        		return Color.GREEN;
        	}
        };
        
        drawMethod(sinY, quadY, logY, cubicY);
        // Draw a short red diagonal on the canvas
        
        // Pause and close the canvas then terminate the program.
        canvas.pause();
        canvas.close();
    }
    
    public static void drawMethod(Function... func) {
    	for (int i = 0; i < func.length; i++) {
    		canvas.setColor(func[i].getColor());
    		for (int j = -360; j < 360; j++) {
               canvas.plot(j, func[i].calcY(j));
            }
    	}
    }
}
