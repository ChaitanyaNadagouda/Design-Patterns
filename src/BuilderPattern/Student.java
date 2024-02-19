package BuilderPattern;
import java.lang.String ;

public class Student {
//    private String name ;
//    private String Universityname ;
    private String name ;
    private String phoneNumber ;
    private String Universityname ;
    private double psp ;
    private int id ;
    private int rollno ;
    private int age ;
//    private String phoneNumber ;

    public Student(Builder builder){
        this.age= builder.getAge();
        this.name=builder.getName();
        this.id=builder.getId() ;
        this.psp=builder.getPsp() ;
        this.rollno=builder.getRollno();
        this.phoneNumber=builder.getPhoneNumber() ;
        this.Universityname=builder.getUniversityname() ;
    }

    public static Builder getInstance(){
        return new Builder() ;
    }

    public static class Builder {
        private String name ;
        private String Universityname ;
        private double psp ;
        private int id ;
        private int rollno ;
        private int age ;
        private String phoneNumber ;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this ;
        }

        public String getUniversityname() {
            return Universityname;
        }

        public Builder setUniverstiyname(String universtiyname) {
            Universityname = universtiyname;
            return this ;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this ;
        }

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this ;
        }

        public int getRollno() {
            return rollno;
        }

        public Builder setRollno(int rollno) {
            this.rollno = rollno;
            return this ;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this ;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this ;
        }

        public Student build() {
            return new Student(this) ;
        }
    }
}
