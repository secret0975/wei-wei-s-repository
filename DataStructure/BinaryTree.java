class BinaryTree{
  Node root;
  BinaryTree(){
    this.root=null;
  }
  void insert(Node current,int val){
    Node newNode=new Node(val);
    if(this.root==null){
      this.root=newNode;
      return;
    }
    if(val<current.data){
      if(current.left!=null)
        insert(current.left,val);
      else
        current.left=newNode;
    }
    else if(current.data==val){
      return;
    }
    else{
      if(current.right!=null)
        insert(current.right,val);
      else
        current.right=newNode;
    }
  }
  void traverse(Node current){
    if(current==null){
      return;
    }
    traverse(current.left);
    System.out.println(current.data);
    traverse(current.right);
  }
  boolean search(Node current,int val){
    if(this.root==null)
      return false;
    if(val<current.data)
      search(current.left,val);
    else if(val==current.data)
      return true;
    else
      search(current.right,val);
    return false;
  }
}