package launcher;
import gui.*;
import entities.*;
public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen sps = new  SimplePresentationScreen (new  Student (114194, "Villarreta", "Florencia Jaqueline", "florencia.inf@gmailcom", "https://github.com/VillarretaFlorencia", "/images/VillaretaFlorencia.png"));
            	sps.setVisible(true);
            }
        });
    }
}