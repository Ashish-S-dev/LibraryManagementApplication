
package librarymanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class ViewStudentProfile extends JFrame implements ActionListener{
    JButton jbcancel,jbedit;
    public ViewStudentProfile(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
//        Heading
        JLabel heading=new JLabel("Student Profile");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(350,30,400,40);
        add(heading);
//        Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/profile.png"));
        Image i2=i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(75,70,400,400);
        add(i4);
        
//        Button
        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(135,450,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbedit=new JButton("Edit");
        jbedit.setBounds(305,450,120,40);
        jbedit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbedit.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbedit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbedit.addActionListener(this);
        add(jbedit);
        
//        Form part
        JLabel lblstuid=new JLabel("Employee ID");
        lblstuid.setBounds(550,100,150,20);
        lblstuid.setFont(new Font("Tahoma",Font.BOLD,18));
        lblstuid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblstuid);
       
        
        JLabel tfstuid=new JLabel();
        tfstuid.setBounds(850,100,150,20);
        tfstuid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfstuid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfstuid);
        
        
        JLabel lblstuname=new JLabel("Full Name");
        lblstuname.setFont(new Font("Tahoma",Font.BOLD,18));
        lblstuname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblstuname.setBounds(550,145,200,20);
        add(lblstuname);
       
        JLabel tfstuname=new JLabel();
        tfstuname.setBounds(850,145,250,20);
        tfstuname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfstuname);
        
        JLabel lbldob=new JLabel("Date Of Birth");
        lbldob.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldob.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldob.setBounds(550,190,200,20);
        add(lbldob);
       
        JLabel jdcdob=new JLabel();
        jdcdob.setBounds(850,190,250,20);
        jdcdob.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jdcdob);
        
        JLabel lblgen=new JLabel("Gender");
        lblgen.setFont(new Font("Tahoma",Font.BOLD,18));
        lblgen.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblgen.setBounds(550,235,200,20);
        add(lblgen);
       
        JLabel tfgender=new JLabel();
        tfgender.setBounds(850,235,250,20);
        tfgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfgender);
        
        JLabel lblnumber=new JLabel("Contact Number");
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,18));
        lblnumber.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblnumber.setBounds(550,280,200,20);
        add(lblnumber);
       
        JLabel tfnumber=new JLabel();
        tfnumber.setBounds(850,280,250,20);
        tfnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfnumber);
        
        JLabel lblemail=new JLabel("Email Id");
        lblemail.setFont(new Font("Tahoma",Font.BOLD,18));
        lblemail.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblemail.setBounds(550,325,100,20);
        add(lblemail);
       
        JLabel tfemail=new JLabel();
        tfemail.setBounds(850,325,250,20);
        tfemail.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfemail);
        
        JLabel lbluniver=new JLabel("University Employee ID");
        lbluniver.setFont(new Font("Tahoma",Font.BOLD,18));
        lbluniver.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbluniver.setBounds(550,370,260,20);
        add(lbluniver);
       
        JLabel tfuniversityrollno=new JLabel();
        tfuniversityrollno.setBounds(850,370,250,20);
        tfuniversityrollno.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfuniversityrollno);
         
        JLabel lbldep=new JLabel("Department");
        lbldep.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldep.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldep.setBounds(550,415,200,20);
        add(lbldep);
        
        JLabel jcdep=new JLabel();
        jcdep.setBounds(850,415,250,20);
        jcdep.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcdep);
        
        JLabel lblquali=new JLabel("Course");
        lblquali.setFont(new Font("Tahoma",Font.BOLD,18));
        lblquali.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblquali.setBounds(550,460,200,20);
        add(lblquali);
        
        JLabel jcquali=new JLabel();
        jcquali.setBounds(850,460,250,20);
        jcquali.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcquali);
        
        JLabel lblyear=new JLabel("Studying Year");
        lblyear.setFont(new Font("Tahoma",Font.BOLD,18));
        lblyear.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblyear.setBounds(550,505,200,20);
        add(lblyear);
        
        JLabel jcbdoj=new JLabel();
        jcbdoj.setBounds(850,505,150,20);
        jcbdoj.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(jcbdoj);
        Conn conn=null;
        try{
            conn=new Conn();
            ResultSet rs=conn.s.executeQuery("Select * from student where Name='"+Login.userName+"' and ReferenceNo='"+Login.userid+"'");
            if(rs.next()){
                tfstuid.setText(rs.getString("ReferenceNo"));
                tfstuname.setText(rs.getString("Name"));
                jdcdob.setText(rs.getString("DOB"));
                tfgender.setText(rs.getString("Gender"));
                tfnumber.setText(rs.getString("Number"));
                tfemail.setText(rs.getString("Email"));
                tfuniversityrollno.setText(rs.getString("UniRoll"));
                jcdep.setText(rs.getString("Department"));
                jcquali.setText(rs.getString("Course"));
                jcbdoj.setText(rs.getString("Year"));
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
        
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jbcancel){
            setVisible(false);
        }else if(ae.getSource()==jbedit){
            new UpdateStudent();
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new ViewStudentProfile();
    }
}
