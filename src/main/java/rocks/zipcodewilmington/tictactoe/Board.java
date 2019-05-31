package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {}

    public Boolean isInFavorOfX() {
        for (int x=0; x<3; x++){
            if

        }
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public Boolean rows (char a0,char a1, char a2) {
        for (int x =0; x<3; x++){
            if((a0 == a1) && (a1 == a2))
                return true;
        }
        return false;
    }

    public Boolean columns (char b0, char b1, char b2){
        for (int y=0; y<3; y++){
            if((b0 == b1) && (b1 == b2))
                return true;
        } return false;
    }

    
}
