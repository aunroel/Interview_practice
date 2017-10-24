package arrays_and_strings;

public class Zero_matrix {

    public static void main(String[] args) {
        Zero_matrix zero_matrix = new Zero_matrix();
        int[][] test = {{1,3,0,4,0},
                        {4,1,3,4,1},
                        {0,2,4,2,1}};
        test = zero_matrix.transformMatrix(test);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
    }

    int[][] transformMatrix(int[][] input_m) {
        if (input_m == null)
            return input_m;

        int[] rows = new int[input_m.length];
        int[] cols = new int[input_m[0].length];

        for (int i = 0; i < input_m.length; i++) {
            for (int j = 0; j < input_m[0].length; j++) {
                if (input_m[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 1)
                input_m[i] = new int[cols.length];
        }

        return input_m;
    }

}
