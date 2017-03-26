class CheckEmployeeIsManager implements CheckEmployee{
	public boolean test(Employee employee) {
		return employee.isManager();
	}
}