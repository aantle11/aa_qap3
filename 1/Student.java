class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String IdNum, double gpa) {
        super(name, age, gender);

        myIdNum = IdNum;
        myGPA = gpa;
    }
}