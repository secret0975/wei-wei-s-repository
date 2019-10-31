class MergeSort{
  static void sort(int[] array,int left,int right){
    if(left<right){
      int middle=(left+right)/2;
      sort(array,left,middle);
      sort(array,middle+1,right);
      merge(array,left,middle,right);
    }
  }
  static void merge(int[] array,int left,int middle,int right){
    int n1=middle-left+1;
    int n2=right-middle;
    int[] l=new int[n1];
    int[] r=new int[n2];
    for(int i=0;i<n1;i++)
      l[i]=array[left+i];
    for(int j=0;j<n2;j++)
      r[j]=array[middle+1+j];
    int i=0,j=0;
    int k=left;
    while(i<n1&&j<n2){
      if(l[i]<r[j]){
        array[k++]=l[i++];
      }
      else
        array[k++]=r[j++];
    }
    while(i<n1)
      array[k++]=l[i++];
    while(j<n2)
      array[k++]=r[j++];
  }
}