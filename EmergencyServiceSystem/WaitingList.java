public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        //TODO: Implement this method
        if(this.head==null)
          return null;
        Node n=this.head;
        this.head=this.head.getNext();
        numNodes--;
        return n.getPatient();
    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        //TODO: Implement this method
        Node newNode=new Node(patient);
        if(this.head==null){
          this.head=newNode;
          numNodes++;
          return;
        }
        if(this.head.getPatient().getTriageLevel()<patient.getTriageLevel()){
          newNode.setNext(this.head);
          this.head=newNode;
          numNodes++;
          return;
        }
        Node temp=this.head;
        while(temp.next!=null&&temp.getNext().getPatient().getTriageLevel()>=patient.getTriageLevel()){
          temp=temp.getNext();
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        numNodes++;
        return;
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        //TODO: Implement this method
        Node temp=this.head;
        if(this.head==null)
          System.out.println("Waiting list is empty!");
        else{
          while(temp!=null){
            temp.printNode();
            System.out.println();
            temp=temp.getNext();
          }
        }
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
