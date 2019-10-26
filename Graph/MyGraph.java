public class MyGraph{
	// number of vertices in the graph
	private int v;
	// array of linked list
	LinkedList[] adjListArray;
	// constructor
	MyGraph(int v){
		this.v=v;	
		adjListArray=new LinkedList[v];
		// creat a new list for each vertex
		for(int i=0;i<v;i++){
			adjListArray[i]=new LinkedList<Node>();
		}
	}
	public void addEdge(int src,int dest){
		this.adjListArray[src].addFirst(new Node(dest));
		// this.adjListArray[dest].addFirst(src);
	}
	public void printGraph(){
		for(int v=0;v<this.v;v++){
			System.out.print(v+": ");
			for(Node n: this.adjListArray[v]){
				n.printNode();
				System.out.print(" -> ");
			}
			System.out.print("Null");
			System.out.println("\n");
		}
	}	
	public void matrixToList(int[][] matrix){
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				if(matrix[i][j]==1)
					addEdge(i,j);
	}
	public static void main(String[] args) {
		int[][] matrix={{0,1,0,1},
						{1,0,0,0},
						{0,0,0,1},
						{0,1,1,0}};
		MyGraph g=new MyGraph(4);
		g.matrixToList(matrix);
		g.printGraph();
	}
}