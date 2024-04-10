package game;

import game.pieces.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.swing.*;

public class Board extends Application {

    private GridPane gridPane;
    private Piece[][] grid;

    @Override
    public void start(Stage primaryStage) {
        this.gridPane = new GridPane();
        this.grid = new Piece[8][8];

        initializeGrid();
        initializePieces();
        addFullGrid();

        Scene scene = new Scene(this.gridPane, 480, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Chess Game");
        primaryStage.show();
    }

    private void initializeGrid() {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                Rectangle square = new Rectangle(60, 60, (row + col) % 2 == 0 ? Color.WHITE : Color.GRAY);
                this.gridPane.add(square, col, row);
            }
        }

    }

    private void initializePieces(){
        for (int i = 0; i < 8; i++)
        {
            grid[1][i] = new Pawn(Color.WHITE, i, 1);
            grid[6][i] = new Pawn(Color.BLACK, i, 6);
        }

        grid[0][0] = new Rook(Color.WHITE, 0, 0);
        grid[0][7] = new Rook(Color.WHITE, 7, 0);
        grid[7][0] = new Rook(Color.BLACK, 0, 7);
        grid[7][7] = new Rook(Color.BLACK, 7, 7);


        grid[0][1] = new Knight(Color.WHITE, 1, 0);
        grid[0][6] = new Knight(Color.WHITE, 6, 0);
        grid[7][1] = new Knight(Color.BLACK, 1, 7);
        grid[7][6] = new Knight(Color.BLACK, 6, 7);

        grid[0][2] = new Bishop(Color.WHITE, 2, 0);
        grid[0][5] = new Bishop(Color.WHITE, 5, 0);
        grid[7][2] = new Bishop(Color.BLACK, 2, 7);
        grid[7][5] = new Bishop(Color.BLACK, 5, 7);

        grid[0][3] = new Queen(Color.WHITE, 3, 0);
        grid[0][4] = new King(Color.WHITE, 4, 0);
        grid[7][3] = new King(Color.BLACK, 3, 7);
        grid[7][4] = new Queen(Color.BLACK, 4, 7);
    }

    private void addFullGrid(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(grid[i][j] != null)
                {
                    gridPane.add(grid[i][j].getImg(), grid[i][j].getX(), grid[i][j].getY());
                }
            }
        }
    }


    public void display() {
        launch();
    }
}
