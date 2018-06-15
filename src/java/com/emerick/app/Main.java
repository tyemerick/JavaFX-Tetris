/*
 * Main.java
 * main src file for the JavaFX-Tetris application
 *
 * Copyright (C) 2018, by:  Tyler Emerick
 *   All rights reserved.   2315 S. Washington St.
 *                          Kokomo, Indiana  46902 USA
 *                          <tyemerick88@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

/*
 * Contributors:
 *
 * Andrea Emerick
 * 2315 S. Washington St.
 * Kokomo, Indiana  46902 USA
 * <afemerick@gmail.com>
 */

package com.emerick.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("tetris_layout.fxml"));
        primaryStage.setTitle("JavaFX Tetris");
        primaryStage.setScene(new Scene(root, 400, 510));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
