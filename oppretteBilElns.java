import javax.swing.*;
import java.awt.*;
import java.util.*;

public class oppretteBilElns {
    public static void main(String[] args) {
        // Setter inn bilde og resizer til ønsket størrelse
        ImageIcon imageIcon = new ImageIcon("OpelAstra1993.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(220, 220, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);

        JLabel label = new JLabel();
        label.setText("Opel Astra");
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(JLabel.CENTER);

        MyFrame myFrame = new MyFrame();
        myFrame.add(label);
        Scanner userInput = new Scanner(System.in);                     // ferdig smekka objekt som styra med input fra terminal



        // Input bilmerke
        System.out.println("Skriv inn bil-merke: ");
        String bilMerke = userInput.nextLine();
        label.setText(bilMerke);

        // Input årsmodell
        System.out.println("Skriv inn aarsmodell: ");
        int aarsModell = userInput.nextInt();

        // Input CC
        System.out.println("Skriv inn cc: ");
        int cc = userInput.nextInt();

        // Input hestekrefter
        System.out.println("Skriv inn hestekrefter: ");
        int hk = userInput.nextInt();

        // Oppretter objektet Bil med
        Opel astra = new Opel(bilMerke, aarsModell, cc, hk);


        // Override user input
        astra.motor.setNewHesteKrefter(91);

        // System prints status
        callStatusPrint(astra);



        // Array stuff t neste modul
        /*
        List<List> mixedTypes = new ArrayList<List>();

        ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(bilMerke));
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>(Arrays.asList(aarsModell, cc, hk));

        ArrayList<String> listOfPrintTekst = new ArrayList<String>();
        mixedTypes.add(listOfStrings);
        mixedTypes.add(listOfIntegers);

        System.out.println("Miksa arraylist: "+ mixedTypes);
        */
    }
    public static void callStatusPrint(Opel astra){
        statusPrint(astra);
    }


    public static void statusPrint(Opel astra)
    {
        System.out.println("Merke: " +astra.merke);
        System.out.println("Modell: " +astra.getModell());
        System.out.println("CC: " +astra.motor.cc);
        System.out.println("Hestekrefter: " + astra.motor.getHesteKrefter());
    }

}





















        /* // this is some function to find the largest prime factor stuff for bitburner
        long num = 368069660;
        long divisor = 2, largestPrimeFactor;
        while (num != 0) {
            if (num % divisor != 0) {
                divisor++;
            } else {
                largestPrimeFactor = num;
                num /= divisor;
                if (num == 1) {
                    System.out.println("The largest prime factor: " + largestPrimeFactor);
                    break;
                }
            }
        }*/



       
    



