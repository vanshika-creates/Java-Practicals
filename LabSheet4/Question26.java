public class Question26 {
    int[][] matrix = new int[2][2];
    static String matrixType = "2x2";

    Question26(int[][] m) {
        matrix = m;
    }

    void add(int[][] other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix[i][j] + other[i][j];
            }
        }
        System.out.println("Addition Result:");
        printMatrix(result);
    }

    void subtract(int[][] other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix[i][j] - other[i][j];
            }
        }
        System.out.println("Subtraction Result:");
        printMatrix(result);
    }

    void printMatrix(int[][] mat) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m1 = {{1, 2}, {3, 4}};
        int[][] m2 = {{5, 6}, {7, 8}};
        Question26 q = new Question26(m1);
        q.add(m2);
        q.subtract(m2);
    }
}

