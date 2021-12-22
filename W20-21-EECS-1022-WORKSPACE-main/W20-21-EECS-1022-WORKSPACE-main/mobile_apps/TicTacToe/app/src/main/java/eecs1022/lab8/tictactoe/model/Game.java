package eecs1022.lab8.tictactoe.model;

import android.provider.Settings;

public class Game {
    // Attributes
    private String playerX;
    private String playerO;

    private int changeTurn; // Incremented at each valid move to determine who's going to play next by taking the modulo
    private char firstLetter; // Used to record the starting player --> it's useful because if the game starts with playerO then change'turn should be 1

    private char winner; // Used to determine the winner's input character for the winnerName helper method
    private String winnerName;
    private boolean winnerExist;
    private boolean tieExist;

    private boolean errorExist;
    private String errorMsg;
    private int attempt;    // extra integer value used to determine if game had a winner or tie, it shouldn't play the same message

    private static char[][] board = {  // static variable because when changes made to the char array it should be reflected to both players
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };


    // Constructor
    public Game(String playerX, String playerO) {
        this.playerO = playerO;
        this.playerX = playerX;
        Game.board = new char[][]{
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}
        };
        this.firstLetter = 'x'; // default startup player is playerX
    }


    // Accessor
    public String getCurrentPlayer() {
        String result = null;
        this.CheckForTheWinner();

        if (!this.winnerExist) {
            if (this.changeTurn % 2 == 0) {
                result = this.playerX;
            } else if (this.changeTurn % 2 == 1) {
                result = this.playerO;
            }
        }

        if (this.firstLetter == 'x') {
            if (this.changeTurn >= 9) { // used to return null if game has been already finished or it ended with a tie
                result = null;
            }
        } else if (this.firstLetter == 'o') {     // used to return null if game has been already finished or it ended with a tie
            if (this.changeTurn >= 10) {
                result = null;
            }
        }
        return result;
    }


    public String getStatus() {
        String result = this.errorMsg;
        this.CheckForTheWinner();
        this.tieExist();

        if (!this.winnerExist) {
            if (!this.errorExist && !this.tieExist) {   // used to determine if there's no error and there's no tie at that moment the on the output the next player's turn will be displayed
                if (this.changeTurn % 2 == 0) {
                    result = this.playerX + "'s turn to play...";
                } else if (this.changeTurn % 2 == 1) {
                    result = this.playerO + "'s turn to play...";
                }
            } else if (tieExist && this.attempt == 0) {
                result = "Game is over with a tie between " + this.playerX + " and " + this.playerO + ".";
                this.attempt++;    // this will help to increase the value of this.attempt on the next iteration and this else if condition will not be executed.
            }
        } else if (this.attempt == 0 && !this.tieExist) {
            result = "Game is over with " + this.winnerName(this.winner) + " being the winner.";
            this.attempt++;    //// this will help to increase the value of this.attempt on the next iteration and this else if condition will not be executed.
        }
        return result;
    }


    public char[][] getBoard() {
        return Game.board;
    }


    // Mutator
    public void setWhoPlaysFirst(char letter) {
        if (letter == 'o') {
            this.changeTurn = 1;    // it starts with 0 because this way the turn on the screen will be different
            this.firstLetter = 'o';
        } else if (letter == 'x') {
            this.changeTurn = 0;
        }
    }


    public void move(int row, int column) {
        this.errorExist = false;
        this.CheckForTheWinner();   // every single time a new row and column is going to be added or removed, this will be checked if there exist a winner.
        this.tieExist();            // same goes for tie-condition

        if (this.winnerExist) { // the errors are arranged based on the error priority table
            this.errorExist = true;
            this.errorMsg = "Error: game is already over with a winner.";
        } else if (this.tieExist) {
            this.errorExist = true; // wrong: this message should only come with all the sets were finished intially -> and at later calls name of the winners should not be there. See junit testing for more clarification.
            this.errorMsg = "Error: game is already over with a tie.";

        } else {
            if (row < 1 || row > 3) {
                this.errorExist = true;
                this.errorMsg = "Error: row " + row + " is invalid.";
            } else if (column < 1 || column > 3) {
                this.errorExist = true;
                this.errorMsg = "Error: col " + column + " is invalid.";
            } else {
                if (Game.board[row - 1][column - 1] != '_') {
                    this.errorExist = true;
                    this.errorMsg = "Error: slot @ (" + row + ", " + column + ") is already occupied.";
                } else {
                    if (this.changeTurn % 2 == 0) {
                        Game.board[row - 1][column - 1] = 'x';
                    } else if (this.changeTurn % 2 == 1) {
                        Game.board[row - 1][column - 1] = 'o';
                    }
                    this.changeTurn++;
                }
            }
        }

    }


    // Helper Method
    public void CheckForTheWinner() {   // used to check different possibilities of checking whether there's a winner or not.
        boolean stay = true;
        this.winnerExist = true;

        // -m Diagonal ---> checks the positive slope diagonal
        char firstChar = 'z';
        if (Game.board[0][0] != '_') {
            firstChar = Game.board[0][0];
            if (firstChar == 'x') {
                this.winner = 'x';
            } else if (firstChar == 'o') {
                this.winner = 'o';
            }
        } else {
            this.winnerExist = false;
            stay = false;
        }

        for (int i = 0; stay && i < 3; i++) {
            if (board[i][i] != firstChar) {
                this.winnerExist = false;
                stay = false;
            }
        }

        // --------------------------------------------------

        // +m  Diagonal ----> checks the negative slope diagonal
        if (!this.winnerExist) {
            stay = true;
            for (int i = 0; stay && i < 3; i++) {
                if (Game.board[i][2 - i] == 'x') {
                    this.winnerExist = true;
                    this.winner = 'x';
                } else {
                    this.winnerExist = false;
                    stay = false;
                }
            }
        }


        if (!this.winnerExist) {
            stay = true;
            for (int i = 0; stay && i < 3; i++) {
                if (Game.board[i][2 - i] == 'o') {
                    this.winnerExist = true;
                    this.winner = 'o';
                } else {
                    this.winnerExist = false;
                    stay = false;
                }
            }
        }

        // -----------------------------------------------

        // Row checking
        if (!this.winnerExist) {
            stay = true;
            for (int i = 0; stay && i < 3; i++) {
                for (int m = 0; stay && m < 3; m++) {
                    if (Game.board[i][m] == 'x') {
                        this.winnerExist = true;
                        this.winner = 'x';
                    } else {
                        this.winnerExist = false;
                        stay = false;
                    }
                }
                stay = !this.winnerExist;
            }
        }

        if (!this.winnerExist) {
            stay = true;
            for (int i = 0; stay && i < 3; i++) {
                stay = true;
                for (int m = 0; stay && m < 3; m++) {
                    if (Game.board[i][m] == 'o') {
                        this.winnerExist = true;
                        this.winner = 'o';
                    } else {
                        this.winnerExist = false;
                        stay = false;
                    }
                }
                stay = !this.winnerExist;
            }
        }

        // -----------------------------------------------------

        if (!this.winnerExist) {
            stay = true;
            for (int i = 0; stay && i < 3; i++) {
                for (int m = 0; stay && m < 3; m++) {
                    if (Game.board[m][i] == 'x') {
                        this.winnerExist = true;
                        this.winner = 'x';
                    } else {
                        this.winnerExist = false;
                        stay = false;
                    }
                }
                stay = !this.winnerExist;
            }
        }

        if (!this.winnerExist) {
            stay = true;
            for (int i = 0; stay && i < 3; i++) {
                for (int m = 0; stay && m < 3; m++) {
                    if (Game.board[m][i] == 'o') {
                        this.winnerExist = true;
                        this.winner = 'o';
                    } else {
                        this.winnerExist = false;
                        stay = false;
                    }
                }
                stay = !this.winnerExist;
            }
        }
    }

    // Helper Method
    public String winnerName(char c) {
        if (c == 'x') {
            this.winnerName = this.playerX;
        } else if (c == 'o') {
            this.winnerName = this.playerO;
        }
        return this.winnerName;
    }

    // Helper Method
    public void tieExist() {
        this.tieExist = false;

        this.CheckForTheWinner();
        if (!this.winnerExist) {
            if (this.firstLetter == 'x' && this.changeTurn == 9) {
                this.tieExist = true;
            }
            else if(this.firstLetter == 'o' && this.changeTurn == 10) {
                this.tieExist = true;
            }
        }
    }

}
