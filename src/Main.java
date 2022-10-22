public class Main {
    public static void main(String[] args) {
        //Parte 1
        int resultant = suma(10, 20, 30);
        System.out.println(resultant);

        //Parte 2
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static class Coche {
        int puertas = 2;

        public void agregarPuerta(){
            puertas += 1;
        }
    }
}