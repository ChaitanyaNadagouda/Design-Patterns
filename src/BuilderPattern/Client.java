package BuilderPattern;

public class Client {
    public static void main(String[] args) {

        /*
        Builder pattern solves the problem of validations of too many attributes before the object creation.
         */

//      v1)
//        Builder builder = new Builder() ;
//        builder.setAge(23);
//        builder.setId(10);
//        builder.setName("Chaitanya");
//        builder.setPhoneNumber("986712342");
//        builder.setPsp(88.89);
//        builder.setRollno(21);
//
//        Student student = new Student(builder) ;

//        v2)
//        Builder should itself build student object and give right , isnt that intuivative ?
//        make a build method inside builder class
//        and u can validate things inside build method
//        Builder builder1 = new Builder() ;
//        builder1.setAge(23);
//        builder1.setId(10);
//        builder1.setName("Chaitanya");
//        builder1.setPhoneNumber("986712342");
//        builder1.setPsp(88.89);
//        builder1.setRollno(21);
//        Student student1 = builder1.build() ;


//        v3)
        /*
        But Here Client should explicitly create builder object and then that is returning student object
        why cant a student class itself build its own object and give , which makes more sense and readale ryt ?
        Lets do this:
        1) Make this Builder class inside student class itself
        2) as still we can create explicitly student object so to avoid it make the student constructor private
        3) Now as we want to acsess Builder class from outside without creating its object so make it static
         */

        Student student = Student.getInstance().setAge(21)
                .setId(10).setName("chaitanya")
                .setPhoneNumber("7466100467")
                .setPsp(99).setUniverstiyname("Scaler")
                .build() ;

//        This is more Intuivative , readable amd concise ;

    }
}
