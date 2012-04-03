package cpsc330_betterbanner;

/**
 *
 * @author Isaac Erickson
 */
public class SearchForm extends javax.swing.JFrame {
    
    String qry = "N/A";

    public SearchForm() {
        initComponents();
        
        choice1.add("ALL Departments");                 
        choice1.add("Accounting");                      //ACCT
        choice1.add("American Studies");                //AMST
        choice1.add("Anthropology");                    //ANTH
        choice1.add("Arabic");                          //ARAB
        choice1.add("Art History");                     //ARTH
        choice1.add("Bacherlor of Liberal Studies");    //BLST
        choice1.add("Bachelor of Profess'l Studies");   //BPST
        choice1.add("Biology");                         //BIOL
        choice1.add("Business Administration");         //BUAD        
        choice1.add("Chemistry");                       //CHEM
        choice1.add("Chinese");                         //CHIN
        choice1.add("Classics");                        //CLAS
        choice1.add("Classics, Phil & Religion");       //CPRD
        choice1.add("Communication");                   //COMM
        choice1.add("Computer Information Systems");    //CIST
        choice1.add("Computer Science");                //CPSC
        choice1.add("Dance");                           //DANC
        choice1.add("ED: Curriculum & Instruction");    //EDCI
        choice1.add("ED: Literacy Specialist");         //EDLS
        choice1.add("ED: Special Education");           //EDSE
        choice1.add("Economics");                       //ECON
        choice1.add("Education");                       //EDUC
        choice1.add("Educational Leadership");          //EDEL
        choice1.add("English");                         //ENGL
        choice1.add("Environmental Earth Science");     //EESC
        choice1.add("First-Year Seminar");              //FSEM
        choice1.add("French");                          //FREN
        choice1.add("Geographic Info Sciences");        //GISC
        choice1.add("Geography");                       //GEOG
        choice1.add("Geology");                         //GEOL
        choice1.add("German");                          //GERM
        choice1.add("Greek");                           //GREK
        choice1.add("Health Education");                //HEED
        choice1.add("Historic Preservation");           //HISP
        choice1.add("History");                         //HIST
        choice1.add("Honors");                          //HONR
        choice1.add("Instructional Design and Tech");   //INDT
        choice1.add("Interdisciplinary Studies");       //IDIS
        choice1.add("Italian");                         //ITAL
        choice1.add("Latin");                           //LATN
        choice1.add("Leadership");                      //LRSP
        choice1.add("Linguistics");                     //LING
        choice1.add("Management Information Systems");  //MMIS
        choice1.add("Master of Business Admin");        //MBUS
        choice1.add("Mathmatics");                      //MATH
        choice1.add("Military Science");                //MSCI
        choice1.add("Modern Foreign Language");         //MDFL
        choice1.add("Musice Education");                //MUED
        choice1.add("Music History and Literature");    //MUHL
        choice1.add("Music Performance");               //MUPR
        choice1.add("Music Theory");                    //MUTH
        choice1.add("Philosophy");                      //PHIL
        choice1.add("Physical Education");              //PHYD
        choice1.add("Physics");                         //PHYS
        choice1.add("Political Science");               //PSCI
        choice1.add("Psychology");                      //PSYC
        choice1.add("Religion");                        //RELG
        choice1.add("Sociology");                       //SOCG
        choice1.add("Spanish");                         //SPAN
        choice1.add("Studio Art");                      //ARTS
        choice1.add("Study Abroad Gen Ed Review");      //SAGE
        choice1.add("Teaching Eng as a Sec Lang");      //TESL
        choice1.add("Theatre");                         //THEA
        choice1.add("Women and Gender Studies");        //WGST


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jButton1.setText("(Search OK GO)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Department");

        jLabel4.setText("Attribute");

        jRadioButton1.setText("WI");

        jRadioButton2.setText("SI");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel5.setText("COURSE SEARCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                        .addComponent(jLabel1))
                    .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(7, 7, 7)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        boolean WI = jRadioButton1.isSelected();
        boolean SI = jRadioButton2.isSelected();

        qry = "SELECT course.CRN, course.name, course.Sec, course.Title, " +
                "course.POI ,course.CO, course.PRE, atr.atr, course.CR, " +
                "course.Instructor FROM course, atr, tslot WHERE "+
                "course.CRN = atr.CRN AND course.CRN = tslot.CRN";
        boolean and = false;

        if(!jTextField1.getText().isEmpty()){
            qry = qry + " AND course.CRN= " + jTextField1.getText();
        }
        if(!jTextField2.getText().isEmpty()){            
            qry = qry + " AND course.Title= '" + jTextField2.getText() + "'";
           
        }
        if(choice1.getSelectedIndex() != 0){
            qry = qry + " AND course.Name LIKE '" + this.departmentpick() + "%'";
        }



        if(jRadioButton1.isSelected()){
            qry = qry + " AND atr.atr = 'WI'";
        }
        if(jRadioButton2.isSelected()){
            qry = qry + " AND atr.atr = 'SI'";
        }

        qry += ";";


        if(Main.Start.getUType() == 2){
            Main.PROFFRONT.setDisplay(qry);
        }
        if(Main.Start.getUType() == 3){
            Main.ADMINFRONT.setDisplay(qry);
        }
        if(Main.Start.getUType() == 1){
            Main.STUDENTFRONT.setDisplay(qry);
        }

      

        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    public String GetQury(){
        return qry;
    }



    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables



private String departmentpick(){
        String selection = "None";        
        int x = choice1.getSelectedIndex();
        
        switch (x){
    
            case 0:;
            break;
            case 1:
                selection = "ACCT";
                break;
            case 2:
                selection = "AMST";
                break;
            case 3:
                selection = "ANTH";
                break;
            case 4:
                selection = "ARAB";
                break;
            case 5:
                selection = "ARTH";
                break;
            case 6:
                selection = "BLST";
                break;                                            
            case 7:
                selection = "BPST";
                break;
            case 8:
                selection = "BIOL";
                break;
            case 9:
                selection = "BUAD";
                break;
            case 10:
                selection = "CHEM";
                break;
            case 11:
                selection = "CHIN";
                break;
            case 12:
                selection = "CLAS";
                break;                
            case 13:
                selection = "CPRD";
                break;
            case 14:
                selection = "COMM";
                break;
            case 15:
                selection = "CIST";
                break;
            case 16:
                selection = "CPSC";
                break;
            case 17:
                selection = "DANC";
                break;
            case 18:
                selection = "EDCI";
                break;                  
            case 19:
                selection = "EDLS";
                break;
            case 20:
                selection = "EDSE";
                break;
            case 21:
                selection = "ECON";
                break;
            case 22:
                selection = "EDUC";
                break;
            case 23:
                selection = "EDEL";
                break;
            case 24:
                selection = "ENGL";
                break;                                
             case 25:
                selection = "EESC";
                break;
            case 26:
                selection = "FSEM";
                break;
            case 27:
                selection = "FREN";
                break;
            case 28:
                selection = "GISC";
                break;
            case 29:
                selection = "GEOG";
                break;
            case 30:
                selection = "GEOL";
                break;                 
            case 31:
                selection = "GERM";
                break;
            case 32:
                selection = "GREK";
                break;
            case 33:
                selection = "HEED";
                break;
            case 34:
                selection = "HISP";
                break;
            case 35:
                selection = "HIST";
                break;
            case 36:
                selection = "HONR";
                break;                 
             case 37:
                selection = "INDT";
                break;
            case 38:
                selection = "IDIS";
                break;
            case 39:
                selection = "ITAL";
                break;
            case 40:
                selection = "LATN";
                break;
            case 41:
                selection = "LRSP";
                break;
            case 42:
                selection = "LING";
                break;                 
            case 43:
                selection = "MMIS";
                break;
            case 44:
                selection = "MBUS";
                break;
            case 45:
                selection = "MATH";
                break;
            case 46:
                selection = "MSCI";
                break;
            case 47:
                selection = "MDFL";
                break;
            case 48:
                selection = "MUED";
                break; 
            case 49:
                selection = "MUHL";
                break;
            case 50:
                selection = "MUPR";
                break;
            case 51:
                selection = "MUTH";
                break;
            case 52:
                selection = "PHIL";
                break;
            case 53:
                selection = "PHYD";
                break;
            case 54:
                selection = "PHYS";
                break; 
            case 55:
                selection = "PSCI";
                break;
            case 56:
                selection = "PSYC";
                break;
            case 57:
                selection = "RELG";
                break;
            case 58:
                selection = "SOCG";
                break;
            case 59:
                selection = "SPAN";
                break;
            case 60:
                selection = "ARTS";
                break;                  
            case 61:
                selection = "SAGE";
                break;
            case 62:
                selection = "TESL";
                break;
            case 63:
                selection = "THEA";
                break;
            case 64:
                selection = "WGST";
                break;
                        
    }
    return selection;
}

}
