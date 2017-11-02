/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License"). You
 * may not use this file except in compliance with the License. You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */ 

package screensframework;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;



/**
 * FXML Controller class
 *
 * @author Angie
 * 
 */
public class Screen2Controller implements Initializable , ControlledScreen {

    ScreensController myController;
    PlayerName myPlayerName;
    @FXML
    private Label label1;
    @FXML
    private Button btnReady;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private ImageView pic1;
    @FXML
    private ImageView pic2;
    @FXML
    private ImageView pic3;
    @FXML
    private ImageView pic4;
    @FXML
    private ImageView pic5;
    @FXML
    private ImageView pic6;
    @FXML
    private ImageView pic7;
    @FXML
    private ImageView pic8;
    @FXML
    private ImageView pic9;
    @FXML
    private ImageView pic10;
    @FXML
    private ImageView pic11;
    @FXML
    private ImageView pic12;
    @FXML
    private ImageView pic13;
    @FXML
    private ImageView pic14;
    @FXML
    private ImageView pic15;
    @FXML
    private ImageView pic16;
    @FXML
    private ImageView pic17;
    @FXML
    private ImageView pic18;
    @FXML
    private ImageView pic19;
    @FXML
    private ImageView pic20;
    @FXML
    private ImageView pic21;
    @FXML
    private ImageView pic22;
    @FXML
    private ImageView pic23;
    @FXML
    private ImageView pic24;
    @FXML
    private ImageView pic25;
    @FXML
    private ImageView pic26;
    @FXML
    private ImageView pic27;
    @FXML
    private ImageView pic28;
    @FXML
    private ImageView pic29;
    @FXML
    private ImageView pic30;
    @FXML
    private ImageView pic31;
    @FXML
    private ImageView pic32;
    @FXML
    private ImageView pic33;
    @FXML
    private ImageView pic34;
    @FXML
    private ImageView pic35;
    @FXML
    private ImageView pic36;
    @FXML
    private ImageView pic37;
    @FXML
    private ImageView pic38;
    @FXML
    private ImageView pic39;
    @FXML
    private ImageView pic40;
    @FXML
    private ImageView pic41;
    @FXML
    private ImageView pic42;
    @FXML
    private ImageView pic43;
    @FXML
    private ImageView pic44;
    @FXML
    private ImageView pic45;
    @FXML
    private ImageView pic46;
    @FXML
    private ImageView pic47;
    @FXML
    private ImageView pic48;
    @FXML
    private ImageView pic49;
    @FXML
    private ImageView pic50;
    @FXML
    private ImageView pic51;
    @FXML
    private ImageView pic52;
    @FXML
    private ImageView pic53;
    @FXML
    private ImageView pic54;
    @FXML
    private ImageView pic55;
    @FXML
    private ImageView pic56;
    @FXML
    private ImageView pic57;
    @FXML
    private ImageView pic58;
    @FXML
    private ImageView pic59;
    @FXML
    private ImageView pic60;
    @FXML
    private ImageView pic61;
    @FXML
    private ImageView pic62;
    @FXML
    private ImageView pic63;
    @FXML
    private ImageView pic64;
    @FXML
    private ImageView pic65;
    @FXML
    private ImageView pic66;
    @FXML
    private ImageView pic67;
    @FXML
    private ImageView pic68;
    @FXML
    private ImageView pic69;
    @FXML
    private ImageView pic70;
    @FXML
    private ImageView pic71;
    @FXML
    private ImageView pic72;
    @FXML
    private ImageView pic73;
    @FXML
    private ImageView pic74;
    @FXML
    private ImageView pic75;
    @FXML
    private ImageView pic76;
    @FXML
    private ImageView pic77;
    @FXML
    private ImageView pic78;
    @FXML
    private ImageView pic79;
    @FXML
    private ImageView pic80;
    @FXML
    private ImageView pic81;
    @FXML
    private ImageView pic82;
    @FXML
    private ImageView pic83;
    @FXML
    private ImageView pic84;
    @FXML
    private ImageView pic85;
    @FXML
    private ImageView pic86;
    @FXML
    private ImageView pic87;
    @FXML
    private ImageView pic88;
    @FXML
    private ImageView pic89;
    @FXML
    private ImageView pic90;
    @FXML
    private ImageView pic91;
    @FXML
    private ImageView pic92;
    @FXML
    private ImageView pic93;
    @FXML
    private ImageView pic94;
    @FXML
    private ImageView pic95;
    @FXML
    private ImageView pic96;
    @FXML
    private ImageView pic97;
    @FXML
    private ImageView pic98;
    @FXML
    private ImageView pic99;
    @FXML
    private ImageView pic100;
    @FXML
    private ImageView pic101;
    @FXML
    private ImageView pic102;
    @FXML
    private ImageView pic103;
    @FXML
    private ImageView pic104;
    @FXML
    private ImageView pic105;
    @FXML
    private ImageView pic106;
    @FXML
    private ImageView pic107;
    @FXML
    private ImageView pic108;
    @FXML
    private ImageView pic109;
    @FXML
    private ImageView pic110;
    @FXML
    private ImageView pic111;
    @FXML
    private ImageView pic112;
    @FXML
    private ImageView pic113;
    @FXML
    private ImageView pic114;
    @FXML
    private ImageView pic115;
    @FXML
    private ImageView pic116;
    @FXML
    private ImageView pic117;
    @FXML
    private ImageView pic118;
    @FXML
    private ImageView pic119;
    @FXML
    private ImageView pic120;
    @FXML
    private ImageView pic121;
    @FXML
    private ImageView pic122;
    @FXML
    private ImageView pic123;
    @FXML
    private ImageView pic124;
    @FXML
    private ImageView pic125;
    @FXML
    private ImageView pic126;
    @FXML
    private ImageView pic127;
    @FXML
    private ImageView pic128;
    @FXML
    private ImageView pic129;
    @FXML
    private ImageView pic130;
    @FXML
    private ImageView pic131;
    @FXML
    private ImageView pic132;
    @FXML
    private ImageView pic133;
    @FXML
    private ImageView pic134;
    @FXML
    private ImageView pic135;
    @FXML
    private ImageView pic136;
    @FXML
    private ImageView pic137;
    @FXML
    private ImageView pic138;
    @FXML
    private ImageView pic139;
    @FXML
    private ImageView pic140;
    @FXML
    private ImageView pic141;
    @FXML
    private ImageView pic142;
    @FXML
    private ImageView pic143;
    @FXML
    private ImageView pic144;
    @FXML
    private ImageView pic145;
    @FXML
    private ImageView pic146;
    @FXML
    private ImageView pic147;
    @FXML
    private ImageView pic148;
    @FXML
    private ImageView pic149;
    @FXML
    private ImageView pic150;
    @FXML
    private ImageView pic151;
    @FXML
    private ImageView pic152;
    @FXML
    private ImageView pic153;
    @FXML
    private ImageView pic154;
    @FXML
    private ImageView pic155;
    @FXML
    private ImageView pic156;
    @FXML
    private ImageView pic157;
    @FXML
    private ImageView pic158;
    @FXML
    private ImageView pic159;
    @FXML
    private ImageView pic160;
    @FXML
    private ImageView pic161;
    @FXML
    private ImageView pic162;
    @FXML
    private ImageView pic163;
    @FXML
    private ImageView pic164;
    @FXML
    private ImageView pic165;
    @FXML
    private ImageView pic166;
    @FXML
    private ImageView pic167;
    @FXML
    private ImageView pic168;
    @FXML
    private ImageView pic169;
    ImageView []mapPicArr = new ImageView[169];
   
