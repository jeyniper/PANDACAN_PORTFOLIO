import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resume extends JFrame {

    Resume() {

        JLabel imageLabel = new JLabel();
        ImageIcon resumeImage = new ImageIcon("Resume.png");
        imageLabel.setIcon(resumeImage);
        this.add(imageLabel);

        JButton homeButton = new JButton();
        ImageIcon homeB = new ImageIcon("Back to Home.png");
        homeButton.setIcon(homeB);
        homeButton.setBounds(650, 600, 180, 40);

        EventHandler handler = new EventHandler();
        homeButton.addActionListener(handler);

        // Next Button
        JButton nextButton = new JButton();
        ImageIcon nextB = new ImageIcon("Next.png");
        nextButton.setIcon(nextB);
        nextButton.setBounds(890, 600, 180, 40);

        // Event handler for next button
        EventHandler1 handler1 = new EventHandler1();
        nextButton.addActionListener(handler1);

        imageLabel.add(homeButton);
        imageLabel.add(nextButton);

        this.setLayout(new FlowLayout());
        this.setTitle("My Portfolio");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100, 700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setResizable(false);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to game frame
            new Main();
            dispose();

        }
    }

    private class EventHandler1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to game frame
            new Contacts();

            dispose();
        }
    }
}