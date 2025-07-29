
package librarymanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class SearchByCategory extends JFrame implements ActionListener{
    Choice cbcategory;
    JButton jbsearch,jbprint,jbadd,jbupdate,jbback,ref4;
    JTable table;
    public SearchByCategory(){
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
        
        JLabel lblsearch=new JLabel("Search By Book Category");
        lblsearch.setBounds(200,105,250,20);
        lblsearch.setFont(new Font("Tahoma",Font.BOLD,18));
        lblsearch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        add(lblsearch);
         
        cbcategory =new Choice();
        cbcategory.setBounds(500,105,200,20);
        cbcategory.setFont(new Font("Tahoma",Font.PLAIN,16));
        cbcategory.setForeground(Color.getHSBColor(0f, 0.80f, 0.85f));
        add(cbcategory);
        
        String arr3[]={"Select","Art","Comic","Science","Technical","Current Affair","Other"};
        for(int i=0;i<arr3.length;i++){
            cbcategory.add(arr3[i]);
        }
       
        
        jbsearch=new JButton("Search");
        jbsearch.setBounds(800,105,100,22);
        jbsearch.setFont(new Font("Tahoma",Font.BOLD,18));
        jbsearch.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbsearch.setBackground(Color.getHSBColor(0.33f, 0.80f, 0.65f));
        jbsearch.addActionListener(this);
        add(jbsearch);
        
        jbprint=new JButton("Print");
        jbprint.setBounds(140,165,100,20);
        jbprint.setFont(new Font("Tahoma",Font.BOLD,18));
        jbprint.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        jbprint.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbprint.addActionListener(this);
        add(jbprint);
        
        jbadd=new JButton("Add");
        jbadd.setBounds(380,165,100,20);
        jbadd.setFont(new Font("Tahoma",Font.BOLD,18));
        jbadd.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        jbadd.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbadd.addActionListener(this);
        add(jbadd);
        
        jbupdate=new JButton("Update");
        jbupdate.setBounds(620,165,100,20);
        jbupdate.setFont(new Font("Tahoma",Font.BOLD,18));
        jbupdate.setBackground(Color.getHSBColor(0.58f, 0.55f, 0.80f));
        jbupdate.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbupdate.addActionListener(this);
        add(jbupdate);
        
        jbback=new JButton("Back");
        jbback.setBounds(860,165,100,20);
        jbback.setFont(new Font("Tahoma",Font.BOLD,18));
        jbback.setForeground(Color.getHSBColor(0, 0, 0.2f));
        jbback.setBackground(Color.getHSBColor(0f, 0.80f, 0.85f));
        jbback.addActionListener(this);
        add(jbback);
        
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
        table.setBackground(Color.getHSBColor(0, 0f, 0.97f));
        table.setForeground(Color.getHSBColor(0, 0, 0.2f));
        table.setFont(new Font("sarif",Font.BOLD,14));
        jsp.setBounds(22,205,1040,345);
        add(jsp);
        
        setSize(1100,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==jbback){
            setVisible(false);
        }else if(ae.getSource()==jbsearch){
            
            String query="Select Reference_No,Name,Publisher,Edition,Category,Language,Branch,Availability from bookdetails where Category='"+cbcategory.getSelectedItem()+"'";
            
            if(!cbcategory.getSelectedItem().equals("Select")){
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
        }else if(ae.getSource() ==jbprint){
            try{
                table.print();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==jbadd){
            new AddBook();
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
        }else if(ae.getSource()==jbupdate){
            new UpdateBook();
        }
    }
    public static void main(String args[]){
        new SearchByCategory();
    }
    
}


