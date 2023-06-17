import java.util.Arrays;

public class ListDataStructure {

    /**
     * This method takes an array and doubles its size
     * 
     * @param arr the array to be doubled
     * @return the doubled array
     */
    public static int[] expandArray(int[] arr) {

        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    /**
     * This method takes an array and doubles its size
     * Uses Arrays.copyOf
     * 
     * @param arr the array to be doubled
     * @return the doubled array
     */
    public static <T> T[] expandArray(T[] arr) {
        T[] newArr = Arrays.copyOf(arr, arr.length * 2);
        return newArr;
    }

    /**
     * This method takes an array and doubles its size
     * Uses System.arraycopy
     * 
     * @param arr the array to be doubled
     * @return the doubled array
     */
    public static <T> T[] expandArray2(T[] arr) {
        int newLength = arr.length * 2;
        T[] newArr = (T[]) new Object[newLength];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    /**
     * This method takes an array and doubles its size
     * uses a for loop
     * 
     * @param arr the array to be doubled
     * @return the doubled array
     */
    public static <T> T[] expandArray3(T[] arr) {
        int newLength = arr.length * 2;
        T[] newArr = (T[]) new Object[newLength];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

}
