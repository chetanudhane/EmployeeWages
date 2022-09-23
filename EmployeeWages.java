package day9.employee_wages_problem;

public class EmployeeWages {

	public static final int emp_Is_Fulltime = 1;
	public static final int emp_Is_Parttime = 2;
	public static final int fulltime_Working_Hrs = 8;
	public static final int parttime_Working_Hrs = 4;
	public static final int working_Days_For_Month = 20;
	public static final int total_Working_Hrs = 100;

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

	public int calculateDailyWages(int working_Hrs) {

		int wage_Per_Hrs = 20;

		int dailyWage = wage_Per_Hrs * working_Hrs;
		System.out.println("Daily Wages For Employee Is : " + dailyWage);

		return dailyWage;

	}

	public void calculateMonthlyWages() {
		EmployeeWages employeeWages = new EmployeeWages();
		int monthly_Wage = 0;
		int working_Hrs_Per_Month = 0;
		for (int i = 1; i <= working_Days_For_Month; i++) {

			System.out.println("Day-" + i);
			if (working_Hrs_Per_Month >= total_Working_Hrs) {
				break;
			}

			int working_Hrs = employeeWages.checkAttendance();
			int dailyWage = employeeWages.calculateDailyWages(working_Hrs);

			working_Hrs_Per_Month += working_Hrs;
			monthly_Wage += dailyWage;

		}
		System.out.println("Monthly Wage Of Employee : " + monthly_Wage);

	}

}
