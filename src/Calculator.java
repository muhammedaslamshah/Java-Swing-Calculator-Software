import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Calculator
 */
public class Calculator {

    public Calculator(){
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(400, 600);


        // Location
        jf.setLocation(300, 150);


        // Display
        JLabel displayJLabel=new JLabel("hello ");
        displayJLabel.setBounds(30, 30, 328, 70);
        displayJLabel.setBackground(Color.gray);
        displayJLabel.setForeground(Color.white);
        
        displayJLabel.setOpaque(true);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayJLabel);
        

        // Buttons 1st Row
        // Seven
        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(30,150,70,70);
        jf.add(sevenButton);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));


        // Eight
        JButton eightButton = new JButton("8");
        eightButton.setBounds(115,150,70,70);
        jf.add(eightButton);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Nine
        JButton nineButton = new JButton("9");
        nineButton.setBounds(200,150,70,70);
        jf.add(nineButton);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Division
        JButton divisionButton = new JButton("/");
        divisionButton.setBounds(285,150,70,70);
        jf.add(divisionButton);
        divisionButton.setFont(new Font("Arial", Font.PLAIN, 40));


        // Buttons 2nd Row
        // Four
        JButton fourButton = new JButton("4");
        fourButton.setBounds(30,240,70,70);
        jf.add(fourButton);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Five
        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(115,240,70,70);
        jf.add(fiveButton);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Sis
        JButton sixButton = new JButton("6");
        sixButton.setBounds(200,240,70,70);
        jf.add(sixButton);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Multiplication
        JButton mulButton = new JButton("X");
        mulButton.setBounds(285,240,70,70);
        jf.add(mulButton);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 40));


        // Buttons 3rd Row
        // One
        JButton oneButton = new JButton("1");
        oneButton.setBounds(30,330,70,70);
        jf.add(oneButton);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Two
        JButton twoButton = new JButton("2");
        twoButton.setBounds(115,330,70,70);
        jf.add(twoButton);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Three
        JButton threeButton = new JButton("3");
        threeButton.setBounds(200,330,70,70);
        jf.add(threeButton);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Minus
        JButton minusButton = new JButton("-");
        minusButton.setBounds(285,330,70,70);
        jf.add(minusButton);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));


        // Buttons 4th Row
        // Dot
        JButton dotButton = new JButton(".");
        dotButton.setBounds(30,420,70,70);
        jf.add(dotButton);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Zero
        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(115,420,70,70);
        jf.add(zeroButton);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Equal
        JButton equlButton = new JButton("=");
        equlButton.setBounds(200,420,70,70);
        jf.add(equlButton);
        equlButton.setFont(new Font("Arial", Font.PLAIN, 40));

        // Plus
        JButton plusButton = new JButton("+");
        plusButton.setBounds(285,420,70,70);
        jf.add(plusButton);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        

        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}