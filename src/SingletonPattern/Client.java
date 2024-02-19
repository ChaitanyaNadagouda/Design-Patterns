package SingletonPattern;

public class Client {
    public static void main(String[] args) {
        /*
        Singleton allows you to create a single instance for that class, this is used mostly where
         different code units are repeatedly creating the same instances which is required
          at that time this singleton pattern is used.
          PROS :
          1) Effiecient
          2) makes Compile time faster

         CONS:
         1) Bit DIff while testing as it is shared by multiple resources.
         2) mocking.
         */

        DatabaseConnection databaseConnection = DatabaseConnection.getInstance() ;

    }
}
