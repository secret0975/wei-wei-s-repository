class Node{
	Finalist pageant;
	Node next;
	Node(Finalist pageant){
		this.pageant=pageant;
		this.next=null;
	}
	Node getNext(){
		return this.next;
	}
	void setNext(Node next){
		this.next=next;
	}
	Finalist getFinalist(){
		return pageant;
	}
	void setFinalist(Finalist pageant){
		this.pageant=pageant;
	}
}