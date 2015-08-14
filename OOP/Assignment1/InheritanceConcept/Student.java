/****************************************************************************************
Name            : Student
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to make Student class that inherit Person class. 
                :
****************************************************************************************/
public class Student extends Person{
		private int stuid;
		private String[] courses;

		public Student(int uid, String name,int studentid) {
			super(uid, name);
			this.stuid=studentid;
		}
		public int getStudentId(){
			return stuid;
		}
		public void setStudentId(int id){
			this.stuid=id;
		}
		public String[] getCourses(){
			return courses;
		}
		public void setCourses(String courses[]){
			this.courses=courses;
		}
		public String toString(){
			return super.toString()+"Student Id : "+stuid;
		}
}
//Emd of Person class