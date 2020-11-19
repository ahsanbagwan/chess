package com.ahsanbagwan.chess;

import java.util.ArrayList;
import java.util.List;

public class Horse extends Piece {

    public List<Point> findAllPossibleMoves(int mat[][], int p, int q) {
        List<Point> result = new ArrayList<Point>();

        int X[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int Y[] = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < 8; i++) {

            int x = p + X[i];
            int y = q + Y[i];

            if (x >= 0 && y >= 0 && x < n && y < m
                    && mat[x][y] == 0)
                result.add(new Point(x, y));
        }

        return result;
    }
}
