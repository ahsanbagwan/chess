package com.ahsanbagwan.chess;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestMovement {
    private ChessGenerator chessGame;
    private List<String> list;

    @BeforeClass
    public static void m1() {
        System.out.println("Using @BeforeClass , executed before all test cases ");
    }

    @Before
    public void m2() {
        list = new ArrayList<String>();
        System.out.println("Using @Before annotations ,executed before each test cases ");
    }

    @AfterClass
    public static void m3() {
        System.out.println("Using @AfterClass ,executed after all test cases");
    }

    @After
    public void m4() {
        list.clear();
        System.out.println("Using @After ,executed after each test cases");
    }

    @Test
    public void testNumberOfMoves() {
        String piece = "Horse";
        String position = "D5";
        Point point = PositionTransformer.translateToPoint(position);
        List<Point> res = ChessGenerator.run(piece, position, point);
        assertEquals(8, res.size());
    }
}
