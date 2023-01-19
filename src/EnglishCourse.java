public class EnglishCourse extends Course{
    public EnglishCourse(int id, String teachersName, String studentsName) {
        super(id, teachersName, studentsName);
    }

    @Override
    public String toString() {
        return "EnglishCourse-> " + "id: " +getId()+ ", "  + "teacher's name: " +getTeachersName()+ ", "  +  "student's name: "+getStudentsName();
    }
}
