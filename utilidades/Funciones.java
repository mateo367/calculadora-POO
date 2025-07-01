package utilidades;

public class Funciones {
    public static void suma (int sumador, int base){
        double suma = base + sumador;
        
        Listas.agregarCuenta(base + "+" + sumador + "=" + suma);
    }
    public static void resta(int restador, int base){
        double resta = base + restador;
        
        Listas.agregarCuenta(base + "-" + restador + "=" + resta);

    }
        public static void multiplicacion(int multiplicador, int base){
        double multiplicacion = base + multiplicador;
        
        Listas.agregarCuenta(base + "*" + multiplicador + "=" + multiplicacion);
    }
        public static void division(int divisor, int dividendo){
        double division = dividendo + divisor;
        
        Listas.agregarCuenta(dividendo + "/" + divisor + "=" + division);

    }
}
