public class Bil
{
    public String merke;
    private int modell;
    public Integer modeller;
    public Motor motor;


    public Bil()                         // Default byggmester Bobb
    {
        merke = "Opel astra";
        modell = 1993;
        motor = new Motor();
    }

    public Bil(String merke, int modell, int cc, int hk) // kan han fikse?
    {
        this.merke = merke;
        this.modell = modell;
        motor = new Motor(cc, hk);
    }

    public int getModell()
    {
        return modell;
    }
/*
    public void nyModell(int modell)
    {
        this.modell = modell;

        if (this.modell < 2000 && this.modell >= 1990)
        {
            System.out.println("Bra bil");
            return;
        }
        else if (this.modell > 2000 && this.modell <= 2022){
            System.out.println("Dårlig bil");
            return;
        }
        System.out.println("Eksisterer ikke");
    }

 */
}
