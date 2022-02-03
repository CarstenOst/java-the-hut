import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame(){

        this.setTitle("Hola mi amor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                // Avslutte når man avslutte
        this.setResizable(true);                                          // Kan ikke endre størrelsen av framen
        this.setSize(420,420);                                // Bredde og høyde
        this.setVisible(true);                                           // Gjør den synlig
        this.getContentPane().setBackground(new Color(0xFFD700));   // Farge
    }
}