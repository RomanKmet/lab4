public class task6 {
    public static void main(String[] args) {
        int[][] num1 = new int[15][];
        num1[0] = new int[5];
        num1[1] = new int[5];
        num1[2] = new int[5];
        num1[3] = new int[5];
        num1[4] = new int[8];
        num1[5] = new int[8];
        num1[6] = new int[8];
        num1[7] = new int[8];
        num1[8] = new int[3];
        num1[9] = new int[3];
        num1[10] = new int[3];
        num1[11] = new int[3];
        num1[12] = new int[9];
        num1[13] = new int[9];
        num1[14] = new int[9];
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                num1[i][j] = (int) (Math.random() * 15);
                System.out.print(num1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
