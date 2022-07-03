package nivel2.ejercicio1;

public class CharacterFormatException extends Exception {
    public CharacterFormatException(String message) {
        //constructor of my own customized exception.
        super(message);
        //extending exception and creating my own new message
 /* public Exception(String message) {
            super(message);
        }Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently be initialized by a call to initCause.
                Params:
        message – the detail message. The detail message is saved for later retrieval by the getMessage() method.
    }*/
    }
}