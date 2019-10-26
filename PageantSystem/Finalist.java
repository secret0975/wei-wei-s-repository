class Finalist extends Contestant{
	String moto;
	String getMoto(){
		return this.moto;
	}
	Finalist(String name,String country,int age,double confident,double ambition,double credibility,double grace,double authenticity,String moto){
		super(name,country,age,confident,ambition,credibility,grace,authenticity);
		this.moto=moto;
	}
	void display(){
		String ans=":: Contestant: "+this.name+", "+this.age+" yr from "+this.country+"\n";
		ans+=":: confidence: "+this.confident+"\n";
		ans+=":: ambition: "+this.confident+"\n";
		ans+=":: credibility: "+this.credibility+"\n";
		ans+=":: grace: "+this.grace+"\n";
		ans+=":: authenticity: "+this.authenticity+"\n";
		ans+=":: mean: "+this.mean+"\n";
		ans+=":: moto: "+this.moto+"\n";
		System.out.println(ans);
	}
}