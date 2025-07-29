
package librarymanagementsystem;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.sql.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class ExitAttendence extends JFrame implements ActionListener{
    JButton jbcancel,jbupdate;
    JTextField tfcaptcha,tfexit;
    JLabel jlcaptcha,tfid,tfname,tfcontact,tfyear,tfentry,tfseat,tfdate;
    Random rm=new Random();
    long num=Math.abs(rm.nextLong()%100000L);
    public ExitAttendence(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
        //        Heading
        JLabel heading=new JLabel("Exit Attendence");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(335,40,330,40);
        add(heading);
//        Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/exit.png"));
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
        add(tfid);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(500,180,150,30);
        lblname.setFont(new Font("Tahoma",Font.BOLD,20));
        lblname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblname);
       
        
        tfname=new JLabel();
        tfname.setBounds(750,180,150,20);
        tfname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfname.setFont(new Font("Tahoma",Font.PLAIN,16));
       
        add(tfname);
        
        JLabel lblentry=new JLabel("Entry Time");
        lblentry.setBounds(500,220,150,30);
        lblentry.setFont(new Font("Tahoma",Font.BOLD,20));
        lblentry.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblentry);
       
        
        tfentry=new JLabel();
        tfentry.setBounds(750,220,150,20);
        tfentry.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfentry.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfentry);
        
        JLabel lblseat=new JLabel("Seat Number");
        lblseat.setBounds(500,260,150,30);
        lblseat.setFont(new Font("Tahoma",Font.BOLD,20));
        lblseat.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblseat);
       
        
        tfseat=new JLabel();
        tfseat.setBounds(750,260,150,20);
        tfseat.setForeground(Color.getHSBColor(0f, 0.80f, 0.2f));
        tfseat.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfseat);
        
        JLabel lbldate=new JLabel("Date");
        lbldate.setBounds(500,300,150,20);
        lbldate.setFont(new Font("Tahoma",Font.BOLD,20));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbldate);
       
        
        tfdate=new JLabel();
        tfdate.setBounds(750,300,150,20);
        tfdate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        tfdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfdate);
        Conn conn=null;
        try{
            conn =new Conn();
            
            ResultSet rs1=conn.s.executeQuery("Select ReferenceNo from "+Login.databaseName+" where Name='"+Login.userName+"'");
            String refno="";
            if(rs1.next()){
                refno=rs1.getString("ReferenceNo");
            }
            
            ResultSet rs=conn.s.executeQuery("Select * from Attendence where Reference_No='"+refno+"' and Exit_Time='Not Marked'");
            if(rs.next()){
                tfid.setText(rs.getString("Reference_No"));
                tfname.setText(rs.getString("Name"));
                tfdate.setText(rs.getString("Date"));
                tfseat.setText(rs.getString("Seat_No"));
                tfentry.setText(rs.getString("Entry_Time"));
            }
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
        
        
        JLabel lblreason=new JLabel("Exit Time");
        lblreason.setBounds(500,340,250,20);
        lblreason.setFont(new Font("Tahoma",Font.BOLD,20));
        lblreason.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblreason);
       
        
        tfexit=new JTextField();
        tfexit.setBounds(750,340,150,20);
        tfexit.setForeground(Color.getHSBColor(0f, 0.80f,0.2f));
        tfexit.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfexit);
        
        
        
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
        
        JLabel lblcopy=new JLabel("**Please Unmark Your Attendence only when you leave the Library premises.**");
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
            
            String captcha1=jlcaptcha.getText();
            String captcha2=tfcaptcha.getText();
            String exit=tfexit.getText();
            
            if(!exit.equals("")){
                if(captcha1.equals(captcha2)){
                    Conn conn=null;
                   try{
                       conn =new Conn();
                       conn.s.executeUpdate("Update Attendence set Exit_Time='"+exit+"' where Reference_No='"+tfid.getText()+"'");
                       JOptionPane.showMessageDialog(null,"Exit Attendence Marked","",JOptionPane.INFORMATION_MESSAGE);
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
        new ExitAttendence();
    }
}

