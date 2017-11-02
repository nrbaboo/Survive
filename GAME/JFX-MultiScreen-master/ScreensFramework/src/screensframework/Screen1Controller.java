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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Angie
 */
public class Screen1Controller implements Initializable, ControlledScreen {
    
    static PlayerName player = new PlayerName();
    ScreensController myController;
    @FXML
    private TextField tx1;
    @FXML
    private TextField tx2;
    @FXML
    private TextField tx3;
    @FXML
    private TextField tx4;
    @FXML
    private Label label_start;
    @FXML
    private Label label_help;
    @FXML
    private Label label_credit;
    @FXML
    private ImageView pic1;
    @FXML
    private Pane panel;
    @FXML
    private Label labelGo;
    @FXML
    private Pane credit_pane;
    @FXML
    private Label label_close;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        TranslateTransition transition1 = new TranslateTransition();
        transition1.setNode(pic1);
        transition1.setDuration(Duration.seconds(2));
        transition1.setToY(50);
        transition1.setAutoReverse(true);
        transition1.setCycleCount(TranslateTransition.INDEFINITE);
        transition1.play();
        
        TranslateTransition transition2 = new TranslateTransition();
        transition2.setNode(label_start);
        transition2.setDuration(Duration.seconds(2));
        transition2.setToY(50);
        transition2.setAutoReverse(true);
        transition2.setCycleCount(TranslateTransition.INDEFINITE);
        transition2.play();
        
        TranslateTransition transition3 = new TranslateTransition();
        transition3.setNode(label_help);
        transition3.setDuration(Duration.seconds(2));
        transition3.setToY(50);
        transition3.setAutoReverse(true);
        transition3.setCycleCount(TranslateTransition.INDEFINITE);
        transition3.play();
        
        TranslateTransition transition4 = new TranslateTransition();
        transition4.setNode(label_credit);
        transition4.setDuration(Duration.seconds(2));
        transition4.setToY(50);
        transition4.setAutoReverse(true);
        transition4.setCycleCount(TranslateTransition.INDEFINITE);
        transition4.play();
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }


    private void goToScreen3(ActionEvent event){
       myController.setScreen(Survive.screen3ID);
    }
    
    public PlayerName getPlayer(){
        return player;
    }

    @FXML
    private void label_start(MouseEvent event) {
       panel.setVisible(true);
    }
    
    public void soundBtn()
    {
        Media sound = new Media(new File("src/Sound/btn1.wav").toURI().toString());
        MediaPlayer cTheme = new MediaPlayer(sound);
        cTheme.setVolume(1.0);
        cTheme.play();
    }
    @FXML
    private void label_enter(MouseEvent event) {
        this.label_start.setTextFill(Color.RED);
        soundBtn();
    }

    @FXML
    private void label_exit(MouseEvent event) {
        this.label_start.setTextFill(Color.WHITE);
    }

    @FXML
    private void label_exit3(MouseEvent event) {
       this.label_credit.setTextFill(Color.WHITE);
    }

    @FXML
    private void label_enter3(MouseEvent event) {
        this.label_credit.setTextFill(Color.RED);
         soundBtn();
    }

    @FXML
    private void label_start3(MouseEvent event) {
        
        credit_pane.setVisible(true);
    }

    @FXML
    private void label_exit2(MouseEvent event) {
        this.label_help.setTextFill(Color.WHITE);
    }

    @FXML
    private void label_enter2(MouseEvent event) {
        this.label_help.setTextFill(Color.RED);
         soundBtn();
    }

    @FXML
    private void label_start2(MouseEvent event) {
        myController.setScreen(Survive.screen3ID);
    }

    @FXML
    private void go_exit(MouseEvent event) {
        this.labelGo.setTextFill(Color.BLACK);
    }

    @FXML
    private void go_enter(MouseEvent event) {
        this.labelGo.setTextFill(Color.RED);
         soundBtn();
    }

    @FXML
    private void go(MouseEvent event) {
       panel.setVisible(false);
       player.setPlayerName(tx1.getText(),0);
       player.setPlayerName(tx2.getText(),1);
       player.setPlayerName(tx3.getText(),2);
       player.setPlayerName(tx4.getText(),3);
       myController.setScreen(Survive.screen2ID);
    }

    @FXML
    private void label_exit4(MouseEvent event) {
        label_close.setTextFill(Color.BLACK);
    }

    @FXML
    private void label_enter4(MouseEvent event) {
        label_close.setTextFill(Color.RED);
    }

    @FXML
    private void label_close(MouseEvent event) {
        credit_pane.setVisible(false);
    }
    
    
}
