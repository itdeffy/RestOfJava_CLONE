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
        
        Function sinY = (x) -> {return (int) (200 * Math.sin(Math.PI * x / 360));};
        Function quadY = (x) -> {return (int) ((x-200)*(x+200)/250);};
        Function logY = (x) -> {return (int) (20 * Math.log(x));};
        Function cubicY = (x) -> {return (int) (x*x*x/200000);};
        // Draw a short red diagonal on the canvas
        canvas.pause();
        canvas.setColor(Color.blue);
        int domain = 400;
        for (int i = -domain; i < domain; i++) {
            canvas.plot(i, logY.calcY(i));
        }

        // Pause and close the canvas then terminate the program.
        canvas.pause();
        canvas.close();
    }
}
