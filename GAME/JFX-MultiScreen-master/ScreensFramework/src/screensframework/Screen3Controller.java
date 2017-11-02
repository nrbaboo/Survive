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

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Angie
 */
public class Screen3Controller implements Initializable, ControlledScreen {

    ScreensController myController;
    @FXML
    private Label label_close;
    @FXML
    private Label next;
    @FXML
    private Label back;
    @FXML
    private ImageView bg_img;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    final int MAX_PAGE = 6;
    int count_page = 1;
    Image img;
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @FXML
    private void goToScreen2(ActionEvent event){
       myController.setScreen(Survive.screen2ID);
    }

    @FXML
    private void close_exit(MouseEvent event) {
        label_close.setTextFill(Color.WHITE);
    }

    @FXML
    private void close_enter(MouseEvent event) {
        this.label_close.setTextFill(Color.RED);
    }

    @FXML
    private void label_close(MouseEvent event) {
         myController.setScreen(Survive.screen1ID);
    }

    @FXML
    private void next_exit(MouseEvent event) {
        next.setTextFill(Color.BLACK);
    }

    @FXML
    private void next_enter(MouseEvent event) {
        next.setTextFill(Color.RED);
    }

    @FXML
    private void next(MouseEvent event) {
        if(count_page < MAX_PAGE)
        {
            back.setVisible(true);
            count_page++;
            img = new Image("Pic/help"+count_page+".jpg");
            //img = new Image("Pic/Help2.jpg");
            bg_img.setImage(img);
        }
        System.out.println(count_page+"    "+MAX_PAGE);
        if(count_page==MAX_PAGE)
            next.setVisible(false);
    }

    @FXML
    private void back_exit(MouseEvent event) {
        back.setTextFill(Color.BLACK);
    }

    @FXML
    private void back_enter(MouseEvent event) {
        back.setTextFill(Color.RED);
    }

    @FXML
    private void back_close(MouseEvent event) {
        if(count_page > 1)
        {
            next.setVisible(true);
            count_page--;
            img = new Image("Pic/help"+count_page+".jpg");
            bg_img.setImage(img);
        }
        if(count_page==1)
            back.setVisible(false);
    }
}
