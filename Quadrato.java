public class Quadrato {
       /*
    Progettare una classe Quadrato, che permetta di
    • Istanziare la classe con la dimensione del lato del quadrato
    • Ottenere il perimetro del quadrato
    • Stampare il quadrato sulla console
    Scrivere un main che verifica le funzioni delle classi

     */



    //attr
    private double lato;
    double lato2;
    double lato3;
    double lato4;



    //cost
    public Quadrato (double lato){
        this.lato = lato;
        this.lato2 =lato;
        this.lato3 = lato;
        this.lato4= lato;
    }
    ///met

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double Perimetro(){
        return lato*4;
    }
    public String quadratoS(){
        return "Il quadrato è "+lato+" X "+lato+" X "+lato+" X "+lato;
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "lato=" + lato +
                ", lato2=" + lato2 +
                ", lato3=" + lato3 +
                ", lato4=" + lato4 +
                '}';
    }
}
