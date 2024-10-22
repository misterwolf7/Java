package statics;

class Foo{
	// static
	public static String classVariable = "I class var";
	// instance
	public String instanceVariable = "I instance var";
	
//	
	public static void classMethod() {
//		classMethod안에서 classVariable에 접근했을 때 
		System.out.println(classVariable); //OK
//		classMethod안에서 instanceVariable에 접근했을 때
//		System.out.println(instanceVariable); //Error
	}
	
	// instance 로 접근(Static 없이 호출)
	 public void instanceMethod() {
//		instanceMethod안에서 classVariable에 접근했을 때 
		System.out.println(classVariable); //OK
//		instanceMethod안에서 instanceVariable에 접근했을 때
		System.out.println(instanceVariable); //OK
	 }
	
}
public class Static {
	public static void main(String args) {
//		 class 를 통해서 classVar 에 접근이되나?
		System.out.println(Foo.classVariable); // OK
//		 class 를 통해서 instanceVar 에 접근이 되나?
//		System.out.println(Poo.instanceVariable); // Error => instance는 instance를 톨해서 사용하도록 고안된 변수
		
		// 호출
		Foo.classMethod();
//		Poo.instanceMethod();
	}
}