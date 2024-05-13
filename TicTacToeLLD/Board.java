package TicTacToeLLD;

import TicTacToeLLD.Types.TypeMoves;

public class Board{
    private int n;
    private int moves;
    private int [][] matrix;
    
    public Board(int n, int [][]arr){
        this.moves = 0;
        this.n = n;
        this.matrix = new int[n][n];
    }

    public boolean addMove(int x, int y){
        // check if the cell if there or not
        return false;
    }

    public void setInTable(TypeMoves typeMove){
        // set the value in the table;
    }

    public boolean checkWinner(){
        // Logic to iterate over the array in the specific direction
        // And find the winner or loser.
        return false;
    }

    public boolean gameOver(){
        // check if the game is over
        return false;
    }

    public void printBoard(){
        // Logic to print the current state of the board.
    }

}