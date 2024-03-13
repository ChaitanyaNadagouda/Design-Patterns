package Prototype_Registry;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student student1prototype = new Student() ;
//        student1prototype.setName("DEC22");
        student1prototype.setBatchName("DEC22");
        student1prototype.setAvgBatchPsp(99.00);
        studentRegistry.register("DEC22",student1prototype);

    }


    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry() ;
        fillRegistry(studentRegistry);

        Student student = studentRegistry.get("DEC22").clone() ;
        student.setName("Chaitanya");
        student.setAge(24);
        student.setPsp(99);

    }

}
