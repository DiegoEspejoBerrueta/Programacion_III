public class MySQLDatabaseService extends DatabaseService{
    public MySQLDatabaseService(){
        super();
        System.out.println("Constructor: MySQLDatabaseService");
    }

    @Override 
    public void connect(){
        super.connect(); //usar el método connect definido en la clase padre
        System.out.println("Base de datos: MySQL");
    }


}
