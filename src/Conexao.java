import java.sql.*;
public class Conexao {

    public static String URL = "jdbc:mysql://localhost/Orcamento";
    public static String USER = "root";
    public static String PWD = "admin";

    private Connection dbconn = null;
    private Statement sqlmgr = null;
    private ResultSet resultsql = null;

    public void OpenDatabase() {

        try {
            dbconn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Conectado com suceso em: "+ URL);
            sqlmgr = dbconn.createStatement(); // criar objeto para SQL
        } catch (Exception Error) {
            System.out.println("Error on connect: "+ Error.getMessage());
        }
    }
    
    public void CloseDatabase() throws SQLException {
        sqlmgr.close();
        dbconn.close();
    }

    public int ExecutaQuery(String sql) {
        try {
            return sqlmgr.executeUpdate(sql); // insert/delete/update/create
        } catch (Exception Error) {
            System.out.println("Error on connect: "+ Error.getMessage());

        }
        return -1;
    }

}

