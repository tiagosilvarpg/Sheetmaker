/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.frames;

import java.io.Serializable;

/**
 *
 * @author Tiago
 */
public class Data implements Serializable{
    int day,month,year;
    public Data(int i, int i0, int i1) {
        day=i;
        month=i0;
        year=i1;
    }
    
}
