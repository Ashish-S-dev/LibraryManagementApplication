package librarymanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LibrarianHome extends JFrame implements ActionListener{
    JButton btn3,btn2,btn1;
    public LibrarianHome(){
        setLayout(null);
        
//      Creating the Menubar
        JMenuBar menubar=new JMenuBar();
        menubar.setBackground(Color.getHSBColor(0.625f,0.60f, 0.45f));
        setJMenuBar(menubar);
       
        JLabel lbllogo=new JLabel("  L.M.S");
        lbllogo.setFont(new Font("Algerian",Font.BOLD,30));
        lbllogo.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(lbllogo);
        
        JMenu book=new JMenu("Books");
        book.setFont(new Font("Tahoma",Font.BOLD,16));
        book.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(book);
        
        
        JMenuItem addBook=new JMenuItem("Add Books");
        addBook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        addBook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        addBook.setFont(new Font("Sarif",Font.BOLD,16));
        addBook.addActionListener(this);
        book.add(addBook);
        
        JMenuItem deletBook=new JMenuItem("Delete Books");
        deletBook.addActionListener(this);
        deletBook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        deletBook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        deletBook.setFont(new Font("Sarif",Font.BOLD,16));
        book.add(deletBook);
        
        JMenuItem updateBook=new JMenuItem("Update Books");
        updateBook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        updateBook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        updateBook.addActionListener(this);
        updateBook.setFont(new Font("Sarif",Font.BOLD,16));
        book.add(updateBook);
        
        JMenu search=new JMenu("Search Book");
        search.setFont(new Font("Tahoma",Font.BOLD,16));
        search.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(search);
        
        JMenuItem byTitle=new JMenuItem("Search By Title");
        byTitle.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        byTitle.setForeground(Color.getHSBColor(0, 0, 0.2f));
        byTitle.setFont(new Font("Tahoma",Font.BOLD,16));
        byTitle.addActionListener(this);
        search.add(byTitle);
        
        JMenuItem byAuthor=new JMenuItem("Search By Author");
        byAuthor.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        byAuthor.setForeground(Color.getHSBColor(0, 0, 0.2f));
        byAuthor.setFont(new Font("Sarif",Font.BOLD,16));
        byAuthor.addActionListener(this);
        search.add(byAuthor);
        
        JMenuItem byCategory=new JMenuItem("Search By Category");
        byCategory.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        byCategory.setForeground(Color.getHSBColor(0, 0, 0.2f));
        byCategory.setFont(new Font("Sarif",Font.BOLD,16));
        byCategory.addActionListener(this);
        search.add(byCategory);
        
        
//        Member Section
        
        JMenu teacher=new JMenu("Teacher");
        teacher.setFont(new Font("Tahoma",Font.BOLD,16));
        teacher.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(teacher);
        
        JMenuItem newtea=new JMenuItem("Add New Teacher");
        newtea.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        newtea.setForeground(Color.getHSBColor(0, 0, 0.2f));
        newtea.setFont(new Font("Sarif",Font.BOLD,16));
        newtea.addActionListener(this);
        teacher.add(newtea);
        
        JMenuItem edittea=new JMenuItem("Update Teacher Details");
        edittea.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        edittea.setForeground(Color.getHSBColor(0, 0, 0.2f));
        edittea.setFont(new Font("Sarif",Font.BOLD,16));
        edittea.addActionListener(this);
        teacher.add(edittea);
       
        JMenuItem removetea=new JMenuItem("Remove Teacher Details");
        removetea.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        removetea.setForeground(Color.getHSBColor(0, 0, 0.2f));
        removetea.setFont(new Font("Sarif",Font.BOLD,16));
        removetea.addActionListener(this);
        teacher.add(removetea);
        
        
//        Student
        //        Report Section
        JMenu newstu=new JMenu("Student");
        newstu.setFont(new Font("Tahoma",Font.BOLD,16));
        newstu.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(newstu);
        
        
        JMenuItem addstu=new JMenuItem("Add New Student");
        addstu.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        addstu.setForeground(Color.getHSBColor(0, 0, 0.2f));
        addstu.setFont(new Font("Sarif",Font.BOLD,16));
        addstu.addActionListener(this);
        newstu.add(addstu);
        
        JMenuItem editstu=new JMenuItem("Update Student Details");
        editstu.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        editstu.setForeground(Color.getHSBColor(0, 0, 0.2f));
        editstu.setFont(new Font("Sarif",Font.BOLD,16));
        editstu.addActionListener(this);
        newstu.add(editstu);
        
        JMenuItem removestu=new JMenuItem("Remove Student Details");
        removestu.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        removestu.setForeground(Color.getHSBColor(0, 0, 0.2f));
        removestu.setFont(new Font("Sarif",Font.BOLD,16));
        removestu.addActionListener(this);
        newstu.add(removestu);
        
//       Issue and return books

        JMenu issue=new JMenu("Issue/Return");
        issue.setFont(new Font("Tahoma",Font.BOLD,16));
        issue.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(issue);
                
        
        
        JMenuItem issuebook=new JMenuItem("Issue Book to Student");
        issuebook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        issuebook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        issuebook.addActionListener(this);
        issuebook.setFont(new Font("Sarif",Font.BOLD,16));
        issue.add(issuebook);
        JMenuItem returnBook=new JMenuItem("Return Student Book");
        returnBook.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        returnBook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        returnBook.setFont(new Font("Sarif",Font.BOLD,16));
        returnBook.addActionListener(this);
        issue.add(returnBook);

        JMenuItem issuebookTea=new JMenuItem("Issue Book to Teacher");
        issuebookTea.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        issuebookTea.setForeground(Color.getHSBColor(0, 0, 0.2f));
        issuebookTea.addActionListener(this);
        issuebookTea.setFont(new Font("Sarif",Font.BOLD,16));
        issue.add(issuebookTea);
        
        JMenuItem returnBook2=new JMenuItem("Return Teacher Book");
        returnBook2.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        returnBook2.setForeground(Color.getHSBColor(0, 0, 0.2f));
        returnBook2.setFont(new Font("Sarif",Font.BOLD,16));
        returnBook2.addActionListener(this);
        issue.add(returnBook2);
        
//        My Profile--->setting
        JMenu myProfile=new JMenu("My Profile");
        myProfile.setFont(new Font("Tahoma",Font.BOLD,16));
        myProfile.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(myProfile);
        
        JMenuItem viewProfile=new JMenuItem("View Profile");
        viewProfile.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        viewProfile.setForeground(Color.getHSBColor(0, 0, 0.2f));
        viewProfile.setFont(new Font("Sarif",Font.BOLD,16));
        viewProfile.addActionListener(this);
        myProfile.add(viewProfile);
        
        JMenuItem editProfile=new JMenuItem("Update Profile");
        editProfile.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        editProfile.setForeground(Color.getHSBColor(0, 0, 0.2f));
        editProfile.setFont(new Font("Sarif",Font.BOLD,16));
        editProfile.addActionListener(this);
        myProfile.add(editProfile);
        
        JMenuItem changePass=new JMenuItem("Change Password");
        changePass.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        changePass.setForeground(Color.getHSBColor(0, 0, 0.2f));
        changePass.setFont(new Font("Sarif",Font.BOLD,16));
        changePass.addActionListener(this);
        myProfile.add(changePass);
    
        
//        Help Section
        JMenu help=new JMenu("Help");
        help.setFont(new Font("Tahoma",Font.BOLD,16));
        help.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalStrut(30));
        menubar.add(help);
        
        JMenuItem userManual=new JMenuItem("About");
        userManual.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        userManual.setForeground(Color.getHSBColor(0, 0, 0.2f));
        userManual.setFont(new Font("Sarif",Font.BOLD,16));
        userManual.addActionListener(this);
        help.add(userManual);
        
        JMenuItem contact=new JMenuItem("Contact Support");
        contact.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        contact.setForeground(Color.getHSBColor(0, 0, 0.2f));
        contact.setFont(new Font("Sarif",Font.BOLD,16));
        contact.addActionListener(this);
        help.add(contact);
        
//        Logout Section
        JMenu log=new JMenu("Logout/ Exit ");
        log.setFont(new Font("Tahoma",Font.BOLD,16));
        log.setForeground(Color.getHSBColor(0, 0f, 0.97f));
        menubar.add(Box.createHorizontalGlue());
        menubar.add(log);
        
        JMenuItem exit=new JMenuItem("Exit");
        exit.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        exit.setForeground(Color.getHSBColor(0, 0, 0.2f));
        exit.setFont(new Font("Sarif",Font.BOLD,16));
        exit.addActionListener(this);
        log.add(exit);
        
        JMenuItem logout=new JMenuItem("Logout");
        logout.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        logout.setForeground(Color.getHSBColor(0, 0, 0.2f));
        logout.setFont(new Font("Sarif",Font.BOLD,16));
        logout.addActionListener(this);
        log.add(logout);
        
//        End Of Menu Bar

        JLabel name2=new JLabel(Login.passName+" !! ");
        name2.setBounds(60,10,1200,60);
        name2.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        name2.setFont(new Font("Algerian",Font.BOLD,40));
        add(name2);

        JLabel name=new JLabel("WELCOME IN LIBRARY MANAGEMENT SYSTEM");
        name.setBounds(60,60,1200,60);
        name.setFont(new Font("Algerian",Font.BOLD,30));
        name.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(name);
        
        JLabel name3=new JLabel("( Developed By - Ashish Soni ) ");
        name3.setBounds(60,100,1200,60);
        name3.setFont(new Font("Algerian",Font.BOLD,20));
        name3.setForeground(Color.ORANGE);
        add(name3);
        
        btn1=new JButton("Attendence");
        btn1.setPreferredSize(new Dimension(250,100));//Dimension of the bUtton
        btn1.setForeground(Color.getHSBColor(0, 0, 0.2f));
        btn1.setBackground(Color.getHSBColor(0.58f,0.10f,0.92f));
        btn1.setFont(new Font("tahoma",Font.BOLD,20));
        btn1.setBounds(60,200,250,100);
        btn1.addActionListener(this);
        add(btn1);
        
        btn2=new JButton("Students");
        btn2.setPreferredSize(new Dimension(250,100));//Dimension of the bUtton
        btn2.setForeground(Color.getHSBColor(0, 0, 0.2f));
        btn2.setBackground(Color.getHSBColor(0.58f,0.10f,0.92f));
        btn2.setFont(new Font("tahoma",Font.BOLD,20));
        btn2.setBounds(60,350,250,100);
        btn2.addActionListener(this);
        add(btn2);
        
        btn3=new JButton("Teacher");
        btn3.setPreferredSize(new Dimension(250,100));//Dimension of the bUtton
        btn3.setForeground(Color.getHSBColor(0, 0, 0.2f));
        btn3.setBackground(Color.getHSBColor(0.58f,0.10f,0.92f));
        btn3.setFont(new Font("tahoma",Font.BOLD,20));
        btn3.setBounds(60,500,250,100);
        btn3.addActionListener(this);
        add(btn3);
        
        ImageIcon tableimg=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/librarian.png"));
        Image tableimg2=tableimg.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT);
        ImageIcon tableimg3=new ImageIcon(tableimg2);
        JLabel tableimg4=new JLabel(tableimg3);
        tableimg4.setBounds(370,70,900,600);
        add(tableimg4);
        
