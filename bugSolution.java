public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0) {
            arr[0] = 10; // Accessing a valid index
        } else {
            System.out.println("Array is empty!");
        }
        System.out.println("Hello");
    }
}