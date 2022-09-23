package day9.employee_wages_problem;

public class EmployeeWages {

	public static final int emp_Is_Fulltime = 1;
	public static final int emp_Is_Parttime = 2;
	public static final int fulltime_Working_Hrs = 8;
	public static final int parttime_Working_Hrs = 4;

	public int checkAttendance() {

		int working_Hrs;
		int empRandomCheck = (int) (Math.random() * 3);
		if (empRandomCheck == emp_Is_Fulltime) {
			System.out.println("Employee is Present Fulltime");
			working_Hrs = fulltime_Working_Hrs;
		} else if (empRandomCheck == emp_Is_Parttime) {
			System.out.println("Employee is Present Parttime");
			working_Hrs = parttime_Working_Hrs;
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
