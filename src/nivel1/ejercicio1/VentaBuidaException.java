package nivel1.ejercicio1;

public class VentaBuidaException extends Exception {
        public VentaBuidaException(String mensaje) {
        super(mensaje);
        //como siempre tengo el mismo mensaje no necesito el parametro en el constructor
    }
}
