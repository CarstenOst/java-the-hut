public class Motor {
    public int cc;
    public int hesteKrefter;

    public Motor(int cc, int hk){
        this.cc = cc;
        hesteKrefter = hk;
    }
    public Motor(){
        int divisor = 3;
        cc = 1000;
        hesteKrefter = cc/divisor;
    }
}