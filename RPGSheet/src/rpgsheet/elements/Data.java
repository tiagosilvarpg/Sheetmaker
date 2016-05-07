/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Tiago
 */
public final class Data implements Serializable{
    private int day,month,year;
    
    public Data(Data data) {
        this.day=data.day;
        this.month=data.month;
        this.year=data.year;
    }
    public Data(){
        day=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        year=Calendar.getInstance().get(Calendar.YEAR);
        month=Calendar.getInstance().get(Calendar.MONTH);
    }
    public String getMonth(){
        String []temp=new String[]{"janeiro","fevereiro","marco","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        return temp[month-1];
    }   
    @Override
    public String toString(){
        return day+" de "+getMonth()+" "+year;
    }
    
}
