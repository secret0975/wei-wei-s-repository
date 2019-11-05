class Stack{
  Node top;
  Stack(){
    this.top=null;
  }
  boolean isEmpty(){
    if(this.top==null)
      return true;
    return false;
  }
  void push(int val){
    Node newNode=new Node(val);
    newNode.next=top;
    top=newNode;
  }
  Node pop(){
    if(isEmpty())
      return null;
    Node n=top;
    top=top.next;
    return n;
  }
  Node peek(){
    return this.top;
  }
}