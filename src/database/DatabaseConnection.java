package database;

public class DatabaseConnection {
    private DatabaseConnection(){

    }

    private static DatabaseConnection instance;
    public static DatabaseConnection createDatabase(){
        if (instance==null) instance=new DatabaseConnection();
        return instance;
    }
}
