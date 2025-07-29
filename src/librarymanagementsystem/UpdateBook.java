
package librarymanagementsystem;

import javax.swing.*;

import java.awt.*;
import java.sql.*;

import java.awt.event.*;
public class UpdateBook extends JFrame implements ActionListener{
    
    JTextField tfbookname,tfauthorname,tfpublisher,tfedition,tfisbn,tfcategory,tflanguage,tfbranch,tfpubdate,tfcurrdate;
    Choice jcrefno;
  
    JButton jbcancel,jbsubmit,fetchDetails;
    
    public UpdateBook(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
//        Heading of the Page

        JLabel heading=new JLabel("Update Book Details");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(340,30,420,40);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/update2.png"));
        Image i2=i1.getImage().getScaledInstance(350, 350, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(650,100,350,350);
        add(i4);
        
        JLabel lblref=new JLabel("Book Reference Number");
        lblref.setFont(new Font("Tahoma",Font.BOLD,20));
        lblref.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblref.setBounds(40,105,250,20);
        add(lblref);
        
        
        jcrefno=new Choice();
        jcrefno.setFont(new Font("Tahoma",Font.PLAIN,14));
        jcrefno.setBounds(300,105,100,20);
        jcrefno.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(jcrefno);
        Conn conn=null;
        
        try{
            conn=new Conn();
            ResultSet rs=conn.s.executeQuery("Select Reference_No from bookdetails");
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
        
        fetchDetails=new JButton("Fetch");
        fetchDetails.setBounds(450,105,100,20);
        fetchDetails.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        fetchDetails.setForeground(Color.getHSBColor(0, 0, 0.2f));
        fetchDetails.setFont(new Font("Tahoma",Font.BOLD,14));
        fetchDetails.addActionListener(this);
        add(fetchDetails);
        
        JLabel lblhead1=new JLabel("Book details");
        lblhead1.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead1.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead1.setBounds(40,145,200,20);
        add(lblhead1);
        
        JLabel lblbooktitle=new JLabel("Book Name/Title");
        lblbooktitle.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbooktitle.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbooktitle.setBounds(40,175,200,20);
        add(lblbooktitle);
       
        tfbookname=new JTextField();
        tfbookname.setBounds(300,175,250,20);
        tfbookname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfbookname);
        
        JLabel lbledition=new JLabel("Edition");
        lbledition.setFont(new Font("Tahoma",Font.BOLD,18));
        lbledition.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbledition.setBounds(40,225,70,20);
        add(lbledition);
       
        tfedition=new JTextField();
        tfedition.setBounds(170,225,100,20);
        tfedition.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfedition);
        
        JLabel lblisbn=new JLabel("ISBN No.");
        lblisbn.setFont(new Font("Tahoma",Font.BOLD,18));
        lblisbn.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblisbn.setBounds(300,225,90,20);
        add(lblisbn);
       
        tfisbn=new JTextField();
        tfisbn.setBounds(450,225,100,20);
        tfisbn.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfisbn);
        
        JLabel lblhead2=new JLabel("Publication details");
        lblhead2.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead2.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead2.setBounds(40,265,200,20);
        add(lblhead2);
        
        JLabel lblpublisher=new JLabel("Publisher Name");
        lblpublisher.setFont(new Font("Tahoma",Font.BOLD,18));
        lblpublisher.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpublisher.setBounds(40,295,200,20);
        add(lblpublisher);
       
