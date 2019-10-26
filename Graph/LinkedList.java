class LinkedList{
	Node head,rear;
	LinkedList(){
		this.head=this.rear=null;
	}
	void addFirst(int value){
		Node temp=new Node(value);
		if(this.head==null){
			this.head=this.rear=temp;
		}
		else{
			temp.setNext(head);
			head=temp;
		}
	}
}