/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screensframework;

/**
 *
 * @author NRBaKa
 */
public class PlayerName  extends Screen1Controller
{
    String[] allPlayer = new String[4];
    public void setPlayerName(String name,int index)
    {
        this.allPlayer[index] = name;
        System.out.println("in Class plyayerName(SET) : "+this.allPlayer[0]);
    }
    
}
