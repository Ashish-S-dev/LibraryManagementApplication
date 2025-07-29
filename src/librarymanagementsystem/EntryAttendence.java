
package librarymanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.sql.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class EntryAttendence extends JFrame implements ActionListener{
    JDateChooser tfdate;
    JButton jbcancel,jbupdate;
    JTextField tfcaptcha,tfreason,tfentry,tfseat;
    JLabel jlcaptcha,tfid,tfname,tfcontact,tfyear;
    Random rm=new Random();
    long num=Math.abs(rm.nextLong()%100000L);
    public EntryAttendence(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
        //        Heading
        JLabel heading=new JLabel("Your Attendence");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(330,40,340,40);
        add(heading);
//        Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/entry.png"));
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
        
        jbupdate=new JButton("Submit");
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
       
        tfid=new JLabel();
        tfid.setBounds(750,140,150,20);
        tfid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfid.setFont(new Font("Tahoma",Font.PLAIN,16));
        
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(500,180,150,30);
        lblname.setFont(new Font("Tahoma",Font.BOLD,20));
        lblname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblname);
       
        
        tfname=new JLabel();
        tfname.setBounds(750,180,150,20);
        tfname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfname.setFont(new Font("Tahoma",Font.PLAIN,16));
        
        tfyear=new JLabel();
        tfcontact=new JLabel();
        Conn conn=null;
        try{
            conn =new Conn();
            ResultSet rs=conn.s.executeQuery("Select * from "+Login.databaseName+" where Name='"+Login.userName+"'");
            if(rs.next()){
                tfid.setText(rs.getString("ReferenceNo"));
                tfname.setText(rs.getString("Name"));
                if(Login.databaseName.equals("student")){
                    tfyear.setText(rs.getString("Year"));
                }else{
                    tfyear.setText("null");
                }
                tfcontact.setText(rs.getString("Number"));
            }
        }catch(Exception e){
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
        
        add(tfid);
        add(tfname);
        
        JLabel lblentry=new JLabel("Entry Time");
        lblentry.setBounds(500,220,150,30);
        lblentry.setFont(new Font("Tahoma",Font.BOLD,20));
        lblentry.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblentry);
       
        
        tfentry=new JTextField();
        tfentry.setBounds(750,220,150,20);
        tfentry.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfentry.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfentry);
        
        JLabel lblseat=new JLabel("Seat Number");
        lblseat.setBounds(500,260,150,30);
        lblseat.setFont(new Font("Tahoma",Font.BOLD,20));
        lblseat.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblseat);
       
        
        tfseat=new JTextField();
        tfseat.setBounds(750,260,150,20);
        tfseat.setForeground(Color.getHSBColor(0f, 0.80f, 0.2f));
        tfseat.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfseat);
        
        JLabel lbldate=new JLabel("Date");
        lbldate.setBounds(500,300,150,20);
        lbldate.setFont(new Font("Tahoma",Font.BOLD,20));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbldate);
       
        
        tfdate=new JDateChooser();
        tfdate.setBounds(750,300,150,20);
        tfdate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfdate);
        
        JLabel lblreason=new JLabel("Reason");
        lblreason.setBounds(500,340,250,20);
        lblreason.setFont(new Font("Tahoma",Font.BOLD,20));
        lblreason.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblreason);
       
        
        tfreason=new JTextField();
        tfreason.setBounds(750,340,150,20);
        tfreason.setForeground(Color.getHSBColor(0f, 0.80f,0.2f));
        tfreason.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfreason);
        
        
        
        JLabel lblcaptcha=new JLabel("Captcha *");
        lblcaptcha.setBounds(500,380,100,20);
        lblcaptcha.setFont(new Font("Tahoma",Font.BOLD,20));
        lblcaptcha.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblcaptcha);
        
        jlcaptcha=new JLabel(""+num);
        jlcaptcha.setBounds(640,380,80,20);
        jlcaptcha.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        jlcaptcha.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(jlcaptcha);
        
        tfcaptcha=new JPasswordField();
        tfcaptcha.setBounds(750,380,150,20);
        tfcaptcha.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfcaptcha.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfcaptcha);
        
        JLabel lblcopy=new JLabel("**Please Mark Your Attendence only when you are inside the Library premises.**");
        lblcopy.setBounds(280,430,440,20);
        lblcopy.setFont(new Font("Tahoma",Font.PLAIN,12));
        lblcopy.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(lblcopy);
        
        setSize(1000,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jbcancel){
            setVisible(false);
        }else if(ae.getSource()==jbupdate){
            String userId=tfid.getText();
            String username=tfname.getText();
            String seat=tfseat.getText();
            String date=((JTextField)tfdate.getDateEditor().getUiComponent()).getText();
            String reason=tfreason.getText();
            String entry=tfentry.getText();
            String captcha1=jlcaptcha.getText();
            String captcha2=tfcaptcha.getText();
            String exit="Not Marked";
            String year=tfyear.getText();
            String contact=tfcontact.getText();
            if(!seat.equals("") && !date.equals("") && !reason.equals("") && !entry.equals("")){
                if(captcha1.equals(captcha2)){
                    Conn conn=null;
                    try{
                        conn =new Conn();
                        conn.s.executeUpdate("Insert into Attendence value('"+userId+"','"+username+"','"+entry+"','"+exit+"','"+contact+"','"+reason+"','"+year+"','"+seat+"','"+date+"')");
                        JOptionPane.showMessageDialog(null,"Attendence Marked Successfully","",JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    finally{
                    if(conn.c!=null){
                        try{
                            conn.c.close();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        System.out.println("Connection Closed");
                    }
                }
                    
                }else{
                    JOptionPane.showMessageDialog(null,"Captcha Not Match","",JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Null Value Not Accepted","",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]){
        new EntryAttendence();
    }
}

