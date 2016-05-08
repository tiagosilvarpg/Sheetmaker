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
public class DungeonsAndDragonsWarrior extends FichaDungeonsAndDragons{
  public DungeonsAndDragonsWarrior(String creator,String sistema,Data data){
      super(creator,sistema,data);
  }
   public DungeonsAndDragonsWarrior(DungeonsAndDragonsWarrior b){
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
            this.addCaracteristica (new Vantagem(
                    //nome da vantagem
                    "Rage",
                    //descricao da vantagem
                    "In battle, you fight with primal ferocity. On your turn,you can enter a rage as a bonus action."+
                    "While raging, you gain the following benefits if you aren’t wearing heavy armor:"+
                    "-You have advantage on Strength checks and Strength saving throws"+
                    "-When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian"+
                    ", as shown in the Rage Damage column o f the Barbarian table."+
                    "-You have resistance to bludgeoning, piercing, and slashing damage."                   
            ),pagina);
            break;
        }
        case 2:
        {
            this.addCaracteristica (new Vantagem(
                //nome da vantagem
                "ReclessAttack",
                //descricao da vantagem
                "you can throw aside all concern for defense to attack with fierce desperation."+
                "When you make your first attack on your turn, you can decide to attack recklessly."+
                "Doing so gives you advantage on melee weapon attack rolls using Strength during this turn, "+
                "but attack rolls against you have advantage until your next turn."
            ),pagina);
            this.addCaracteristica(new Vantagem(
                "DangerSense",
                "you gain an uncanny sense of when things nearby aren’t as they should be, "+
                "giving you an edge when you dodge away from danger."+
                "you have advantage on Dexterity saving throws against effects that you can see, "+
                "such as traps and spells."+
                "To gain this benefit, you can’t be blinded, deafened, or incapacitated."
            ),pagina);
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
