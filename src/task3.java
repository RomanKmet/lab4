public class task3 {
    public static void main(String[] args) {
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int[] num3 = new int[5];
        double mid1=0, mid2=0, mid3=0;
        for (int i = 0; i < 5; i++) {
            num1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + num1[i];
            System.out.print(num1[i] + " ");
        }for (int i = 0; i < 5; i++) {
            num2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + num2[i];
            System.out.print(num2[i] + " ");
        }for (int i = 0; i < 5; i++) {
            num3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + num3[i];
            System.out.print(num3[i] + " ");
        }
        System.out.println();
        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);
        if (mid1 < mid2)
            System.out.println("mid1<mid2");
        else if (mid1 > mid2)
            System.out.println("mid1>mid2");
        else if (mid1 == mid2)
            System.out.println("mid1==mid2");
        else if (mid1 > mid3)
            System.out.println("mid1>mid2");
        else if (mid1 < mid3)
            System.out.println("mid1==mid2");
        else if (mid1 == mid3)
            System.out.println("mid1==mid2");
    }
}

