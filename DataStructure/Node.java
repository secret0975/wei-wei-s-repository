class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
    this.next=null;
  }
  void setNext(Node next){
    this.next=next;
  }
  Node getNext(){
    return this.next;
  }
}