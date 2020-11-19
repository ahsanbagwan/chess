package com.ahsanbagwan.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ChessGenerator {
    private static final int n = 8;
    private static final int m = 8;
    private static final int[][] board = new int[8][8];

    public static void main(String[] args) {
        String piece = args[0];
        String position = args[1];

        Point point = PositionTransformer.translateToPoint(position);
        run(piece, position, point);
    }

    public static List<Point> run(String piece, String position, Point point) {
        List<Point> result = null;
        if(piece.equals("Horse")) {
            result = new Horse().findAllPossibleMoves(board, point.getX(), point.getY());
            System.out.println(result.toString());

        }
        return result;
    }

    // TODO Remove
    public String letterPosition(String position) {
        return position.replaceAll("[0-9]","");
    }

    // TODO Remove
    public String numericPosition(String position) {
        return position.replaceAll("[^A-Za-z]","");
    }
}
