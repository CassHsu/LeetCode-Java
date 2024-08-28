class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x = 0;
        int[][] d = new int[100][100];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = x;
                x++;
            }
        }

        int i = 0, j = 0;
        for (String c : commands) {
            switch (c) {
                case "RIGHT":
                    j++;
                    break;
                case "DOWN":
                    i++;
                    break;
                case "LEFT":
                    j--;
                    break;
                case "UP":
                    i--;
                    break;
            }
        }

        return d[i][j];
    }
}