//      Making the Frame Full Screen
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1350,750);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        String userCmd=ae.getActionCommand();
        if(userCmd.equals("Exit")){
            Login.passName="Hello ";
            setVisible(false);
        }else if(userCmd.equals("Logout")){
            Login.passName="Hello ";
            new Login();
            setVisible(false);
        }else if(userCmd.equals("Add Books")){
            new AddBook();
        }else if(userCmd.equals("Search By Title")){
            new SearchByTitle();
        }else if(userCmd.equals("Search By Author")){
            new SearchByAuthor();
        }else if(userCmd.equals("Search By Category")){
            new SearchByCategory();
        }else if(userCmd.equals("Delete Books")){
            new DeleteBook();
        }else if(userCmd.equals("Update Books")){
            new UpdateBook();
        }else if(userCmd.equals("Add New Teacher")){
            new AddTeacher();
        }else if(userCmd.equals("Update Teacher Details")){
            new UpdateTeacher();
        }else if(userCmd.equals("Remove Teacher Details")){
            new RemoveTeacher();
        }else if(userCmd.equals("Add New Student")){
            new AddStudent();
        }else if(userCmd.equals("Update Student Details")){
            new UpdateStudent();
        }else if(userCmd.equals("Remove Student Details")){
            new RemoveStudent();
        }else if(userCmd.equals("Return Student Book")){
            new ReturnBook();
        }else if(userCmd.equals("Return Teacher Book")){
            new ReturnTeaBook();
        }else if(userCmd.equals("Issue Book to Student")){
            new IssueBook();
        }else if(userCmd.equals("Issue Book to Teacher")){
            new IssueBookTeacher();
        }else if(userCmd.equals("View Profile")){
            new ViewLibrarianProfile();
        }else if(userCmd.equals("Update Profile")){
            new UpdateLibrarianProfile();
        }else if(userCmd.equals("Change Password")){
            new UpdateTeacherPassword();
        }else if(userCmd.equals("About")){
            new About();
        }else if(userCmd.equals("Contact Support")){
            new ContactUs();
        }
        
        if(ae.getSource()==btn1){
            new Attendence();
        }else if(ae.getSource()==btn2){
            new AllStudent();
        }else if(ae.getSource()==btn3){
            new AllTeacher();
        }
    }
    public static void main(String args[]){
        new LibrarianHome();
    }
}
