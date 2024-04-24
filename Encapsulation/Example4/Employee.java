class Employee
{
	private int employee_id;
	private String employee_name;
	private double employee_salary;


	public void setEmployeeId(int employeeId){this.employee_id=employeeId;}
	public void setEmployeeName(String employeeName){this.employee_name=employeeName;}
	public void setEmployeeSalary(double employeeSalary){this.employee_salary=employeeSalary;}


	int getEmployeeId(){return employee_id;}
	String getEmployeeName(){return employee_name;}	
	double getEmployeeSalary(){return employee_salary;}


	
}

