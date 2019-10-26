class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
	void setData(int data){
		this.data=data;
	}
	void setNext(Node next){
		this.next=next;
	}
	Node getNext(){
		return this.next;
	}
	int getData(){
		return this.data;
	}
}