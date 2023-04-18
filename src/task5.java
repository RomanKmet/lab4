public class task5 {
    public static void main(String[] args) {
        int counter = 0;
        int[] num1 = new int[15];
        for (int i = 0; i < 15; i++) {
            num1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(num1[i] + " ");
            if (num1[i] % 2 == 0)
                counter++;
        }
        System.out.println();
        System.out.println(counter);
    }
}
