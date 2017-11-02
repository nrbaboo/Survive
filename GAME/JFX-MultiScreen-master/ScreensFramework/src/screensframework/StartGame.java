package screensframework;

import java.util.*;

public class StartGame extends ScreensController
{
    
    Setmap setGame = new Setmap();
    int sand  ,forrest ;
    int win[][] = new int[4][11];
    int ranScoreWin[][] = new int[4][11];
    int[] cradEvent1 = new int[]{8, 8, 8, 8, 8, 8, 2, 2, 2, 2, 2, 6,6,6,6,3,3,3,3,3,3,3,3,3};
    int[] cradEvent2 = new int[]{8, 8, 1, 1, 2, 2, 1,1, 5, 5, 6, 6};
    int[] cradEvent3 = new int[]{8, 1, 2,1, 1, 5, 6, 7};
    
    public void initStartGame()
    {
        System.out.println("InitMap");
        StatusMap status = new StatusMap();
        for(int i = 0 ; i < 13 ; i++)
        {
            for(int j = 0 ; j < 13 ; j++)
            {
                setGame.mapStatus[i][j] = status.returnStatusMap(j, i);
                if(setGame.mapStatus[i][j] == 1) sand ++;
                if(setGame.mapStatus[i][j] == 2) forrest ++;
                System.out.print(setGame.mapStatus[i][j]+" "); 
            }
            System.out.println("");
        }
       
     //player 1
       setGame.setpersonXY(1, 1, 6 ,3);
       setGame.setpersonXY(1, 2, 5 ,4);
       setGame.setpersonXY(1, 3, 8 ,4);
       setGame.setpersonXY(1, 4, 3 ,5);
       setGame.setpersonXY(1, 5, 8 ,5);
       setGame.setpersonXY(1, 6, 5 ,7);
       setGame.setpersonXY(1, 7, 7 ,7);
       setGame.setpersonXY(1, 8, 9 ,7);
       setGame.setpersonXY(1, 9, 6 ,8);
       setGame.setpersonXY(1, 10, 4 ,9);
       setGame.setpersonXY(1, 11, 8 ,9);
       //player 2
       setGame.setpersonXY(2, 1, 5 ,3);
       setGame.setpersonXY(2, 2, 3 ,4);
       setGame.setpersonXY(2, 3, 7 ,4);
       setGame.setpersonXY(2, 4, 5 ,5);
       setGame.setpersonXY(2, 5, 4 ,6);
       setGame.setpersonXY(2, 6, 7 ,6);
       setGame.setpersonXY(2, 7, 9 ,6);
       setGame.setpersonXY(2, 8, 3 ,8);
       setGame.setpersonXY(2, 9, 5 ,8);
       setGame.setpersonXY(2, 10, 8 ,8);
       setGame.setpersonXY(2, 11, 7 ,9);
       //player 3
       setGame.setpersonXY(3, 1, 7 ,3);
       setGame.setpersonXY(3, 2, 4 ,4);
       setGame.setpersonXY(3, 3, 9 ,4);
       setGame.setpersonXY(3, 4, 6 ,5);
       setGame.setpersonXY(3, 5, 7 ,5);
       setGame.setpersonXY(3, 6, 3 ,6);
       setGame.setpersonXY(3, 7, 8 ,6);
       setGame.setpersonXY(3, 8, 4 ,7);
       setGame.setpersonXY(3, 9, 7 ,8);
       setGame.setpersonXY(3, 10, 9 ,8);
       setGame.setpersonXY(3, 11, 5 ,9);
       //player 4
       setGame.setpersonXY(4, 1, 4 ,3);
       setGame.setpersonXY(4, 2, 8 ,3);
       setGame.setpersonXY(4, 3, 6 ,4);
       setGame.setpersonXY(4, 4, 4 ,5);
       setGame.setpersonXY(4, 5, 9 ,5);
       setGame.setpersonXY(4, 6, 5 ,6);
       setGame.setpersonXY(4, 7, 3 ,7);
       setGame.setpersonXY(4, 8, 6 ,7);
       setGame.setpersonXY(4, 9, 8 ,7);
       setGame.setpersonXY(4, 10, 4 ,8);
       setGame.setpersonXY(4, 11, 6 ,9);
       
       setGame.mapShark[2][2] = 1;
       setGame.mapShark[2][10] = 2;
       setGame.mapShark[10][2] = 3;
       setGame.mapShark[10][10] = 4;
       setGame.mapShark[6][6] = 5; 
       setGame.mapBoat[2][5] =true;
       setGame.mapBoat[2][7] =true;
       setGame.mapBoat[5][2] =true;
       setGame.mapBoat[5][10] =true;    
       setGame.mapBoat[7][2] =true;
       setGame.mapBoat[7][10] =true;
       setGame.mapBoat[10][5] =true;
       setGame.mapBoat[10][7] =true;
       setGame.mapBoat[2][4] =true;
       setGame.mapBoat[2][5] =true;
       setGame.mapBoat[2][6] =true;
       setGame.mapBoat[2][7] =true;
       setGame.mapBoat[2][8] =true;
       setGame.mapBoat[3][3] =true;
       setGame.mapBoat[3][9] =true;
       setGame.mapBoat[4][2] =true;
       setGame.mapBoat[4][10] =true;
       setGame.mapBoat[5][2] =true;
       setGame.mapBoat[5][10] =true;
       setGame.mapBoat[6][2] =true;
       setGame.mapBoat[6][10] =true;
       setGame.mapBoat[7][2] =true;
       setGame.mapBoat[7][10] =true;
       setGame.mapBoat[8][2] =true;
       setGame.mapBoat[8][10] =true;
       setGame.mapBoat[9][3] =true;
       setGame.mapBoat[9][9] =true;
       setGame.mapBoat[10][4] =true;
       setGame.mapBoat[10][5] =true;
       setGame.mapBoat[10][6] =true;
       setGame.mapBoat[10][7] =true;
       setGame.mapBoat[10][8] =true;
       
    }   

    public boolean setCard(int i,int j)
    {
            int random=0;
            boolean shark = false;
                switch (setGame.mapStatus[i][j])  // statusMap
                    {
                    case 1:
                        do {
                            random = (int) (Math.random() * 24);
                        } while (cradEvent1[random] == -1);
                        setGame.mapCard[i][j]=cradEvent1[random];
                        if(cradEvent1[random] == 8 )
                        {       shark =true;
                        }
                        cradEvent1[random] = -1;
                        return shark; 
                 
                    case 2:
                        do {
                            random = (int) (Math.random() * 12);
                        } while (cradEvent2[random] == -1);
                        setGame.mapCard[i][j]=cradEvent2[random];
                        if(cradEvent2[random] == 8 ) shark =true;
                        cradEvent2[random] = -1;
                        return shark; 
                    case 3:
                        do {
                            random = (int) (Math.random() * 8);
                        } while (cradEvent3[random] == -1);
                        setGame.mapCard[i][j]=cradEvent3[random];
                        if(cradEvent3[random] == 8 ) shark =true;
                        cradEvent3[random] = -1;
                        return shark;
                    default : return shark;
                 }    
    }
    public void randomScorePerson()
    {
        int[] scorePerson = {1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6};
        int ran = 0;
        for(int player=0; player<4; player++)
        {
            for(int number = 0 ; number < 11 ; number++){
                do
                {
                    ran = (int) (Math.random() * 11);
                }while(scorePerson[ran]==-1);
                ranScoreWin[player][number]=scorePerson[ran];
                scorePerson[ran] = -1;
            }
            scorePerson = new int[]{1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6};
        }
    }
}
