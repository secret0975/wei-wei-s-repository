class Bus{
	int busId;
	int capacity;
	int numberOfSeatAvaliable;
	Seat[][] seat;
	boolean busIsAvaliable;
	Bus(){
		this.busId=0;
		this.capacity=32;
		this.numberOfSeatAvaliable=32;
		seat=new Seat[8][4];
		this.busIsAvaliable=true;
	}
	Bus(int busId,int capacity,int numberOfSeatAvaliable,boolean busIsAvaliable){
		this.busId=busId;
		this.capacity=capacity;
		this.numberOfSeatAvaliable=numberOfSeatAvaliable;
		this.
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
		return busId;
	}
	public int getCapacity(){
		return capacity;
	}
	public int getNumberOfSeatAvaliable(){
		return numberOfSeatAvaliable;
	}
	public Seat[][] getSeat(){
		return this.seat;
	}
	public boolean getBusIsAvaliable(){
		return busIsAvaliable;
	}
}