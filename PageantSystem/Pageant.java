class Pageant{
	Node head,rear;
	int maxNumber;
	int current;
	Pageant(){
		this.current=0;
		this.maxNumber=3;
		this.head=this.rear=null;
	}
	boolean addFinalist(Finalist pageant){
		Node temp=new Node(pageant);
		if(this.current==maxNumber){
			System.out.println("Add Finallist failed! Three pagent already in list");
			return false;
		}
		else if(this.head==null||current==0){
			this.head=this.rear=temp;
			current++;
			return true;
		}
		else{
			rear.setNext(temp);
			rear=temp;
			current++;
			return true;
		}
	}
	void printFinalist(){
		Node temp=head;
		if(head==null)
			System.out.println("Print Error! The finallist is empty");
		else{
			while(temp!=null){
			temp.getFinalist().display();
			temp=temp.getNext();
			}
		}
	}
	void sortFinalist(){
		boolean hasExchanged;

		do{
			Node temp=head;
			hasExchanged=false;
			while(temp.getNext()!=null){
				if(temp.getFinalist().getMean()<temp.next.getFinalist().getMean()){
					Finalist tempFinalist=temp.getFinalist();
					temp.setFinalist(temp.next.getFinalist());
					temp.next.setFinalist(tempFinalist);
					hasExchanged=true;
				}
				temp=temp.getNext();
			}
		}while(hasExchanged);
	}
}