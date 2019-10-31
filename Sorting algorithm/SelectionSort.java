class SelectionSort{
  static void sort(int[] array){
    int n=array.length;
    for(int i=0;i<n-1;i++){
      int index=i;
      for(int j=i+1;j<n;j++){
        if(array[j]<array[index]){
          index=j;
        }
      }
      int temp=array[i];
      array[i]=array[index];
      array[index]=temp;
    }
  }
}