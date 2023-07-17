public class Main {

    public static void main(String[] args) {
        suma(1, 2, 3);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println("Numero puertas: " + miCoche.numeroDePuertas);
    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}
class Coche {
    public int numeroDePuertas = 4;
    public void sumarPuertas(){
        this.numeroDePuertas++;
    }
}