package kodlamaio;

public class InstructorManager {
	
	public void about(Instructor instructor) {
		System.out.println("Hakkýnda : " + instructor.getAbout());
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println("Yeni bir kurs eklendi. ");
	}
	
	public void addAssignment(Instructor instructor) {
		System.out.println(instructor.getFirstName() + ' ' + instructor.getLastName() + " Sisteme yeni bir ödev yükledi.");
	}

}
