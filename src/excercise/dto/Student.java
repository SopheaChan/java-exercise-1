package excercise.dto;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String grade;

    public Student(int id, String name, int age, String gender, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
