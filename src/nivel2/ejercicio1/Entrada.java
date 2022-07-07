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
        boolean continuar = false;
        do {
            try {

                System.out.println(message);
                input = sc.nextInt();
                continuar = true;
                //when everything goes well will be stored in variable input
                //if something goes bad exception is thrown before continuar is set to true and we jump to catch and then we ask for input
                //until everything goes weell and continuar changes to true

            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");

            }
            sc.nextLine();

        } while (!continuar);//
        return input;


    }

    public static byte readByte(String message) {
        byte input = 0;
        boolean continuar = false;
        do {
            try {
                System.out.println(message);
                input = sc.nextByte();
                continuar = true;


            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");


            }
            sc.nextLine();// para limpiar el buffer,lee nro entrada.nextInt pero no el enter.
        } while (!continuar);
        return input;
    }

    public static float readFloat(String message) {
        float input = 0f;
        boolean continuar = false;
        do {
            try {
                System.out.println(message);
                input = sc.nextFloat();
                continuar = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");

            }
            sc.nextLine();
        } while (!continuar);
        return input;
    }

    public static double readDouble(String message) {
        double input = 0d;
        boolean continuar = false;
        do {
            try {
                System.out.println(message);
                input = sc.nextDouble();
                continuar = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato. Introduzca un valor correcto");

            }
            sc.nextLine();
        } while (!continuar);
        return input;
    }

    public static String readString(String message) {
        String mensajeUser = "";
        boolean continuar = false;


        do {
            try {
                System.out.println(message);

                mensajeUser = sc.nextLine();
                continuar = true;


            } catch (Exception e) {
                System.out.println("Error de formato. Introduzca un valor correcto");

            }
        } while (!continuar);
        return mensajeUser;
    }

    public static char readChar(String message) {
        String userMessage = "";
        boolean continuar = false;

        do {
            try {
                System.out.println(message);
                userMessage = sc.nextLine();

                if (userMessage.length() == 1) {
                    continuar = true;
                } else {
                    throw new CharacterFormatException("Introdujiste un texto. No un caracter.Vuelve a intentarlo.");
                    //new object of type characterformatexception so can take any message.
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } while (!continuar);
        return userMessage.charAt(0);
    }

    public static boolean readSiNo(String message) {
        String userMessage ="";
        boolean continuar = false;
        boolean result = false;


        do {
            try {
                System.out.println(message);
                userMessage = sc.nextLine();
                if (userMessage.charAt(0) == 's') {
                    result = true;
                    continuar = true;
                } else if (userMessage.charAt(0) == 'n') {
                    result = false;
                    continuar = true;
                } else {
                    throw new CharacterFormatException("Error de formato. Introduce si o no.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!continuar);
return result;
    }
}