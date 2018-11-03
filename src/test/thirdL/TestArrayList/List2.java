package test.thirdL.TestArrayList;

public class List2 {
    private int[] array = new int[0];
    private static int counter;

    public void add(int value) {
        int[] destinationArray = new int[++counter];
        for (int i = 0; i < counter - 1; i++) {
            destinationArray[i] = array[i];
        }
        destinationArray[counter - 1] = value;

        array = destinationArray;
    }

    public void print() {
        for (int i = 0; i < counter; i++) {
            System.out.println(array[i]);
        }
    }


}
