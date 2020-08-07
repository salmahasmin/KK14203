//NAME : SALMAH BINTI ASMIN
//MATRIC NO. : BI19110102
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.DecimalFormat;

class CakePanel extends JPanel implements ActionListener, ItemListener{
   DecimalFormat df = new DecimalFormat("0.00");
   JLabel line;
   JLabel menu;
   JLabel line2;
   JLabel toppings;
   JLabel topping;
   JLabel topping1;
   JLabel topping2;
   JLabel price;
   JLabel small;
   JLabel medium;
   JLabel big;
   JLabel details;
   JLabel line3;
   JLabel orderToppings;
   JLabel size;  
   JRadioButton sizeSmall;
   JRadioButton sizeMed;
   JRadioButton sizeBig;
   JLabel line4;
   JLabel total;
   JLabel line5;
   JButton submit;
   JButton clear;
   JLabel lbl_output; 
   JScrollPane jsp;
   JCheckBox toppingChoco;
   JCheckBox toppingCherrie;
   JCheckBox toppingCream;
   JLabel quantity;
   JTextField user_quantity;
   Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

   //list of global variables  
   String output="";
   String list_selection="";
   String list_selection1="";
   String list_selection2="";
   String rb_selection="";
   String filePath="data.txt";
   int allToppings, sum;
   int quantities;
   
   public CakePanel(){        
      
      line = new JLabel ("-------------------------------------------------------------------------------------------");
      menu = new JLabel ("Cake Menu");
      line2 = new JLabel ("-------------------------------------------------------------------------------------------");
      toppings = new JLabel ("BlackForest with available toppings:");
      topping = new JLabel ("1) Chocolate");
      topping1 = new JLabel ("2) Cherries");
      topping2 = new JLabel ("3) Whipped Cream");
      price = new JLabel ("Price:");
      small = new JLabel ("[1] Small     : RM45.00");
      medium = new JLabel ("[2] Medium : RM65.00");
      big = new JLabel ("[3] Big          : RM80.00");
      details = new JLabel ("Cake Order Details:");
      line3 = new JLabel ("-------------------------------------------------------------------------------------------");
      orderToppings = new JLabel ("Topping :");
      
      setPreferredSize (new Dimension (415, 700));
      setLayout (null);

      add (line);
      add (menu);
      add (line2);
      add (toppings);
      add (topping);
      add (topping1);
      add (topping2);
      add (price);
      add (small);
      add (medium);
      add (big);
      add (details);
      add (line3);
      add (orderToppings);
        
      line.setBounds (20, 15, 400, 25);
      menu.setBounds (160, 35, 300, 25);
      line2.setBounds (20, 55, 400, 25);
      toppings.setBounds (20, 75, 230, 25);
      topping.setBounds (20, 95, 100, 25);
      topping1.setBounds (20, 115, 100, 25);
      topping2.setBounds (20, 135, 120, 25);
      price.setBounds (20, 170, 100, 25);
      small.setBounds (20, 190, 130, 25);
      medium.setBounds (20, 210, 130, 25);
      big.setBounds (20, 230, 130, 25);
      details.setBounds (20, 275, 130, 25);
      line3.setBounds (20, 290, 400, 25);
      orderToppings.setBounds (20, 310, 100, 25);

      toppingChoco = new JCheckBox("Chocolate");
      toppingChoco.setBounds (75, 310, 100, 25);
      toppingChoco.addItemListener(this);
      toppingCherrie = new JCheckBox("Cherries");
      toppingCherrie.setBounds (175, 310, 90, 25);
      toppingCherrie.addItemListener(this);
      toppingCream = new JCheckBox("Whipped Cream");
      toppingCream.setBounds (265, 310, 140, 25);
      toppingCream.addItemListener(this);

      add(toppingChoco);
      add(toppingCherrie);
      add(toppingCream);
      
      size = new JLabel ("Size        :");
      size.setBounds (20, 335, 100, 25);
      add(size);
      sizeSmall = new JRadioButton("Small");
      sizeSmall.setBounds (75, 335, 100, 25);
      sizeSmall.addActionListener(this);
      add(sizeSmall);
      sizeMed = new JRadioButton("Medium");
      sizeMed.setBounds (175, 335, 90, 25);
      sizeMed.addActionListener(this);
      add(sizeMed);
      sizeBig = new JRadioButton("Big");
      sizeBig.setBounds (265, 335, 50, 25);
      sizeBig.addActionListener(this);
      add(sizeBig);
      
      ButtonGroup bg = new ButtonGroup();
      bg.add(sizeSmall);
      bg.add(sizeMed);
      bg.add(sizeBig);
      
      quantity = new JLabel("Quantity: ");
      quantity.setBounds(20,362,100,25);
      add(quantity);
      user_quantity = new JTextField(20);
      user_quantity.setBounds(75,362,100,25); 
      add(user_quantity);
      
      submit = new JButton ("Submit");
      submit.setBounds (20, 395, 100, 25);
      add(submit);
      
      clear = new JButton("Clear");
      clear.setBounds (130, 395, 100, 25);
      add(clear);
      
      line4 = new JLabel ("-------------------------------------------------------------------------------------------");
      line4.setBounds (20, 420, 400, 25);
      add(line4);
      
      total = new JLabel ("Total Price :");
      total.setBounds (20, 435, 200, 25);
      add(total);
          
      line5 = new JLabel ("-------------------------------------------------------------------------------------------");
      line5.setBounds (20, 450, 400, 25);
      add(line5);
      
      //handle button submit action listener
      //view the input to output label
      //and write to file
      submit.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){                
             if(printOutput())
                writeInput(); 
                quantity.setText("Quantity: ");
                total.setText("Total Price : RM"+df.format(sum));   
          }  
       });
      
      clear.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
             lbl_output.setText("Output"); 
             bg.clearSelection();
             toppingChoco.setSelected(false);
             toppingCherrie.setSelected(false);
             toppingCream.setSelected(false);
             user_quantity.setText(" ");
             quantity.setText("Quantity: ");
             total.setText("Total Price : RM"); 
          }  
        });
            
      lbl_output = new JLabel("Output");
      lbl_output.setBounds (20, 480, 380, 25);
      lbl_output.setBorder(border);
      lbl_output.setVerticalAlignment(JLabel.TOP);
      
      jsp = new JScrollPane(lbl_output);
      jsp.setBounds (20, 480, 370, 200);
      add(jsp);   
}

   public void actionPerformed(ActionEvent ae) {
      rb_selection = ae.getActionCommand();    	   
   }
   
   public void itemStateChanged(ItemEvent ie) {
      JCheckBox check = (JCheckBox)ie.getSource();
      list_selection += check.getText() + " ";   
   }

    public boolean printOutput(){
      output = "<html>";
      output += "Thank you for your order.<br><br>";   
      output += "Your Order Details: <br>";
      output += "------------------------------------------------------------------ <br>";
      output += "Topping : " + list_selection + "<br>";
      quantities = Integer.parseInt(user_quantity.getText());
      if(toppingChoco.isSelected()){
      allToppings += 10;
      }if(toppingCherrie.isSelected()){
      allToppings += 10;
      }if(toppingCream.isSelected()){
      allToppings += 10;
      }
      
      if(sizeSmall.isSelected()){
         sum = (allToppings + 45) * quantities;
      }else if(sizeMed.isSelected()){
         sum = (allToppings + 65) * quantities;
      }else if(sizeBig.isSelected()){
         sum = (allToppings + 80) * quantities;
      }
      
      output += "Size : " + rb_selection + "<br>";
      output += "Quantity : "+ quantities + "<br>";
      output += "Total : RM" + df.format(sum) + "<br>";
      output += "</html>";          
      lbl_output.setText(output);
      jsp.getViewport().revalidate();
      return true;
    }
    
    public void writeInput(){
      File file = new File(filePath);
		FileWriter fr = null;
		BufferedWriter br = null;
		PrintWriter pr = null;
       
      String input = rb_selection + ", " + list_selection + ","  +  user_quantity.getText() +", RM" + df.format(sum);
       
		try {
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);
			pr = new PrintWriter(br);
			pr.println(input);
		} catch (IOException e) {			
         lbl_output.setText(e.toString());
		} finally {
			try {
				pr.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				lbl_output.setText(e.toString());
			}
		}
    }
}

