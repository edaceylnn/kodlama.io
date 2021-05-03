package kodlamaio;

public class StudentManager {
	
	public void comment(Student student) {
		System.out.println(student.getUserName() + " yorum yaptý.");
	}
	
	public void assignment(Student student) {
		System.out.println(student.getUserName() + " ödevini sisteme yükledi.");
	}

}
