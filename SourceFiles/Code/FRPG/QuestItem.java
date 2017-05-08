/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;

/**
 *
 * @author gryan
 */
public class QuestItem extends Item{
    
    public QuestItem(){   
    super(0,new Buff(),"",false);
}
    public QuestItem(int value, Buff buff, String name, boolean stack){
        super(value, buff, name, stack);
    }      
}
