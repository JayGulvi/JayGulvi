
public class oops_concept_1 {

class Emp{
	int id;
	String name;
	public void printdeatails() {
		System.out.println("my id is : " +id);
		System.out.println("my name is : " + name);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("This is our custom class");
		Emp harry = new Emp();
		Emp jon = new Emp();
		
		harry.id = 12;
		harry.name = "CodeWithHarry";
		
		
		jon.id = 15;
		jon.name = "jon gulvi";
		
		harry.printdeatails();
		jon.printdeatails();
		
	}

}
