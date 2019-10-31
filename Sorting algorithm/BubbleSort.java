class BubbleSort{
  static void sort(int[] array){
    int n=array.length;
    boolean hasExchanged;
    do{
      hasExchanged=false;
      for(int i=0;i<n-1;i++){
        if(array[i]>array[i+1]){
          int temp=array[i];
          array[i]=array[i+1];
          array[i+1]=temp;
          hasExchanged=true;
        }
      }
    }while(hasExchanged);
  }
}