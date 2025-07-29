
package librarymanagementsystem;

import javax.swing.*;
import java.util.Random;
import java.awt.*;

import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class AddBook extends JFrame implements ActionListener{
    
    JTextField tfbookname,tfauthorname,tfpublisher,tfedition,tfcopies,tfisbn;
    JComboBox tfcategory,tflanguage,tfbranch;
    JLabel lblrefno;
   
    JDateChooser jyccurrdate,pubyear;
    JButton jbcancel,jbsubmit;
    Random rm=new Random();
    Long num=Math.abs((rm.nextLong()%9000L)+1000L);
    public AddBook(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
//        Heading of the Page

        JLabel heading=new JLabel("Add New Book");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(410,30,280,40);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/addbook.png"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(550,90,600,400);
        add(i4);
        
        JLabel lblref=new JLabel("Book Reference Number");
        lblref.setFont(new Font("Tahoma",Font.BOLD,20));
        lblref.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblref.setBounds(40,105,250,20);
        add(lblref);
        
        
        lblrefno=new JLabel("383"+num);
        lblrefno.setBounds(350,105,200,20);
        lblrefno.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        lblrefno.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(lblrefno);
        
        JLabel lblhead1=new JLabel("Book details");
        lblhead1.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead1.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead1.setBounds(40,140,200,20);
        add(lblhead1);
        
        JLabel lblbooktitle=new JLabel("Book Name/Title");
        lblbooktitle.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbooktitle.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbooktitle.setBounds(40,170,200,20);
        add(lblbooktitle);
       
        tfbookname=new JTextField();
        tfbookname.setBounds(300,170,250,20);
        tfbookname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfbookname);
        
        JLabel lbledition=new JLabel("Edition");
        lbledition.setFont(new Font("Tahoma",Font.BOLD,18));
        lbledition.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbledition.setBounds(40,220,70,20);
        add(lbledition);
       
        tfedition=new JTextField();
        tfedition.setBounds(170,220,100,20);
        tfedition.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfedition);
        
        JLabel lblisbn=new JLabel("ISBN No.");
        lblisbn.setFont(new Font("Tahoma",Font.BOLD,18));
        lblisbn.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblisbn.setBounds(300,220,90,20);
        add(lblisbn);
       
        tfisbn=new JTextField();
        tfisbn.setBounds(450,220,100,20);
        tfisbn.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfisbn);
        
        JLabel lblhead2=new JLabel("Publication details");
        lblhead2.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead2.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead2.setBounds(40,270,200,20);
        add(lblhead2);
        
        JLabel lblpublisher=new JLabel("Publication Name");
        lblpublisher.setFont(new Font("Tahoma",Font.BOLD,18));
        lblpublisher.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpublisher.setBounds(40,300,200,20);
        add(lblpublisher);
       
        tfpublisher=new JTextField();
        tfpublisher.setBounds(300,300,250,20);
        tfpublisher.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfpublisher);
        
        JLabel lblpubdate=new JLabel("PUB. Date");
        lblpubdate.setFont(new Font("Tahoma",Font.BOLD,18));
        lblpubdate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpubdate.setBounds(40,350,100,20);
        add(lblpubdate);
       
        pubyear=new JDateChooser();
        pubyear.setBounds(140,350,100,20);
        pubyear.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(pubyear);
        
        JLabel lbllanguage=new JLabel("Language");
        lbllanguage.setFont(new Font("Tahoma",Font.BOLD,18));
        lbllanguage.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbllanguage.setBounds(300,350,90,20);
        add(lbllanguage);
       
        String arr[]={"Select","Hindi","French","German","Chinese","English","Spanish"};
        tflanguage=new JComboBox(arr);
        tflanguage.setBackground(Color.white);
        tflanguage.setFont(new Font("sarif",Font.PLAIN,14));
        tflanguage.setForeground(Color.BLACK);
        tflanguage.setBounds(450,350,100,20);
        add(tflanguage);
        
        JLabel lblhead3=new JLabel("Other details");
        lblhead3.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead3.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead3.setBounds(40,400,200,20);
        add(lblhead3);
        
        
        
        JLabel lblcategory=new JLabel("Book Category");
        lblcategory.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcategory.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcategory.setBounds(40,480,200,20);
        add(lblcategory);
        
        String arr3[]={"Select","Art","Comic","Science","Technical","Current Affair","Other"};
        tfcategory=new JComboBox(arr3);
        tfcategory.setBackground(Color.white);
        tfcategory.setFont(new Font("sarif",Font.PLAIN,14));
        tfcategory.setForeground(Color.BLACK);
        tfcategory.setBounds(300,480,250,20);
        add(tfcategory);
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbranch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbranch.setBounds(40,430,90,20);
        add(lblbranch);
        
        String arr2[]={"Select","All","IT","CSE","Aerospace","Mechanical","Electronic","Other"};
        tfbranch=new JComboBox(arr2);
        tfbranch.setBackground(Color.white);
        tfbranch.setFont(new Font("sarif",Font.PLAIN,14));
        tfbranch.setForeground(Color.BLACK);
        tfbranch.setBounds(170,430,100,20);
        add(tfbranch);
        
        JLabel lbldate=new JLabel("Date");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(300,430,90,20);
        add(lbldate);
       
        jyccurrdate=new JDateChooser();
        jyccurrdate.setBounds(420,430,130,20);
        jyccurrdate.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(jyccurrdate);
        
        JLabel lblauthor=new JLabel("Author Name");
        lblauthor.setFont(new Font("Tahoma",Font.BOLD,18));
        lblauthor.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblauthor.setBounds(40,530,200,20);
        add(lblauthor);
        
        tfauthorname=new JTextField();
        tfauthorname.setBounds(300,530,250,20);
        tfauthorname.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(tfauthorname);
        
        jbcancel=new JButton("Cancel");
        jbcancel.setBounds(650,490,120,40);
        jbcancel.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbcancel.setFont(new Font("Tahoma",Font.BOLD,18));
        jbcancel.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));//Light red
        jbcancel.addActionListener(this);
        add(jbcancel);
        
        jbsubmit=new JButton("Submit");
        jbsubmit.setBounds(900,490,120,40);
        jbsubmit.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsubmit.setForeground(Color.getHSBColor(0, 0, 0.2f));//Green
        jbsubmit.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsubmit.addActionListener(this);
        add(jbsubmit);
        
        
        
        //setLocation(220,65);
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
            String category=(String)tfcategory.getSelectedItem();
            String language=(String)tflanguage.getSelectedItem();
            String branch=(String)tfbranch.getSelectedItem();
            String refno=lblrefno.getText();
            String currdate=((JTextField)jyccurrdate.getDateEditor().getUiComponent()).getText();
            String pubdate=((JTextField)pubyear.getDateEditor().getUiComponent()).getText();
            if(!language.equals("Select")  && !branch.equals("Select") && !refno.equals("") && !currdate.equals("") && !pubdate.equals("") && !name.equals("") && !authorname.equals("") && !publisher.equals("") && !edition.equals("") && !isbn.equals("") && !category.equals("Select")){
                Conn conn=null;
                try{
                    conn=new Conn();
                    String query="Insert into bookdetails value('"+refno+"','"+name+"','"+authorname+"','"+publisher+"','"+edition+"','"+isbn+"','"+category+"','"+language+"','"+branch+"','"+currdate+"','"+pubdate+"','Available','Null')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Book Details Successfully Added","",JOptionPane.INFORMATION_MESSAGE);
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
        new AddBook();
    }
}
