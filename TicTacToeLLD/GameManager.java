package TicTacToeLLD;

import java.util.Deque;

public class GameManager{
    private Board playingBoard;
    private Deque<Person> arrDeque;

    // Give me a board and the deque of persons playing on that board.
    public GameManager(Board b,Deque arrDeque){
        this.arrDeque = arrDeque;
        this.playingBoard = b;
        initilize();
    }

    // Method to start the game;
    private void initilize(){
        // Logic to hadle the starting of the game.
        boolean winner = false;
        while(!winner){
            Person p = arrDeque.pop();
            // Give chance to a player
                // addMove in the table
                // check if we found the winner
                    //make winner  = true
                // check if game is over then break from the loop    
            arrDeque.add(p);
        }
        // if winner = true
            // notifyWinner
        //  notifyDraw
    }

    public void notifyWinner(Person p){
        
    }

}