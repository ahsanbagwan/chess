package com.ahsanbagwan.chess;

import java.util.List;

public abstract class Piece {
    public static final int n = 8;
    public static final int m = 8;

    public abstract List<Point> findAllPossibleMoves(int board[][], int m, int n);
}
