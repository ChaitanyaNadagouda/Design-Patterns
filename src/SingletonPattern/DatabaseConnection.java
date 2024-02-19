package SingletonPattern;

public class DatabaseConnection {
    private int id ;
    private String url ;
    private String password ;

    private DatabaseConnection(){

    }

    /*
    AS oly one instance need to be created so ways are :
    1) eager loading
    con - configurations cant be passed and compilation slows down .
    2) Single locking by condition ;
    con - Fails in Multithreaded Environment
    3) DCL - Double Check Locking
    feasible for multithreaded environment ;
     */

    private static DatabaseConnection databaseConnection  ;

//    1) Single Threaded
//    public static DatabaseConnection getInstance(){
//        if(databaseConnection==null){
//             return new DatabaseConnection();
//        }
//        return databaseConnection ;
//    }

//    2)Multithreaded Safe DCL ;
        public static DatabaseConnection getInstance(){
            if(databaseConnection==null){
                synchronized (DatabaseConnection.class) {
                    if(databaseConnection==null) {
                        return new DatabaseConnection();
                    }
                }
            }
            return databaseConnection ;
        }
}
