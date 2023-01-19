public class Course {
    private int id;
    private String teachersName;
    private String studentsName;

    public Course(int  id, String teachersName, String studentsName) {
        this.id = id;
        this.teachersName = teachersName;
        this.studentsName = studentsName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getStudentsName() {
        return studentsName;
    }

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }


}

