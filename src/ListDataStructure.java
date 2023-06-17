public class ListDataStructure {

    //create javadoc comments for the expandArray method
    /**
     * This method takes an array and doubles its size
     * @param arr the array to be doubled
     * @return the doubled array
     */
    public int[] expandArray(int[] arr) {
        
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        
        return newArr;
    }
}
