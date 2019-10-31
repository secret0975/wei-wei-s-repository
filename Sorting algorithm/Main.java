class Main {
  static void printArray(int[] array){
    for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
  }
  public static void main(String[] args) {
    int[] array={7,6,5,4,3,2,1};
    // BubbleSort.sort(array);
    // QuickSort.sort(array,0,6);
    // InsertitonSort.sort(array);
    // MergeSort.sort(array,0,6);
    // SelectionSort.sort(array);
    printArray(array);
  }
}