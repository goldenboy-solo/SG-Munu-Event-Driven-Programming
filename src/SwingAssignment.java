import javax.swing.*;
import java.awt.*;

public class SwingAssignment extends JFrame {
    public static void main(String[] args) {
        new SwingAssignment();
    }

        JFrame frame;
        JPanel panel;
        JLabel label;
        JButton messageButton;
        JButton colorButton;

        public SwingAssignment() {
            frame = this;
            frame.setTitle("Java Swing Assignment");
            frame.setSize(800, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());

            ImageIcon icon = new ImageIcon("app icon.jpeg");
            frame.setIconImage(icon.getImage());

            panel = new JPanel();
            panel.setPreferredSize(new Dimension(700, 600));
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            label = new JLabel("Welcome to Java Swing First Individual Assignment by Solomon Gibrilla Munu");
            label.setAlignmentX(Component.CENTER_ALIGNMENT);

            messageButton = new JButton("Change Message");
            messageButton.addActionListener(e -> {
                if (label.getText().equals("Welcome to Java Swing First Individual Assignment by Solomon Gibrilla Munu")) {
                    label.setText("Hello! Watch me complete all my assignments in one week!!");
                }else  {
                    label.setText("Welcome to Java Swing First Individual Assignment by Solomon Gibrilla Munu");
                }
            });
            messageButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            colorButton = new JButton("Change Background");
            colorButton.addActionListener(e -> {
                if (panel.getBackground() == Color.LIGHT_GRAY) {
                    panel.setBackground(Color.CYAN);
                } else {
                    panel.setBackground(Color.LIGHT_GRAY);
                }
            });
            colorButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            panel.add(Box.createVerticalStrut(10));
            panel.add(label);
            panel.add(Box.createVerticalStrut(30));
            panel.add(messageButton);
            panel.add(Box.createVerticalStrut(10));
            panel.add(colorButton);

            frame.add(panel);
            frame.setVisible(true);
        }
    }

