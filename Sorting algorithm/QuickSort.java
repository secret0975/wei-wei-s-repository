class QuickSort{
  static void sort(int[] array,int low,int high){
    if(low<high){
      int pi=partition(array,low,high);
      sort(array,low,pi-1);
      sort(array,pi+1,high);
    }
  }
  static int partition(int[] array,int low,int high){
    int pivot=array[high];
    int j=low;
    for(int i=low;i<=high;i++){
      if(array[i]<pivot){
        int temp=array[low];
        array[low]=array[i];
        array[i]=temp;
        j++;
      }
    }
    int temp=array[high];
    array[high]=array[j];
    array[j]=temp;
    return j;
  }
}