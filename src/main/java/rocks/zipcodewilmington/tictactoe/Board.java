package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] xOxO;


    public Board(Character[][] matrix) {
        this.xOxO = matrix;
    }

    public Boolean isInFavorOfX() {
        if (xOxO[0][0].equals('X') && (xOxO[0][1].equals('X') && (xOxO[0][2].equals('X')))) {
            return true;
        } else if (xOxO[1][0].equals('X') && (xOxO[1][1].equals('X') && (xOxO[1][2].equals('X')))) {
            return true;
        } else if (xOxO[2][0].equals('X') && (xOxO[2][1].equals('X') && (xOxO[2][2].equals('X')))) {
            return true;
        }  else if (xOxO[0][0].equals('X') && (xOxO[1][0].equals('X') && (xOxO[2][0].equals('X')))) {
            return true;
        } else if (xOxO[0][1].equals('X') && (xOxO[1][1].equals('X') && (xOxO[2][1].equals('X')))) {
            return true;
        } else if (xOxO[0][2].equals('X') && (xOxO[1][2].equals('X') && (xOxO[2][2].equals('X')))) {
            return true;
        } else if (xOxO[0][0].equals('X') && (xOxO[1][1].equals('X') && (xOxO[2][2].equals('X')))) {
            return true;
        } else if (xOxO[0][2].equals('X') && (xOxO[1][1].equals('X') && (xOxO[2][0].equals('X')))) {
            return true;
        } else {
            return false;
        }

    }

    public Boolean isInFavorOfO() {
        if (xOxO[0][0].equals('O') && (xOxO[0][1].equals('O') && (xOxO[0][2].equals('O')))) {
            return true;
        } else if (xOxO[1][0].equals('O') && (xOxO[1][1].equals('O') && (xOxO[1][2].equals('O')))) {
            return true;
        } else if (xOxO[2][0].equals('O') && (xOxO[2][1].equals('O') && (xOxO[2][2].equals('O')))) {
            return true;
        }  else if (xOxO[0][0].equals('O') && (xOxO[1][0].equals('O') && (xOxO[2][0].equals('O')))) {
            return true;
        } else if (xOxO[0][1].equals('O') && (xOxO[1][1].equals('O') && (xOxO[2][1].equals('O')))) {
            return true;
        } else if (xOxO[0][2].equals('O') && (xOxO[1][2].equals('O') && (xOxO[2][2].equals('O')))) {
            return true;
        } else if (xOxO[0][0].equals('O') && (xOxO[1][1].equals('O') && (xOxO[2][2].equals('O')))) {
            return true;
        } else if (xOxO[0][2].equals('O') && (xOxO[1][1].equals('O') && (xOxO[2][0].equals('O')))) {
            return true;
        }else{
            return false;
        }
    }

    public Boolean isTie() {
        if (isInFavorOfO() == false && isInFavorOfX() == false) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {
        if (isInFavorOfX() == true) {
            return "X";
        } else if (isInFavorOfO() == true) {
            return "O";
        }else{
            return "";
        }

    }
}