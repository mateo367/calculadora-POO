package aplicacion;
import utilidades.IngresoNumero;
import utilidades.Listas;
import utilidades.Funciones;

public class Iniciador{
    public static void pantallaDeInicio(){
        while (true){
            System.out.println("eliga que quiere realizar");
            System.out.println("eliga que quiere realizar");
            int seleccionMenu = IngresoNumero.ingresarNumero();
            switch (seleccionMenu) {
                case (1):
                    System.out.println("ingrese el primer numero de la suma");
                    int baseSuma = IngresoNumero.ingresarNumero();
                    System.out.println("ingrese el segundo numero de la suma");
                    int sumador = IngresoNumero.ingresarNumero();
                    Funciones.suma(sumador, baseSuma);

                    break;
                case (2):
                    System.out.println("ingrese el primer numero de la suma");
                    int baseResta = IngresoNumero.ingresarNumero();
                    System.out.println("ingrese el segundo numero de la suma");
                    int restador = IngresoNumero.ingresarNumero();
                    Funciones.suma(restador, baseResta);

                    break;
                case (3):
                    System.out.println("ingrese el primer numero de la suma");
                    int baseMult = IngresoNumero.ingresarNumero();
                    System.out.println("ingrese el segundo numero de la suma");
                    int multiplicador = IngresoNumero.ingresarNumero();
                    Funciones.suma(multiplicador, baseMult);


                    break;
                case (4):
                    System.out.println("ingrese el primer numero de la suma");
                    int dividendo = IngresoNumero.ingresarNumero();
                    System.out.println("ingrese el segundo numero de la suma");
                    int divisor;
                    do{
                        divisor = IngresoNumero.ingresarNumero();
                    }while (divisor == 0);
                    Funciones.suma(divisor, dividendo);

                    break;
                case (5):
                    Listas.mostrarLista();
    
                }

            }
        }
    }