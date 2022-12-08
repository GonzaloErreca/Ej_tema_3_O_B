public class Main {
    public static void main(String[] args) {
        int resultado = suma(10,20,30);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        System.out.println(miCoche.puertas);
           }
    public static int suma(int a,int b,int c) {
        int sumatoria = a + b + c;
        return sumatoria;
    }

    static class Coche {
    public int puertas = 0;
    public void sumarPuerta(){
         this.puertas++ ;
        }
    }
}

//Crear una clase coche.
//
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//
//Una función que incremente el número de puertas que tiene el coche.
//
//Crear un objeto miCoche en el main y añadirle una puerta.
//
//Mostrar el número de puertas que tiene el objeto.