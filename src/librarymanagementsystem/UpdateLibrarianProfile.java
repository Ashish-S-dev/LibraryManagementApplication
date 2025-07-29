package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class UpdateLibrarianProfile extends JFrame implements ActionListener{
    JLabel tfgender,tfstuid,jdcdob,jcbdoj,tfstuname,tfuniversityrollno;
    JTextField tfnumber,tfemail,jcdep,jcquali,jcurrdate;
    JButton jbcancel,jbsubmit;
    public UpdateLibrarianProfile(){
        setLayout(null);
//        heading of the page

        JLabel heading=new JLabel("Update Librarian Details");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(295,30,520,40);
        add(heading);

//         heading end


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/update.png"));
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
       
        
        tfstuid=new JLabel();
        tfstuid.setBounds(350,105,200,20);
        tfstuid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfstuid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfstuid);
        
        
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
       
        tfnumber=new JTextField();
        tfnumber.setBounds(300,305,250,20);
        tfnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfnumber);
        
        JLabel lblemail=new JLabel("Email Id");
        lblemail.setFont(new Font("Tahoma",Font.BOLD,18));
        lblemail.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblemail.setBounds(40,355,100,20);
        add(lblemail);
       
        tfemail=new JTextField();
        tfemail.setBounds(300,355,250,20);
        tfemail.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfemail);
        
        JLabel lbluniver=new JLabel("Faculty ID");
        lbluniver.setFont(new Font("Tahoma",Font.BOLD,18));
        lbluniver.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbluniver.setBounds(40,405,160,20);
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
        
        jcdep=new JTextField();
        jcdep.setBounds(300,455,250,20);
        jcdep.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcdep);
        
        JLabel lbldep=new JLabel("Highest Qualification");
        lbldep.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldep.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldep.setBounds(40,505,200,20);
        add(lbldep);
        
        jcquali=new JTextField();
        jcquali.setBounds(300,505,250,20);
        jcquali.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcquali);
        
        JLabel lblyear=new JLabel("Join on");
        lblyear.setFont(new Font("Tahoma",Font.BOLD,18));
        lblyear.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblyear.setBounds(600,430,70,20);
        add(lblyear);
        
        jcbdoj=new JLabel();
        jcbdoj.setBounds(680,430,100,20);
        jcbdoj.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcbdoj);
       
        
        JLabel lbldate=new JLabel("Updated On");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(800,430,150,20);
        add(lbldate);
       
        jcurrdate=new JTextField();
        jcurrdate.setBounds(950,430,100,20);
        jcurrdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcurrdate);
        
        
//       Filling the empty field of the Update Profile
        Conn conn=null;
        try{
                conn=new Conn();
                ResultSet rs=conn.s.executeQuery("Select * From Teacher where ReferenceNo='"+Login.userid+"'");
                if(rs.next()){
                    tfstuid.setText(rs.getString("ReferenceNo"));
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
                            System.out.println("Connection Closed");
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        
                    }
                }
    
//Enda of the form input field

        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(650,485,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Update");
        jbsubmit.setBounds(900,485,120,40);
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
        if(ae.getSource()==jbcancel){
            setVisible(false);
        }else if(ae.getSource()==jbsubmit){
            String refno=tfstuid.getText();
            String number=tfnumber.getText();
            String email=tfemail.getText();
            String dep=jcdep.getText();
            String quali=jcquali.getText();
            String updateon=jcurrdate.getText();
            if(!tfstuname.getText().equals("") && !refno.equals("") && !number.equals("") && !email.equals("") && !dep.equals("")&& !quali.equals("")){
                Conn conn=null;
                try{
                    conn=new Conn();
                    String query="Update Teacher set Number='"+number+"',Email='"+email+"',Department='"+dep+"',Qualification='"+quali+"' ,ModifyDate='"+updateon+"' where ReferenceNo='"+refno+"'";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Teacher Detail Successfully Updated","",JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
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
                JOptionPane.showMessageDialog(null,"Null Value Not Accepted","",JOptionPane.ERROR_MESSAGE);            
            }
            
        }    
    }
    public static void main(String args[]){
        new UpdateLibrarianProfile();
    }
}

