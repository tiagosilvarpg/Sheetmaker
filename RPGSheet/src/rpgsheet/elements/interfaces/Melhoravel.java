/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.interfaces;

import Exceptions.MaximumReached;
import Exceptions.NoPoints;
import rpgsheet.elements.Xp;

/**
 *
 * @author Tiago
 */
public interface Melhoravel {
    
    public abstract void upgrade(final Xp experiencia) throws NoPoints,MaximumReached;
    
}
