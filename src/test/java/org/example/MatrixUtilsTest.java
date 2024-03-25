package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MatrixUtilsTest {

    @Test
    public void rotate3x3Matrix(){

        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        MatrixUtils.rotate(matrix);

        assertArrayEquals(new int[]{7, 4, 1}, matrix[0]);
        assertEquals(5, matrix[1][1]);
    }

    @Test
    public void rotate4x4Matrix(){

        int[][] matrix = new int[][]{
                {9, 10, 11, 12},
                {16, 17, 18, 19},
                {23, 24, 25, 26},
                {30, 31, 32, 33}
        };

        MatrixUtils.rotate(matrix);

        assertArrayEquals(new int[]{30, 23, 16, 9}, matrix[0]);

        assertArrayEquals(new int[]{33, 26, 19, 12}, matrix[3]);
    }

    @Test
    public void rotate5x5Matrix(){

        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        MatrixUtils.rotate(matrix);

        assertArrayEquals(new int[]{21, 16, 11, 6, 1}, matrix[0]);

        assertArrayEquals(new int[]{22, 17, 12, 7, 2}, matrix[1]);


    }
}
