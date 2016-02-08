/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionparking;

/**
 *
 * @author daw1
 */
public class ExceptionMatricula extends RuntimeException {

    /**
     * Creates a new instance of <code>ExceptionMatricula</code> without detail
     * message.
     */
    public ExceptionMatricula() {
        super("Matricula no valida");
    }

    /**
     * Constructs an instance of <code>ExceptionMatricula</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionMatricula(String msg) {
        super(msg);
    }
}
