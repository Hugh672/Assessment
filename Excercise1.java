import java.util.ArrayList;

public class Excercise1 {
	public static void main(String[] args) {

		System.out.println("hello");
		
//ex2
		String HelloWorld = "hello world";
		System.out.println(HelloWorld);
		
//ex3
		PrintString("Hello World");
		
//ex4
		ReturnHelloWorldMethod();
		System.out.println(ReturnHelloWorldMethod());
	
		
//ex5 + ex6
		System.out.println(IntegerSum(2,3,true));
		
//ex7
		System.out.println(CheckIf0(2,0));

		{
//ex8 
		for (int x = 0; x <10; x++) {
		System.out.println(CheckIf0(x, 3));
		}
		}
		
		
//ex9	
		
		int[] ArrayOfInts = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(CheckIf0(ArrayOfInts[1],ArrayOfInts[8]));
		
		
//ex10
		{
		for (int x = 0; x < ArrayOfInts.length; x++) {
		System.out.println(ArrayOfInts[x]);
		}
		}
		
//ex11
		
		int[] SecondArray;
		SecondArray = new int[10];
		for(int x=0; x <SecondArray.length; x++) {
			SecondArray[x] = x;
			System.out.println(SecondArray);
		}
		for(int x = 0;x<SecondArray.length; x++) {
			SecondArray[x]*=10;
			System.out.println(SecondArray[x]);
		}
		
//ex12
		
		System.out.println(Blackjack(14,17));
	
	
//ex13
		
		System.out.println("Unique sum "+(USum(3,2,2)));

//ex14
		
		System.out.println("Too Hot, "+TooHot(100, false));
		
//ex15 People
		Person hugh = new Person("Hugh", 27, "the don");
		Person nick =new Person("nick", 24 , "the dons mate");
		
	
		
		ArrayList<Person> peopleList = new ArrayList<Person>();
		
		peopleList.add(hugh);
		peopleList.add(nick);
		
		for(Person p : peopleList) {
			System.out.println(p);
		}
		
		for(Person p :peopleList) {
			if(p.getName().equals("Hugh")) {
				System.out.println(hugh.getAge() + " " + hugh.getJobTitle());
			}
		}
	}

	
//ex3
	public static void PrintString(String output){
		System.out.println(output);
}

//ex4
	public static String ReturnHelloWorldMethod() {
	return "Hello World";
}
//ex5 + ex6
	 static int IntegerSum(int A,int B, boolean C) {


	if (C) {
		return A+B;
			}
	else {
		return A*B;
		}	
}
//ex7
	public static int CheckIf0 (int A, int B) {
		if(A==0||B==0) {
			return (A == 0)?B:A;
		}
		return A+B;
		}

//ex12
	public static int Blackjack(int A, int B) {
		if(A>21&&B>21) {
			return 0;
		}
		
		if(A>21)return B;
		if(B>21)return A;
		if(A==B)return A;
		
		int CalcA = 21 - A;
		int CalcB = 21 - B;
		
		return(CalcA>CalcB)?B:A;
		}
	
	
//ex13

public static int USum(int A, int B, int C) {
	int CalcA = A;
	int CalcB = B;
	int CalcC = C;
	
	
	if(CalcA == B) {
		A = 0;
		B = 0;
	}
	
	if(CalcA == C) {
		A = 0;
		C = 0;	
	}
	if(CalcB == C) {
		B = 0;
		C = 0;
	}
	
	return A + B + C;
	
	}

//ex14

public static boolean TooHot(int temperature, boolean
isSummer){
	
	if(isSummer) {
	if(temperature>=60&& temperature <=90) {
		return true;
	}
	}
	return false;

}

}





	
	

	
	
	
	
	
	

	
	
	
	












	
	
	
	
	
	
	
	
