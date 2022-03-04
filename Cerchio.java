public class Cerchio {

    /*
    Progettare una classe Cerchio, che permetta di
    • Istanziare la classe con un costruttore che accetta un parametro
    • Ottenere la circonferenza del cerchio
    • Ottenere l’area del cerchio
     */

    //att
    private double raggio;

    private Colore color;

    public Colore getColor() {
        return color;
    }

    public void setColor(Colore color) {
        this.color = color ;
    }

    //costr
    public Cerchio(double raggio,Colore color){
        this.raggio= raggio;
        this.color= color;
    }

    public Cerchio(double raggio) {
        this.raggio = raggio;
        this.color = Colore.NERO;
    }

    //meth
    public double Circonferenza(){
        return 2*Math.PI*raggio;
    }
    public double Area(){
        return Math.PI*(raggio*raggio);
    }


    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public String toString() {
        return "Cerchio{" +
                "raggio=" + raggio +
                ", color=" + color +
                '}';
    }
}
