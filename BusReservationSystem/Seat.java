class Seat{
	int seatId;
	boolean isReserved;
	String passengerName;
	Seat(){
		seatId=0;
		isReserved=false;
		passengerName="unnamed";
	}

	Seat(int searId,boolean isReserved,String passengerName){
		this.seatId=seatId;
		this.isReserved=isReserved;
		this.passengerName=passengerName;
	}
	public void reserve(String name){
		this.isReserved=true;
		this.passengerName=name;
	}
	public void cancel(){
		this.isReserved=false;
		this.passengerName="unnamed";
	}
	public void setId(int seatId){
		this.seatId=seatId;
	}
	public void setIsReserved(boolean isReserved){
		this.isReserved=isReserved;
	}
	public void setPassengerName(String passengerName){
		this.passengerName=passengerName;
	}
	public int getSeatId(){
		return this.seatId;
	}
	public boolean getIsReserved(){
		return this.isReserved;
	}
	public String passengerName(){
		return this.passengerName;
	}
}