package cpsc330_betterbanner;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Version {
        private static Connection con = null;
        private static PreparedStatement pst = null;
        private static Statement st = null;
        private static ResultSet rs = null;


public static String getEnrolledCourses(int inUID){
    String courseT = "";
        String url = "jdbc:mysql://localhost:3306/ccat";
        String user = "ccat2012";
        String password = "password";
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT course.CRN, course.name FROM course, enrole WHERE course.CRN = enrole.CRN AND UID=" + inUID + ";");
            rs = pst.executeQuery();

            while(rs.next()){
                courseT += rs.getString(1);
                courseT += "     ";
                courseT += rs.getString(2);
                courseT += " \n";
            }
            return courseT;
        }
        catch (SQLException ex){
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    return courseT;
}

public static void CreateUser(int inUID, String inFName, String inLName, String inUname, String inPWord, int inUtype){
        String url = "jdbc:mysql://localhost:3306/ccat";
        String user = "ccat2012";
        String password = "password";
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("INSERT INTO USERS VALUES (" + inUID + ", '" + inFName + "', '"+inLName+"', '"+inUname+"', '"+inPWord+"', " + inUtype + ");");          
            pst.execute();
        }
        catch (SQLException ex){
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }





}

public static int LogOn(String Col, String Uname, String PWord){
        int userT = -1;
        String url = "jdbc:mysql://localhost:3306/ccat";
        String user = "ccat2012";
        String password = "password";
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT " + Col + " FROM users WHERE UName = '"+ Uname + "' AND PWord = '" + PWord + "';");
            rs = pst.executeQuery();

            while(rs.next()){
                userT = rs.getInt(1);
            }
            return userT;
        }
        catch (SQLException ex){
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }  
       return userT;
    }

public static String User(String Col, String Uname, String PWord){
        String userT = "N/A";
        String url = "jdbc:mysql://localhost:3306/ccat";
        String user = "ccat2012";
        String password = "password";
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT " + Col + " FROM users WHERE UName = '"+ Uname + "' AND PWord = '" + PWord + "';");
            rs = pst.executeQuery();

            while(rs.next()){
                userT = rs.getString(1);
            }
            return userT;
        }
        catch (SQLException ex){
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
       return userT;
    }

public static String RunSearch(String inputArg){
        String result = "N/A";
        String url = "jdbc:mysql://localhost:3306/ccat";
        String user = "ccat2012";
        String password = "password";
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(inputArg);
            rs = pst.executeQuery();

            while(rs.next()){
                result = rs.getString(1);
            }
            return result;
        }
        catch (SQLException ex){
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
    
    return result;
}

public static void RunInsert(String inputArg){
        String result = "N/A";
        String url = "jdbc:mysql://localhost:3306/ccat";
        String user = "ccat2012";
        String password = "password";
        try{
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(inputArg);
            pst.execute();
        }
        catch (SQLException ex){
            Logger lgr = Logger.getLogger(Version.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        } finally{
            try {
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            } catch (SQLException ex){
                Logger lgr = Logger.getLogger(Version.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }
}

}

