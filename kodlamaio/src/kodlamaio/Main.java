package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ela");
		student.setLastName("Demir");
		student.setEmail("demir@gmail.com");
		student.setUserName("elademir");
		student.setPassword("123");
		student.setSchool("Kodlama.io");
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setAbout(" Kodlama.io, Co-Founder");
		
		UserManager userManager = new UserManager();
		userManager.signIn(student);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.assignment(student);
		userManager.signOut(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addAssignment(instructor);
		
	
		

	}

}
