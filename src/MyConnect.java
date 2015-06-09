
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyConnect {
    
     protected Connection conn = null;  //для підключення до БД
     protected Statement stat = null;   //для виконання запитів до БД
     protected ResultSet res = null;    //для виводу даних за запитом
     ArrayList<String> list1 = new ArrayList<String>();  //list1  для score
     ArrayList<String> list2 = new ArrayList<String>();//list2  для time
     ArrayList<String> list3 = new ArrayList<String>();
     
     /**
      * 
      * перевіряє з'єднання, чи він не нулл
      */
     public int checkConnStat() {
         if(conn == null || stat == null )
             return -1;
         else return 1;
     }
     
     /**
      *  
      * @param database - назва бази даних
      */
     public void openConn(String database) {
                 try {
                     
		 String userName = "root";
		 String password = "1234";
		 String url = "jdbc:mysql://127.0.0.1:3307/"+database;
		 Class.forName ("com.mysql.jdbc.Driver").newInstance(); //звертаємось до jdbc.Driver, (його підключення) 
                 
		 System.out.println("------");
                 
		 conn = DriverManager.getConnection (url, userName, password); //DriverManager ми підключаємось до БД 
		  System.out.println("Connection complete");
		 stat = conn.createStatement();    //робимо об'єкт, щоб відсилати запити
                 
		 System.out.println("Stat complete");
		 
                 }
                 catch (Exception e) {
		 System.err.println (e.getMessage());
                     }
		 
            }
     /**
      * закриваємо коннекшн
      */
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
     /**
      * зберігаємо в БД рекорди наші
      * @param name
      * @param score
      * @param time
      */
     public void save(String name,String score,String time,String mod) { 
    	 try {
             stat.executeUpdate("insert into score value('"+name+"', "+score+", '"+time+"', '"+mod+"', null);");
             JOptionPane.showMessageDialog(null, "Ваш запис успішно доданий !");
            } catch (SQLException ex) {
           System.out.println(ex.toString());
       }
     }
     public ArrayList<String> get() {
    	 ArrayList<String> list = new ArrayList<String>();
    	 list.add("Ім'я");
    	 list1.add("Очки");
    	 list2.add("Час");
    	 list3.add("Режим гри");
    	  try {
    	         res = stat.executeQuery("select  name from score order by score desc;");  //дістаємо дані з таблиці score
    	            while(res.next())
    	            	list.add(res.getString(1));    //заносимо name  в колекцію (list)
    	            res = stat.executeQuery("select  score from score order by score desc;");
    	            while(res.next())
    	            	list1.add(res.getString(1));
    	            res = stat.executeQuery("select  time from score order by score desc ;");
    	            while(res.next())
    	            	list2.add(res.getString(1));
    	            	res = stat.executeQuery("select game from score order by score desc ;");
        	            while(res.next())
        	            	list3.add(res.getString(1));
    	  			} catch (SQLException ex) {
    	            System.out.println(ex.toString());
    	          }
    	 return list;
     }
/**
 * метод з list робить (повертає)  2вимірний масив об'єктів, щоб їх потім можна було внести в таблицю
 * @param list
 * @return
 */
     public Object [][] arrayToObject(ArrayList<String> list) {
         Object [][] o = new Object[list.size()][4];
         for(int i = 0;i < o.length;i++) {
             o[i][0] = (Object) list.get(i);
             o[i][1] = (Object) list1.get(i);
             o[i][2] = (Object) list2.get(i);
             o[i][3] = (Object) list3.get(i);
         }
         return o;
     }
}

