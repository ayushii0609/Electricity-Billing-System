
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project extends JFrame{
    
    Project() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/e2.jpg"));
        Image i2=i1.getImage().getScaledInstance(1500,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JMenuBar mb=new JMenuBar(); 
        setJMenuBar(mb);
        
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        mb.add(master);
        
        
        JMenuItem newCustomer = new JMenuItem("New Customer");
        newCustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newCustomer.setBackground(Color.WHITE);
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1=icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newCustomer.setIcon(new ImageIcon(image1));
        newCustomer.setMnemonic('N');
        newCustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        master.add(newCustomer);
        
        JMenuItem customerDetails = new JMenuItem("Customer Details");
        customerDetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        customerDetails.setBackground(Color.WHITE);
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2=icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerDetails.setIcon(new ImageIcon(image2));
        customerDetails.setMnemonic('D');
        customerDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        master.add(customerDetails);
        
        JMenuItem depositDetails = new JMenuItem("Deposit Details");
        depositDetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        depositDetails.setBackground(Color.WHITE);
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3=icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositDetails.setIcon(new ImageIcon(image3));
        depositDetails.setMnemonic('P');
        depositDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        master.add(depositDetails);
        
        JMenuItem calculateBill = new JMenuItem("Calculate Bill");
        calculateBill.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculateBill.setBackground(Color.WHITE);
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculateBill.setIcon(new ImageIcon(image4));
        calculateBill.setMnemonic('B');
        calculateBill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        master.add(calculateBill);
        
        
        JMenu info = new JMenu("Information");
        info.setForeground(Color.RED);
        mb.add(info);
        
        
        JMenuItem updateInformation = new JMenuItem("Update Information");
        updateInformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        updateInformation.setBackground(Color.WHITE);
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5=icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateInformation.setIcon(new ImageIcon(image5));
        updateInformation.setMnemonic('I');
        updateInformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        info.add(updateInformation);
        
        JMenuItem viewInformation = new JMenuItem("View Information");
        viewInformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        viewInformation.setBackground(Color.WHITE);
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6=icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewInformation.setIcon(new ImageIcon(image6));
        viewInformation.setMnemonic('V');
        viewInformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        info.add(viewInformation);
        
        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        mb.add(user);
        
        JMenuItem payBill = new JMenuItem("Pay Bill");
        payBill.setFont(new Font("monospaced", Font.PLAIN, 12));
        payBill.setBackground(Color.WHITE);
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image7=icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        payBill.setIcon(new ImageIcon(image7));
        payBill.setMnemonic('R');
        payBill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        user.add(payBill);
        
        JMenuItem billDetails = new JMenuItem("Bill Details");
        billDetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        billDetails.setBackground(Color.WHITE);
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image8=icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billDetails.setIcon(new ImageIcon(image8));
        billDetails.setMnemonic('M');
        billDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        user.add(billDetails);
        
        JMenu report = new JMenu("Report");
        report.setForeground(Color.RED);
        mb.add(report);
        
        JMenuItem generateBill = new JMenuItem("Generate Bill");
        generateBill.setFont(new Font("monospaced", Font.PLAIN, 12));
        generateBill.setBackground(Color.WHITE);
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image9=icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        generateBill.setIcon(new ImageIcon(image9));
        generateBill.setMnemonic('G');
        generateBill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        report.add(generateBill);
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced", Font.PLAIN, 12));
        notepad.setBackground(Color.WHITE);
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image10=icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('N');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        utility.add(notepad);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculator.setBackground(Color.WHITE);
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image11=icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('C');
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        JMenu mexit = new JMenu("Exit");
        mexit.setForeground(Color.RED);
        mb.add(mexit);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(new Font("monospaced", Font.PLAIN, 12));
        exit.setBackground(Color.WHITE);
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image12=icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('W');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        mexit.add(exit);
        
        setLayout(new FlowLayout());
        
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Project();
    }
}
