
package librarymanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
public class ContactUs extends JFrame{
   
    
    public ContactUs(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
        //        Heading
        JLabel heading=new JLabel("Contact Details");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(310,40,380,40);
        add(heading);
//        Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/contactdeve.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(100,150,200,200);
        add(i4);
        
//        Form Field

        ImageIcon num=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/phone.png"));
        Image num2=num.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon num3=new ImageIcon(num2);
        JLabel num4=new JLabel(num3);
        num4.setBounds(400,140,50,50);
        add(num4);
        
        
        JLabel lbloldpass=new JLabel("+917311116450");
        lbloldpass.setBounds(500,150,200,20);
        lbloldpass.setFont(new Font("Tahoma",Font.PLAIN,20));
        lbloldpass.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbloldpass);
        
        ImageIcon email=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/mail.png"));
        Image email2=email.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon email3=new ImageIcon(email2);
        JLabel email4=new JLabel(email3);
        email4.setBounds(400,200,50,50);
        add(email4);
        
        
        JLabel lblemail=new JLabel("techashishsoni@gmail.com");
        lblemail.setBounds(500,210,300,20);
        lblemail.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblemail.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblemail);
        
        ImageIcon lin=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/web.png"));
        Image lin2=lin.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon lin3=new ImageIcon(lin2);
        JLabel lin4=new JLabel(lin3);
        lin4.setBounds(400,270,50,50);
        add(lin4);
        
        JLabel lbllin=new JLabel("https://www.ashishsoni.com/librarymanagementsystem");
        lbllin.setBounds(500,280,450,20);
        lbllin.setFont(new Font("Tahoma",Font.PLAIN,20));
        lbllin.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbllin);
        
        ImageIcon git1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/location.png"));
        Image git2=git1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon git3=new ImageIcon(git2);
        JLabel git4=new JLabel(git3);
        git4.setBounds(400,330,50,50);
        add(git4);
        
        
        JLabel lblgit=new JLabel("Munshiganj,District:Amethi-227405-India ");
        lblgit.setBounds(500,340,400,20);
        lblgit.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblgit.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblgit);
        
        
        JLabel lblcopy=new JLabel("© 2025 Library Management System. All Rights Reserved. Unauthorized copying, distribution, or modification of this software is prohibited.");
        lblcopy.setBounds(140,430,720,20);
        lblcopy.setFont(new Font("Tahoma",Font.PLAIN,12));
        lblcopy.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(lblcopy);
        
        
        setSize(1000,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public static void main(String args[]){
        new ContactUs();
    }
}

