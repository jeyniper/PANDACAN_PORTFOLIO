import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    Main() {

        JLabel imageLabel = new JLabel();
        ImageIcon bgImage = new ImageIcon("bg.png");
        imageLabel.setIcon(bgImage);
        this.add(imageLabel);

        // about me button
        JButton aboutmeButton = new JButton();
        ImageIcon aboutmeB = new ImageIcon("aboutmeb.png");
        aboutmeButton.setIcon(aboutmeB);
        aboutmeButton.setBounds(460, 200, 230, 40);

        EventHandler handler = new EventHandler();
        aboutmeButton.addActionListener(handler);
        imageLabel.add(aboutmeButton);

        // skills button
        JButton skillsButton = new JButton();
        ImageIcon skillsB = new ImageIcon("skillsb.png");
        skillsButton.setIcon(skillsB);
        skillsButton.setBounds(460, 250, 230, 40);

        // event handler for hobbies button
        EventHandler1 handler1 = new EventHandler1();
        skillsButton.addActionListener(handler1);
        imageLabel.add(skillsButton);

        // works button
        JButton worksButton = new JButton();
        ImageIcon worksB = new ImageIcon("worksb.png");
        worksButton.setIcon(worksB);
        worksButton.setBounds(460, 300, 230, 40);

        // event handler for works button
        EventHandler2 handler2 = new EventHandler2();
        worksButton.addActionListener(handler2);
        imageLabel.add(worksButton);

        // resume button
        JButton resumeButton = new JButton();
        ImageIcon resumeB = new ImageIcon("resumeb.png");
        resumeButton.setIcon(resumeB);
        resumeButton.setBounds(460, 350, 230, 40);

        // event handler for resume button
        EventHandler3 handler3 = new EventHandler3();
        resumeButton.addActionListener(handler3);
        imageLabel.add(resumeButton);

        // contacts button
        JButton contactsButton = new JButton();
        ImageIcon contactsB = new ImageIcon("contactsb.png");
        contactsButton.setIcon(contactsB);
        contactsButton.setBounds(460, 400, 230, 40);

        // event handler for contacts button
        EventHandler4 handler4 = new EventHandler4();
        contactsButton.addActionListener(handler4);
        imageLabel.add(contactsButton);

        // System layout
        this.setLayout(new FlowLayout());
        this.setTitle("Portfolio");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100, 700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setResizable(false);

    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to about me frame
            new AboutMe();
            dispose(); // close the frame

        }
    }

    private class EventHandler1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to hobbies frame
            new Skills();
            dispose(); // close the frame
        }
    }

    private class EventHandler2 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to works frame
            new Works();
            dispose(); // close the frame
        }
    }

    private class EventHandler3 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to resume frame
            new Resume();
            dispose(); // close the frame
        }
    }

    private class EventHandler4 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to contacts frame
            new Contacts();
            dispose(); // close the frame
        }
    }
}