        tfpublisher=new JTextField();
        tfpublisher.setBounds(300,295,250,20);
        tfpublisher.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfpublisher);
        
        JLabel lblpubdate=new JLabel("PUB. Date");
        lblpubdate.setFont(new Font("Tahoma",Font.BOLD,18));
        lblpubdate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpubdate.setBounds(40,345,100,20);
        add(lblpubdate);
       
        tfpubdate=new JTextField();
        tfpubdate.setBounds(170,345,100,20);
        tfpubdate.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfpubdate);
        
        JLabel lbllanguage=new JLabel("Language");
        lbllanguage.setFont(new Font("Tahoma",Font.BOLD,18));
        lbllanguage.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbllanguage.setBounds(300,345,90,20);
        add(lbllanguage);
       
        tflanguage=new JTextField();
        tflanguage.setBackground(Color.white);
        tflanguage.setFont(new Font("sarif",Font.PLAIN,14));
        tflanguage.setForeground(Color.BLACK);
        tflanguage.setBounds(450,345,100,20);
        add(tflanguage);
        
        JLabel lblhead3=new JLabel("Other details");
        lblhead3.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead3.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead3.setBounds(40,385,200,20);
        add(lblhead3);
        
        JLabel lblauthor=new JLabel("Author Name");
        lblauthor.setFont(new Font("Tahoma",Font.BOLD,18));
        lblauthor.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblauthor.setBounds(40,415,200,20);
        add(lblauthor);
        
        tfauthorname=new JTextField();
        tfauthorname.setBounds(300,415,250,20);
        tfauthorname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfauthorname);
        
        JLabel lblcategory=new JLabel("Book Category");
        lblcategory.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcategory.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcategory.setBounds(40,465,200,20);
        add(lblcategory);
        
        
        tfcategory=new JTextField();
        tfcategory.setBackground(Color.white);
        tfcategory.setFont(new Font("sarif",Font.PLAIN,14));
        tfcategory.setForeground(Color.BLACK);
        tfcategory.setBounds(300,465,250,20);
        add(tfcategory);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbranch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbranch.setBounds(40,515,90,20);
        add(lblbranch);
        
        
        tfbranch=new JTextField();
        tfbranch.setBackground(Color.white);
        tfbranch.setFont(new Font("sarif",Font.PLAIN,14));
        tfbranch.setForeground(Color.BLACK);
        tfbranch.setBounds(170,515,100,20);
        add(tfbranch);
        
        JLabel lbldate=new JLabel("Date");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(300,515,90,20);
        add(lbldate);
       
        tfcurrdate=new JTextField();
        tfcurrdate.setBounds(450,515,100,20);
        tfcurrdate.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfcurrdate);
      
        
        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(650,480,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Submit");
        jbsubmit.setBounds(900,480,120,40);
        jbsubmit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsubmit.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbsubmit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsubmit.addActionListener(this);
        add(jbsubmit);
        
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){


        if(ae.getSource()==jbsubmit){
            String name=tfbookname.getText();
            String authorname=tfauthorname.getText();
            String publisher=tfpublisher.getText();
            String edition=tfedition.getText();
            String isbn=tfisbn.getText();
            String category=tfcategory.getText();
            String language=tflanguage.getText();
            String branch=tfbranch.getText();
            String currdate=tfcurrdate.getText();
            String pubdate=tfpubdate.getText();
            if(!name.equals("")){
                Conn conn=null;
                try{
                    conn=new Conn();
                    String query="Update bookdetails set Name='"+name+"',Author='"+authorname+"',Publisher='"+publisher+"',Edition='"+edition+"',ISBN='"+isbn+"',Category='"+category+"',language='"+language+"',Branch='"+branch+"',PublicationDate='"+currdate+"',Add_on='"+pubdate+"' where Reference_No='"+jcrefno.getSelectedItem()+"'";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Book Details Updated Successfully","",JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Null Value Not Accepted","",JOptionPane.ERROR_MESSAGE);
            }
        }else if(ae.getSource()==jbcancel){
            setVisible(false);
        }else if(ae.getSource()==fetchDetails){
            String msg=jcrefno.getSelectedItem();
            Conn conn=null;
            try{
                conn=new Conn();
                ResultSet rs=conn.s.executeQuery("Select * from bookdetails where Reference_no='"+msg+"'");
                if(rs.next()){
                    tfbookname.setText(rs.getString("Name"));
                    tfauthorname.setText(rs.getString("Author"));
                    tfpublisher.setText(rs.getString("Publisher"));
                    tfedition.setText(rs.getString("Edition"));
                    tflanguage.setText(rs.getString("language"));
                    tfisbn.setText(rs.getString("ISBN"));
                    tfpubdate.setText(rs.getString("PublicationDate"));
                    tfcurrdate.setText(rs.getString("Add_on"));
                    tfcategory.setText(rs.getString("Category"));
                    tfbranch.setText(rs.getString("Branch"));
                 }else{
                    JOptionPane.showMessageDialog(null,"No Book Found" );
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
            
        }
    }
    public static void main(String args[]){
        new UpdateBook();
    }
}
