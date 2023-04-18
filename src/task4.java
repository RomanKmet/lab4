public class task4 {
    public static void main(String[] args) {
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] num3 = new int[10];
        for (int i = 0; i < 10; i++) {
            num1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            num2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(num2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            num3[i] = num1[i] + num2[i];
            System.out.print(num3[i] + " ");
        }
    }
}
