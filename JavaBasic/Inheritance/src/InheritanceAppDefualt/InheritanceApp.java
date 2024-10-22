package InheritanceAppDefualt;
class Cal{
    public int sum(int v1, int v2){
        return v1+v2;
    }
    // Overloading(과적하다) : 자바는 여러개의 메소드를 과적할 수 있음. (=> 형태만 다르면 가능)
    public int sum(int v1, int v2, int v3){
    	// this 로 자신의(Cal의) 메소드 사용.
        return this.sum(v1,v2)+v3;
    }
}
// extends : 상속하기 위해 필요함
class Cal3 extends Cal{
    public int minus(int v1, int v2){
        return v1-v2;
    }
    // Overriding(무시하다) : 부모가 가진 기능을 다른(더 좋은)기능으로 덮어씀으로써 제어할 수 있다..
    public int sum(int v1, int v2){
        System.out.println("Cal3!!"); // 부모에게 없는 내용 추가
     
        // super : Cal3의 부모크래스(SuperClass)인 Cal 에 sum 을 가리키게 됨.
        return super.sum(v1,v2);
    }
 
}
public class InheritanceApp {
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));
 
        Cal3 c3 = new Cal3();
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
    }
}
class Cal2{
	// 입력값의 형태에따라서 같은 이름의 메소드지만, 다르게 실행.
    public int sum(int v1, int v2){
        return v1+v2;
    }
    public int minus(int v1, int v2){
        return v1-v2;
    }
}