/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exceptions;

/**
 *
 * @author Tiago
 */
public class NoPoints extends Exception {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public NoPoints() {
        super("not enough points");
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NoPoints(String msg) {
        super(msg);
    }
}
