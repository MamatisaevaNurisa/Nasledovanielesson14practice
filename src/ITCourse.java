public class ITCourse extends Course {
    public ITCourse(int id, String teachersName, String studentsName) {
        super(id, teachersName, studentsName);
    }

    @Override
    public String toString() {
        return "IT Course-> " + "id: " +getId()+", " + "teacher's name: "+getTeachersName()+", " + "student's name: "+getStudentsName();
    }
}
