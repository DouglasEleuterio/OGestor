package Util;

/**
 *
 * @author Saulo Cardoso
 */
public class DBException extends Exception {

    public DBException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message);
        System.out.println(cause);
    }

}
