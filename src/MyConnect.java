
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyConnect {
    
     protected Connection conn = null;
     protected Statement stat = null;
     protected ResultSet res = null;
     ArrayList<String> list1 = new ArrayList<String>();
     ArrayList<String> list2 = new ArrayList<String>();
     
     public int checkConnStat() {
         if(conn == null || stat == null )
             return -1;
         else return 1;
     }
     
     public void openConn(String database) {
                 try {
                     
		 String userName = "root";
		 String password = "1234";
		 String url = "jdbc:mysql://127.0.0.1:3307/"+database;
		 Class.forName ("com.mysql.jdbc.Driver").newInstance(); 
                 
		 System.out.println("------");
                 
		 conn = DriverManager.getConnection (url, userName, password); 
		  System.out.println("Connection complete");
		 stat = conn.createStatement();
                
                 
		 System.out.println("Stat complete");
		 
                 }
                 catch (Exception e) {
		 System.err.println (e.getMessage());
                     }
		 
            }
     
     public void closeConn() {
         
        if (conn != null) {
           try {
             conn.close ();
                if(stat != null)
                    stat.close();
                if(res != null)
                    res.close();
               }
            catch (Exception e) {e.printStackTrace(); } 
           
           System.out.println("Connection closed");
            
        }
		 
     }
     
     public void save(String name,String score,String time) { 
    	 try {
             stat.executeUpdate("insert into score value('"+name+"', "+score+", '"+time+"', null);");
             JOptionPane.showMessageDialog(null, "Ваш запис успішно доданий !");
            } catch (SQLException ex) {
           System.out.println(ex.toString());
       }
     }
     public ArrayList<String> get() {
    	 ArrayList<String> list = new ArrayList<String>();
    	  try {
    	         res = stat.executeQuery("select  name from score  ;");
    	            while(res.next())
    	            	list.add(res.getString(1));
    	            res = stat.executeQuery("select  score from score  ;");
    	            while(res.next())
    	            	list1.add(res.getString(1));
    	            res = stat.executeQuery("select  time from score  ;");
    	            while(res.next())
    	            	list2.add(res.getString(1));
    	  			} catch (SQLException ex) {
    	            System.out.println(ex.toString());
    	          }
    	 return list;
     }

     public Object [][] arrayToObject(ArrayList<String> list) {
         Object [][] o = new Object[list.size()][3];
         for(int i = 0;i < o.length;i++) {
             o[i][0] = (Object) list.get(i);
             o[i][1] = (Object) list1.get(i);
             o[i][2] = (Object) list2.get(i);
         }
         return o;
     }
}

