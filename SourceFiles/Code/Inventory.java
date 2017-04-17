/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.FRPG;

/**
 *
 * @author Tim
 */
public class Inventory {
    public Item[] inventory;
    public Item getItem(int pos){
        for (Item n : inventory){
            return inventory[pos];
        }
        return inventory[0];
    }
}