    @FXML
    private ImageView playerone1;
    @FXML
    private ImageView playerone2;
    @FXML
    private ImageView playerone3;
    @FXML
    private ImageView playerone4;
    @FXML
    private ImageView playerone5;
    @FXML
    private ImageView playerone6;
    @FXML
    private ImageView playerone7;
    @FXML
    private ImageView playerone8;
    @FXML
    private ImageView playerone9;
    @FXML
    private ImageView playerone10;
    @FXML
    private ImageView playerone11;
    @FXML
    private Label labelfree;
    @FXML
    private ImageView shark2;
    @FXML
    private ImageView shark1;
    @FXML
    private ImageView shark4;
    @FXML
    private ImageView shark3;
    @FXML
    private ImageView shark5;
    @FXML
    private ImageView shark6;
    @FXML
    private ImageView shark7;
    @FXML
    private ImageView shark8;
    @FXML
    private ImageView shark9;
    @FXML
    private ImageView shark10;
    @FXML
    private ImageView shark11;
    @FXML
    private ImageView shark12;
    @FXML
    private ImageView shark13;
    @FXML
    private ImageView shark14;
    @FXML
    private ImageView playertwo1;
    @FXML
    private ImageView playertwo2;
    @FXML
    private ImageView playertwo3;
    @FXML
    private ImageView playertwo4;
    @FXML
    private ImageView playertwo5;
    @FXML
    private ImageView playertwo6;
    @FXML
    private ImageView playertwo7;
    @FXML
    private ImageView playertwo8;
    @FXML
    private ImageView playertwo9;
    @FXML
    private ImageView playertwo10;
    @FXML
    private ImageView playertwo11;
    @FXML
    private ImageView playerthree1;
    @FXML
    private ImageView playerthree2;
    @FXML
    private ImageView playerthree3;
    @FXML
    private ImageView playerthree4;
    @FXML
    private ImageView playerthree5;
    @FXML
    private ImageView playerthree6;
    @FXML
    private ImageView playerthree7;
    @FXML
    private ImageView playerthree8;
    @FXML
    private ImageView playerthree9;
    @FXML
    private ImageView playerthree10;
    @FXML
    private ImageView playerthree11;
    @FXML
    private ImageView playerfour1;
    @FXML
    private ImageView playerfour2;
    @FXML
    private ImageView playerfour3;
    @FXML
    private ImageView playerfour4;
    @FXML
    private ImageView playerfour5;
    @FXML
    private ImageView playerfour6;
    @FXML
    private ImageView playerfour7;
    @FXML
    private ImageView playerfour8;
    @FXML
    private ImageView playerfour9;
    @FXML
    private ImageView playerfour10;
    @FXML
    private ImageView playerfour11;
    @FXML
    private Label label_energy1;
    @FXML
    private Label label_energy2;
    @FXML
    private Label label_turn;
    @FXML
    private Label label_energy3;
    @FXML
    private Label label_energy4;
    
    
    @FXML
    private ImageView card_img;
    @FXML
    private Button btnMove1;
    @FXML
    private Button btnMove2;
    @FXML
    private Button btnMove3;
    @FXML
    private Button btnMove4;
    @FXML
    private Button btnEnd1;
    @FXML
    private Button btnEnd2;
    @FXML
    private Button btnEnd4;
    @FXML
    private Button btnEnd3;
    @FXML
    private Label command;
    @FXML
    private Label label_sur1;
    @FXML
    private Label label_sur2;
    @FXML
    private Label label_sur3;
    @FXML
    private Label label_sur4;
    @FXML
    private ImageView bg_img;
    @FXML
    private ImageView picEnd;
    @FXML
    private Label showPlayerwin;
    @FXML
    private Label scoreP2;
    @FXML
    private Label scoreP3;
    @FXML
    private Label scoreP4;
    @FXML
    private Label scoreP1;
    @FXML
    private Pane panel_showwin;
    @FXML
    private Label totalS1;
    @FXML
    private Label totalS2;
    @FXML
    private Label totalS3;
    @FXML
    private Label totalS4;
    MediaPlayer sound1;
    Media sound = new Media(new File("src/Sound/shark3.wav").toURI().toString());    
    MediaPlayer sound2 = new MediaPlayer(sound);
    /**
     * Initializes the controller class.
     */
     public void soundBG()
    {
        Media soundM = new Media(new File("src/Sound/bg2.mp3").toURI().toString());    
        sound1 = new MediaPlayer(soundM);
        sound1.setVolume(1.0);
        sound1.setCycleCount(1000);
        sound1.play();
    }
     public void soundShark()
    { 
        sound2.setCycleCount(1000);
        sound1.setVolume(0.35);
       // sound1.pause();
        sound2.setVolume(0.4);
        sound2.play();
    }
    public void animeShark()
    {
        ImageView shark[]={shark1,shark2,shark3,shark4,shark5,shark6,shark7,shark8,shark9,shark10,shark11,shark12,shark13,shark14};
        for(int i=0;i<14;i++){
            TranslateTransition transition1 = new TranslateTransition();
            transition1.setNode(shark[i]);
          //  transition1.setDuration(Duration.seconds(1));
            transition1.setToY(10);
            transition1.setAutoReverse(true);
            transition1.setCycleCount(TranslateTransition.INDEFINITE);
            transition1.play();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        animeShark();
        soundBG();
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;    
    }

    @FXML
    private void goToScreen1(ActionEvent event){
       myController.setScreen(Survive.screen1ID);
    }
    
    @FXML
    private void goToScreen3(ActionEvent event){
       myController.setScreen(Survive.screen3ID);
    }
    StartGame set = new StartGame();
    private void setPic()
    {
        mapPicArr[0]=pic1;
        mapPicArr[1]=pic2;
        mapPicArr[2]=pic3;
        mapPicArr[3]=pic4;
        mapPicArr[4]=pic5;
        mapPicArr[5]=pic6;
        mapPicArr[6]=pic7;
        mapPicArr[7]=pic8;
        mapPicArr[8]=pic9;
        mapPicArr[9]=pic10;
        mapPicArr[10]=pic11;
        mapPicArr[11]=pic12;
        mapPicArr[12]=pic13;
        mapPicArr[13]=pic14;
        mapPicArr[14]=pic15;
        mapPicArr[15]=pic16;
        mapPicArr[16]=pic17;
        mapPicArr[17]=pic18;
        mapPicArr[18]=pic19;
        mapPicArr[19]=pic20;
        mapPicArr[20]=pic21;
        mapPicArr[21]=pic22;
        mapPicArr[22]=pic23;
        mapPicArr[23]=pic24;
        mapPicArr[24]=pic25;
        mapPicArr[25]=pic26;
        mapPicArr[26]=pic27;
        mapPicArr[27]=pic28;
        mapPicArr[28]=pic29;
        mapPicArr[29]=pic30;
        mapPicArr[30]=pic31;
        mapPicArr[31]=pic32;
        mapPicArr[32]=pic33;
        mapPicArr[33]=pic34;
        mapPicArr[34]=pic35;
        mapPicArr[35]=pic36;
        mapPicArr[36]=pic37;
        mapPicArr[37]=pic38;
        mapPicArr[38]=pic39;
        mapPicArr[39]=pic40;
        mapPicArr[40]=pic41;
        mapPicArr[41]=pic42;
        mapPicArr[42]=pic43;
        mapPicArr[43]=pic44;
        mapPicArr[44]=pic45;
        mapPicArr[45]=pic46;
        mapPicArr[46]=pic47;
        mapPicArr[47]=pic48;
        mapPicArr[48]=pic49;
        mapPicArr[49]=pic50;
        mapPicArr[50]=pic51;
        mapPicArr[51]=pic52;
        mapPicArr[52]=pic53;
        mapPicArr[53]=pic54;
        mapPicArr[54]=pic55;
        mapPicArr[55]=pic56;
        mapPicArr[56]=pic57;
        mapPicArr[57]=pic58;
        mapPicArr[58]=pic59;
        mapPicArr[59]=pic60;
        mapPicArr[60]=pic61;
        mapPicArr[61]=pic62;
        mapPicArr[62]=pic63;
        mapPicArr[63]=pic64;
        mapPicArr[64]=pic65;
        mapPicArr[65]=pic66;
        mapPicArr[66]=pic67;
        mapPicArr[67]=pic68;
        mapPicArr[68]=pic69;
        mapPicArr[69]=pic70;
        mapPicArr[70]=pic71;
        mapPicArr[71]=pic72;
        mapPicArr[72]=pic73;
        mapPicArr[73]=pic74;
        mapPicArr[74]=pic75;
        mapPicArr[75]=pic76;
        mapPicArr[76]=pic77;
        mapPicArr[77]=pic78;
        mapPicArr[78]=pic79;
        mapPicArr[79]=pic80;
        mapPicArr[80]=pic81;
        mapPicArr[81]=pic82;
        mapPicArr[82]=pic83;
        mapPicArr[83]=pic84;
        mapPicArr[84]=pic85;
        mapPicArr[85]=pic86;
        mapPicArr[86]=pic87;
        mapPicArr[87]=pic88;
        mapPicArr[88]=pic89;
        mapPicArr[89]=pic90;
        mapPicArr[90]=pic91;
        mapPicArr[91]=pic92;
        mapPicArr[92]=pic93;
        mapPicArr[93]=pic94;
        mapPicArr[94]=pic95;
        mapPicArr[95]=pic96;
        mapPicArr[96]=pic97;
        mapPicArr[97]=pic98;
        mapPicArr[98]=pic99;
        mapPicArr[99]=pic100;
        mapPicArr[100]=pic101;
        mapPicArr[101]=pic102;
        mapPicArr[102]=pic103;
        mapPicArr[103]=pic104;
        mapPicArr[104]=pic105;
        mapPicArr[105]=pic106;
        mapPicArr[106]=pic107;
        mapPicArr[107]=pic108;
        mapPicArr[108]=pic109;
        mapPicArr[109]=pic110;
        mapPicArr[110]=pic111;
        mapPicArr[111]=pic112;
        mapPicArr[112]=pic113;
        mapPicArr[113]=pic114;
        mapPicArr[114]=pic115;
        mapPicArr[115]=pic116;
        mapPicArr[116]=pic117;
        mapPicArr[117]=pic118;
        mapPicArr[118]=pic119;
        mapPicArr[119]=pic120;
        mapPicArr[120]=pic121;
        mapPicArr[121]=pic122;
        mapPicArr[122]=pic123;
        mapPicArr[123]=pic124;
        mapPicArr[124]=pic125;
        mapPicArr[125]=pic126;
        mapPicArr[126]=pic127;
        mapPicArr[127]=pic128;
        mapPicArr[128]=pic129;
        mapPicArr[129]=pic130;
        mapPicArr[130]=pic131;
        mapPicArr[131]=pic132;
        mapPicArr[132]=pic133;
        mapPicArr[133]=pic134;
        mapPicArr[134]=pic135;
        mapPicArr[135]=pic136;
        mapPicArr[136]=pic137;
        mapPicArr[137]=pic138;
        mapPicArr[138]=pic139;
        mapPicArr[139]=pic140;
        mapPicArr[140]=pic141;
        mapPicArr[141]=pic142;
        mapPicArr[142]=pic143;
        mapPicArr[143]=pic144;
        mapPicArr[144]=pic145;
        mapPicArr[145]=pic146;
        mapPicArr[146]=pic147;
        mapPicArr[147]=pic148;
        mapPicArr[148]=pic149;
        mapPicArr[149]=pic150;
        mapPicArr[150]=pic151;
        mapPicArr[151]=pic152;
        mapPicArr[152]=pic153;
        mapPicArr[153]=pic154;
        mapPicArr[154]=pic155;
        mapPicArr[155]=pic156;
        mapPicArr[156]=pic157;
        mapPicArr[157]=pic158;
        mapPicArr[158]=pic159;
        mapPicArr[159]=pic160;
        mapPicArr[160]=pic161;
        mapPicArr[161]=pic162;
        mapPicArr[162]=pic163;
        mapPicArr[163]=pic164;
        mapPicArr[164]=pic165;
        mapPicArr[165]=pic166;
        mapPicArr[166]=pic167;
        mapPicArr[167]=pic168;
        mapPicArr[168]=pic169;
    }
    @FXML
    private void btnReady(MouseEvent event) {
        btnMove1.setVisible(true);
        btnReady.setVisible(false);
        showSurvivor();
        setPic();
        Image img = new Image("Pic/c1.jpg");
        bg_img.setImage(img);
        start = 1;
        command.setText("Move person.");
        Screen1Controller f1 = new Screen1Controller();
        PlayerName namePlayer = f1.getPlayer();
        label1.setText(""+namePlayer.allPlayer[0]);
        label2.setText(""+namePlayer.allPlayer[1]);
        label3.setText(""+namePlayer.allPlayer[2]);
        label4.setText(""+namePlayer.allPlayer[3]);
        set.initStartGame();
        for(int i=0 ; i< 11 ; i++)
        System.out.println("Player1 No."+(i+1)+" :  ( "+ set.setGame.personX[0][i]+" , "+set.setGame.personY[0][i]+" )");
        setRanShark();
        showEnergy();
        btnReady.setVisible(false);
        for(int i = 0 ; i < 13 ; i++)
        {
            for(int j = 0 ;j< 13 ;j++)
                System.out.print(set.setGame.mapCard[i][j]+" ");
            System.out.println("");
        }
        set.randomScorePerson();
        System.out.print("Player1 : ");
        for(int i =0;i<11;i++)
        {
            System.out.print(set.ranScoreWin[0][i]+" ");
        }
        img = new Image("Pic/c1.gif");
        bg_img.setImage(img);
    }
     // Golbal 
      int maxEnergy = 3;
     Image img ;
     int indexSelect = -1,energyShark=0;
     int turn = 1,energy = maxEnergy ;
     boolean turnShark = false  , turnOpenCard = false ,killShark = false , teleShark = false ;
     double mouseX,mouseY;
     int countNewShark = 6;
     ImageView selectPlayerImg;
     ImageView shark;
     int survivor[]=new int[4];
     ImageView picBoat;
     int changBoat =0,changPlayer=0,start =-1;
     boolean nojump=false;
    
    public void setRanShark()
    {   
        boolean haveShark;
        for (int i = 3; i < 10; i++) 
        {
            for (int j = 3; j < 10; j++) 
            {
                haveShark = set.setCard(i,j);
                if(haveShark)
                {
                    set.setGame.mapShark[i][j] = countNewShark;
                    ImageView imgShark = findShark(countNewShark++);
                    imgShark.setLayoutX((j+1)*70+16-52.5);
                    imgShark.setLayoutY((i+1)*70+98-52.5);
                    Image img = new Image("Pic/Shark.png");
                    imgShark.setImage(img);
                    imgShark.setVisible(false);
                    System.out.println(j+":"+i+" // Card  : "+set.setGame.mapCard[i][j]);
                }
            }
        }
    }
      public ImageView findShark(int index)
    {
         switch(index-1)
        {
            case 0 :   return shark1;
            case 1 :   return shark2;
            case 2 :   return shark3;
            case 3 :   return shark4;
            case 4 :   return shark5;
            case 5 :   return shark6;
            case 6 :   return shark7;
            case 7 :   return shark8;
            case 8 :   return shark9;
            case 9 :   return shark10;
            case 10 :  return shark11;
            case 11 :  return shark12;
            case 12 :  return shark13;
            case 13 :  return shark14;
            
            default :  return null;
        }
    }
     public ImageView findPlayer(int index)
    {
        if(turn==1)
        {
            switch(index)
           {
               case 0 :   return playerone1;
               case 1 :   return playerone2;
               case 2 :   return playerone3;
               case 3 :   return playerone4;
               case 4 :   return playerone5;
               case 5 :   return playerone6;
               case 6 :   return playerone7;
               case 7 :   return playerone8;
               case 8 :   return playerone9;
               case 9 :   return playerone10;
               case 10 :  return playerone11;
               default :  return null;
           }
        }
        else if(turn==2)
        {
            switch(index)
           {
               case 0 :   return playertwo1;
               case 1 :   return playertwo2;
               case 2 :   return playertwo3;
               case 3 :   return playertwo4;
               case 4 :   return playertwo5;
               case 5 :   return playertwo6;
               case 6 :   return playertwo7;
               case 7 :   return playertwo8;
               case 8 :   return playertwo9;
               case 9 :   return playertwo10;
               case 10 :  return playertwo11;
               default :  return null;
           }
        }
         else if(turn==3)
        {
            switch(index)
           {
               case 0 :   return playerthree1;
               case 1 :   return playerthree2;
               case 2 :   return playerthree3;
               case 3 :   return playerthree4;
               case 4 :   return playerthree5;
               case 5 :   return playerthree6;
               case 6 :   return playerthree7;
               case 7 :   return playerthree8;
               case 8 :   return playerthree9;
               case 9 :   return playerthree10;
               case 10 :  return playerthree11;
               default :  return null;
           }
        }
        else if(turn==4)
        {
            switch(index)
           {
               case 0 :   return playerfour1;
               case 1 :   return playerfour2;
               case 2 :   return playerfour3;
               case 3 :   return playerfour4;
               case 4 :   return playerfour5;
               case 5 :   return playerfour6;
               case 6 :   return playerfour7;
               case 7 :   return playerfour8;
               case 8 :   return playerfour9;
               case 9 :   return playerfour10;
               case 10 :  return playerfour11;
               default :  return null;
           }
        }
        else return null;
    }
     public void selectPlayer(int turnClick,ImageView player,int index)
     {
        if(turnShark==true)return;
        if(turnClick!=turn) return;
        if(turnOpenCard) return;
        if(index==indexSelect)return;
        if(changBoat==1)
        {
            Image img = new Image("Pic/Boat.jpg");
            picBoat.setImage(img);
            picBoat=new ImageView();
            changBoat=0;
        }
        if(turn==1)
            img = new Image("Pic/p1select.png");
        else if(turn==2)
            img = new Image("Pic/p2select.png");
        else if(turn==3)
            img = new Image("Pic/p3select.png");
        else if(turn==4)
            img = new Image("Pic/p4select.png");
        
        player.setImage(img);
        if(indexSelect != -1)
        unselectPlayer(indexSelect);
        indexSelect = index;
     }
     public void unselectPlayer(int indexPlayer)
     {
        if(turn == 1)
        img = new Image("Pic/p1.png");
        else if(turn==2)
        img = new Image("Pic/p2.png");
        else if(turn==3)
        img = new Image("Pic/p3.png");
        else if(turn==4)
        img = new Image("Pic/p4.png");
        
        ImageView pic = findPlayer(indexPlayer);
        pic.setImage(img);
    }
     public void selectShark(ImageView shark,int index)
     {
        if(index==indexSelect)return;
        img = new Image("Pic/SharkSelect.png");
        shark.setImage(img);
        if(indexSelect != -1)
        unselectShark(indexSelect);
        indexSelect = index;
     }
     public void unselectShark(int indexPlayer)
    {
        img = new Image("Pic/Shark.png");
        ImageView pic = findShark(indexPlayer);
        pic.setImage(img);
    }
    
    
     public void randomMoveShark()
    {
        energyShark = (int)(0.5+Math.random() * 3);
        if(energyShark==3)energyShark--;
        turnShark = true;
        soundShark();
        if(energyShark == 0){
            turnShark =false;
            unvisibleEndTurn();
        }
        if(energyShark<2)command.setText("Move shark "+ energyShark +" tile.");
        else command.setText("Move shark "+ energyShark +" tiles.");
    }
     @FXML
    private void clickShark(MouseEvent event) {
        if(start==-1)
        {          
            return;    
        }
        shark = (ImageView)event.getSource();
        String str = (String)shark.idProperty().get(),str2;
        str2 = str.substring(5);
        int indexShark= Integer.parseInt(str2);
        if(turnShark==true)
        {
            selectShark(shark,indexShark);
        }
        if(killShark==true)
        {
            shark.setVisible(false);
            for(int y=0;y<13;y++)
            {
                for(int x=0;x<13;x++)
                {
                    if(set.setGame.mapShark[y][x]==indexShark)
                    {
                        set.setGame.mapShark[y][x] = 0;
                        y=13; 
                        break;    
                    }
                }
            }
            killShark=false;
            randomMoveShark();
           
        }
        else if(teleShark == true)
        {
            selectShark(shark,indexShark);
        }
    }
    public int no_player(MouseEvent event)
    {
        ImageView testPic = new ImageView();
        testPic = (ImageView)event.getSource();
        String str = testPic.idProperty().get(),str2 = " ";
        switch (turn) {
            case 1:
                str2 = str.substring(9);
                break;
            case 2:
                str2 = str.substring(9);
                break;
            case 3:
                str2 = str.substring(11);
                break;
            case 4:
                str2 = str.substring(10);
                break;
            default:
                break;
        }
        
        int index = Integer.parseInt(str2);    
        return index;
    }
    @FXML
    private void clickPlayerOne(MouseEvent event) {  
       if(turn==1&&start==1){
        int number =  no_player(event);
        ImageView playerPic = new ImageView();
        playerPic = (ImageView)event.getSource();
        selectPlayer(1,playerPic,number-1);
        selectPlayerImg = (ImageView) event.getSource();
       }

    }
    @FXML
    private void clickPlayerTwo(MouseEvent event) {
        if(turn==2&&start==1){
        int number =  no_player(event);
        ImageView playerPic = new ImageView();
        playerPic = (ImageView)event.getSource();
        selectPlayer(2,playerPic,number-1);
        selectPlayerImg = (ImageView) event.getSource();
        }
    }
    
   @FXML
    private void clickPlayerThree(MouseEvent event) { 
        if(turn==3&&start==1){
            int number =  no_player(event);     
            ImageView playerPic = new ImageView();
            playerPic = (ImageView)event.getSource();
            selectPlayer(3,playerPic,number-1);
            selectPlayerImg = (ImageView) event.getSource();
        }
    }
    
     @FXML
    private void clickPlayerFour(MouseEvent event) {
        if(turn==4&&start==1){
            int number =  no_player(event);
            ImageView playerPic = new ImageView();
            playerPic = (ImageView)event.getSource();
            selectPlayer(4,playerPic,number-1); 
            selectPlayerImg = (ImageView) event.getSource();
        }
       
    }
    
    public void showEnergy()
    {
        switch(turn)
        {
            case 1 : label_energy1.setText(""+energy); break;
            case 2 : label_energy2.setText(""+energy); break;
            case 3 : label_energy3.setText(""+energy); break;
            case 4 : label_energy4.setText(""+energy); break;
        }
        System.out.println("ENERGY   "+energy);
    }
    
    public void endMove()
    {
        energy=0;
        showEnergy();
        turnOpenCard = true ; 
        
        if(indexSelect != -1 )unselectPlayer(indexSelect);
        
        indexSelect = -1;
        selectPlayerImg = new ImageView();
        command.setText("Click to open map.");
        if(changBoat==0)return;
        Image img = new Image("Pic/Boat.jpg");
        picBoat.setImage(img);
    }
    @FXML
    private void btnMove1(MouseEvent event) {
        if(turn==1)endMove();
        btnMove1.setVisible(false);
    }
    @FXML
    private void btnMove2(MouseEvent event) {
        if(turn==2)endMove();
        btnMove2.setVisible(false);
    }
     @FXML
    private void btnMove3(MouseEvent event) {
        if(turn==3)endMove();
        btnMove3.setVisible(false);
    }
    @FXML
    private void btnMove4(MouseEvent event) {
        if(turn==4)endMove();
        btnMove4.setVisible(false);
    }
    public void endTurn()
    {
        energy = maxEnergy;
        showEnergy();
        command.setText("Move person.");
        indexSelect =-1;
        Image img = new Image("Pic/Shark.png");
        shark.setImage(img);
        shark = new ImageView();
        img = new Image("Pic/c"+turn+".gif");
        bg_img.setImage(img);
    }
    @FXML
    private void btnEnd1(MouseEvent event) {
         if(turn==1)
        {
            turn=2;
            btnEnd1.setVisible(false);
            btnMove2.setVisible(true);
            label_turn.setText("Player 2");
            endTurn();
        }  
    }
    @FXML
    private void btnEnd2(MouseEvent event) {
        if(turn==2)
        {
            turn=3;
            btnEnd2.setVisible(false);
            btnMove3.setVisible(true);
            label_turn.setText("Player 3");
            endTurn();
            
        }  
    }
    @FXML
    private void btnEnd3(MouseEvent event) {
         if(turn==3)
        {
            turn=4;
            btnEnd3.setVisible(false);
            btnMove4.setVisible(true);
            label_turn.setText("Player 4");
            endTurn();
           
        }  
    }

    @FXML
    private void btnEnd4(MouseEvent event) {
        if(turn==4)
        {
            turn=1;
            btnEnd4.setVisible(false);
            btnMove1.setVisible(true);
            label_turn.setText("Player 1");
            endTurn();
        }  
    }
    // method Check
    public boolean canMove(int blockX,int blockY,int x,int y)
    {
        boolean move = false;
        System.out.println("Can Move Block X Y"+blockX+" "+blockY);      
        System.out.println("Can Move       X Y"+x+" "+y);
        if( y==blockY && (x == blockX+1 || x == blockX-1))  move = true;
        if( x==blockX && (y == blockY+1 || y == blockY-1)) move = true;
        return move ;
    }  
    public boolean deadZone(int blockX,int blockY)
    {
        int shark = set.setGame.mapShark[blockY][blockX];
        if(shark==0) return false; 
        else {     
            return true;   
        }   
    }
    public void sharkKill(int blockX,int blockY)
    {
         for(int player = 0 ; player <4 ;player++)
                {
                    for(int number = 0 ; number < 11 ; number++)
                    {
                         if(set.setGame.personX[player][number]==blockX && set.setGame.personY[player][number]==blockY )
                         {
                             System.out.println("Die >>> Player : "+(player+1)+"   No. : "+(number+1));
                             ImageView die = new ImageView();
                             die = findWhodie(player,number);
                             die.setVisible(false);
                             command.setText("Shark kill.");
                         }
                    }
                }
    }
    public void moveBoat(MouseEvent event,int blockX,int blockY)
    {
        ImageView newBlock = (ImageView)event.getSource();
        int statusMap = set.setGame.mapStatus[blockY][blockX];
        Image img = new Image("Pic/Boat.jpg");
        Image img2 = new Image("Pic/Water2.jpg"); 
        if(statusMap==1)img2 = new Image("Pic/Sand2.jpg");
        if(statusMap==2)img2 = new Image("Pic/Forrest2.jpg");
        if(statusMap==3)img2 = new Image("Pic/Stone2.jpg");
        if(statusMap==4)img2 = new Image("Pic/island2.jpg");
        picBoat.setImage(img2);
        if(nojump && statusMap == 0)newBlock.setImage(img);
        else if(nojump && statusMap != 0)
        {
             newBlock.setImage(img2);
             picBoat.setImage(img);
             
        }
        else 
        {
            if(set.setGame.mapBoat[blockY][blockX])
                newBlock.setImage(img);
            else
                newBlock.setImage(img2);
            picBoat.setImage(img);
       
        }
        
     
        picBoat = new ImageView();
        nojump = false;
        changBoat=0;
       
    }
    public void showSurvivor()
    {
        label_sur1.setText("Survivor : "+survivor[0]);
        label_sur2.setText("Survivor : "+survivor[1]);
        label_sur3.setText("Survivor : "+survivor[2]);
        label_sur4.setText("Survivor : "+survivor[3]);
        
    }
    public void checkPlayer_Map(int index,MouseEvent event)
    {
        if(indexSelect!= -1){
            int personX = set.setGame.personX[turn-1][indexSelect];
            int personY = set.setGame.personY[turn-1][indexSelect];
            int blockX,blockY = (index-1) /13;
                if(index%13 == 0) blockX=12;
                else blockX=(index%13)-1; 
            
            int statusMap = set.setGame.mapStatus[blockY][blockX];
            int statusMapPerson = set.setGame.mapStatus[personY][personX];
            int energyLoss = 1;
            boolean haveBoat = set.setGame.mapBoat[personY][personX];
            
            if(statusMapPerson ==0  && !haveBoat) 
            {   System.out.println("2 energy");
                energyLoss = 2;
            }
            System.out.println("Map per"+statusMapPerson);
            System.out.println(!haveBoat);
                         
            if(energy - energyLoss >=0 && ( canMove(blockX,blockY,personX,personY)) )
            {
                energy -= energyLoss;
                command.setText("Move person.");
                System.out.println("Walk : "+energy+"  -  "+energyLoss+"power");
                // move player
                ImageView person = playerone1;      
                person = findPlayer(indexSelect);
                set.setGame.setpersonXY(turn, indexSelect+1, blockX ,blockY); 
                showEnergy();
                person.setLayoutX(mouseX-17.5);
                person.setLayoutY(mouseY-17.5);
                
                if(deadZone(blockX,blockY)&&statusMap==0){
                    selectPlayerImg.setVisible(false);
                    command.setText("Shark kill.");
                    indexSelect = -1;
                }
                if(haveBoat)
                {
                    if(nojump && statusMap == 0){
                        set.setGame.mapBoat[personY][personX] = false;
                        set.setGame.mapBoat[blockY][blockX] = true;
                    }
                      moveBoat(event,blockX,blockY);
                }
                if(set.setGame.mapStatus[blockY][blockX]==4) //Save Zone
                {
                    set.win[turn-1][indexSelect]=1;
                    person.setVisible(false);
                    command.setText("Survivor!!");
                    survivor[turn-1]++;
                    showSurvivor();
                }
                    
            }
            else if(blockX ==personX && blockY ==personY)
            {
                System.out.println("Same block!");
                if(!haveBoat)command.setText("Can't move same block!");
                if(haveBoat&&changBoat==0)
                {  
                    
                    picBoat = (ImageView)event.getSource();
                    Image img = new Image("Pic/Boat2.jpg");
                    picBoat.setImage(img);
                    nojump=true;
                    changBoat=1;
                    command.setText("Select boat.");
                }
                else if(haveBoat&&changBoat==1)
                {
                    Image img = new Image("Pic/Boat.jpg");
                    picBoat.setImage(img);
                    picBoat = (ImageView)event.getSource();
                    img = new Image("Pic/Boat2.jpg");
                    picBoat.setImage(img);
                    nojump=true;
                    command.setText("Change boat.");
                }
                    
            } 
            else if(!( canMove(blockX,blockY,personX,personY)))
            {
                System.out.println("Can't move to this block.");
                command.setText("Can't move to this block.");
            }
            else
            {
                System.out.println("Don't have energy!");
                command.setText("Don't have energy.");
            }
        }
        else
            System.out.println("Not select person");
        
        
    }
    int clickAllMap = 0;
    @FXML
    private void clickAll(MouseEvent event) {
        if(start == -1) return;
        mouseX = event.getSceneX();
        mouseY = event.getSceneY();
        // labelfree.setText("X : "+mouseX + "    Y : " + mouseY);
        labelfree.setText("Sand : "+set.sand);
        
        if(clickAllMap!=1)card_img.setVisible(false);
        clickAllMap++;
    }
    public void showCard(int number)
    {
        
        card_img.setVisible(true);
        
        Image img= new Image("Pic/Card"+number+".gif");
        card_img.setImage(img);
        clickAllMap=1;
        System.out.println("in card  X = "+clickAllMap);
    }
    public void clickMapEvent(int pic,MouseEvent event,int chkBlock)
    {
        if(start==-1)return;
        labelfree.setText("Move Shark : "+energyShark);
        int blockX,blockY = (pic-1) /13;
            if(pic%13 == 0) blockX=12;
            else blockX=(pic%13)-1; 
        
            if(teleShark==false&&turnShark==false&&turnOpenCard==false&&killShark==false)
            {
                mouseX = event.getSceneX();
                mouseY = event.getSceneY();
                checkPlayer_Map(pic,event);
            }
            if(turnShark==true) 
            {
                if(indexSelect==-1)
                {
                    command.setText("Plz select shark, EnerGy shark: "+energyShark);
                    return;
                }
                int sharkX=0,sharkY=0;  
                String str = shark.idProperty().get(),str2;
                str2 = str.substring(5);
                int indexShark = Integer.parseInt(str2); 
                 for(int y = 0; y < 13;y++)
                 {
                     for(int x = 0 ; x < 13 ; x++)
                     {
                         if(set.setGame.mapShark[y][x]==indexShark)
                         {
                             sharkX = x;
                             sharkY = y;
                         }
                     }
                 }
                 if(canMove(blockX,blockY,sharkX,sharkY)&&set.setGame.mapStatus[blockY][blockX]==0)
                 {
                     set.setGame.mapShark[sharkY][sharkX] =0;
                     if(set.setGame.mapShark[blockY][blockX]!=0)
                     {
                         ImageView kill1Shark = new ImageView();
                         kill1Shark=findShark(set.setGame.mapShark[blockY][blockX]);
                         kill1Shark.setVisible(false);
                     }
                     set.setGame.mapShark[blockY][blockX] = indexShark;
                     command.setText("Move shark.");
                     energyShark--;
                     mouseX = event.getSceneX();
                     mouseY = event.getSceneY();
                     sharkKill(blockX,blockY);
                     shark.setLayoutX(mouseX-12.5);
                     shark.setLayoutY(mouseY-12.5);
                     command.setText("Energy shark : "+energyShark);
                     if(energyShark==0)
                     {
                         turnShark=false;
                         unvisibleEndTurn();
                     }
                 }
                 else if(blockX==sharkX && blockY==sharkY)
                 {
                     command.setText("Energy shark : "+energyShark+",Can't move same block.");
                 }
                 else
                 {
                     command.setText("Energy shark : "+energyShark+",Can't move to this block.");
                 }
            }
            
            if(teleShark==true&&set.setGame.mapStatus[blockY][blockX]== 0 )
            {
                if(shark == null)
                {
                    System.out.println("No shark");
                    return;
                }
                
                int sharkX=0,sharkY=0;  
                String str = shark.idProperty().get(),str2;
                str2 = str.substring(5);
                int sharkIndex = Integer.parseInt(str2); 
                for(int y = 0; y < 13;y++)
                {
                    for(int x = 0 ; x < 13 ; x++)
                    {
                        if(set.setGame.mapShark[y][x]==sharkIndex)
                        {
                            sharkX = x;
                            sharkY = y;
                        if(set.setGame.mapShark[blockY][blockX]!=0)
                        {
                         ImageView kill1Shark = new ImageView();
                         kill1Shark=findShark(set.setGame.mapShark[blockY][blockX]);
                         kill1Shark.setVisible(false);
                        }
                            set.setGame.mapShark[y][x] = 0;
                            set.setGame.mapShark[blockY][blockX] = sharkIndex;
                            shark.setLayoutX(event.getSceneX()-17.5);
                            shark.setLayoutY(event.getSceneY()-17.5);
                            sharkKill(blockX,blockY);
                            System.out.println(x+" "+y);
                            System.out.println(blockX+" "+blockY);
                            y=14;break;
                        }
                    }
                }
                System.out.println("Index shark"+sharkIndex);
                System.out.println("Map shark "+set.setGame.mapShark[blockY][blockX]);
               teleShark = false;
               Image img = new Image("Pic/Shark.png");
               shark.setImage(img);
               shark = new ImageView();
               command.setText("Click end turn.");
               unvisibleEndTurn();
         }
        
        if(turnOpenCard)
        {   
            if(set.setGame.mapStatus[blockY][blockX]== 0 )return;
            if(set.setGame.mapStatus[blockY][blockX]== 4 )return;
            if(set.sand!=0 && (chkBlock == 1 || chkBlock ==2)) return;
            if(set.forrest!= 0 && chkBlock == 2)return;
            if(chkBlock == 0) set.sand -- ;
            else if(chkBlock == 1) set.forrest --;
            
            if(set.sand==0)maxEnergy = 4;
            else maxEnergy = 3;
            if(set.forrest==0)maxEnergy = 6;
            openCard(pic,event);         
            int card = set.setGame.mapCard[blockY][blockX];
            set.setGame.mapStatus[blockY][blockX]=0;
            System.out.println("ShowCard : "+card);
            showCard(card);
            turnOpenCard = false;
        }
  
    }
    public ImageView findWhodie(int player,int number)
    {  
        switch(player)
        {
            case 0 : {
                switch(number)
                {
                    case 0 :    return playerone1;
                    case 1 :    return playerone2;   
                    case 2 :    return playerone3;
                    case 3 :    return playerone4;
                    case 4 :    return playerone5;
                    case 5 :    return playerone6;  
                    case 6 :    return playerone7;
                    case 7 :    return playerone8;
                    case 8 :    return playerone9;
                    case 9 :    return playerone10; 
                    case 10 :   return playerone11;
                }      
            }
            case 1 : {
                switch(number)
                {
                    case 0 :    return playertwo1;
                    case 1 :    return playertwo2;  
                    case 2 :    return playertwo3;
                    case 3 :    return playertwo4;
                    case 4 :    return playertwo5;
                    case 5 :    return playertwo6; 
                    case 6 :    return playertwo7;
                    case 7 :    return playertwo8;
                    case 8 :    return playertwo9;
                    case 9 :    return playertwo10; 
                    case 10 :   return playertwo11;
                }      
            }
            case 2 : {
                switch(number)
                {
                    case 0 :    return playerthree1;
                    case 1 :    return playerthree2;  
                    case 2 :    return playerthree3;
                    case 3 :    return playerthree4;
                    case 4 :    return playerthree5;
                    case 5 :    return playerthree6;
                    case 6 :    return playerthree7;
                    case 7 :    return playerthree8;
                    case 8 :    return playerthree9;
                    case 9 :    return playerthree10; 
                    case 10 :   return playerthree11;
                }  
            }
            case 3 : {
                switch(number)
                {
                    case 0 :    return playerfour1;
                    case 1 :    return playerfour2; 
                    case 2 :    return playerfour3;
                    case 3 :    return playerfour4;
                    case 4 :    return playerfour5;
                    case 5 :    return playerfour6;
                    case 6 :    return playerfour7;
                    case 7 :    return playerfour8;
                    case 8 :    return playerfour9;
                    case 9 :    return playerfour10; 
                    case 10 :   return playerfour11;
                }  
            }
                
        }
        return pic1;
    }
    public void unvisibleEndTurn()
    {
        sound2.pause();
        sound1.setVolume(1);
        if(turn==1)btnEnd1.setVisible(true);
        if(turn==2)btnEnd2.setVisible(true);
        if(turn==3)btnEnd3.setVisible(true);
        if(turn==4)btnEnd4.setVisible(true);
        command.setText("Click end turn.");
    }
    public void openCard(int index,MouseEvent event)
    {
        img = new Image("Pic/Water2.jpg");
        ImageView pic;
            pic = (ImageView)event.getSource();
          
            int blockX,blockY = (index-1) /13;
                    if(index%13 == 0) blockX=12;
                    else blockX=(index%13)-1; 
        if(set.setGame.mapStatus[blockY][blockX]==4)return;
            if(set.setGame.mapCard[blockY][blockX]==1) // found Boat
            {
                command.setText("Click end turn.");
                set.setGame.mapBoat[blockY][blockX] =true; 
                img = new Image("Pic/Boat.jpg");
                randomMoveShark();
                
            }
            if(set.setGame.mapCard[blockY][blockX]==6) // tele shark
            {
               teleShark = true;
               command.setText("Select shark and teleport to kill some one.");
            }
            if(set.setGame.mapCard[blockY][blockX]==5) // water vortex
            {
                System.out.println("WaterVorTex!!!!");
                int sharkDie=0;
                for(int x=blockX-1; x<=blockX+1;x++)
                {
                    for(int y=blockY-1; y<=blockY+1;y++)
                    {
                            sharkKill(x,y);
                            if(set.setGame.mapShark[y][x]!=0&&set.setGame.mapStatus[y][x]==0){
                                sharkDie = set.setGame.mapShark[y][x];
                                set.setGame.mapShark[y][x] = 0;
                                ImageView sharkDiepic=findShark(sharkDie);
                                sharkDiepic.setVisible(false);
                            }
                             if(set.setGame.mapBoat[y][x] == true)
                             {
                                set.setGame.mapBoat[y][x] = false;
                             }
                    }
                }
                System.out.println("Water Vortex"+index);
                Image waterImg = new Image("Pic/Water2.jpg");
                if(set.setGame.mapStatus[blockY-1][blockX]==0)
                    mapPicArr[index-13-1].setImage(waterImg);
                if(set.setGame.mapStatus[blockY+1][blockX]==0)
                    mapPicArr[index+13-1].setImage(waterImg);
                if(set.setGame.mapStatus[blockY][blockX+1]==0)
                    mapPicArr[index+1-1].setImage(waterImg);
                if(set.setGame.mapStatus[blockY][blockX-1]==0)
                    mapPicArr[index-1-1].setImage(waterImg);
                
                if(set.setGame.mapStatus[blockY-1][blockX-1]==0)
                    mapPicArr[index-13-1-1].setImage(waterImg);
                if(set.setGame.mapStatus[blockY-1][blockX+1]==0)
                    mapPicArr[index-13-1+1].setImage(waterImg);
                if(set.setGame.mapStatus[blockY+1][blockX-1]==0)
                    mapPicArr[index+13-1-1].setImage(waterImg);
                if(set.setGame.mapStatus[blockY+1][blockX+1]==0)
                    mapPicArr[index+13-1+1].setImage(waterImg);
                
               randomMoveShark();
            }
            pic.setImage(img);
            System.out.println("Block X : "+ blockX + " Block Y : "+blockY);   
            set.setGame.mapStatus[blockY][blockX] = 0;
            
            if(set.setGame.mapShark[blockY][blockX]!=0) // found Shark
            {
                pic = findShark(set.setGame.mapShark[blockY][blockX]);
                pic.setVisible(true);
                sharkKill(blockX,blockY);
                randomMoveShark();
            }   
                      
            if(set.setGame.mapCard[blockY][blockX]==2) // kill Shark
            {
                int checkShark = 0;
                for(int i = 0 ; i<13 ; i++)
                {
                    for(int j = 0 ; j< 13 ; j++)
                    {
                        if(set.setGame.mapShark[i][j]>0)
                        {
                            checkShark =set.setGame.mapShark[i][j] ;
                            break;
                        }
                    }
                }
                if(checkShark!=0)
                {
                    killShark= true;
                    command.setText("Click to kill one shark.");
                }
                else
                    command.setText("No shark to kill.");
                
            }
            
            if(set.setGame.mapCard[blockY][blockX]==3||set.setGame.mapCard[blockY][blockX]==4||set.setGame.mapCard[blockY][blockX]==7)
            {
                randomMoveShark();
            }
             if(set.setGame.mapCard[blockY][blockX]==7)
            {   
                picEnd.setVisible(true);
                panel_showwin.setVisible(true);
               // winnnnnnnnnnnnnnnnnnnnn
               showScore(0);
               showScore(1);
               showScore(2);
               showScore(3);                
           
            }
            
    }
    public void showScore(int turnPlayer)
    {
         String str="";
         int score = 0;
                for(int i = 0 ; i < 11 ;i ++)
                {
                    if(set.win[turnPlayer][i]!=0)
                    {
                       
                        str +=(String) (""+ set.ranScoreWin[turnPlayer][i]+"   ");              
                        score+=set.ranScoreWin[turnPlayer][i];
                    }
                }
               if(turnPlayer==0){
                   scoreP1.setText("Survive : "+survivor[turnPlayer] +" | Random Score : "+str ); 
                   totalS1.setText((String)("Total Score : "+score));
               }
               if(turnPlayer==1){
                   scoreP2.setText("Survive : "+survivor[turnPlayer] +" | Random Score : "+str ); 
                   totalS2.setText((String)("Total Score : "+score));
               }
               if(turnPlayer==2){
                   scoreP3.setText("Survive : "+survivor[turnPlayer] +" | Random Score : "+str ); 
                   totalS3.setText((String)("Total Score : "+score));
               }
               if(turnPlayer==3){
                   scoreP4.setText("Survive : "+survivor[turnPlayer] +" | Random Score : "+str ); 
                   totalS4.setText((String)("Total Score : "+score));
               }
    }
    public int findIndexBlock(MouseEvent event){
        ImageView testPic;
        testPic = (ImageView)event.getSource();
        String str = testPic.idProperty().get(),str2;
            str2 = str.substring(3);
        int index = Integer.parseInt(str2);
        return index;
    }
    @FXML 
    private void clickSand(MouseEvent event) {
       // maxEnergy = 3;
        int index = findIndexBlock(event);
        clickMapEvent(index,event,0); 
    }
    @FXML
    private void clickForrest(MouseEvent event) {
       // maxEnergy = 4;
        int index = findIndexBlock(event);
        clickMapEvent(index,event,1);
        
    }
    @FXML
    private void clickStone(MouseEvent event) {
       // maxEnergy = 6;
        int index = findIndexBlock(event);
        clickMapEvent(index,event,2);  
    }
    @FXML
    private void clickIsland(MouseEvent event) {
        int index = findIndexBlock(event);
        clickMapEvent(index,event,-1); 
    }
    @FXML
    private void clickWater(MouseEvent event) {
            int index = findIndexBlock(event);
            clickMapEvent(index,event,-1);
    }
    
    
    // method test
    
    public void showMap()
    {
        System.out.println("----- Show Map -----");
       for(int i = 0 ; i < 13 ; i++)
        {
            for(int j = 0 ; j < 13 ; j++)
            {
                System.out.print(set.setGame.mapStatus[i][j]+" "); 
            }
            System.out.println("");
        }
    }

   

}
    

