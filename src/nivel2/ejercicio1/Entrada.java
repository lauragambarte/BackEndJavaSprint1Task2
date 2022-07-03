package nivel2.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Entrada {
    static Scanner sc = new Scanner(System.in);


    /* boolean continuar;
     do

     {
         try {
             continuar = false;
             System.out.println("Introduzca su edad");
             edad = sc.nextInt();
         } catch (InputMismatchException e) {
             System.out.println("Introduzca un numero entero");
             sc.next();
             continuar = true;
         }
     } while(continuar);
 */
    public static int readInt(String message) {
        do {
            try {
                System.out.println(message);
                int input= sc.nextInt();
                sc.nextLine();
              return input;
                //breaks the loop if I get here
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                sc.next();
            }
        } while (true);

    }

    public static byte readByte(String message) {
        do {
            try {
                System.out.println(message);
                byte input = sc.nextByte();
                sc.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                sc.next();
            }
        } while (true);
    }

    public static float readFloat(String message) {
        do {
            try {
                System.out.println(message);
                float input = sc.nextFloat();
                sc.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                sc.next();
            }
        } while (true);
    }

    public static double readDouble(String message) {
        do {
            try {
                System.out.println(message);

                double input = sc.nextDouble();
                sc.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");

            }
        } while (true);
    }

    public static String readString(String message) {
        String mensajeUser="";

        do {
            try {
                System.out.println(message);

                 mensajeUser=sc.nextLine();

                return mensajeUser;
            } catch (Exception e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
            }
        } while (true);
    }

    public static char readChar(String message) {
        String userMessage = "";

        do {
            try {
                System.out.println(message);

                userMessage = sc.nextLine();
                if (userMessage.length() != 1) {
                    throw new CharacterFormatException("Introdujiste un texto. " + userMessage + " No un caracter.Vuelve a intentarlo.");
                }
                return userMessage.charAt(0);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }



        }while (true);
    }
}