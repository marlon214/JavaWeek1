
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double itemprice=10.99;
	double wallet=500.77;
	int friends=36;
	int age=18;
	String firstname="Marlon";
	String lastname="Alejandro";
	char middleinitial='Z';

	System.out.println("You have $" + wallet +" in your wallet.");
	System.out.println("You bought an item for $" + itemprice);
	wallet-=itemprice;
	System.out.println("Your wallet now has $" + wallet);
	
	System.out.println("");
	
	System.out.println("You have "+friends+" friends");
	System.out.println("You are "+ age + " years old");
	System.out.println("You made an average of "+ friends/age + " friends a year");
	
	System.out.println("");
	
	System.out.println("Your full name is "+firstname+" "+middleinitial+" "+lastname);
	
	System.out.println("");
	
	double itemprice2=17.99;
	double wallet2=230.12;
	int friends2=60;
	int age2=10;
	String firstname2="John";
	String lastname2="Doe";
	char middleinitial2='H';
	
	System.out.println("You have $" + wallet2 +" in your wallet.");
	System.out.println("You bought an item for $" + itemprice2);
	wallet2-=itemprice2;
	System.out.println("Your wallet now has $" + wallet2);
	
	System.out.println("");
	
	System.out.println("You have "+friends2+" friends");
	System.out.println("You are "+ age2 + " years old");
	System.out.println("You made an average of "+ friends2/age2 + " friends a year");
	
	System.out.println("");
	
	System.out.println("Your full name is "+firstname2+" "+middleinitial2+" "+lastname2);
	
	}

}
