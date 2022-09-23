package day9.employee_wages_problem;

public class EmployeeWages {

	public static final int emp_Is_Fulltime = 1;
	public static final int emp_Is_Parttime = 2;
	public static final int fulltime_Working_Hrs = 8;
	public static final int parttime_Working_Hrs = 4;
	private static final int EMP_IS_PART_TIME_PRESENT = 0;

//	public int checkAttendance() {
//
//		int working_Hrs;
//		int empRandomCheck = (int) (Math.random() * 3);
//		if (empRandomCheck == emp_Is_Fulltime) {
//			System.out.println("Employee is Present Fulltime");
//			working_Hrs = fulltime_Working_Hrs;
//		} else if (empRandomCheck == emp_Is_Parttime) {
//			System.out.println("Employee is Present Parttime");
//			working_Hrs = parttime_Working_Hrs;
//		} else {
//			System.out.println("Employee is Absent");
//			working_Hrs = 0;
//		}
//		return working_Hrs;
//	}

	public int switchCase() {

		int working_Hrs;
		int rand = (int) (Math.random() * 3);

		switch (rand) {

		case emp_Is_Fulltime:
			System.out.println("Employee is full time Present");
			working_Hrs = fulltime_Working_Hrs;
			break;

		case EMP_IS_PART_TIME_PRESENT:
			System.out.println("Employee is part time Present");
			working_Hrs = parttime_Working_Hrs;
			break;

		default:
			System.out.println("Employee is absent");
			working_Hrs = 0;
		}
		return working_Hrs;
	}

	public void calculateDailyWages() {

		int working_Hrs_PerDay = switchCase();
		int wage_Per_Hrs = 20;

		int dailyWage = wage_Per_Hrs * working_Hrs_PerDay;
		System.out.println("Daily Wages For Employee Is : " + dailyWage);

	}

}
