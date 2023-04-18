public class task1 {
    public static void main(String[] args) {
        int[] numbers = new int[99];
        for(int i = 1, h=0; i<=99; i=i+1, h++){
            numbers[h]=i;
        }
        System.out.println("Непарні числа");
        for(int i=0; i < numbers.length; i=i+2)
            System.out.print(numbers[i]+ " ");
    }
}
