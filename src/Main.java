/*
   Testing 3x +1

   Please call one of the next functions in class Main.
   Temu(int): calculate numbers e iterations
   nNumeros(Int): Calculate 3x+a for n numbers since this number.
*/


//Import para leer lo que escriba el usuario en la consola.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Test 3x+1");
        System.out.println("Comandos: Numero entero, n, Salir");
        System.out.println("");



        boolean play=true;

        while (play){
            // Input based on w3c Documentation:
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Ingresa un número entero positivo       !Escribe: Salir  =>  para finalizar el programa");

            String numero = myObj.nextLine();  // Read user input

            String s = numero.toUpperCase();

            if (s.equals("SALIR") || s.equals("EXIT") || s.equals("X")){
                play=false;
                System.out.println("Finalizando programa....");
            } else if (s.equals("N")) {
                nNumeros(1);
            }else{

                //Captura errores para evitar que el programa termine por un error de entrada del usuario.
                try {
                    //  Block of code to try
                    if(Integer.parseInt(numero)>0){
                        //El usuario
                        Temu(Integer.parseInt(numero));
                    } else if (Integer.parseInt(numero)<=0) {
                        System.out.println("......................................................................................");
                        System.out.println(">>>>> Los números negativos no tienen iteraciones. Intenta nuevamente");
                    }

                }
                catch(Exception e) {
                    //  Block of code to handle errors
                    System.out.println("......................................................................................");
                    System.out.println(">>>>> El valor ingresado no es permitido. Intenta nuevamente");
                }
            }


            System.out.println("......................................................................................");
        }
    }
    //3X+1....................................................
    public static void Temu(int a){
        System.out.println("Numero inicial= " + a);
        int iteration=0;
        while (a>1){
            int b=a%2;
            if(b==0){
                a=a/2;
            }else{
                a=(3*a)+1;
            }
            System.out.print(a +" ");
            iteration++;
        }
        System.out.println(" ");
        System.out.println("Numero de iteraciones= " + iteration);
        System.out.println(" ");

    }

    //3X+1 Para n números

    public static void nNumeros(int numeroInicial){
        while (numeroInicial>0){
            Temu(numeroInicial);
            numeroInicial++;
        }

    }

    
}