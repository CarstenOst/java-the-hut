import javax.swing.JLabel;
import java.util.*;

public class oppretteBilElns {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Opel Astra");
        label.setHorizontalAlignment(JLabel.CENTER);

        MyFrame myFrame = new MyFrame();
        myFrame.add(label);
        Scanner userInput = new Scanner(System.in);                     // ferdig smekka objekt som styra med input fra terminal



        // input bilmerke
        System.out.println("Skriv inn bil-merke: ");
        String bilMerke = userInput.nextLine();
        label.setText(bilMerke);

        // input årsmodell
        System.out.println("Skriv inn aarsmodell: ");
        int aarsModell = userInput.nextInt();

        // input CC
        System.out.println("Skriv inn cc: ");
        int cc = userInput.nextInt();

        // input hestekrefter
        System.out.println("Skriv inn hestekrefter: ");
        int hk = userInput.nextInt();

        // Oppretter objektet Bil med
        Bil astra = new Bil(bilMerke, aarsModell, cc, hk);
        List<List> mixedTypes = new ArrayList<List>();

        ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(bilMerke));
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>(Arrays.asList(aarsModell, cc, hk));

        ArrayList<String> listOfPrintTekst = new ArrayList<String>();
        mixedTypes.add(listOfStrings);
        mixedTypes.add(listOfIntegers);

        System.out.println("Merke: " +astra.merke);
        System.out.println("Modell: " +astra.getModell());
        System.out.println("CC: " +astra.motor.cc);
        System.out.println("Hestekrefter: " + astra.motor.hesteKrefter);
        System.out.println("Miksa arraylist: "+ mixedTypes);
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



       
    



