
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class ViewAttendence extends JFrame implements ActionListener {
    JButton ref4;
    JTable table;
    public ViewAttendence(){
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
        
        JLabel heading =new JLabel("Your Attendence");
        heading.setBounds(375,30,350,40);
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        add(heading);
        
        table =new JTable();
        Conn conn=null;
        try{
            conn=new Conn();
            String query="";
            if(Login.databaseName.equals("student")){
                 query="Select Reference_No, Name, Entry_Time, Exit_Time, Contact, Reason, Year, Seat_No, Date from Attendence Where Name='"+Login.userName+"' and Reference_No='"+Login.userid+"'";
            }else{
                 query="Select Reference_No, Name, Entry_Time, Exit_Time, Contact, Reason, Seat_No, Date from Attendence Where Name='"+Login.userName+"' and Reference_No='"+Login.userid+"'";

            }
            ResultSet rs=conn.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
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
        
        JScrollPane jsp=new JScrollPane(table);
        table.setBackground(Color.white);
        jsp.setFont(new Font("Tahoma",Font.PLAIN,18));
        table.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        table.setForeground(Color.getHSBColor(0, 0, 0.2f));
        table.setFont(new Font("sarif",Font.BOLD,14));
        jsp.setBounds(22,105,1040,440);
        add(jsp);
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==ref4){
            new ViewAttendence();
            setVisible(false);
        }
    }
        
    public static void main(String args[]){
        new ViewAttendence();
    }
    
}


