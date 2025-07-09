//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // local scope
//        double[] myList; // Khai bao bien tham chieu, tat ca gia tri phai cung kieu du lieu
//        myList = new double[10];
//        System.out.printf("Do dai cua mang la: " + myList.length); // 10
//
//        // Nhap gia tri vao
//        myList[0] = 69.0d; // ep kieu ngam dinh casting byte -> short -> int -> long -> float -> double
//        myList[5] = 96.0d;
//        myList[9] = 100.0d;
//
//        System.out.println(myList[9]); // 100
//
//        // In ra
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i]);
//        }

//        int[] numbers = {69, 96, 29};
//        System.out.println(numbers.length); // 3

//        System.out.println(numbers[1]); // 96
//        <>
//            int[] numbers = new int[3];
//            numbers[0] = 69;
//            numbers[1] = 96;
//            numbers[2] = 29;




//        int[] numbers = {1, 2, 3, 4, 5};
        // Vong lap for
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println("Number: " + numbers[i]);
//        }
//        for (elementType elementRefVar : collections)
//        for (int number : numbers) {
//            System.out.println("Number: " + number);
//        }

//        int larger = max(3, 4); // 4
//        System.out.println(larger);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sum(numbers)); // 15
    }

//    static int max(int a, int b) {
//        return a > b ? a : b;
//    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}