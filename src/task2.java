public class task2 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) Math.round(Math.random() * 9);
        }for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 != 0)
                numbers[i] = 0;
            System.out.print(numbers[i] + " ");
        }
    }
}