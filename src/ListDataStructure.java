import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDataStructure <T> implements Iterable<T> {

    private int theSize = 0;
    private T[] arr;

    public int size() {
        return theSize;
    }

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

    /**
     * This method takes an array and doubles its size
     * uses a for each loop
     * 
     * @param arr the array to be doubled
     * @return the doubled array
     */
    public static <T> void print(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

   
    /**
     * This method prints the elements of a collection
     * This is an example using an iterator.
     * 
     * @param arr the collection to be printed
     */
    public static <T> void printIterator(Collection<T> arr) {
        Iterator<T> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    
    /**
     * This method removes all even numbers from a list
     * Quadratic time complexity for ArrayList
     * linear time complexity for LinkedList
     * 
     * @param list the list to be modified
     */
    public static void removeEvens(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
    }


    @Override
    public Iterator<T> iterator() {
       return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size();
        }

        @Override
        public T next() {
            //TODO: check if there is a next element
            return (T) arr[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
