import java.awt.Frame;
import java.awt.Insets;

public class Program {

    public static void main(String[] args) {
        System.out.println("Hello to Java Abstract Window Toolkit (AWT)!");
        
        // Create a frame (window) with a title bar.
        // The frame is 600 x 400 pixels, centered on the screen.
        Frame myFrame = new Frame("Java AWT Demo");
        myFrame.setSize(600, 400);
        myFrame.setLocationRelativeTo(null);

        // Make the frame visible
        myFrame.setVisible(true);
        
        // Once the frame is visible, get its insets
        Insets insets = myFrame.getInsets();
        System.out.println("Insets: ");
        System.out.printf("    top=%d, left=%d, bottom=%d, right=%d\n",
                insets.top, insets.left, insets.bottom, insets.right);
        
        // The effective (drawable) area of the frame is 
        // within the (top, left) and (bottom, right) insets.
        int xMin = insets.left;
        int yMin = insets.top;
        int xMax = myFrame.getWidth() - insets.right;
        int yMax = myFrame.getHeight() - insets.bottom;
        System.out.println("Effective (drawable) area:");
        System.out.printf("    from top-left: (%d, %d)\n", xMin, yMin);
        System.out.printf("    to bottom-right: (%d, %d)\n", xMax, yMax);
        
        System.out.println("Goodbye");
    }

}
