package nivel2.ejercicio1;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Put your age");
//        int age= sc.nextInt();

        int age = Entrada.readInt("Introduce tu edad:");
        //putting the return value from Entrada.readInt.[   () is a parameter to readInt function], into variable int age
        //return age from entrada return sc.NextInt()
        byte computers = Entrada.readByte("Introduce el nro de computadoras que tienes en casa:");
        float altura = Entrada.readFloat("Introduce tu  altura:");
        double pi = Entrada.readDouble("Introduce el numero Pi ");
        String message = Entrada.readString("Introduce un mensaje a leer:");
        char character = Entrada.readChar("Introduce un character:");

    }
}