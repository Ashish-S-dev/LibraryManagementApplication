
package librarymanagementsystem;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class OpenPdf extends JFrame implements ActionListener{
    JLabel tfbookname,tfauthorname,tfpublisher,tfedition,tfisbn,tflanguage,pubyear,tfcurrdate,tfcategory,tfbranch;
    
    Choice jcrefno;
   
    JButton jbcancel,jbopen,fetchDetails;
    
    public OpenPdf(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
//        Heading of the Page

        JLabel heading=new JLabel("Read Book");
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        heading.setBounds(425,30,250,40);
        add(heading);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/openBook.png"));
        Image i2=i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        i4.setBounds(570,80,500,400);
        add(i4);
        
        JLabel lblref=new JLabel("Book Reference Number");
        lblref.setFont(new Font("Tahoma",Font.BOLD,20));
        lblref.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblref.setBounds(40,110,250,20);
        add(lblref);
        
        
        jcrefno=new Choice();
        jcrefno.setFont(new Font("Tahoma",Font.PLAIN,14));
        jcrefno.setBounds(300,110,100,20);
        jcrefno.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(jcrefno);
        Conn conn=null;
        try{
            conn =new Conn();
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
        fetchDetails.setBounds(450,110,100,20);
        fetchDetails.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        fetchDetails.setForeground(Color.getHSBColor(0, 0, 0.2f));
        fetchDetails.setFont(new Font("Tahoma",Font.BOLD,14));
        fetchDetails.addActionListener(this);
        add(fetchDetails);
        
        JLabel lblhead1=new JLabel("Book details");
        lblhead1.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead1.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead1.setBounds(40,150,200,20);
        add(lblhead1);
        
        JLabel lblbooktitle=new JLabel("Book Name/Title");
        lblbooktitle.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbooktitle.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbooktitle.setBounds(40,180,200,20);
        add(lblbooktitle);
       
        tfbookname=new JLabel();
        tfbookname.setBounds(300,180,250,20);
        tfbookname.setForeground(Color.DARK_GRAY);
        tfbookname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfbookname);
        
        JLabel lbledition=new JLabel("Edition");
        lbledition.setFont(new Font("Tahoma",Font.BOLD,18));
        lbledition.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbledition.setBounds(40,230,70,20);
        add(lbledition);
       
        tfedition=new JLabel();
        tfedition.setBounds(170,230,100,20);
        tfedition.setForeground(Color.DARK_GRAY);
        tfedition.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfedition);
        
        JLabel lblisbn=new JLabel("ISBN No.");
        lblisbn.setFont(new Font("Tahoma",Font.BOLD,18));
        lblisbn.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblisbn.setBounds(300,230,90,20);
        add(lblisbn);
       
        tfisbn=new JLabel();
        tfisbn.setBounds(450,230,100,20);
        tfisbn.setForeground(Color.DARK_GRAY);
        tfisbn.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfisbn);
        
        JLabel lblhead2=new JLabel("Publication details");
        lblhead2.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead2.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead2.setBounds(40,270,200,20);
        add(lblhead2);
        
        JLabel lblpublisher=new JLabel("Publisher Name");
        lblpublisher.setFont(new Font("Tahoma",Font.BOLD,18));
        lblpublisher.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpublisher.setBounds(40,300,200,20);
        add(lblpublisher);
       
        tfpublisher=new JLabel();
        tfpublisher.setBounds(300,300,250,20);
        tfpublisher.setFont(new Font("Tahoma",Font.PLAIN,16));
        tfpublisher.setForeground(Color.DARK_GRAY);
        add(tfpublisher);
        
        JLabel lblpubdate=new JLabel("PUB. Date");
        lblpubdate.setFont(new Font("Tahoma",Font.BOLD,18));
        lblpubdate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblpubdate.setBounds(40,350,100,20);
        add(lblpubdate);
       
        pubyear=new JLabel();
        pubyear.setBounds(170,350,100,20);
        pubyear.setFont(new Font("Tahoma",Font.PLAIN,16));
        pubyear.setForeground(Color.DARK_GRAY);
        add(pubyear);
        
        JLabel lbllanguage=new JLabel("Language");
        lbllanguage.setFont(new Font("Tahoma",Font.BOLD,18));
        lbllanguage.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbllanguage.setBounds(300,350,90,20);
        add(lbllanguage);
       
        tflanguage=new JLabel();
        tflanguage.setBounds(450,350,100,20);
        tflanguage.setFont(new Font("Tahoma",Font.PLAIN,16));
        tflanguage.setForeground(Color.DARK_GRAY);
        add(tflanguage);
        
        JLabel lblhead3=new JLabel("Other details");
        lblhead3.setFont(new Font("Tahoma",Font.BOLD,14));
        lblhead3.setForeground(Color.getHSBColor(210/360f, 1.0f, 0.5f));
        lblhead3.setBounds(40,390,200,20);
        add(lblhead3);
        
        JLabel lblauthor=new JLabel("Author Name");
        lblauthor.setFont(new Font("Tahoma",Font.BOLD,18));
        lblauthor.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblauthor.setBounds(40,420,200,20);
        add(lblauthor);
        
        tfauthorname=new JLabel();
        tfauthorname.setBounds(300,420,250,20);
        tfauthorname.setFont(new Font("Tahoma",Font.PLAIN,16));
        tfauthorname.setForeground(Color.DARK_GRAY);
        add(tfauthorname);
        
        
        JLabel lblcategory=new JLabel("Book Category");
        lblcategory.setFont(new Font("Tahoma",Font.BOLD,18));
        lblcategory.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblcategory.setBounds(40,470,200,20);
        add(lblcategory);
        
        
        tfcategory=new JLabel();
        tfcategory.setBounds(300,470,250,20);
        tfcategory.setFont(new Font("Tahoma",Font.PLAIN,16));
        tfcategory.setForeground(Color.DARK_GRAY);
        add(tfcategory);
        
 
        
        JLabel lblbranch=new JLabel("Branch");
        lblbranch.setFont(new Font("Tahoma",Font.BOLD,18));
        lblbranch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lblbranch.setBounds(40,520,90,20);
        add(lblbranch);
        
        tfbranch=new JLabel();
        tfbranch.setBounds(170,520,100,20);
        tfbranch.setFont(new Font("Tahoma",Font.PLAIN,16));
        tfbranch.setForeground(Color.DARK_GRAY);
        add(tfbranch);
       
        
        JLabel lbldate=new JLabel("Date");
        lbldate.setFont(new Font("Tahoma",Font.BOLD,18));
        lbldate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        lbldate.setBounds(300,520,90,20);
        add(lbldate);
       
        tfcurrdate=new JLabel();
        tfcurrdate.setBounds(450,520,100,20);
        tfcurrdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        tfcurrdate.setForeground(Color.DARK_GRAY);
        add(tfcurrdate);
       
      
        
        jbopen=new JButton("Open Book");
        jbopen.setBounds(700,490,240,40);
        jbopen.setFont(new Font("Tahoma",Font.BOLD,18));
        jbopen.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbopen.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbopen.addActionListener(this);
        add(jbopen);
        
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){


        if(ae.getSource()==jbopen){
            String referenceno= jcrefno.getSelectedItem();
            Conn conn=null;
            try {
                String driveLink=null;
                conn = new Conn();
                ResultSet rs2=conn.s.executeQuery( "Select pdflink from BookPdf where Reference_No ='"+referenceno+"' ");
                
                if(rs2.next()){
                    // Google Drive ka share link
                    driveLink=rs2.getString("pdflink");
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().browse(new URI(driveLink));
                    }else{
                        JOptionPane.showMessageDialog( null ,"Not Supported ! Update Your Browser" , "", JOptionPane.CANCEL_OPTION);
                    }
                }else{
                    JOptionPane.showMessageDialog( null ,"Book Content Not be Found, It may be deleted ?" , "", JOptionPane.CANCEL_OPTION);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                if( conn.c!=null){
                    try{
                        conn.c.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
            
        }else if(ae.getSource()==fetchDetails){
            String msg=jcrefno.getSelectedItem();
            Conn conn=null;
            try{
                conn =new Conn();
                ResultSet rs=conn.s.executeQuery("Select * from bookdetails where Reference_no='"+msg+"'");
                if(rs.next()){
                    tfbookname.setText(rs.getString("Name"));
                    tfauthorname.setText(rs.getString("Author"));
                    tfpublisher.setText(rs.getString("Publisher"));
                    tfedition.setText(rs.getString("Edition"));
                    tflanguage.setText(rs.getString("language"));
                    tfisbn.setText(rs.getString("ISBN"));
                    pubyear.setText(rs.getString("PublicationDate"));
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
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        System.out.println("Connection Closed");
                    }
                }
            
        }
    }
    public static void main(String args[]){
        new OpenPdf();
    }
}
//    public OpenPdf(){
//        setLayout(null);
//        setVisible(true);
//        setSize(500, 500);
//        setLocation(200,200);
//    }
//    
//    public static void main(String[] args) {
//        new OpenPdf();
////        JFrame frame = new JFrame("Open PDF from Drive");
////        JButton button = new JButton("Open PDF from Drive");
////
////        button.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                try {
////                    // Google Drive ka share link
////                    String driveLink = "https://docs.google.com/document/d/12TydyucDjO-rOwvLza7SswbZUU_x9Wu8Z-pHpQwaHIQ/edit?usp=drive_link";
////                    
////                    if (Desktop.isDesktopSupported()) {
////                        Desktop.getDesktop().browse(new URI(driveLink));
////                    }
////                } catch (IOException | URISyntaxException ex) {
////                    ex.printStackTrace();
////                }
////            }
////        });
////
////        frame.add(button);
////        frame.setSize(300, 200);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setVisible(true);
//    }
//    public void actionPerformed(ActionEvent ae){
//        
//    }
//}