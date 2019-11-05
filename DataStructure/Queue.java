class Queue{
  Node front,rear;
  Queue(){
    this.front=this.rear=null;
  }
  void enqueue(int val){
    Node newNode=new Node(val);
    if(this.front==null){
      this.front=this.rear=newNode;
      return;
    }
    else{
      rear.setNext(newNode);
      this.rear=newNode;
    }
  }
  Node dequeue(){
    if(this.front==null)
      return null;
    Node n=this.front;
    front=front.getNext();
    return n;
  }
  void traverse(){
    Node current=this.front;
    while(current!=null){
      System.out.println(current.data);
      current=current.getNext();
    }
  }
}