package assignmentThree;

import java.util.Comparator;

public class compst implements Comparator<StudentPro>{

		public int compare(StudentPro m, StudentPro n)
	    {
			int compare = m.getFname().compareTo(n.getFname());
				  if((m.getCgpa() > n.getCgpa()) && (m.getCgpa() != n.getCgpa())){
				      return 1;
				  }
			   else if((m.getCgpa() == n.getCgpa()) && (compare < 0))
			       {
			       return -1;
			   }
				  else if((m.getCgpa() == n.getCgpa()) && (compare > 0))
				      {
				       return 1;
				   }
				  else if((m.getCgpa() == n.getCgpa()) && compare == 0 && (m.getId() < n.getId()))
			   {
				      return 1;
				  }
			   else
			       {
			       return -1;
			       } 
		    }
	

}
