public class main {
    public static void main(String[] args) {

        Colore bianco = new Colore(0,0,0);
        Quadrato q1 = new Quadrato(2.0);
        Cerchio c1 = new Cerchio(5.0);
        Cerchio c2 = new Cerchio(3.0,bianco);
        System.out.println(q1);
        System.out.println(q1.Perimetro());
        System.out.println(q1.quadratoS());
        q1.setLato(3.5);
        System.out.println(q1.Perimetro());
        System.out.println(c1);
        c1.setColor(Colore.BIANCO);
        System.out.println(c1);
        System.out.println(c2);

    }
}
