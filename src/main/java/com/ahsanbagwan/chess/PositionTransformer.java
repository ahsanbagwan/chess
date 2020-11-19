package com.ahsanbagwan.chess;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PositionTransformer {
    private static final Map<String, Point> transformer = new HashMap<String, Point>() {{
        put("A1", new Point(7,0));
        put("A2", new Point(6,0));
        put("A3", new Point(5,0));
        put("A4", new Point(4,0));
        put("A5", new Point(3,0));
        put("A6", new Point(2,0));
        put("A7", new Point(1,0));
        put("A8", new Point(0,0));
        put("B1", new Point(7,1));
        put("B2", new Point(6,1));
        put("B3", new Point(5,1));
        put("B4", new Point(4,1));
        put("B5", new Point(3,1));
        put("B6", new Point(2,1));
        put("B7", new Point(1,1));
        put("B8", new Point(0,1));
        put("C1", new Point(7,2));
        put("C2", new Point(6,2));
        put("C3", new Point(5,2));
        put("C4", new Point(4,2));
        put("C5", new Point(3,2));
        put("C6", new Point(2,2));
        put("C7", new Point(1,2));
        put("C8", new Point(0,2));
        put("D1", new Point(7,3));
        put("D2", new Point(6,3));
        put("D3", new Point(5,3));
        put("D4", new Point(4,3));
        put("D5", new Point(3,3));
        put("D6", new Point(2,3));
        put("D7", new Point(1,3));
        put("D8", new Point(0,3));
        put("E1", new Point(7,4));
        put("E2", new Point(6,4));
        put("E3", new Point(5,4));
        put("E4", new Point(4,4));
        put("E5", new Point(3,4));
        put("E6", new Point(2,4));
        put("E7", new Point(1,4));
        put("E8", new Point(0,4));
        put("F1", new Point(7,5));
        put("F2", new Point(6,5));
        put("F3", new Point(5,5));
        put("F4", new Point(4,5));
        put("F5", new Point(3,5));
        put("F6", new Point(2,5));
        put("F7", new Point(1,5));
        put("F8", new Point(0, 5));
        put("G1", new Point(7,6));
        put("G2", new Point(6,6));
        put("G3", new Point(5,6));
        put("G4", new Point(4,6));
        put("G5", new Point(3,6));
        put("G6", new Point(2,6));
        put("G7", new Point(1,6));
        put("G8", new Point(0, 6));
        put("H1", new Point(7,7));
        put("H2", new Point(6,7));
        put("H3", new Point(5,7));
        put("H4", new Point(4,7));
        put("H5", new Point(3,7));
        put("H6", new Point(2,7));
        put("H7", new Point(1,7));
        put("H8", new Point(0, 7));
    }};

    public static Point translateToPoint(String position) {
        return transformer.get(position);
    }

    public static Map<String, Point> unmodifiableMap() {
        return Collections.unmodifiableMap(transformer);
    }
}
