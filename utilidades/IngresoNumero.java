package utilidades;
import java.util.Scanner;

public class IngresoNumero {

    public static int ingresarNumero (){
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado = 0;
        boolean numeroValido = false;
        do {
            try {
            scanner.nextLine();
            numeroValido = true;
            numeroIngresado = scanner.nextInt();
            }
            catch(Exception e){
                System.out.println("el/los caracter/es ingresados no son numeros, por favor ingrese un numero");
                numeroValido = false;
            }


        }while (numeroValido == false);
        scanner.close();
        return numeroIngresado;
    }
}