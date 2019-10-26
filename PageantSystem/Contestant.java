class Contestant extends AbstractionContestant{
	Contestant(String name,String country,int age,double confident,double ambition,double credibility,double grace,double authenticity){
		this.name=name;
		this.country=country;
		this.age=age;
		this.confident=confident;
		this.ambition=ambition;
		this.credibility=credibility;
		this.grace=grace;
		this.authenticity=authenticity;
		this.mean=getMean();
	}
	@Override
	double getMean(){
		double mean=(confident+ambition+credibility+grace+authenticity)/5;
		return mean;
	}
	void setName(String name){
		this.name=name;
	}
	void setCountry(String country){
		this.country=country;
	}
	void setAge(int age){
		this.age=age;
	}
	void setConfident(double confident){
		this.confident=confident;
	}
	void setAmbition(double ambition){
		this.ambition=ambition;
	}
	void setCredibility(double credibility){
		this.credibility=credibility;
	}
	void setGrace(double grace){
		this.grace=grace;
	}
	void setAuthenticity(double authenticity){
		this.authenticity=authenticity;
	}
	void setMean(double mean){
		this.mean=mean;
	}
	String getName(){
		return this.name;
	}
	String getCountry(){
		return this.country;
	}
	int getAge(){
		return this.age;
	}
	double getConfident(){
		return confident;
	}
	double getAmbition(){
		return ambition;
	}
	double getCredibility(){
		return this.credibility;
	}
	double getGrace(){
		return this.grace;
	}
	double getAuthenticity(){
		return this.authenticity;
	}
}