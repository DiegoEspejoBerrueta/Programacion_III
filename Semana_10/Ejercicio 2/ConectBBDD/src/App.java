import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<DatabaseService> conexiones = new ArrayList<>();

        System.out.println("1");  
        conexiones.add(new DatabaseService()); //Imprime su linea
        System.out.println("2");
        conexiones.add(new MySQLDatabaseService());//Imprime la linea del padre más la suya
        System.out.println("3");
        conexiones.add(new SQLiteDatabaseService());//Imprime la linea del padre más la suya
        System.out.println("4");
        conexiones.add(new FakeDatabaseService()); //Imprime solo la linea del padre

        for(DatabaseService conexion: conexiones){
            System.out.println("------------------------------------");
            conexion.connect();
        }
    }
}
