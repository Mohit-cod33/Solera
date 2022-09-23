package daythree.string;

public class Comparisonstrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDm ed=new EmployeeDm();
		EmployeeDm dm=new EmployeeDm();
		ed.setEmpId(1);
		ed.setFrstname("Mohit");
		ed.setLastname("kumar");
		ed.setDepart("CSE");
		
		dm.setEmpId(1);
		dm.setFrstname("Nitin");
		dm.setLastname("kumar");
		dm.setDepart("EC");
		
		System.out.println(ed.equals(dm));
		System.out.println(ed.hashCode());
		System.out.println(dm.hashCode());
		
		System.out.println(ed);
		
		System.out.println("##################################");
		System.out.println();
		
		
		System.out.println(ed.equals(dm));
		System.out.println(ed.hashCode());
		System.out.println(dm.hashCode());
		
		System.out.println(ed);

	}

}
