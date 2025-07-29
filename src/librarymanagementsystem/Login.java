package librarymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
public class Login extends JFrame implements ActionListener{

    JTextField tfname,tfuserid;
    JPasswordField tfpassword;
    JRadioButton student, librarian,teacher;
    JButton cancel,log;
    public static String passName="Hello ",userName,databaseName,userid,logpassword;
    
//    Creating the Constructor for the Login Page
    
    public Login() {
        setLayout(null);

//        Frame Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(1350, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(0, 0, 1350, 750);
        add(i4);
        

        JLabel heading = new JLabel("LOGIN");
        heading.setForeground(Color.ORANGE);
        heading.setFont(new Font("Algerian", Font.BOLD, 40));
        heading.setBounds(410, 210, 150, 50);
        i4.add(heading);
        
        JLabel lbluserid = new JLabel("UserId");
        lbluserid.setFont(new Font("Tahoma", Font.BOLD, 20));
        lbluserid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbluserid.setBounds(325, 280, 130, 30);
        i4.add(lbluserid);

        tfuserid = new JTextField("ST-383-");
        tfuserid.setBounds(480, 280, 150, 30);
        i4.add(tfuserid);

        JLabel lblname = new JLabel("Username");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblname.setBounds(325, 330, 130, 30);
        i4.add(lblname);

        tfname = new JTextField();
        tfname.setBounds(480, 330, 150, 30);
        i4.add(tfname);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblpassword.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpassword.setBounds(325, 380, 100, 30);
        i4.add(lblpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(480, 380, 150, 30);
        i4.add(tfpassword);

        ButtonGroup butongrp = new ButtonGroup();
        librarian = new JRadioButton(" Librarian ");
        librarian.setBackground(Color.WHITE);
        librarian.setForeground(Color.getHSBColor(0, 0, 0.2f));
        librarian.setBounds(325, 430, 115, 30);
        librarian.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i4.add(librarian);
        
        teacher = new JRadioButton(" Teacher ");
        teacher.setBackground(Color.WHITE);
        teacher.setForeground(Color.getHSBColor(0, 0, 0.2f));
        teacher.setBounds(440, 430, 115, 30);
        teacher.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i4.add(teacher);
        
        student = new JRadioButton(" Student ");
        student.setBackground(Color.WHITE);
        student.setForeground(Color.getHSBColor(0, 0, 0.2f));
        student.setBounds(555, 430, 115, 30);
        student.setFont(new Font("Tahoma", Font.PLAIN, 20));
        i4.add(student);

        butongrp.add(teacher);
        butongrp.add(student);
        butongrp.add(librarian);
        
        cancel=new JButton("Cancel");
        cancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        cancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));
        cancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        cancel.setBounds(350,490,100,40);
        cancel.addActionListener(this);
        i4.add(cancel);
        
        log=new JButton("Login");
        log.setFont(new Font("Tahoma", Font.PLAIN, 20));
        log.setForeground(Color.getHSBColor(0, 0, 0.2f));
        log.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        log.setBounds(500,490,100,40);
        log.addActionListener(this);
        i4.add(log);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/login2.png"));
        Image img2=img1.getImage().getScaledInstance(466, 360, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img4=new JLabel(img3);
        img4.setBounds(648,193,466,360);
        i4.add(img4);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1350,750);
        setLocationRelativeTo(null);
        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== log){
//            Accessing input Box Value
            
            String username=tfname.getText();
            
            String password=tfpassword.getText();
            if(librarian.isSelected() || teacher.isSelected()){
                databaseName="Teacher";
            }else if(student.isSelected()){
                databaseName="student";
            }
            String user=tfuserid.getText();
//            Creating the Object of the Connection Class
            Conn conn=null;
            try{
                conn=new Conn();
                String query;
                
                query="Select * from "+databaseName+" where Name='"+username+"' and Password='"+password+"' and ReferenceNo='"+user+"' ";
                ResultSet rs=conn.s.executeQuery(query);
                
                if(rs.next()){
                    
                    if(student.isSelected()){
                        passName+=tfname.getText();
                        userName=tfname.getText();
                        userid=tfuserid.getText();
                        logpassword=tfpassword.getText();
                        new StudentHome();
                        setVisible(false);
                        
                    }else if(librarian.isSelected()){
                        passName+=tfname.getText();
                        userName=tfname.getText();
                        userid=tfuserid.getText();
                        logpassword=tfpassword.getText();
                        new LibrarianHome();
                        
                        setVisible(false);
                        
                    }else if(teacher.isSelected() && !rs.getString("Department").equals("Librarian")){
                        passName+=tfname.getText();
                        userName=tfname.getText();
                        userid=tfuserid.getText();
                        logpassword=tfpassword.getText();
                        new TeacherHome();
                        
                        setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null,"No Such User Present");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"No Such User Present");
                }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Poor Connection !!","",JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }finally{
                if(conn.c!=null){
                    try{
                        conn.c.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("Connection Closed");
            }
        }

        }else if(ae.getSource()==cancel){
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        new Login();
        
    }
}
