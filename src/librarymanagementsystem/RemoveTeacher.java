
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RemoveTeacher extends JFrame implements ActionListener{
    Choice tfstuid;
    JLabel tfgender,jdcdob,jcurrdate,jcdep,jcquali,jcbdoj,tfstuname,tfnumber,tfemail,tfuniversityrollno;
    JButton jbcancel,jbsubmit,fetchDetails;
    public RemoveTeacher(){
        setLayout(null);
//        heading of the page

        JLabel heading=new JLabel("Remove Teacher Details");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(300,30,500,40);
        add(heading);

//         heading end


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/remove.png"));
        Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(620,50,400,400);
        add(i4);

//Form input field start
        
        JLabel lblstuid=new JLabel("Employee ID");
        lblstuid.setBounds(40,105,150,20);
        lblstuid.setFont(new Font("Tahoma",Font.BOLD,20));
        lblstuid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblstuid);
       
        
        tfstuid=new Choice();
        tfstuid.setBounds(210,105,150,20);
        tfstuid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfstuid.setFont(new Font("Tahoma",Font.PLAIN,16));
        Conn conn=null;
        
        try{
            conn=new Conn();
            ResultSet rs=conn.s.executeQuery("Select ReferenceNo from Teacher");
            while(rs.next()){
                tfstuid.add(rs.getString("ReferenceNo"));
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
        
        add(tfstuid);
        
        fetchDetails=new JButton("Fetch");
        fetchDetails.setBounds(400,105,100,20);
        fetchDetails.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        fetchDetails.setForeground(Color.getHSBColor(0, 0, 0.2f));
        fetchDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        fetchDetails.addActionListener(this);
        add(fetchDetails);
        
        JLabel lblstuname=new JLabel("Full Name");
        lblstuname.setFont(new Font("Tahoma",Font.BOLD,18));
        lblstuname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblstuname.setBounds(40,155,200,20);
        add(lblstuname);
       
        tfstuname=new JLabel();
        tfstuname.setBounds(300,155,250,20);
        tfstuname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfstuname);
        
        JLabel lbldob=new JLabel("Date Of Birth");
        lbldob.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldob.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldob.setBounds(40,205,200,20);
        add(lbldob);
       
        jdcdob=new JLabel();
        jdcdob.setBounds(300,205,250,20);
        jdcdob.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jdcdob);
        
        JLabel lblgen=new JLabel("Gender");
        lblgen.setFont(new Font("Tahoma",Font.BOLD,18));
        lblgen.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblgen.setBounds(40,255,200,20);
        add(lblgen);
       
        tfgender=new JLabel();
        tfgender.setBounds(300,255,250,20);
        tfgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfgender);
        
        JLabel lblnumber=new JLabel("Contact Number");
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,18));
        lblnumber.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblnumber.setBounds(40,305,200,20);
        add(lblnumber);
       
        tfnumber=new JLabel();
        tfnumber.setBounds(300,305,250,20);
        tfnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfnumber);
        
        JLabel lblemail=new JLabel("Email Id");
        lblemail.setFont(new Font("Tahoma",Font.BOLD,18));
        lblemail.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblemail.setBounds(40,355,100,20);
        add(lblemail);
       
        tfemail=new JLabel();
        tfemail.setBounds(300,355,250,20);
        tfemail.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfemail);
        
        JLabel lbluniver=new JLabel("University Employee ID");
        lbluniver.setFont(new Font("Tahoma",Font.BOLD,18));
        lbluniver.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbluniver.setBounds(40,405,260,20);
        add(lbluniver);
       
        tfuniversityrollno=new JLabel();
        tfuniversityrollno.setBounds(300,405,250,20);
        tfuniversityrollno.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfuniversityrollno);
         
        JLabel lblcourse=new JLabel("Department");
        lblcourse.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcourse.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcourse.setBounds(40,455,200,20);
        add(lblcourse);
        
        jcdep=new JLabel();
        jcdep.setBounds(300,455,250,20);
        jcdep.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcdep);
        
        JLabel lbldep=new JLabel("Highest Qualification");
        lbldep.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldep.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldep.setBounds(40,505,200,20);
        add(lbldep);
        
        jcquali=new JLabel();
        jcquali.setBounds(300,505,250,20);
        jcquali.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcquali);
        
        JLabel lblyear=new JLabel("Join on");
        lblyear.setFont(new Font("Tahoma",Font.BOLD,18));
        lblyear.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblyear.setBounds(600,420,80,20);
        add(lblyear);
        
        jcbdoj=new JLabel();
        jcbdoj.setBounds(700,420,100,20);
        jcbdoj.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcbdoj);
       
        
        JLabel lbldate=new JLabel("Date");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(850,420,100,20);
        add(lbldate);
       
        jcurrdate=new JLabel();
        jcurrdate.setBounds(950,420,100,20);
        jcurrdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcurrdate);
        
//Enda of the form input field

        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(630,480,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Remove");
        jbsubmit.setBounds(860,480,120,40);
        jbsubmit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsubmit.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbsubmit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsubmit.addActionListener(this);
        add(jbsubmit);
        
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==fetchDetails){
            String msg=tfstuid.getSelectedItem();
            Conn conn=null;
            try{
                conn=new Conn();
                ResultSet rs=conn.s.executeQuery("Select * From Teacher where ReferenceNo='"+msg+"'");
                if(rs.next()){
                    tfgender.setText(rs.getString("Gender"));
                    jdcdob.setText(rs.getString("DOB"));
                    jcurrdate.setText(rs.getString("ModifyDate"));
                    jcdep.setText(rs.getString("Department"));
                    jcquali.setText(rs.getString("Qualification"));
                    jcbdoj.setText(rs.getString("JoinOn"));
                    tfstuname.setText(rs.getString("Name"));
                    tfnumber.setText(rs.getString("Number"));
                    tfemail.setText(rs.getString("Email"));
                    tfuniversityrollno.setText(rs.getString("UniRoll"));
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
            
        }else if(ae.getSource()==jbsubmit){
            String msg=tfstuid.getSelectedItem();
            if(!tfstuname.getText().equals("")){
                Conn conn=null;
                try{
                    conn=new Conn();
                    conn.s.executeUpdate("Delete from Teacher where ReferenceNo='"+msg+"'");
                    JOptionPane.showMessageDialog(null,"Teacher Date Successfully Removed","",JOptionPane.CANCEL_OPTION);
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
                 JOptionPane.showMessageDialog(null,"Null Value Not Accepted","",JOptionPane.ERROR_MESSAGE);
            }
        }else if(ae.getSource()==jbcancel){
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new RemoveTeacher();
    }
}

