
package librarymanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.sql.*;
import java.awt.event.*;
public class UpdateStudentPassword extends JFrame implements ActionListener{
   
    JButton jbcancel,jbupdate;
    JTextField tfcaptcha;
    JLabel jlcaptcha,tfid;
    JPasswordField tfoldpass,tfnewpass,tfconfirm;
    Random rm=new Random();
    long num=Math.abs(rm.nextLong()%100000L);
    public UpdateStudentPassword(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
        //        Heading
        JLabel heading=new JLabel("Update Password");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(310,40,380,40);
        add(heading);
//        Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/updatepassword.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(150,130,200,200);
        add(i4);
        
        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(100,360,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbupdate=new JButton("Update");
        jbupdate.setBounds(280,360,120,40);
        jbupdate.setFont(new Font("Tahoma",Font.BOLD,18));
        jbupdate.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbupdate.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbupdate.addActionListener(this);
        add(jbupdate);
        
//        Form Field
        JLabel lblstuid=new JLabel("Reference Number");
        lblstuid.setBounds(500,140,200,20);
        lblstuid.setFont(new Font("Tahoma",Font.BOLD,20));
        lblstuid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblstuid);
       
        
        tfid=new JLabel(""+Login.userid);
        tfid.setBounds(750,140,150,20);
        tfid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfid);
        
        JLabel lbloldpass=new JLabel("Old Password");
        lbloldpass.setBounds(500,200,150,20);
        lbloldpass.setFont(new Font("Tahoma",Font.BOLD,20));
        lbloldpass.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbloldpass);
       
        
        tfoldpass=new JPasswordField();
        tfoldpass.setBounds(750,200,150,20);
        tfoldpass.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfoldpass.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfoldpass);
        
        JLabel lblnewpass=new JLabel("New Password");
        lblnewpass.setBounds(500,260,150,20);
        lblnewpass.setFont(new Font("Tahoma",Font.BOLD,20));
        lblnewpass.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblnewpass);
       
        
        tfnewpass=new JPasswordField();
        tfnewpass.setBounds(750,260,150,20);
        tfnewpass.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfnewpass.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfnewpass);
        
        JLabel lblconfirm=new JLabel("Confirm New Password");
        lblconfirm.setBounds(500,320,250,20);
        lblconfirm.setFont(new Font("Tahoma",Font.BOLD,20));
        lblconfirm.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblconfirm);
       
        
        tfconfirm=new JPasswordField();
        tfconfirm.setBounds(750,320,150,20);
        tfconfirm.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfconfirm.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfconfirm);
        
        jlcaptcha=new JLabel(""+num);
        jlcaptcha.setBounds(640,380,80,20);
        jlcaptcha.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        jlcaptcha.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(jlcaptcha);
        
        JLabel lblcaptcha=new JLabel("Captcha *");
        lblcaptcha.setBounds(500,380,100,20);
        lblcaptcha.setFont(new Font("Tahoma",Font.BOLD,20));
        lblcaptcha.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblcaptcha);

        
        tfcaptcha=new JPasswordField();
        tfcaptcha.setBounds(750,380,150,20);
        tfcaptcha.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfcaptcha.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfcaptcha);
        
        setSize(1000,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jbcancel){
            setVisible(false);
        }else if(ae.getSource()==jbupdate){
            String userid=tfid.getText();
            String oldpass=tfoldpass.getText();
            String newpass=tfnewpass.getText();
            String confirmpass=tfconfirm.getText();
            String captcha=jlcaptcha.getText();
            String captchaInp=tfcaptcha.getText();
           
            if(!userid.equals("")){
                
                if(captcha.equals(captchaInp) && newpass.equals(confirmpass)){
                    Conn conn=null;
                try{
                    conn=new Conn();
                    ResultSet rs=conn.s.executeQuery("Select * from student where ReferenceNo='"+userid+"' and Password='"+oldpass+"'");
                    if(rs.next()){
                        try{
                            String query="Update student set Password='"+newpass+"' where ReferenceNo='"+userid+"'";
                            conn.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null,"Password Updated Successfully","",JOptionPane.INFORMATION_MESSAGE);
                            setVisible(false);
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"Old Password Not Match","",JOptionPane.QUESTION_MESSAGE);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                finally{
                    if(conn.c!=null){
                        try{
                            conn.c.close();
                            System.out.println("Connection Closed");
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        
                    }
                }
                
                }else{
                if(!captcha.equals(captchaInp)){
                    JOptionPane.showMessageDialog(null,"Captcha Not Match","",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"New Password and Confirm Password Field Not match","",JOptionPane.INFORMATION_MESSAGE);
                }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Input Field Null Not Accepted","",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]){
        new UpdateStudentPassword();
    }
}

