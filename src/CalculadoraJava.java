import java.util.Scanner;           // se incluye la libreria java scanner

public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);  //se escanea lo que se escribe por consola
        while(true){
            //Verificación de las opciones del menu
            try{
                System.out.println("**** Aplicacion Calculadora ****");   // se imprime título de la aplicación
                mostrarMenu();//llamamos a la función del menu
                var operacion = Integer.parseInt(consola.nextLine());      //variable para ingresar el valor seleccionado del menú de arriba
                //Evaluamos si la opcion seleccionada esta dentro del rango de una de las operaciones del 1-4
                if (operacion >= 1 && operacion <= 4){
                  ejecutarOperacion(operacion,consola); //llamamos a la función de operaciones
                } else if (operacion == 5) { //Salir del Programa
                    System.out.println("Estamos saliendo del programa, hasta pronto...");
                    break;
                }else {
                    System.out.println("Lo sentimos, la opción es erronea" + operacion);
                    break;
                }
                System.out.println();
            }//Fin Try
             catch (Exception e){
                 System.out.println("Ocurrio un error:" + e.getMessage());
             }
        }// Fin While
      } //Fin Main

    private static void mostrarMenu(){
        //Imprimimos el menu de la calculadora+
        //System.out.println("1. Suma \n2. Resta\n3. Multiplicacion");
        //Menu en Java con Triple comillas
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
        System.out.print("Por favor ingrese la opción: ");
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Ingrese el primer valor:");
        var operando1 = Double.parseDouble(consola.nextLine());  //se convierte el valor a string a int y se captura el valor en consola
        System.out.print("Ingrese el segundo valor:");                  // se imprime los mensajes para ingresar los valores
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion){
            case 1 ->{ //Suma
                resultado = operando1 + operando2;                           // se ejecuta la operación aritmetica
                System.out.println("Resultado suma: "+ resultado);                    // se imprime el resultado
            }
            case 2 ->{ //Resta
                resultado = operando1 - operando2;                           // se ejecuta la operación aritmetica
                System.out.println("Resultado resta: "+ resultado);                    // se imprime el resultado
            }
            case 3 ->{ //Multiplicacion
                resultado = operando1 * operando2;                           // se ejecuta la operación aritmetica
                System.out.println("Resultado multiplicacion: "+ resultado);                    // se imprime el resultado
            }
            case 4 ->{ //Division
                resultado = operando1 / operando2;                           // se ejecuta la operación aritmetica
                System.out.println("Resultado division: "+ resultado);                    // se imprime el resultado
            }
            default ->
                    System.out.println("Lo sentimos, la operacion ingresada no es válida -> " + operacion);   // se imprime error de la opción

        }

    }


    } //Fin Class

