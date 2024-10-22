package defualtpakage;
class Foo{
	   	// static
	    public static String classVar = "I class var";
	    //instance
	    public String instanceVar = "I instance var";
	    public static void classMethod() {
	    	//classMethod안에서 classVariable에 접근했을 때 
	        System.out.println(classVar); // Ok
	        //classMethod안에서 instanceVariable에 접근했을 때
//		    System.out.println(instanceVar); // Error
	    }
	    // instance 로 접근(Static 없이 호출)
	    public void instanceMethod() {
	    	//instanceMethod안에서 classVariable에 접근했을 때 
	        System.out.println(classVar); // Ok
	    	//instanceMethod안에서 instanceVariable에 접근했을 때
	        System.out.println(instanceVar); // Ok
	    }
	}


	public class StaticApp {
	 
	    public static void main(String[] args) {
	    	//class 를 통해서 classVar 에 접근이되나?
	        System.out.println(Foo.classVar); // OK
	        //class 를 통해서 instanceVar 에 접근이 되나?
//	        System.out.println(Foo.instanceVar); Error => instance 는 instance 를 통해서 사용하도록 고안된 변수

	        // Foo class 의 함수 호출
	        Foo.classMethod();
//	        Foo.instanceMethod();
	         
	        // indtance 생성
	        Foo f1 = new Foo();
	        Foo f2 = new Foo();

	        // instance 호출
	        System.out.println(f1.classVar); // I class var 출력
	        System.out.println(f1.instanceVar); // I instance var 출력

	        // classVar : static 을 사용한 놈 => f1에서 바뀌면 Foo 에서도 바뀌고, Foo 의 또다른 instance 도 바뀐다.
	        f1.classVar = "changed by f1";
	        System.out.println(Foo.classVar); // changed by f1 출력
	        System.out.println(f2.classVar);  // changed by f1 출력

	        // instanceVar : static 없는 놈 => 오직 f1 의 instanceVar 만 바뀐다.
	        f1.instanceVar = "changed by f1";
	        System.out.println(f1.instanceVar); // changed by f1 출력
	        System.out.println(f2.instanceVar); // I instance var 출력
	    }
	 
	}
