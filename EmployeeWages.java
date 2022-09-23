package day9.employee_wages_problem;

public class EmployeeWages {

	public static final int emp_Is_Present = 1;

	public void checkAttendance() {

		int empRandomCheck = (int) (Math.random() * 2);
		if (empRandomCheck == emp_Is_Present) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}
