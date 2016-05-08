/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpgsheet.elements.DungeonsAndDragons;

import Exceptions.LevelImprevisto;
import rpgsheet.elements.Data;
import rpgsheet.elements.Vantagem;

/**
 *
 * @author Tiago
 */
public class DungeonsAndDragonsThief extends FichaDungeonsAndDragons{
  public DungeonsAndDragonsThief(String creator,String sistema,Data data){
      super(creator,sistema,data);
  }
   public DungeonsAndDragonsThief(DungeonsAndDragonsThief b){
      super(b.creator,b.system,b.data);
  }
  @Override
  public void updateSkills(int level) throws LevelImprevisto{
    int pagina= findPaginaIndex("Classe");  
    switch (level)
    {
        case 1:
        {
            //skills do level 1
            break;
        }
        case 2:
        {
            //skills do level 1
            break;
        }
        case 3:
        {
            //skills do level 1
            break;
        }
        case 4:
        {
            //skills do level 1
            break;
        }
        case 5:
        {
            //skills do level 1
            break;
        }
        default :{ throw new LevelImprevisto("nao sabemos o que acontece nesse nivel");}
   }
  } 
}
