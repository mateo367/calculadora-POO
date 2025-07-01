package utilidades;
import java.util.ArrayList;



public class Listas {
    public static final ArrayList<String> listaCuentas = new ArrayList<String>();

    public static ArrayList<String> mostrarLista(){
        return listaCuentas;
    }

    public static void agregarCuenta(String cuentaString){
        listaCuentas.add(0, cuentaString);
        listaCuentas.remove(4);
    }
}

