package parent;

public class Java_demo {

	public static void main(String[] args) {
		
		Student_demo st=new Student_demo();
		st.setEmail("abc@gmail.com");
		st.setId(1);
        st.setName("abc");
        
        
        Student_saver saver=new Student_saver(st);
        
        
       // saver.saveStudent();
        
          Student_demo d= saver.saveStudent(st);
          System.out.println(d.getName());
	}

}


class Student_demo{
	
	int id;
	String name;
	String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}



class Student_saver{
	
	
	private Student_demo demo;
	
	
	public Student_saver(Student_demo demo)
	
	{
		this.demo=demo;
	}
	
	
	public Student_demo saveStudent(Student_demo st)
	{
		System.out.println("student saved");
		return st;
	}
}