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
public class Pet {
    private String name;
    private Buff buff;
    
    public Pet(){
        name = "";
        Buff buff = new Buff();
    }
    public Pet(String name, Buff buff){
        this.name = name;
        this.buff = buff;
    }
    
}
