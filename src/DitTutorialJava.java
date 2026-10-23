import javax.swing.*;
import java.awt.*;

public class DitTutorialJava {
    public static void main(String[] args){
        //JFrame
        String[] columns = {
                "ID", "Name", "Course"
        };

        String[][] data = {
                {"1", "John", "Java"},
                {"2", "Mary", "Python"},
                {"3", "Jane", "Database"},
        };
        JTable table = new JTable(data, columns);
        JFrame frame = new JFrame("Shazam");
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.add(table);
    }
}
