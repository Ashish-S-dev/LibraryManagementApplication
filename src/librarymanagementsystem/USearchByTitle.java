
package librarymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class USearchByTitle extends JFrame implements ActionListener{
    JTextField tfbookname;
    JButton jbsearch,ref4;
    JTable table;
    public USearchByTitle(){
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
        
        JLabel heading =new JLabel("Search Book");
        heading.setBounds(425,30,250,40);
        heading.setFont(new Font("Algerian",Font.BOLD,36));
        heading.setForeground(Color.getHSBColor(0.58f, 1.0f, 0.35f));
        add(heading);
        
        JLabel lblsearch=new JLabel("Search By Book Name");
        lblsearch.setBounds(200,105,250,20);
        lblsearch.setFont(new Font("Tahoma",Font.BOLD,18));
        lblsearch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblsearch);
         
        tfbookname=new JTextField();
        tfbookname.setBounds(500,105,200,20);
        tfbookname.setFont(new Font("Tahoma",Font.PLAIN,16));
        tfbookname.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(tfbookname);
        
        
        jbsearch=new JButton("Search");
        jbsearch.setBounds(800,105,100,20);
        jbsearch.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsearch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbsearch.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsearch.addActionListener(this);
        add(jbsearch);
        
        
        
        table =new JTable();
        Conn conn=null;
        try{
            conn=new Conn();
            String qurey="Select Reference_No,Name,Publisher,Edition,Category,Language,Branch,Availability from bookdetails";
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
        jsp.setBounds(22,160,1040,385);
        add(jsp);
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jbsearch){
            
            String query="Select Reference_No,Name,Publisher,Edition,Category,Language,Branch,Availability from bookdetails where Name='"+tfbookname.getText()+"'";
            
            if(!tfbookname.getText().equals("")){
                Conn conn=null;
                try{
                
                    conn=new Conn();
                    ResultSet rs=conn.s.executeQuery(query);
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
                
            }else{
                JOptionPane.showMessageDialog(null, "Null value Not Accepted","",JOptionPane.ERROR_MESSAGE);
            }
        }else if(ae.getSource()==ref4){
            Conn conn=null;
            try{
            conn=new Conn();
            String qurey="Select * from bookdetails";
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
            
        }
    }
    public static void main(String args[]){
        new USearchByTitle();
    }
    
}

