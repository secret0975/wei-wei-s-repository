public class GNode{
	// attibutes
	private int index;
	// constructor
	GNode(int index){
		this.index=index;
	}
	// accessors and mutators
	public int getIndex(){
		return index;
	}
	public void setIndex(int index){
		this.index=index;
	}
	// method
	public void printNode(){
		System.out.print("Node <"+this.index+">");
	}
}