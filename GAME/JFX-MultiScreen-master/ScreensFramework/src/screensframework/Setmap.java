
package screensframework;
public class Setmap extends ScreensController
{


    
    int [][]personX=new int [4][11];
    int [][]personY=new int [4][11];
    
    int [][]mapStatus = new int [13][13];
    int [][]mapCard = new int[13][13];
    int [][]mapShark = new int [13][13];
    boolean [][]mapBoat = new boolean [13][13];
  
    public void setpersonXY(int player,int no_person,int x,int y)
    {
        personX[player-1][no_person-1] = x ;
        personY[player-1][no_person-1] = y ;
    }

}
