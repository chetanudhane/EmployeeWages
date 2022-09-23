package day9.employee_wages_problem;

public class EmployeeWages {

	public static final int emp_Is_Present = 1;

	public int checkAttendance() {

		int working_Hrs;
		int empRandomCheck = (int) (Math.random() * 2);
		if (empRandomCheck == emp_Is_Present) {
			System.out.println("Employee is Present");
			working_Hrs = 8;
		} else {
			System.out.println("Employee is Absent");
			working_Hrs = 0;
		}
		return working_Hrs;
	}

	public void calculateDailyWages() {

		int working_Hrs_PerDay = checkAttendance();
		int wage_Per_Hrs = 20;

		int dailyWage = wage_Per_Hrs * working_Hrs_PerDay;
		System.out.println("Daily Wages For Employee Is : " + dailyWage);

	}

}
