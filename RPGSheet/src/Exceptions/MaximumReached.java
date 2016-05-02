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
public class MaximumReached extends Exception {

    /**
     * Creates a new instance of <code>MaximumReached</code> without detail
     * message.
     */
    public MaximumReached() {
        super("value too high");
    }

    /**
     * Constructs an instance of <code>MaximumReached</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MaximumReached(String msg) {
        super(msg);
    }
}
