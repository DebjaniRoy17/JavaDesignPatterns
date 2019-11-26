package com.java.test;

public class BasicJavaTest extends Model implements  ModelInterface{
	
	public static void someMethod(String a) {System.out.println("inside String");};
	//public void someMethod(Model m) {System.out.println("inside Model");};
	public static void someMethod(Object m) {System.out.println("inside Object");};

	public String getA() {
		return "inside BasicJavaTest";
	}
	//public String getB(){ return "inside B";}
	
	public static void main(String args[])throws Exception{
		someMethod((Object) null);

		Model test = new BasicJavaTest();
		System.out.println(test.getA());//although getA() is present in Model and BasicJavaTest, it will call getA() of BasicJavaTest
		System.out.println(test.getB());//getB() is not there in BasicJavaTest, hence it will call getB() of Model.
										// So it will call getB() of BasicJavaTest if the method is overridden.

		ModelInterface testInf = new BasicJavaTest();
		System.out.println(testInf.getA());
		System.out.println(testInf.getB());
	}
	

}
