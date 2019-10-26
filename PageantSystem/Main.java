class Main{
	public static void main(String[] args) {
		Finalist burra=new Finalist("Lady Burra","Australia",21,9.3,9.3,9.3,9.3,9.3,"life is beautiful");
		Finalist kate=new Finalist("Kate Perry","England",24,9,9,8.3,5.3,10,"Thank God is Friday");
		Finalist swift=new Finalist("Taylor Swift","United States",24,10,10,10,10,10,"I hate Kate Perry");
		// Finalist[] finalist={burra,kate,swift};
		Pageant pageant=new Pageant();
		pageant.addFinalist(burra);
		pageant.addFinalist(kate);
		pageant.addFinalist(swift);
		pageant.sortFinalist();
		pageant.printFinalist();
	}
}