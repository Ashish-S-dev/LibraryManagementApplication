
package librarymanagementsystem;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class ReturnTeaBook extends JFrame implements ActionListener{
    JButton jbcancel,jbsubmit,fetchstudent;
    JTextField tfstuid;
    JLabel lblempname,tfbookname,bookref,tfdate;
    Choice studid;
    
    public ReturnTeaBook(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
        //        Heading
        JLabel heading=new JLabel("Return/Submit Book");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(275,40,450,40);
        add(heading);
//        Image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/returnBook.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(100,130,200,200);
        add(i4);
        
        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(60,360,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Submit");
        jbsubmit.setBounds(240,360,120,40);
        jbsubmit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsubmit.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbsubmit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsubmit.addActionListener(this);
        add(jbsubmit);
        
//        Form Field
        JLabel lblstuid=new JLabel("Employee Id");
        lblstuid.setBounds(430,140,200,20);
        lblstuid.setFont(new Font("Tahoma",Font.BOLD,20));
        lblstuid.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblstuid);
       
        
        studid=new Choice();
        studid.setBounds(630,140,120,20);
        studid.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        studid.setFont(new Font("Tahoma",Font.PLAIN,16));
        Conn conn=null;
        
        try{
            conn=new Conn();
            ResultSet rs=conn.s.executeQuery("Select User_Id from issuedbook where UserType='Teacher'");
            while(rs.next()){
                studid.add(rs.getString("User_Id"));
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
        
        add(studid);
        
        fetchstudent=new JButton("Fetch");
        fetchstudent.setBounds(800,140,100,20);
        fetchstudent.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        fetchstudent.setForeground(Color.getHSBColor(0, 0, 0.2f));
        fetchstudent.setFont(new Font("Tahoma",Font.BOLD,20));
        fetchstudent.addActionListener(this);
        add(fetchstudent);
        
        JLabel lbloldpass=new JLabel("Employee Name");
        lbloldpass.setBounds(430,200,200,20);
        lbloldpass.setFont(new Font("Tahoma",Font.BOLD,20));
        lbloldpass.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbloldpass);
       
        
        lblempname=new JLabel();
        lblempname.setBounds(700,200,200,20);
        lblempname.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        lblempname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblempname);
        
        JLabel lblbookname=new JLabel("Book Name");
        lblbookname.setBounds(430,260,150,20);
        lblbookname.setFont(new Font("Tahoma",Font.BOLD,20));
        lblbookname.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblbookname);
       
        
        tfbookname=new JLabel();
        tfbookname.setBounds(700,260,200,20);
        tfbookname.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfbookname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfbookname);
        
        JLabel lblbookref=new JLabel("Book Reference Number");
        lblbookref.setBounds(430,320,200,20);
        lblbookref.setFont(new Font("Tahoma",Font.BOLD,20));
        lblbookref.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblbookref);
       
        
        bookref=new JLabel();
        bookref.setBounds(700,320,200,20);
        bookref.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        bookref.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(bookref);
        
        
        JLabel lbldate=new JLabel("Issued Date *");
        lbldate.setBounds(430,380,150,20);
        lbldate.setFont(new Font("Tahoma",Font.BOLD,20));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lbldate);

        
        tfdate=new JLabel();
        tfdate.setBounds(700,380,200,20);
        tfdate.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        tfdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfdate);
        
        setSize(1000,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==fetchstudent){
            String userid=studid.getSelectedItem();
            Conn conn=null;
            try{
                conn=new Conn();
                ResultSet rs=conn.s.executeQuery("Select * from issuedbook where User_id='"+userid+"'");
                if(rs.next()){
                    lblempname.setText(rs.getString("User_Name"));
                    tfbookname.setText(rs.getString("Book_Name"));
                    bookref.setText(rs.getString("Book_Reference_No"));
                    tfdate.setText(rs.getString("issuedDate"));
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
            
        }else if(ae.getSource()==jbcancel){
                  setVisible(false);
        }else if(ae.getSource()==jbsubmit){
            String userid=studid.getSelectedItem();
            String bookre=bookref.getText();
            if(!lblempname.getText().equals("")){
                Conn conn=null;
                try{
                    conn=new Conn();
                    String query1="Delete from issuedbook where Book_Reference_No='"+bookre+"'";
                    String query2="Update bookdetails set Availability='Available',issueDate='Null' where Reference_No='"+bookre+"'";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Book Submitted Successfully","",JOptionPane.INFORMATION_MESSAGE);
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
        new ReturnTeaBook();
    }
}
