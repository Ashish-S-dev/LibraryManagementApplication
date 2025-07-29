
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class IssueBookTeacher extends JFrame implements ActionListener{
    
    JLabel  tfbookname,tfauthorname,tfcategory,tfbranch,tflanguage,tfstuname,tfunroll,tfdep,tfyear,tfcourse;
    Choice jcrefno,stuid;
    JDateChooser issuedon;
    JButton jbcancel,jbsubmit,fetchbook,fetchstudent;
    
    public IssueBookTeacher(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
//        Heading of the Page

        JLabel heading=new JLabel("Issue Book To Teacher");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(325,30,450,40);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/issuebook.png"));
        Image i2=i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(675,115,300,300);
        add(i4);
        
        JLabel lblhead1=new JLabel("Book details");
        lblhead1.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead1.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead1.setBounds(40,105,200,20);
        add(lblhead1);
        
        JLabel lblref=new JLabel("Book Reference Number");
        lblref.setFont(new Font("Tahoma",Font.BOLD,18));
        lblref.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblref.setBounds(40,135,250,20);
        add(lblref);
        
        
        jcrefno=new Choice();
        jcrefno.setFont(new Font("Tahoma",Font.PLAIN,16));
        jcrefno.setBounds(300,135,140,20);
        jcrefno.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(jcrefno);
        Conn conn=null;
        try{
            conn =new Conn();
            ResultSet rs=conn.s.executeQuery("Select Reference_No from bookdetails where Availability!='Issued'");
            while(rs.next()){
                jcrefno.add(rs.getString("Reference_No"));
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
        
        fetchbook=new JButton("Fetch");
        fetchbook.setBounds(450,135,100,20);
        fetchbook.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        fetchbook.setForeground(Color.getHSBColor(0, 0, 0.2f));
        fetchbook.setFont(new Font("Tahoma",Font.BOLD,14));
        fetchbook.addActionListener(this);
        add(fetchbook);
        
        JLabel lblbooktitle=new JLabel("Book Name/Title");
        lblbooktitle.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbooktitle.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbooktitle.setBounds(40,175,200,20);
        add(lblbooktitle);
       
        tfbookname=new JLabel();
        tfbookname.setBounds(300,175,250,20);
        tfbookname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfbookname);     
        
        JLabel lblauthor=new JLabel("Author Name");
        lblauthor.setFont(new Font("Tahoma",Font.BOLD,18));
        lblauthor.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblauthor.setBounds(40,215,200,20);
        add(lblauthor);
        
        tfauthorname=new JLabel();
        tfauthorname.setBounds(300,215,250,20);
        tfauthorname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfauthorname);
        
        JLabel lblcategory=new JLabel("Book Category");
        lblcategory.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcategory.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcategory.setBounds(40,255,200,20);
        add(lblcategory);
        
        tfcategory=new JLabel();
        tfcategory.setFont(new Font("sarif",Font.PLAIN,14));
        tfcategory.setForeground(Color.BLACK);
        tfcategory.setBounds(300,255,250,20);
        add(tfcategory);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbranch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbranch.setBounds(40,295,90,20);
        add(lblbranch);
        
        tfbranch=new JLabel();
        tfbranch.setFont(new Font("sarif",Font.PLAIN,14));
        tfbranch.setForeground(Color.BLACK);
        tfbranch.setBounds(170,295,100,20);
        add(tfbranch);
        
        JLabel lbllanguage=new JLabel("Language");
        lbllanguage.setFont(new Font("Tahoma",Font.BOLD,18));
        lbllanguage.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbllanguage.setBounds(300,295,90,20);
        add(lbllanguage);
       
        tflanguage=new JLabel();
        tflanguage.setFont(new Font("sarif",Font.PLAIN,14));
        tflanguage.setForeground(Color.BLACK);
        tflanguage.setBounds(410,295,140,20);
        add(tflanguage);
        
        JLabel lblhead2=new JLabel("Teacher details");
        lblhead2.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead2.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead2.setBounds(40,325,200,20);
        add(lblhead2);
        
        JLabel lblstuid=new JLabel("Teacher ID");
        lblstuid.setBounds(40,365,150,20);
        lblstuid.setFont(new Font("Tahoma",Font.BOLD,18));
        lblstuid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblstuid);
        
        stuid=new Choice();
        stuid.setBounds(210,365,180,20);
        stuid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        stuid.setFont(new Font("Tahoma",Font.PLAIN,16));
        Conn conn2=null;
        try{
            conn2=new Conn();
            ResultSet rs=conn2.s.executeQuery("Select ReferenceNo from Teacher ");
            while(rs.next()){
                stuid.add(rs.getString("ReferenceNo"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
                    if(conn2.c!=null){
                        try{
                            conn2.c.close();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        System.out.println("Connection Closed");
                    }
                }
        
        add(stuid);
        
        fetchstudent=new JButton("Fetch");
        fetchstudent.setBounds(450,365,100,20);
        fetchstudent.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        fetchstudent.setForeground(Color.getHSBColor(0, 0, 0.2f));
        fetchstudent.setFont(new Font("Tahoma",Font.BOLD,20));
        fetchstudent.addActionListener(this);
        add(fetchstudent);
        
        JLabel lblstuname=new JLabel("Full Name");
        lblstuname.setFont(new Font("Tahoma",Font.BOLD,18));
        lblstuname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblstuname.setBounds(40,405,200,20);
        add(lblstuname);
       
        tfstuname=new JLabel();
        tfstuname.setBounds(300,405,250,20);
        tfstuname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfstuname);
        
        JLabel lbluniver=new JLabel("University Employee ID");
        lbluniver.setFont(new Font("Tahoma",Font.BOLD,18));
        lbluniver.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbluniver.setBounds(40,445,260,20);
        add(lbluniver);
       
        tfunroll=new JLabel();
        tfunroll.setBounds(300,445,250,20);
        tfunroll.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfunroll);
        
        
        JLabel lbldep=new JLabel("Department");
        lbldep.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldep.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldep.setBounds(40,485,200,20);
        add(lbldep);
        
        tfdep=new JLabel();
        tfdep.setBounds(300,485,250,20);
        tfdep.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfdep);
        
        JLabel lblcourse=new JLabel("Qualification");
        lblcourse.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcourse.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcourse.setBounds(40,525,130,20);
        add(lblcourse);
        
        tfcourse=new JLabel();
        tfcourse.setBounds(170,525,100,20);
        tfcourse.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfcourse);
        
        JLabel lblyear=new JLabel("DOJ");
        lblyear.setFont(new Font("Tahoma",Font.BOLD,18));
        lblyear.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblyear.setBounds(300,525,90,20);
        add(lblyear);
        
        tfyear=new JLabel();
        tfyear.setBounds(450,525,100,20);
        tfyear.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfyear);
        
        JLabel lbldate=new JLabel("Issued On");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(600,430,150,20);
        add(lbldate);
       
        issuedon=new JDateChooser();
        issuedon.setBounds(750,430,250,20);
        issuedon.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(issuedon);
        
        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(650,490,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Submit");
        jbsubmit.setBounds(850,490,120,40);
        jbsubmit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsubmit.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbsubmit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsubmit.addActionListener(this);
        add(jbsubmit);
        
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==fetchbook){
            String bookrefno=jcrefno.getSelectedItem();
            Conn conn=null;
            try{
                conn =new Conn();
                ResultSet rs=conn.s.executeQuery("Select * from bookdetails where Reference_No='"+bookrefno+"'");
                if(rs.next()){
                    tfbookname.setText(rs.getString("Name"));
                    tfauthorname.setText(rs.getString("Author"));
                    tfcategory.setText(rs.getString("Category"));
                    tfbranch.setText(rs.getString("Branch"));
                    tflanguage.setText(rs.getString("Language"));
                }else{
                    JOptionPane.showMessageDialog(null, "User Details Not Found","",JOptionPane.ERROR);
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
            
        }if(ae.getSource()==fetchstudent){
            String studid=stuid.getSelectedItem();
            Conn conn=null;
            try{
                conn=new Conn();
                ResultSet rs=conn.s.executeQuery("select * from Teacher where ReferenceNo='"+studid+"'");
                if(rs.next()){
                    tfstuname.setText(rs.getString("Name"));
                    tfunroll.setText(rs.getString("UniRoll"));
                    tfyear.setText(rs.getString("JoinOn"));
                    tfcourse.setText(rs.getString("Qualification"));
                    tfdep.setText(rs.getString("Department"));
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
            String bookref=jcrefno.getSelectedItem();
            String bookname=tfbookname.getText();
            String studid=stuid.getSelectedItem();
            String stuname=tfstuname.getText();
            String issuedate=((JTextField)(issuedon.getDateEditor().getUiComponent())).getText();
            if(!bookname.equals("")&& !stuname.equals("") && !issuedate.equals("")){
                Conn conn=null;
                try{
                     conn=new Conn();
                    String query="Update bookdetails set Availability='Issued',issueDate='"+issuedate+"' WHERE Reference_No='"+bookref+"'";
                    conn.s.executeUpdate(query);
                    String query2="Insert into issuedbook value('"+bookref+"','"+bookname+"','"+studid+"','"+stuname+"','"+issuedate+"','Teacher')";
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Book Successfully Issued","",JOptionPane.INFORMATION_MESSAGE);
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
        new IssueBookTeacher();
    }
}
