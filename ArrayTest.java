public class ArrayTest {
    public static void main(String[] args) {

        int[] arrayExample = new int[5];

        arrayExample[0] = 1;
        arrayExample[1] = 2;
        arrayExample[2] = 3;
        arrayExample[3] = 4;
        arrayExample[4] = 5;

        System.out.println(""); // Space
        System.out.println("The arrayExample for 1 is " + arrayExample[1]);

        System.out.println(""); // Space
        final int IncreaseByOne = 1;
        for (int sub = 0; sub < 5; ++sub) { // Using the sub
            arrayExample[sub] += IncreaseByOne;

            System.out.println("After increase by one, arrayExample is " + arrayExample[sub]);
        }

        System.out.println(""); // Space
        int[] arrayExample2 = { 1, 2, 3, 4, 5 };
        System.out.println("The arrayExample2 for 4 is " + arrayExample2[4]);

        System.out.println(""); // Space
        final int IncreaseByFive = 5;
        arrayExample2[0] += IncreaseByFive;
        arrayExample2[1] += IncreaseByFive;
        arrayExample2[2] += IncreaseByFive;
        arrayExample2[3] += IncreaseByFive;
        arrayExample2[4] += IncreaseByFive;

        System.out.println("After increase by 5, the arrayExample2 for 4 is " + arrayExample2[4]);

        System.out.println(""); // Space
        System.out.print("The arrayExample3.lenght is");
        int[] arrayExample3 = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        // This is the longer version to print all arrays
        for (int sub2 = 0; sub2 < arrayExample3.length; ++sub2) {
            System.out.print(" " + arrayExample3[sub2]);
        }
        System.out.println(" "); // Space
        System.out.println(" "); // Space

        // This is the shorter version to print all arrays
        for (int value : arrayExample3) {
            System.out.println("Using (value : arrayExample3) is " + value);
        }
    }
}