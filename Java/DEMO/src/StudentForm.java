import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
 

class StudentForm implements ActionListener{  

       // Creating the labels
        JLabel l1, l2, l3, l4, l5,l6,l7,l8;
  
        // Creating three text fields for student name, college mail ID  and for  Mobile No
        JTextField t1, t2, t3,t4,t5,t6;
  
        // Creating two JComboboxes for Branch and for Section
        JComboBox j1, j2;
  
        // Creating  two buttons
        JButton b1, b2;
        
        // Creating Frame
	JFrame f;

StudentForm(){  

 // Creating a new frame using JFrame
         f = new JFrame("Student Registration Form");
  
       
        // Naming the labels and setting
        // the bounds for the labels
        l1 = new JLabel("Student Name:");
        l1.setBounds(50, 100, 120, 30);
        l2 = new JLabel("College Email ID:");
        l2.setBounds(350,100 , 120, 30);
        l3 = new JLabel("Branch:");
        l3.setBounds(50, 150, 120, 30);
        l4 = new JLabel("Section:");
        l4.setBounds(350, 150, 120, 30);
        l5 = new JLabel("Mobile No:");
        l5.setBounds(50, 200, 120, 30);
        l6=new JLabel(" Maths Marks");
        l6.setBounds(350,200,120,30);
        l7=new JLabel(" Chemistry Marks");
        l7.setBounds(50,250,120,30);
        l8=new JLabel(" Physics Marks");
        l8.setBounds(350,250,120,30);

  
        // Creating the textfields and
        // setting the bounds for textfields
        t1 = new JTextField();
        t1.setBounds(180, 100, 130, 30);
        t2 = new JTextField();
        t2.setBounds(500, 100, 130, 30);
        t3 = new JTextField();
        t3.setBounds(180, 200, 130, 30);
        t4 = new JTextField();
        t4.setBounds(500, 200, 130, 30);
        t5 = new JTextField();
        t5.setBounds(180, 250, 130, 30);
        t6 = new JTextField();
        t6.setBounds(500, 250, 130, 30);
        // Creating two string arrays one for
        // braches and other for sections
        String s1[]
            = { "  ", "CSE", "ECE", "EEE",
                "CIVIL", "MEC", "Others" };
        String s2[]
            = { "  ", "Section-A", "Section-B",
                "Section-C", "Section-D",
                "Section-E" };
  
        // Creating two JComboBoxes for selecting branch and other for selecting the section
        // and setting the bounds
        j1 = new JComboBox(s1);
        j1.setBounds(150, 150, 130, 30);
        j2 = new JComboBox(s2);
        j2.setBounds(500, 150, 130, 30);
  
        // Creating one button for Saving and other button to close
        // and setting the bounds
        b1 = new JButton("Save");
        b1.setBounds(150, 300, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(420, 300, 70, 30);

  
  
//register listener  
b1.addActionListener(this);//passing current instance 
b2.addActionListener(this);//passing current instance   
  
//add components and set size, layout and visibility  

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(j1);
        f.add(j2);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setSize(900, 700);
        f.setVisible(true); 
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}


  
public void actionPerformed(ActionEvent ae){  
if(ae.getSource()==b1){
// Getting the text from text fields
                // and JComboboxes
                // and copying it to a strings
  
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = j1.getSelectedItem() + "";
                String s4 = j2.getSelectedItem() + "";
                String s5 = t3.getText();
                String s6=t4.getText();
                String s7=t5.getText();
                String s8=t6.getText();
                int per= (Integer.parseInt(s6)+Integer.parseInt(s7)+Integer.parseInt(s8))/3;
               
                try {
  
                        // Creating a file and writing the data into a Textfile.
                        FileWriter w = new FileWriter("data.txt", true);
  
                        w.write("Name: "+s1 + "\n");
                        w.write("College Email Id: "+s2 + "\n");
                        w.write("Branch: "+s3 + "\n");
                        w.write("Section: "+s4 + "\n");
                        w.write("Mobile No."+s5 + "\n");
                        w.write("Maths: "+s6+ "\n");
                        w.write("Chemistry: "+s7+ "\n");
                        w.write("Physics: "+s8+ "\n");
                        w.write("Percentage: "+per+"\n");
                        w.write("-------------------\n");
                        w.close();
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                
  
                // Shows a Pop up Message when
                // save button is clicked
                JOptionPane.showMessageDialog(f,"Successfully Saved"+ " The Details"+"\nTotal Percentage: "+per);

}
	 

if(ae.getSource()==b2){
	f.dispose();
}	


 
} 
 
public static void main(String args[]){  
new StudentForm();  

}  

}  