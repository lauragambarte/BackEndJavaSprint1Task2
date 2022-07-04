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
        int input = 0;
        boolean continuar;//default value is false
        do {
            try {

                System.out.println(message);
                input = sc.nextInt();
                continuar = false;//when everything goes well then continuar set to false to break the loop, otherwise
                //if something goes bad exception is thrown and we jump to catvh

            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                continuar = true;
            }
            sc.nextLine();

        } while (continuar);//
        return input;


    }

    public static byte readByte(String message) {
        byte input = 0;
        boolean continuar;
        do {
            try {
                System.out.println(message);
                input = sc.nextByte();
                continuar = false;


            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                continuar = true;

            }
            sc.nextLine();
        } while (continuar);
        return input;
    }

    public static float readFloat(String message) {
        float input = 0f;
        boolean continuar;
        do {
            try {
                System.out.println(message);
                input = sc.nextFloat();
                continuar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                continuar = true;
            }
            sc.nextLine();
        } while (continuar);
        return input;
    }

    public static double readDouble(String message) {
        double input = 0d;
        boolean continuar;
        do {
            try {
                System.out.println(message);
                input = sc.nextDouble();
                continuar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                continuar = true;
            }
            sc.nextLine();
        } while (continuar);
        return input;
    }

  public static String readString(String message) {
        String mensajeUser="";
        boolean continuar;


        do {
            try {
                System.out.println(message);

                 mensajeUser=sc.nextLine();
                 continuar=false;


            } catch (Exception e) {
                System.out.println("Error de formato. Introduzca un valor correcto");
                continuar=true;
            }
        } while (continuar);
      return mensajeUser;
    }

       public static char readChar(String message) {
        String userMessage = "";
        boolean continuar;

        do {
            try {
                System.out.println(message);
                userMessage = sc.nextLine();
                continuar=false;
                if (userMessage.length() != 1) {
                    throw new CharacterFormatException("Introdujiste un texto. " + userMessage + " No un caracter.Vuelve a intentarlo.");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                continuar=true;
            }



        }while (continuar);
           return userMessage.charAt(0);
    }
}