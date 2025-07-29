
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class AddTeacher extends JFrame implements ActionListener{
    Random rm=new Random();
    Long num=Math.abs((rm.nextLong()%9000L)+1000L);
    JTextField tfstuname,tfnumber,tfemail,tfuniversityrollno;
    JLabel tfstuid;
    JRadioButton male,female,other;
    JComboBox jcbdep,jcbquali;
    JDateChooser jdcdob,jcurrdate,jcbdoj;
    JButton jbcancel,jbsubmit;
    public AddTeacher(){
        setLayout(null);
//        heading of the page

        JLabel heading=new JLabel("Teacher Details");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(385,30,330,40);
        add(heading);

//         heading end


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/addteacher.png"));
        Image i2=i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(620,90,400,400);
        add(i4);

//Form input field start
        
        JLabel lblstuid=new JLabel("Employee ID");
        lblstuid.setBounds(40,105,250,20);
        lblstuid.setFont(new Font("Tahoma",Font.BOLD,20));
        lblstuid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblstuid);
        
        tfstuid=new JLabel("ST-383-"+num);
        tfstuid.setBounds(350,105,200,20);
        tfstuid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfstuid.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(tfstuid);
        
        JLabel lblstuname=new JLabel("Full Name");
        lblstuname.setFont(new Font("Tahoma",Font.BOLD,18));
        lblstuname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblstuname.setBounds(40,155,200,20);
        add(lblstuname);
       
        tfstuname=new JTextField();
        tfstuname.setBounds(300,155,250,20);
        tfstuname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfstuname);
        
        JLabel lbldob=new JLabel("Date Of Birth");
        lbldob.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldob.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldob.setBounds(40,205,200,20);
        add(lbldob);
       
        jdcdob=new JDateChooser();
        jdcdob.setBounds(300,205,250,20);
        jdcdob.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(jdcdob);
        
        JLabel lblgen=new JLabel("Gender");
        lblgen.setFont(new Font("Tahoma",Font.BOLD,18));
        lblgen.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblgen.setBounds(40,255,200,20);
        add(lblgen);
       
        ButtonGroup btngroup=new ButtonGroup();
        male=new JRadioButton("Male");
        male.setBounds(300,255,80,20);
        male.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        male.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(380,255,80,20);
        female.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        female.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(female);
        other=new JRadioButton("Other");
        other.setBounds(460,255,90,20);
        other.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        other.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(other);
        btngroup.add(male);
        btngroup.add(female);
        btngroup.add(other);
        
        JLabel lblnumber=new JLabel("Contact Number");
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,18));
        lblnumber.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblnumber.setBounds(40,305,200,20);
        add(lblnumber);
       
        tfnumber=new JTextField();
        tfnumber.setBounds(300,305,250,20);
        tfnumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfnumber);
        
        JLabel lblemail=new JLabel("Email Id");
        lblemail.setFont(new Font("Tahoma",Font.BOLD,18));
        lblemail.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblemail.setBounds(40,355,100,20);
        add(lblemail);
       
        tfemail=new JTextField();
        tfemail.setBounds(300,355,250,20);
        tfemail.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfemail);
        
        JLabel lbluniver=new JLabel("University Employee ID");
        lbluniver.setFont(new Font("Tahoma",Font.BOLD,18));
        lbluniver.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbluniver.setBounds(40,405,260,20);
        add(lbluniver);
       
        tfuniversityrollno=new JTextField();
        tfuniversityrollno.setBounds(300,405,250,20);
        tfuniversityrollno.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfuniversityrollno);
        
        JLabel lblyear=new JLabel("Join on");
        lblyear.setFont(new Font("Tahoma",Font.BOLD,18));
        lblyear.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblyear.setBounds(40,455,70,20);
        add(lblyear);
        
        jcbdoj=new JDateChooser();
        jcbdoj.setBounds(170,455,100,20);
        jcbdoj.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(jcbdoj);
       
        
        JLabel lbldate=new JLabel("Date(Today)");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(300,455,150,20);
        add(lbldate);
       
        jcurrdate=new JDateChooser();
        jcurrdate.setBounds(450,455,100,20);
        jcurrdate.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(jcurrdate);
        
        JLabel lblcourse=new JLabel("Department");
        lblcourse.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcourse.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcourse.setBounds(40,505,130,20);
        add(lblcourse);
        
        String arr3[]={"Select","Art","MBA","Biology","Librarian","Registar Office","Applied Science","Other"};
        jcbdep=new JComboBox(arr3);
        jcbdep.setBackground(Color.white);
        jcbdep.setFont(new Font("sarif",Font.PLAIN,14));
        jcbdep.setForeground(Color.BLACK);
        jcbdep.setBounds(170,505,100,20);
        add(jcbdep);
        
        JLabel lbldep=new JLabel("Qualification");
        lbldep.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldep.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldep.setBounds(300,505,150,20);
        add(lbldep);
        
        String arr4[]={"Select","B.tech","M.tech","MBA","Biology","Law","Other"};
        jcbquali=new JComboBox(arr4);
        jcbquali.setBackground(Color.white);
        jcbquali.setFont(new Font("sarif",Font.PLAIN,14));
        jcbquali.setForeground(Color.BLACK);
        jcbquali.setBounds(450,505,100,20);
        add(jcbquali);
        
        JLabel lblnote=new JLabel("** Your Default Password is 'Tea-12345', Kindly Update it to prevent Fraud !! **");
        lblnote.setBounds(250,540,600,20);
        lblnote.setFont(new Font("Tahoma",Font.BOLD,14));
        lblnote.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(lblnote);
        
//Enda of the form input field

        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(650,470,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Submit");
        jbsubmit.setBounds(900,470,120,40);
        jbsubmit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsubmit.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbsubmit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsubmit.addActionListener(this);
        add(jbsubmit);
        
        getContentPane().setBackground(Color.getHSBColor(0f, 0f, 0.97f));
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jbcancel){
            setVisible(false);
        }else if(ae.getSource()==jbsubmit){
            String stuName=tfstuname.getText();
            String stunum=tfnumber.getText();
            String stuemail=tfemail.getText();
            String universityroll=tfuniversityrollno.getText();
            String refno=tfstuid.getText();
            String gender;
            if(male.isSelected()){
                gender="Male";
            }else if(female.isSelected()){
                gender="Female";
                
            }else{
                gender="Other";
            }
            String dep=(String)jcbdep.getSelectedItem();
            String quali=(String)jcbquali.getSelectedItem();
            String dob=((JTextField)(jdcdob.getDateEditor().getUiComponent())).getText();
            String add=((JTextField)(jcurrdate.getDateEditor().getUiComponent())).getText();
            String doj=((JTextField)(jcbdoj.getDateEditor().getUiComponent())).getText();
            
            if(!stuName.equals("") && !stunum.equals("")&& !doj.equals("") && !add.equals("")&& !dob.equals("") && !quali.equals("") && !dep.equals("") && !gender.equals("") && !stuemail.equals("")&& !universityroll.equals("")&& !refno.equals("")){
                Conn conn=null;
                try{
                    conn =new Conn();
                    String query="Insert into Teacher value('"+refno+"','"+stuName+"','"+dob+"','"+stunum+"','"+stuemail+"','"+gender+"','"+universityroll+"','"+dep+"','"+quali+"','"+add+"','"+doj+"','Tea-12345')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Teacher Detail Successfully Added","",JOptionPane.INFORMATION_MESSAGE);
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
        }
    }
    public static void main(String args[]){
        new AddTeacher();
    }
}
