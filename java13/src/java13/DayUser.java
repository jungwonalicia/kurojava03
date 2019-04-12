package java13;

public class DayUser {

	public static void main(String[] args) {
		System.out.println(Day.count);
		
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count);
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		Day day4 = new Day("운동", 11, "피트니스");
		Day day5 = new Day("운동", 11, "피트니스");
		Day day6 = new Day("운동", 11, "피트니스");
		Day day7 = new Day("운동", 11, "피트니스");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("-----------------");
		System.out.println(day1.time + day2.time + day3.time);
		System.out.println(Day.sum);
		
		System.out.println("-----------------");
		System.out.println("내가 하는 일의 평균 시간은: " + Day.sum/Day.count);
		
		System.out.println(Day.avgTime());
		
	}

}
