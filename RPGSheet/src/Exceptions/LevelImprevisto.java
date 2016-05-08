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
public class LevelImprevisto extends Exception {

    /**
     * Creates a new instance of <code>LevelImprevisto</code> without detail
     * message.
     */
    public LevelImprevisto() {
        super("Unkwon level");
    }

    /**
     * Constructs an instance of <code>LevelImprevisto</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LevelImprevisto(String msg) {
        super(msg);
    }
}
