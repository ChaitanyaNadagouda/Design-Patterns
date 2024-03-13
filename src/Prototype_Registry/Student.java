package Prototype_Registry;

public class Student implements Prototype{
    private  int age ;
    private double psp ;

    private String name ;
    private String batchName ;
    private double avgBatchPsp ;

    public Student() {
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.avgBatchPsp = student.avgBatchPsp;
        this.batchName = student.batchName;
    }

    public Student clone(){
        return new Student(this) ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
}
