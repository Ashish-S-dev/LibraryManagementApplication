package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TeacherHome extends JFrame implements ActionListener {

    JButton btn1, btn2, btn3;

    public TeacherHome() {
        setLayout(null);

//      Creating the Menubar
        JMenuBar menubar = new JMenuBar();
        menubar.setBackground(Color.getHSBColor(0.625f, 0.60f, 0.45f));
        setJMenuBar(menubar);

        JLabel lbllogo = new JLabel("  L.M.S");
        lbllogo.setFont(new Font("Algerian", Font.BOLD, 30));
        lbllogo.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(lbllogo);

        JMenu searchBook = new JMenu("Search Books");
        searchBook.setFont(new Font("Tahoma", Font.BOLD, 16));
        searchBook.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(searchBook);

        JMenuItem byTitle = new JMenuItem("By Title");
        byTitle.setBackground(Color.getHSBColor(0, 0, 0.97f));
        byTitle.setForeground(Color.getHSBColor(0, 0, 0.2f));
        byTitle.setFont(new Font("sarif", Font.BOLD, 16));
        byTitle.addActionListener(this);
        searchBook.add(byTitle);

        JMenuItem byAuthor = new JMenuItem("By Author");
        byAuthor.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        byAuthor.setForeground(Color.getHSBColor(0, 0, 0.2f));
        byAuthor.setFont(new Font("Sarif", Font.BOLD, 16));
        byAuthor.addActionListener(this);
        searchBook.add(byAuthor);

        JMenuItem byCategory = new JMenuItem("By Category");
        byCategory.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        byCategory.setForeground(Color.getHSBColor(0, 0, 0.2f));
        byCategory.addActionListener(this);
        byCategory.setFont(new Font("Sarif", Font.BOLD, 16));
        searchBook.add(byCategory);

//        Issued Books Section
        JMenu issuedBook = new JMenu("Books");
        issuedBook.setFont(new Font("Tahoma", Font.BOLD, 16));
        issuedBook.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(issuedBook);

        JMenuItem allbook = new JMenuItem("All Books");
        allbook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        allbook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        allbook.setFont(new Font("Sarif", Font.BOLD, 16));
        allbook.addActionListener(this);
        issuedBook.add(allbook);

        JMenuItem availbook = new JMenuItem("Available Book");
        availbook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        availbook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        availbook.setFont(new Font("Sarif", Font.BOLD, 16));
        availbook.addActionListener(this);
        issuedBook.add(availbook);

        JMenuItem viewIssuedBook = new JMenuItem("View Issued Book");
        viewIssuedBook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        viewIssuedBook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        viewIssuedBook.setFont(new Font("sarif", Font.BOLD, 16));
        viewIssuedBook.addActionListener(this);
        issuedBook.add(viewIssuedBook);

//        Request Book
        JMenu attend = new JMenu("Attendence");
        attend.setFont(new Font("Tahoma", Font.BOLD, 16));
        attend.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(attend);

        JMenuItem viewatt = new JMenuItem("View Attendence");
        viewatt.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        viewatt.setForeground(Color.getHSBColor(0, 0, 0.2f));
        viewatt.setFont(new Font("Sarif", Font.BOLD, 16));
        viewatt.addActionListener(this);
        attend.add(viewatt);

        JMenuItem entryatt = new JMenuItem("Attendence Entry");
        entryatt.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        entryatt.setForeground(Color.getHSBColor(0, 0, 0.2f));
        entryatt.setFont(new Font("Sarif", Font.BOLD, 16));
        entryatt.addActionListener(this);
        attend.add(entryatt);

        JMenuItem exitatt = new JMenuItem("Exit Attendence");
        exitatt.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        exitatt.setForeground(Color.getHSBColor(0, 0, 0.2f));
        exitatt.setFont(new Font("Sarif", Font.BOLD, 16));
        exitatt.addActionListener(this);
        attend.add(exitatt);

//        My Profile
        JMenu myProfile = new JMenu("My Profile");
        myProfile.setFont(new Font("Tahoma", Font.BOLD, 16));
        myProfile.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(myProfile);

        JMenuItem viewProfile = new JMenuItem("View Profile");
        viewProfile.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        viewProfile.setForeground(Color.getHSBColor(0, 0, 0.2f));
        viewProfile.setFont(new Font("Sarif", Font.BOLD, 16));
        viewProfile.addActionListener(this);
        myProfile.add(viewProfile);

        JMenuItem changePass = new JMenuItem("Change Password");
        changePass.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        changePass.setForeground(Color.getHSBColor(0, 0, 0.2f));
        changePass.setFont(new Font("Sarif", Font.BOLD, 16));
        changePass.addActionListener(this);
        myProfile.add(changePass);

//        Help Section
        JMenu help = new JMenu("Help");
        help.setFont(new Font("Tahoma", Font.BOLD, 16));
        help.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(help);

        JMenuItem userManual = new JMenuItem("About");
        userManual.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        userManual.setForeground(Color.getHSBColor(0, 0, 0.2f));
        userManual.setFont(new Font("Sarif", Font.BOLD, 16));
        userManual.addActionListener(this);
        help.add(userManual);

        JMenuItem contact = new JMenuItem("Contact Support");
        contact.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        contact.setForeground(Color.getHSBColor(0, 0, 0.2f));
        contact.setFont(new Font("Sarif", Font.BOLD, 16));
        contact.addActionListener(this);
        help.add(contact);

//        Logout Section
        JMenu log = new JMenu("Logout/ Exit ");
        log.setFont(new Font("Tahoma", Font.BOLD, 16));
        log.setForeground(Color.getHSBColor(0f, 0f, 0.97f));
        menubar.add(Box.createHorizontalGlue());
        menubar.add(log);

        JMenuItem exit = new JMenuItem("Exit");
        exit.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        exit.setForeground(Color.getHSBColor(0, 0, 0.2f));
        exit.setFont(new Font("Sarif", Font.BOLD, 16));
        exit.addActionListener(this);
        log.add(exit);

        JMenuItem logout = new JMenuItem("Logout");
        logout.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        logout.setForeground(Color.getHSBColor(0, 0, 0.2f));
        logout.setFont(new Font("Sarif", Font.BOLD, 16));
        logout.addActionListener(this);
        log.add(logout);

//        End Of Menu Bar
//      Display Image of the Application
        JLabel name2 = new JLabel(Login.passName + " !! ");
        name2.setBounds(60, 10, 1200, 60);
        name2.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        name2.setFont(new Font("Algerian", Font.BOLD, 40));
        add(name2);

        JLabel welcomemsg = new JLabel("WELCOME IN LIBRARY MANAGEMENT SYSTEM");
        welcomemsg.setBounds(60, 60, 1200, 60);
        welcomemsg.setFont(new Font("Algerian", Font.BOLD, 30));
        welcomemsg.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(welcomemsg);

        JLabel name3 = new JLabel("( Developed By - Ashish Soni ) ");
        name3.setBounds(60, 100, 1200, 60);
        name3.setFont(new Font("Algerian", Font.BOLD, 20));
        name3.setForeground(Color.ORANGE);
        add(name3);

        btn1 = new JButton("Available Books");
        btn1.setPreferredSize(new Dimension(250, 100));//Dimension of the bUtton
        btn1.setForeground(Color.getHSBColor(0, 0, 0.2f));
        btn1.setBackground(Color.getHSBColor(0.58f, 0.10f, 0.92f));
        btn1.setFont(new Font("tahoma", Font.BOLD, 20));
        btn1.setBounds(60, 200, 250, 100);
        btn1.addActionListener(this);
        add(btn1);

        btn2 = new JButton("Issued Books");
        btn2.setPreferredSize(new Dimension(250, 100));//Dimension of the bUtton
        btn2.setForeground(Color.getHSBColor(0, 0, 0.2f));
        btn2.setBackground(Color.getHSBColor(0.58f, 0.10f, 0.92f));
        btn2.setFont(new Font("tahoma", Font.BOLD, 20));
        btn2.setBounds(60, 350, 250, 100);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new JButton("Read Book");
        btn3.setPreferredSize(new Dimension(250, 100));//Dimension of the bUtton
        btn3.setForeground(Color.getHSBColor(0, 0, 0.2f));
        btn3.setBackground(Color.getHSBColor(0.58f, 0.10f, 0.92f));
        btn3.setFont(new Font("tahoma", Font.BOLD, 20));
        btn3.setBounds(60, 500, 250, 100);
        btn3.addActionListener(this);
        add(btn3);

        ImageIcon tableimg = new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/teacher.png"));
        Image tableimg2 = tableimg.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon tableimg3 = new ImageIcon(tableimg2);
        JLabel tableimg4 = new JLabel(tableimg3);
        tableimg4.setBounds(350, 80, 1000, 600);
        add(tableimg4);

//      Making the Frame Full Screen
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1350, 750);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String userCmd = ae.getActionCommand();
        if (userCmd.equals("By Title")) {
            new USearchByTitle();
        } else if (userCmd.equals("By Author")) {
            new USearchByAuthor();
        } else if (userCmd.equals("By Category")) {
            new USearchByCategory();
        } else if (userCmd.equals("All Books")) {
            new AllBook();
        } else if (userCmd.equals("Available Book")) {
            new AvailableBook();
        } else if (userCmd.equals("View Issued Book")) {
            new IssuedBook();
        } else if (userCmd.equals("View Attendence")) {
            new ViewAttendence();
        } else if (userCmd.equals("Attendence Entry")) {
            new EntryAttendence();
        } else if (userCmd.equals("Exit Attendence")) {
            new ExitAttendence();
        } else if (userCmd.equals("View Profile")) {
            new ViewTeacherProfile();
        } else if (userCmd.equals("Change Password")) {
            new UpdateTeacherPassword();
        } else if (userCmd.equals("About")) {
            new About();
        } else if (userCmd.equals("Contact Support")) {
            new ContactUs();
        } else if (userCmd.equals("Exit")) {
            Login.passName = "Hello ";
            setVisible(false);
        } else if (userCmd.equals("Logout")) {
            Login.passName = "Hello ";
            new Login();
            setVisible(false);

        }

        if (ae.getSource() == btn1) {
            new AvailableBook();
        } else if (ae.getSource() == btn2) {
            new IssuedBook();
        } else if (ae.getSource() == btn3) {
            new OpenPdf();
        }
    }

    public static void main(String args[]) {
        new TeacherHome();
    }
}