class MenuActionListener implements ActionListener {
   CakePanel fp;
   public MenuActionListener(CakePanel p){
      fp = p;
   }
    public void actionPerformed(ActionEvent e) {
       BufferedReader reader;
 	   try {
 			reader = new BufferedReader(new FileReader(fp.filePath));
 			String line = reader.readLine();
          String output="<html>";
 			while (line != null) {
 				output += line + "<br>";
 				line = reader.readLine();
 			}
          output += "<br>";
          fp.lbl_output.setText(output);
 			reader.close();
 		} catch (IOException io) {
 			fp.lbl_output.setText(io.toString());
 		}
 
   }
 }

//to run the cake app
public class CakeAppSystem {  
   public static void main(String[] 	args) {  
      JFrame f = new JFrame("Cake Order System");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      CakePanel fp = new CakePanel();
      
      JMenuBar mb = new JMenuBar(); 
      JMenu x = new JMenu("Menu"); 
      
      //to create the contents in menu
      JMenuItem m1 = new JMenuItem("View Previous Data"); 
      m1.addActionListener(new MenuActionListener(fp));
      JMenuItem m2 = new JMenuItem("Exit");  
      m2.addActionListener((event) -> System.exit(0));
      
      x.add(m1); 
      x.add(m2);
      mb.add(x); 

      f.setJMenuBar(mb);  
      f.setResizable(false);     
      f.add(fp);
      f.pack();
      f.setVisible(true);
   }  
}