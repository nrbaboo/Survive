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
public class StatusMap {
    public int returnStatusMap(int x,int y)
    {
        switch(x)
        {   
            // Iceland
            case 0 :
            {
                if(y==0 || y==1 || y==11 || y==12) return 4;
                else return 0;
                
            }
            case 1 :
            {
                if(y==0 || y==1 || y==11 || y==12) return 4;
                else return 0;
            }
            case 11 :
            {
                if(y==0 || y==1 || y==11 || y==12) return 4;
                else return 0;
            }
            case 12 :
            {
                if(y==0 || y==1 || y==11 || y==12) return 4;
                else return 0;
            }
            
            case 3 :
            {
                if(y>=4 && y<=8) return 1;
                else return 0;
            }
            case 4 :
            {
                if(y==3 || y==4 || y==8 || y==9) return 1;
                else if(y>=5 && y<=7) return 2;
                else return 0;
            }
            case 5 :
            {
                if(y==3 || y==9) return 1;
                else if(y==4 || y==8) return 2;
                else if(y>=5 && y<=7) return 3;
                else return 0;
            }
            case 6 :
            {
                if(y==3 || y==9) return 1;
                else if(y==4 || y==8) return 2;
                else if(y==5 || y==7) return 3;
                else return 0;
            }
            case 7 :
            {
                if(y==3 || y==9) return 1;
                else if(y==4 || y==8) return 2;
                else if(y>=5 && y<=7) return 3;
                else return 0;
            }
            case 8 :
            {
                if(y==3 || y==4 || y==8 || y==9) return 1;
                else if(y>=5 && y<=7) return 2;
                else return 0;
            }
            case 9 :
            {
                 if(y>=4 && y<=8) return 1;
                 else return 0;
            }
            
            default : return 0;
        }
    }
}
