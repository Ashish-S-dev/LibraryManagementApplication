
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
public class About extends JFrame{
   
    public About(){
        setLayout(null);
        
        JLabel heading=new JLabel("About L.M.S");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(400,30,300,40);
        add(heading);
        
        String data="<html>"+
                "<Style>b{font-size:14px;"
                + "font-color:#154360;} li{color:#333333; text-align:left; font-size:12px;  font-family: sarif;margin-top:10px; margin-left:20px; margin-right:20px;} h2{color:#032B44; text-align:left; font-size:18px;  font-family: sarif;margin-top:5px;margin-bottom:1px; margin-left:20px; margin-right:20px;}  p{color:#343a40; text-align:center; font-size:14px;  font-family: sarif;margin-top:10px; margin-left:20px; margin-right:20px;}</style>"+
                "<p>Our Library Management System (LMS) is a user-friendly and efficient software designed to simplify and automate library operations. It helps librarians, students, and faculty members manage books, members, and transactions of Book in a smooth and organized manner.</p>"
                +"<h2> Key Features</h2>"+
                "<ul type='none'><li><b>Book Management : </b> Easily add, update, or remove books with details like title, author, ISBN, and category.</li>"
                +"<li><b>Member Management : </b> Maintain a complete record of students and faculty members with membership details.</li>"+
                "<li><b>Issue & Return : </b> Quick and error-free book issue/return process with due date tracking.</li>"+
                "<li><b>Search & Filter : </b> Fast book and member search using various filters.</li>"+
                "<li><b>Reports & Logs : </b> Generate daily, weekly, or monthly reports of library activities.</li></ul>";
        JLabel lblmsg=new JLabel(data);
        lblmsg.setBounds(50,70,1000,350);
        add(lblmsg);
        
        JLabel lbldep=new JLabel("Developed By ");
        lbldep.setBounds(175,440,150,20);
        lbldep.setFont(new Font("Tahoma",Font.BOLD,16));
        lbldep.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbldep);
       
        
        JLabel depname=new JLabel("Ashish Soni");
        depname.setBounds(350,440,100,20);
        depname.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        depname.setFont(new Font("Algerian",Font.BOLD,16));
        add(depname);
        
        JLabel lblversion=new JLabel("Version ");
        lblversion.setBounds(200,480,100,20);
        lblversion.setFont(new Font("Tahoma",Font.BOLD,16));
        lblversion.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblversion);
       
        
        JLabel versiondet=new JLabel("1.0");
        versiondet.setBounds(350,480,50,20);
        versiondet.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        versiondet.setFont(new Font("Tahoma",Font.BOLD,14));
        add(versiondet);
        
        ImageIcon logo=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/aboutlogo.png"));
        Image i2=logo.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(675,410,300,100);
        add(i4);
        
        JLabel lblcopy=new JLabel("© 2025 Library Management System. All Rights Reserved. Unauthorized copying, distribution, or modification of this software is prohibited.");
        lblcopy.setBounds(190,530,720,20);
        lblcopy.setFont(new Font("Tahoma",Font.PLAIN,12));
        lblcopy.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(lblcopy);
        
        add(lblmsg);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new About();
    }
}
