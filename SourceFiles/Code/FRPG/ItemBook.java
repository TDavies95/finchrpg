/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;

/**
 *
 * @author 53548
 */
public class ItemBook {
    static Item[] itembook = {new Item("Health Potion",0,10,50)};
    public static Item getItem(int id)
    {
      switch(id){
          case 0:{
              itembook[0].changeQ(-1);
              return itembook[0];
          }
      }
      return new Item(0,null,"Item Not Found",false,-1);
    
    }
}
