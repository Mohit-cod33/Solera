package hrmsapp.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee implements Comparable{
		private Integer id;
		private String name;
		private LocalDate dateOfBirth;
		private Double salary;
		//HAS-A
		private Address address;
		/*
		 * public int compare(Employee o1, Employee o2) 
		 * {
		  
		    return o2.getSalary().compareTo(o1.getSalary());
			}
		 */
		@Override
		public int compareTo(Object o) {
			if(this.id == ((Employee)o).id) {
				return 0;
			}else if (this.id <((Employee) o).id) {
				return 1;
			}else {
				return -1;
			}
		}
}

/*
 * public int compare(Employee o1, Employee o2) 
 * {
  
    return o2.getSalary().compareTo(o1.getSalary());
	}
 */
