package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class MatrixUtils {
    @Contract(pure = true)
    public static void rotate(int[] @NotNull [] matrix){
        int n = matrix.length;
        if (n <= 1) return;

        for (int i = 0; i < n / 2; i++){

            for (int j = i; j < n - i - 1; j++){
                int temp = matrix[i][j];

                matrix[i][j] = matrix[n - 1 - j][i];

                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];

                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];

                matrix[j][n - 1 - i] = temp;
            }
        }


    }
}
