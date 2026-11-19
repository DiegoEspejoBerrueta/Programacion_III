public class SQLiteDatabaseService extends DatabaseService{
    public SQLiteDatabaseService(){

    }

    @Override 
    public void connect(){
        super.connect();
        System.out.println("Base de datos: SQLite");
    }
}
