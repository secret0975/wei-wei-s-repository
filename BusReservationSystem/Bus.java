class Bus{
	int busId;
  String driver;
  String destination;
	int capacity;
	int numberOfSeatAvaliable;
	Seat[][] seat;
	boolean busIsAvaliable;
	Bus(){
		this.busId=0;
    this.driver="no driver";
    this.destination="not set";
		this.capacity=32;
		this.numberOfSeatAvaliable=32;
		seat=new Seat[8][4];
    int id=1;
    for(int i=0;i<8;i++)
      for(int j=0;j<4;j++){
        seat[i][j]=new Seat();
        seat[i][j].setId(id);
        id++;
      }
		this.busIsAvaliable=false;
	}
	Bus(String driver,String destination,boolean busIsAvaliable){
    this.driver=driver;
    this.destination=destination;
		this.capacity=32;
		this.numberOfSeatAvaliable=32;
    this.seat=new Seat[8][4];
    int id=1;
    for(int i=0;i<8;i++)
      for(int j=0;j<4;j++){
        seat[i][j]=new Seat();
        seat[i][j].setId(id);
        id++;
      }
		this.busIsAvaliable=busIsAvaliable;
	}
  public void printBusInfo(){
    String ans="Bus ID: "+this.busId+"\n";
    ans+="Destination: "+this.destination+"\n";
    ans+="Driver: "+this.driver+"\n";
    ans+="Capacity: "+this.capacity+"\n";
    ans+="Number of seat avaliable: "+this.numberOfSeatAvaliable+"\n";
    ans+="Seat position\n";
    for(int i=0;i<8;i++){
      for(int j=0;j<4;j++){
        if(seat[i][j].getIsReserved()==true)
          ans+=String.format("%8s",seat[i][j].getPassengerName());
        else
          ans+=String.format("%8s","Empty");
      }
      ans+="\n";  
    }
    if(this.busIsAvaliable==true)
      ans+="Bus is avaliable";
    else
      ans+="Bus is not avaliable";
    System.out.println(ans);
  }
  public boolean reserve(int seatId,String name){
    if(numberOfSeatAvaliable==0||busIsAvaliable==false){
      System.out.println("There are no seat available or the bus is unavaliable");
      return false;
    }
    else
      for(int i=0;i<8;i++)
        for(int j=0;j<4;j++){
          if(this.seat[i][j].getSeatId()==seatId){
            if(this.seat[i][j].getIsReserved()==true)
              return false;
            this.seat[i][j].setPassengerName(name);
            this.seat[i][j].setIsReserved(true);
            numberOfSeatAvaliable--;
            return true;
          }
        }
    System.out.println("There are no seat with this ID");
    return false;
  }
  public boolean cancel(String name){
    for(int i=0;i<8;i++)
      for(int j=0;j<4;j++){
        if(seat[i][j].getPassengerName().equals(name)){
          seat[i][j].setPassengerName("unnamed");
          seat[i][j].setIsReserved(false);
          numberOfSeatAvaliable++;
          return true;
        }
      }
    return false;
  }
	public void setBusId(int id){
		this.busId=id;
	}
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
	public void setNumberOfSeatAvaliable(int number){
		this.numberOfSeatAvaliable=number;
	}
	public void setBusIsAvailable(boolean busIsAvaliable){
		this.busIsAvaliable=busIsAvaliable;
	}
	public void setSeat(Seat[][] seat){
		this.seat=seat;
	}
	public int getBusId(){
		return this.busId;
	}
	public int getCapacity(){
		return this.capacity;
	}
	public int getNumberOfSeatAvaliable(){
		return this.numberOfSeatAvaliable;
	}
	public Seat[][] getSeat(){
		return this.seat;
	}
	public boolean getBusIsAvaliable(){
		return this.busIsAvaliable;
	}
}