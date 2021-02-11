package day17;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for(ChessPiece chessPiece : chessPieces){
            System.out.print(chessPiece.getDisplay());
        }


    }
}