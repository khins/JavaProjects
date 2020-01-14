// Student Class: Nested if...else Statements
public class Student {
	private String name;
	private double average;
	
	public Student(String name, double average) {
		this.name = name;
		
		if (average > 0.0) {
			if (average <= 100) {
				this.average = average;
			}
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAverage(double average) {
		if (average > 0.0) {
			if (average <= 100) {
				this.average = average;
			}
		}
	}
	
	public double getAverage() {
		return this.average;
	}
	
	public String getLetterGrade() {
		String letterGrade = "";
		
		if (average >= 90.00) {
			letterGrade = "A";
		} // etc.. else conditions
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
}
