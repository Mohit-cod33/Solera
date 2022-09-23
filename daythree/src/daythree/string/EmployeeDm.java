package daythree.string;

import java.util.Objects;

public class EmployeeDm {
	private int empId;
	private String frstname;
	private String lastname;
	private String depart;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFrstname() {
		return frstname;
	}
	public void setFrstname(String frstname) {
		this.frstname = frstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	
	@Override
	public String toString() {
		return "EmployeeDm [empId=" + empId + ", frstname=" + frstname + ", lastname=" + lastname + ", depart=" + depart
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDm other = (EmployeeDm) obj;
		return this.getEmpId() == other.getEmpId();
	}
	

}
