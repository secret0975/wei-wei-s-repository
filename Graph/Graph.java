class Graph{
	int v;
	LinkedList[] adjList;
	// 这个只是数组而已，数组里面的元素是LinkedList
	Graph(int v){
		this.v=v;
		adjList=new LinkedList[v];
		for(int i=0;i<v;i++){
			adjList[i]=new LinkedList();
		}
	}
	void addEdge(int src,int des){
		this.adjList[src].addFirst(des);
	}
	void printGraph(){
		for(int i=0;i<v;i++){
			Node temp=this.adjList[i].head;
			String ans="Vertix["+i+"]: ";
			while(temp!=null){
				ans+=temp.getData()+"->";
				temp=temp.getNext();
			}
			ans+="null";
			System.out.println(ans);
		}
	}
	void matrixToGraph(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]==1){
					addEdge(i,j);
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] matrix={{0,1,0,1},
				{1,0,0,0},
				{0,0,0,1},
				{0,1,1,0}};
		Graph g=new Graph(4);
		g.printGraph();
		g.matrixToGraph(matrix);
		g.printGraph();
	}
}