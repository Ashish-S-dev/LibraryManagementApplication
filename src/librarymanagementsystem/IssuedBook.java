
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class IssuedBook extends JFrame implements ActionListener {
    JButton ref4;
    JTable table;
    public IssuedBook(){
        setLayout(null);
        getContentPane().setBackground(Color.getHSBColor(0, 0f, 0.97f));
        
        
        ImageIcon ref1=new ImageIcon(ClassLoader.getSystemResource("librarymanagementsystem/icons/refresh2.png"));
        Image ref2=ref1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon ref3=new ImageIcon(ref2);
        ref4=new JButton(ref3);
        ref4.setBounds(5,5,30,30);
        ref4.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        ref4.addActionListener(this);
        add(ref4);
        
        JLabel heading =new JLabel("Issued Book");
        heading.setBounds(435,30,230,40);
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        add(heading);
        
        table =new JTable();
        Conn conn=null;
        try{
            conn=new Conn();
            ResultSet rs1=conn.s.executeQuery("Select ReferenceNo from "+Login.databaseName+" where Name='"+Login.userName+"'");
            String refno="";
            if(rs1.next()){
                refno=rs1.getString("ReferenceNo");
            }
            
            
            String qurey="Select Book_Reference_No, Book_name, user_Id, User_Name, issuedDate from issuedbook where user_Id='"+Login.userid+"'";
            ResultSet rs=conn.s.executeQuery(qurey);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
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
        
        
        
        
        JScrollPane jsp=new JScrollPane(table);
        table.setBackground(Color.white);
        jsp.setFont(new Font("Tahoma",Font.PLAIN,18));
        table.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        table.setForeground(Color.getHSBColor(0, 0, 0.2f));
        table.setFont(new Font("sarif",Font.BOLD,14));
        jsp.setBounds(50,105,1000,440);
        add(jsp);
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==ref4){
            new AllBook();
            setVisible(false);
        }
    }
        
    public static void main(String args[]){
        new IssuedBook();
    }
    
}


