public class Colore {
    /*
    Progettare una classe Colore, che permette di
    • Rappresentare un colore con i valori RGB (0-255)
    • Esporre due costanti, BIANCO e NERO
    Aggiungere il colore alle classi Quadrato e Cerchio
    • Che di default sia NERO
    • Che sia modificabile
     */

    //att
    private int r;
    private int g;
    private int b;
    boolean yes = false;





    //cost
    public Colore(int r,int g,int b){
        this.r= r;
        this.g= g;
        this.b= b;
    }

    //meth


    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r<= 225)
            return;
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        if (r<= 225)
            return;
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if (r<= 225)
            return;
        this.b = b;
    }
    public static Colore NERO = new Colore(0,0,0);

    public static Colore BIANCO = new Colore(225,225,225);

    @Override
    public String toString() {
        return "Colore{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
