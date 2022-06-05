import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Frame;

/**
 * Main Listener class, implementing all listener interfaces
 * needed for reacting to user actions. An instance of this
 * object is registered with each of the UI components.
 */
public class MyListener implements WindowListener, ActionListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
        ((Frame)e.getSource()).dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Deactivated");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

}
