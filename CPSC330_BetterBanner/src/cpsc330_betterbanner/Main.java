/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cpsc330_betterbanner;

/**
 *
 * @author Isaac Erickson
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        int UID = -1;
        String FName;
        String LName;
        int UserLevel = -1;
        
        Start = new BBLO();
        
        UserLevel = Start.getUType();
        FName = Start.getFName();
        LName = Start.getLName();
        UID = Start.getUID();
            
        Start.setVisible(true);


    }
    public static RemoveTHISfromCOURSE selfrem;
    public static AddTHIStoCOURSE selfadd;
    public static DELETEObjectCATCH catcher;
    public static DELETEObject KILLSwitch;
    public static RemoveUSERfromCOURSE R2C;
    public static CreateCourse MCG;
    public static AddUSERtoCOURSE U2C;
    public static CreateUser MAKEUSER;
    public static BBLO Start;
    public static MainPage ADMINFRONT;
    public static MainPageProf PROFFRONT;
    public static MainPageStudent STUDENTFRONT;
    public static SearchFormUSER SEARCHUSER;
    public static SearchForm SearchCOURSE;
}
