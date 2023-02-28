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
        int[] arrayExample2 = { 1, 2, 3, 4, 5 };
        System.out.println("The arrayExample2 for 0 is " + arrayExample2[0]);

        System.out.println(""); // Space
        final int Increase = 5;
        arrayExample2[0] += Increase;
        arrayExample2[1] += Increase;
        arrayExample2[2] += Increase;
        arrayExample2[3] += Increase;
        arrayExample2[4] += Increase;

        System.out.println("After increase of 5, the arrayExample2 for 0 is " + arrayExample2[0]);

        System.out.println(""); // Space
    }
}