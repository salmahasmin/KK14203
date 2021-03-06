//NAME : SALMAH BINTI ASMIN
//MATRIC NO. : BI19110102
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CourseGrade extends JFrame{

   JFrame f1 = new JFrame ("Course Grade System");
   JFrame f2 = new JFrame();
   double grade, png;
   String grading, status;
      
   JLabel lblcourse = new JLabel ("KK14203 : Object-Oriented Programming");
   JLabel lbl1 = new JLabel ("Enter your name");
   JLabel lbl2 = new JLabel ("Enter your matric no.");
   JLabel lbl3 = new JLabel ("Quizzes (20%)");
   JLabel lbl4 = new JLabel ("Assignments (10%)");   
   JLabel lbl5 = new JLabel ("Projects (20%)");
   JLabel lbl6 = new JLabel ("Participation (10%)");
   JLabel lbl7 = new JLabel ("Attendance (10%)");
   JLabel lbl8 = new JLabel ("Examination (30%)");
   JLabel lbl9 = new JLabel ("Universiti Malaysia Sabah");
   JLabel lbl10 = new JLabel ("Final Grade");
   JLabel lbl11 = new JLabel ("Preliminary");
   JLabel lbl12 = new JLabel ("Midterm");
   JLabel lbl13 = new JLabel ("Prefinal");
   JLabel lbl14 = new JLabel ("Final");
   JLabel lbl15 = new JLabel ("FINAL GRADE");
   JLabel lbl16 = new JLabel ("GRADE POINT");
   JLabel lbl17 = new JLabel ("GRADE");
   JLabel lbl18 = new JLabel ("STUDENT STATUS");

   JTextField txt1 = new JTextField (15);
   JTextField txt2 = new JTextField (15); 
   JTextField txt3 = new JTextField (2);
   JTextField txt4 = new JTextField (2);
   JTextField txt5 = new JTextField (2); 
   JTextField txt6 = new JTextField (2); 
   JTextField finalgrade = new JTextField (5); 
   JTextField finalrating = new JTextField (5);
   JTextField finalgrading = new JTextField (5);
   JTextField finalstatus = new JTextField (10);
   
   String output1 = "";
   String output2 = "";
   String output3 = "";
   String output4 = "";
   String output5 = ""; 
   String output6 = "";
   
   JButton btn1 = new JButton ("OK");
   JButton btn2 = new JButton ("Cancel");
   JButton btn3 = new JButton ("Compute");
   JButton btn4 = new JButton ("Compute");
   JButton btn5 = new JButton ("Compute");
   JButton btn6 = new JButton ("Compute");
   JButton jcompute = new JButton ("Compute All");
   JButton jclear = new JButton ("Clear All");
   JButton jexit = new JButton ("Exit");
   JButton finalbutton = new JButton ("OK");
   JButton finalprint = new JButton ("Print");

   //preliminary
   JComboBox cb1 = new JComboBox();
   JComboBox cb2 = new JComboBox();
   JComboBox cb3 = new JComboBox();
   JComboBox cb4 = new JComboBox();
   JComboBox cb5 = new JComboBox();
   JComboBox cb6 = new JComboBox();
   //midterm
   JComboBox cb7 = new JComboBox();
   JComboBox cb8 = new JComboBox();
   JComboBox cb9 = new JComboBox();
   JComboBox cb10 = new JComboBox();
   JComboBox cb11 = new JComboBox();
   JComboBox cb12 = new JComboBox();
   //prefinal
   JComboBox cb13 = new JComboBox();
   JComboBox cb14 = new JComboBox();
   JComboBox cb15 = new JComboBox();
   JComboBox cb16 = new JComboBox();
   JComboBox cb17 = new JComboBox();
   JComboBox cb18 = new JComboBox();
   //finals
   JComboBox cb19 = new JComboBox();
   JComboBox cb20 = new JComboBox();
   JComboBox cb21 = new JComboBox();
   JComboBox cb22 = new JComboBox();
   JComboBox cb23 = new JComboBox();
   JComboBox cb24 = new JComboBox();

   public CourseGrade(){
      f1.getContentPane().setLayout(null);
      f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setSize (500,300);
      f1.setResizable(false);
      f1.getContentPane().add(lbl9);
      f1.getContentPane().add(lblcourse);
      f1.getContentPane().add(lbl1);
      f1.getContentPane().add(lbl2);
      f1.getContentPane().add(txt1);
      f1.getContentPane().add(txt2);
      f1.getContentPane().add(btn1);
      f1.getContentPane().add(btn2);
      lbl9.setBounds(150,20,230,20);
      lblcourse.setBounds(110,25,300,50);
      lbl1.setBounds(30,70,100,75);
      lbl2.setBounds(30,120,170,75);
      txt1.setBounds(180,90,200,30);
      txt2.setBounds(180,140,150,30);
      btn1.setBounds(50,200,100,40);
      btn2.setBounds(300,200,100,40);
      
      btn1.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
            String x, y;
            x = txt1.getText();
            y = txt2.getText();
            
            if(x.isEmpty() || y.isEmpty()){
               JOptionPane.showMessageDialog(null, " Please enter your name/matric no. ");
            }else{
               f2.setTitle(x + "'s Grading");
               f2.getContentPane().setLayout(null);
               f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               f2.setSize (850,600);
               f2.setResizable(false);
      
               f1.hide(); 
               f2.show();  
      
               f2.getContentPane().add(lbl3);
               f2.getContentPane().add(lbl4);
               f2.getContentPane().add(lbl5);
               f2.getContentPane().add(lbl6);
               f2.getContentPane().add(lbl7);
               f2.getContentPane().add(lbl8);
               f2.getContentPane().add(lbl9);
               f2.getContentPane().add(lbl10);
               f2.getContentPane().add(lbl11);
               f2.getContentPane().add(lbl12);
               f2.getContentPane().add(lbl13);
               f2.getContentPane().add(lbl14);
               f2.getContentPane().add(lblcourse);
               f2.getContentPane().add(jcompute);
               f2.getContentPane().add(jclear);
               f2.getContentPane().add(jexit);
      
               lbl3.setBounds(30,120,110,70);
               lbl4.setBounds(30,170,110,70);
               lbl5.setBounds(30,220,90,70);
               lbl6.setBounds(30,270,120,70);
               lbl7.setBounds(30,320,100,70);
               lbl8.setBounds(30,370,110,70);
               lbl9.setBounds(280,20,230,20);
               lbl10.setBounds(30,420,80,70);
               lbl11.setBounds(185,60,100,100);
               lbl12.setBounds(315,60,100,100);
               lbl13.setBounds(440,60,100,100);
               lbl14.setBounds(575,60,100,100);
               lblcourse.setBounds(240,25,300,50);
               jcompute.setBounds(660,160,120, 60);
               jclear.setBounds(660,260,120, 60);
               jexit.setBounds(660,360,120,60);
                              
               //PRELIMINARY
               f2.getContentPane().add(cb1); 
               f2.getContentPane().add(cb2);
               f2.getContentPane().add(cb3);
               f2.getContentPane().add(cb4);
               f2.getContentPane().add(cb5);
               f2.getContentPane().add(cb6);
               f2.getContentPane().add(btn3);
               f2.getContentPane().add(txt3); 
               txt3.setEditable(false);
               cb1.setBounds(190,140,50,30);
               cb2.setBounds(190,190,50,30);
               cb3.setBounds(190,240,50,30);
               cb4.setBounds(190,290,50,30);
               cb5.setBounds(190,340,50,30);
               cb6.setBounds(190,390,50,30);
               btn3.setBounds(170,490,95,40);
               txt3.setBounds(190,440,55,35);
      
               int addPrelim1 = 10;
               for (int i = 0; i <= addPrelim1; i++) {
                  cb2.addItem(new Integer(i));        
                  cb4.addItem(new Integer(i));
                  cb5.addItem(new Integer(i));
               }
      
               int addPrelim2 = 20;
               for (int i = 0; i <= addPrelim2; i++) {
                  cb1.addItem(new Integer(i));        
                  cb3.addItem(new Integer(i));
      
               }   
      
               int addPrelim3 = 30;
               for (int i = 0; i <= addPrelim3; i++) {
                  cb6.addItem(new Integer(i));
               }
      
               //MIDTERM
               f2.getContentPane().add(cb7); 
               f2.getContentPane().add(cb8);
               f2.getContentPane().add(cb9);
               f2.getContentPane().add(cb10);
               f2.getContentPane().add(cb11);
               f2.getContentPane().add(cb12);              
               f2.getContentPane().add(btn4);
               f2.getContentPane().add(txt4); 
               txt4.setEditable(false);
               cb7.setBounds(315,140,50,30);
               cb8.setBounds(315,190,50,30);
               cb9.setBounds(315,240,50,30);
               cb10.setBounds(315,290,50,30);
               cb11.setBounds(315,340,50,30);
               cb12.setBounds(315,390,50,30);
               btn4.setBounds(295,490,95,40);
               txt4.setBounds(315,440,55,35);
      
               int addMidterm1 = 10;
               for (int i = 0; i <= addMidterm1; i++) {
                  cb8.addItem(new Integer(i));        
                  cb10.addItem(new Integer(i));
                  cb11.addItem(new Integer(i));
               }
      
               int addMidterm2 = 20;
               for (int i = 0; i <= addMidterm2; i++) {
                  cb7.addItem(new Integer(i));        
                  cb9.addItem(new Integer(i));
               }   
      
               int addMidterm3 = 30;
               for (int i = 0; i <= addMidterm3; i++) {
                  cb12.addItem(new Integer(i));
               }
      
               //PREFINAL
               f2.getContentPane().add(cb13); 
               f2.getContentPane().add(cb14);
               f2.getContentPane().add(cb15);
               f2.getContentPane().add(cb16);
               f2.getContentPane().add(cb17);
               f2.getContentPane().add(cb18);
               f2.getContentPane().add(btn5);
               f2.getContentPane().add(txt5); 
               txt5.setEditable(false);
               cb13.setBounds(440,140,50,30);
               cb14.setBounds(440,190,50,30);
               cb15.setBounds(440,240,50,30);
               cb16.setBounds(440,290,50,30);
               cb17.setBounds(440,340,50,30);
               cb18.setBounds(440,390,50,30);
               btn5.setBounds(420,490,95,40);
               txt5.setBounds(440,440,55,35);
      
               int addPrefinal1 = 10;
               for (int i = 0; i <= addPrefinal1; i++) {
                  cb14.addItem(new Integer(i));       
                  cb16.addItem(new Integer(i));
                  cb17.addItem(new Integer(i));
               }
      
               int addPrefinal2 = 20;
               for (int i = 0; i <= addPrefinal2; i++) {
                  cb13.addItem(new Integer(i));       
                  cb15.addItem(new Integer(i));
               }   
      
               int addPrefinal3 = 30;
               for (int i = 0; i <= addPrefinal3; i++) {
                  cb18.addItem(new Integer(i));
               }
      
      
               //FINALS
               f2.getContentPane().add(cb19); 
               f2.getContentPane().add(cb20);
               f2.getContentPane().add(cb21);
               f2.getContentPane().add(cb22);
               f2.getContentPane().add(cb23);
               f2.getContentPane().add(cb24);
               f2.getContentPane().add(btn6);
               f2.getContentPane().add(txt6); 
               txt6.setEditable(false);
               cb19.setBounds(565,140,50,30);
               cb20.setBounds(565,190,50,30);
               cb21.setBounds(565,240,50,30);
               cb22.setBounds(565,290,50,30);
               cb23.setBounds(565,340,50,30);
               cb24.setBounds(565,390,50,30);
               btn6.setBounds(545,490,95,40);
               txt6.setBounds(565,440,55,35);
      
               int addFinal1 = 10;
               for (int i = 0; i <= addFinal1; i++) {
                 cb20.addItem(new Integer(i));       
                 cb22.addItem(new Integer(i));
                 cb23.addItem(new Integer(i));
               }
      
               int addFinal2 = 20;
               for (int i = 0; i <= addFinal2; i++) {
                  cb19.addItem(new Integer(i));       
                  cb21.addItem(new Integer(i));
               }   
      
               int addFinal3 = 30;
               for (int i = 0; i <= addFinal3; i++) {
                  cb24.addItem(new Integer(i));
               }
           }                            
         }
      });
      
      //FOR 'CANCEL' BUTTON
      btn2.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
            System.exit(0);
         }
      });
      
      //TO COMPUTE PRELIMINARY MARKS
      btn3.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
   
            int cb1Int = Integer.parseInt(cb1.getSelectedItem().toString());
            int cb2Int = Integer.parseInt(cb2.getSelectedItem().toString());
            int cb3Int = Integer.parseInt(cb3.getSelectedItem().toString());
            int cb4Int = Integer.parseInt(cb4.getSelectedItem().toString());
            int cb5Int = Integer.parseInt(cb5.getSelectedItem().toString());
            int cb6Int = Integer.parseInt(cb6.getSelectedItem().toString());
   
            txt3.setText(String.valueOf(cb1Int + cb2Int + cb3Int + cb4Int + cb5Int + cb6Int));
         }
      });
      
      //TO COMPUTE MIDTERM MARKS
      btn4.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
   
            int cb7Int = Integer.parseInt(cb7.getSelectedItem().toString());
            int cb8Int = Integer.parseInt(cb8.getSelectedItem().toString());
            int cb9Int = Integer.parseInt(cb9.getSelectedItem().toString());
            int cb10Int = Integer.parseInt(cb10.getSelectedItem().toString());
            int cb11Int = Integer.parseInt(cb11.getSelectedItem().toString());
            int cb12Int = Integer.parseInt(cb12.getSelectedItem().toString());
   
            txt4.setText(String.valueOf(cb7Int + cb8Int + cb9Int + cb10Int + cb11Int + cb12Int));
         }
      });
   
      //TO COMPUTE PREFINAL MARKS
      btn5.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
   
            int cb13Int = Integer.parseInt(cb13.getSelectedItem().toString());
            int cb14Int = Integer.parseInt(cb14.getSelectedItem().toString());
            int cb15Int = Integer.parseInt(cb15.getSelectedItem().toString());
            int cb16Int = Integer.parseInt(cb16.getSelectedItem().toString());
            int cb17Int = Integer.parseInt(cb17.getSelectedItem().toString());
            int cb18Int = Integer.parseInt(cb18.getSelectedItem().toString());
   
            txt5.setText(String.valueOf(cb13Int + cb14Int + cb15Int + cb16Int + cb17Int + cb18Int));
         }
      });
   
   
      //TO COMPUTE FINAL MARKS
      btn6.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
   
            int cb19Int = Integer.parseInt(cb19.getSelectedItem().toString());
            int cb20Int = Integer.parseInt(cb20.getSelectedItem().toString());
            int cb21Int = Integer.parseInt(cb21.getSelectedItem().toString());
            int cb22Int = Integer.parseInt(cb22.getSelectedItem().toString());
            int cb23Int = Integer.parseInt(cb23.getSelectedItem().toString());
            int cb24Int = Integer.parseInt(cb24.getSelectedItem().toString());
   
            txt6.setText(String.valueOf(cb19Int + cb20Int + cb21Int + cb22Int + cb23Int + cb24Int));
         }
      });
      
      //TO CALCULATE FINAL GRADE, DETERMINE THE GRADE POINT AND STATUS
      jcompute.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
   
            String prelim, midterm, prefinal, finals, total;
            double a, b, c, d, totalgrade;
   
            prelim = txt3.getText();
            midterm = txt4.getText();
            prefinal = txt5.getText();
            finals = txt6.getText();
   
            a = Double.parseDouble(prelim);
            b = Double.parseDouble(midterm);
            c = Double.parseDouble(prefinal);
            d = Double.parseDouble(finals);
   
            totalgrade = (a + b + c + d)/4;                         
            total = Double.toString(totalgrade);
            finalgrade.setText(total);
   
            JFrame f3 = new JFrame ("Student Final Grading");
   
            f3.getContentPane().setLayout(null);
            f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f3.setSize (350,400);
            f3.setResizable(false);
   
            f2.hide();
            f3.show();
            
            f3.getContentPane().add(lbl9);
            f3.getContentPane().add(lblcourse);
            f3.getContentPane().add(lbl15);
            f3.getContentPane().add(lbl16);
            f3.getContentPane().add(lbl17);
            f3.getContentPane().add(lbl18);
            f3.getContentPane().add(finalgrade);
            finalgrade.setEditable(false);
            f3.getContentPane().add(finalrating);
            finalrating.setEditable(false);
            f3.getContentPane().add(finalgrading);
            finalgrading.setEditable(false);
            f3.getContentPane().add(finalstatus);
            finalstatus.setEditable(false);
            f3.getContentPane().add(finalbutton);
            f3.getContentPane().add(finalprint);
            
            lbl9.setBounds(95,20,230,20);
            lblcourse.setBounds(55,25,300,50);
            lbl15.setBounds(90,80,150,30);
            lbl16.setBounds(90,115,150,30);
            lbl17.setBounds(145,160,50,30);
            lbl18.setBounds(30,240,150,30);
            finalgrade.setBounds(175,80,50,30);
            finalrating.setBounds(175,115,50,30);
            finalgrading.setBounds(140,190,50,30);
            finalstatus.setBounds(140,240,150,30);
            finalbutton.setBounds(70,310,70,30);
            finalprint.setBounds(180,310,70,30);
                           
            //GRADE POINT, GRADE AND STATUS
            grade = Double.parseDouble(finalgrade.getText());
            
            if(grade<101 && grade>=80.00){
               png = 4.00;
               grading = "A";
               status = "Pass with Distinction";
            }else if(grade<80.00 && grade>=75.00){
               png = 3.67;
               grading = "A-";
               status = "Pass with Distinction";
            }else if(grade<75.00 && grade>=70.00){
               png = 3.33;
               grading = "B+";
               status = "Pass with Credit";
            }else if(grade<70.00 && grade>=65.00){
               png = 3.00;
               grading = "B";
               status = "Pass with Credit";
            }else if(grade<65.00 && grade>=60.00){
               png = 2.67;
               grading = "B-";
               status = "Pass with Credit";
            }else if(grade<60.00 && grade>=55.00){
               png = 2.33;
               grading = "C+";
               status = "Pass";
            }else if(grade<55.0 && grade>=50.00){
               png = 2.00;
               grading = "C";
               status = "Pass";
            }else if(grade<50.00 && grade>=45.00){
               png = 1.67;
               grading = "C-";
               status = "Pass";
            }else if(grade<44.00 && grade>=40.00){
               png = 1.33;
               grading = "D+";
               status = "Pass";
            }else if(grade<40.00 && grade>=35.00){
               png = 1.00;
               grading = "D";
               status = "Pass";
            }else{
               png = 0.00;
               grading = "E";
               status = "Fail";
            }
   
            finalrating.setText("" + png);
            finalrating.setEditable(false);
            finalgrading.setText(grading);
            finalgrading.setEditable(false);
            finalstatus.setText(status);
            finalstatus.setEditable(false);
         }
      });
      
      finalbutton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "" + png);
   
            if (png  >=1.50 && png <=4.0) JOptionPane.showMessageDialog(null, " STUDENT PASSED ");
            else if (png >=0.0 && png <=1.49) JOptionPane.showMessageDialog(null, " STUDENT FAILED ");
         }
      });        
      
      finalprint.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(rootPane, "File Saved as 'Course Grade.txt' in Dekstop");
         String finalname, finalmatric, printfinal, printrating, printgrading, printstatus;

         finalname = txt1.getText();
         finalmatric = txt2.getText();
         printfinal = finalgrade.getText();
         printrating = finalrating.getText();
         printgrading = finalgrading.getText();
         printstatus = finalstatus.getText();
         
         output1 = "Name           : " + finalname + System.lineSeparator();   
         output2 = "Matric No.     : " + finalmatric + System.lineSeparator();
         output3 = "Final Grade    : " + printfinal + System.lineSeparator();
         output4 = "Grade Point    : " + printrating + System.lineSeparator();
         output5 = "Grade          : " + printgrading + System.lineSeparator();
         output6 = "Student Status : " + printstatus + System.lineSeparator();
         
         if(e.getSource() == finalprint){
           try {
               PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\USER\\Desktop\\Course Grade.txt"));
               
               out.write(output1);
               out.write(output2);
               out.write(output3);
               out.write(output4);
               out.write(output5);
               out.write(output6);
               out.flush();
               out.close();
               
            } catch (IOException e1) {
               System.err.println("Error occurred");
               e1.printStackTrace();
               }
            }
         }
      });
      
      jclear.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
            cb1.setSelectedItem(Integer.valueOf(0));
            cb2.setSelectedItem(Integer.valueOf(0));
            cb3.setSelectedItem(Integer.valueOf(0));
            cb4.setSelectedItem(Integer.valueOf(0));
            cb5.setSelectedItem(Integer.valueOf(0));
            cb6.setSelectedItem(Integer.valueOf(0));
            cb7.setSelectedItem(Integer.valueOf(0));
            cb8.setSelectedItem(Integer.valueOf(0));
            cb9.setSelectedItem(Integer.valueOf(0));
            cb10.setSelectedItem(Integer.valueOf(0));
            cb11.setSelectedItem(Integer.valueOf(0));
            cb12.setSelectedItem(Integer.valueOf(0));
            cb13.setSelectedItem(Integer.valueOf(0));
            cb14.setSelectedItem(Integer.valueOf(0));
            cb15.setSelectedItem(Integer.valueOf(0));
            cb16.setSelectedItem(Integer.valueOf(0));
            cb17.setSelectedItem(Integer.valueOf(0));
            cb18.setSelectedItem(Integer.valueOf(0));
            cb19.setSelectedItem(Integer.valueOf(0));
            cb20.setSelectedItem(Integer.valueOf(0));
            cb21.setSelectedItem(Integer.valueOf(0));
            cb22.setSelectedItem(Integer.valueOf(0));
            cb23.setSelectedItem(Integer.valueOf(0));
            cb24.setSelectedItem(Integer.valueOf(0));
   
            txt3.setText(" ");
            txt4.setText(" ");
            txt5.setText(" ");
            txt6.setText(" ");          
   
         }
      });
   
      jexit.addActionListener(new ActionListener(){
         public void actionPerformed (ActionEvent e){
            System.exit(0);
         }
      });
   
      f1.show();
   }
   
   public static void main (String args []){
      CourseGrade xx = new CourseGrade(); 
   }
}