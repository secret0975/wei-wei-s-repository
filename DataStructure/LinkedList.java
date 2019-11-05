class LinkedList{
  Node head;
  void append(int val){
    if(head==null){
      this.head=new Node(val);
      return;
    }
    Node current=head;
    while(current.next!=null){
      current=current.next;
    }
    current.next=new Node(val);
  }
  void perpend(int val){
    Node newNode=new Node(val);
    newNode.next=this.head;
    this.head=newNode;
  }
  void deleteWithValue(int val){
    if(head==null)
      return;
    if(head.data==val){
      head=head.next;
      return;
    }
    Node current=this.head;
    while(current.next!=null){
      if(current.next.data==val){
        current.next=current.next.next;
        return;
      }
      current=current.next;
    }
  }
}