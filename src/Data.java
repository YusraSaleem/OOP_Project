import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Data {
    Statement stat;
    Data(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TravelManagmentSystem", "root", "Y21sw034");
            stat = conn.createStatement();
        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}
