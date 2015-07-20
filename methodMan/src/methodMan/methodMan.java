/**
 * practising methods
 */
package methodMan;

/**
 * @author Craig McGarry
 *
 */


public class methodMan {
	private static String name = "Craig";
	private static String dept = "T100" ;
	private static int age = 21;
	private static String location = "Dublin";



	public static void main(String[] args) {
		System.out.println(name+ " " + dept +" " + age+" " + location);
		methodMan man = new methodMan();
		man.setName("\nCraig McGarry");
		man.setLocation("Ireland");
		man.setAge(21);
		man.setDept("Aj123");
		System.out.println(man.getName() +" "+ man.getAge() +" "+ man.getDept()+" "+ man.getLocation());

	}
	private String getName(){
		return name;
	}
	private String getDept() {
		return dept;
	}
	private void setDept(String dept) {
		methodMan.dept = dept;
	}
	private String getLocation() {
		return location;
	}
	private void setName(String name) {
		methodMan.name = name;
	}
	private void setAge(int age) {
		methodMan.age = age;
	}
	private String getGept(){
		return dept;
	}
	private int getAge(){
		return age;
	}
	private void setLocation(String location){
		return;
	}
}
