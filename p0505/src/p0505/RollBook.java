package p0505;

class Student{
	int num;
	String name;
	
public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
void print(){
	System.out.println("*이름 :"+name+"  *학번 : "+num );
	}
}
public class RollBook {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("백하진");
		s1.setNum(111);
		s1.print();
		
		String na=s1.getName();//가져오고싶은 변수와 다른이름의 변수를 설정한다
		System.out.print(na);
	}

}
