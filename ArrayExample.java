public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Accessing elements in the array using index
        System.out.println("Element at index 0: " + numbers[0]); // Output: 5
        System.out.println("Element at index 3: " + numbers[3]); // Output: 20

        // Modifying elements in the array
        numbers[2] = 30; // Changing the value at index 2 to 30

            // Loop through the array and print all elements
            System.out.print("Array elements: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            // Output: Array elements: 5 10 30 20 25

            // Calculate the sum of all elements in the array
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            System.out.println("\nSum of array elements: " + sum);
            // Output: Sum of array elements: 90

            // Find the maximum element in the array
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max); // Output: Maximum element: 30
    }
}