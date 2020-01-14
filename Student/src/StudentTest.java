
public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Jane", 91.00);
		System.out.printf("%s's letter grade is: %s%n", student1.getName(),student1.getLetterGrade());
		Student student2 = new Student("jim", 18.00);
		System.out.printf("%s's letter grade is: %s", student2.getName(),student2.getLetterGrade());

	}

}
