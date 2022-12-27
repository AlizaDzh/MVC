import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class Viewer {

    JTextField textField;

    public Viewer() {

        Controller controller = new Controller(this);

        Color bl = new Color(153, 204, 255);
        Color rd = new Color(255, 153, 153);
        Color wh = new Color(224, 224, 224);

        Font font = new Font("Bernard MT Condensed", Font.PLAIN, 16);

        JPanel pane = new JPanel();
        pane.setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 260, 50);
        textField.setFont(font);
        textField.setForeground(java.awt.Color.BLACK);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(10, 270, 60, 60);
        buttonOne.setFont(font);
        buttonOne.setForeground(java.awt.Color.BLACK);
        buttonOne.setBackground(wh);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(75, 270, 60, 60);
        buttonTwo.setFont(font);
        buttonTwo.setForeground(java.awt.Color.BLACK);
        buttonTwo.setBackground(wh);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");

        JButton buttonThree = new JButton("3");
        buttonThree.setBounds(140, 270, 60, 60);
        buttonThree.setFont(font);
        buttonThree.setForeground(java.awt.Color.BLACK);
        buttonThree.setBackground(wh);
        buttonThree.addActionListener(controller);
        buttonThree.setActionCommand("Three");

        JButton buttonFour = new JButton("4");
        buttonFour.setBounds(10, 205, 60, 60);
        buttonFour.setFont(font);
        buttonFour.setForeground(java.awt.Color.BLACK);
        buttonFour.setBackground(wh);
        buttonFour.addActionListener(controller);
        buttonFour.setActionCommand("Four");

        JButton buttonFive = new JButton("5");
        buttonFive.setBounds(75, 205, 60, 60);
        buttonFive.setFont(font);
        buttonFive.setForeground(java.awt.Color.BLACK);
        buttonFive.setBackground(wh);
        buttonFive.addActionListener(controller);
        buttonFive.setActionCommand("Five");

        JButton buttonSix = new JButton("6");
        buttonSix.setBounds(140, 205, 60, 60);
        buttonSix.setFont(font);
        buttonSix.setForeground(java.awt.Color.BLACK);
        buttonSix.setBackground(wh);
        buttonSix.addActionListener(controller);
        buttonSix.setActionCommand("Six");

        JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(10, 140, 60, 60);
        buttonSeven.setFont(font);
        buttonSeven.setForeground(java.awt.Color.BLACK);
        buttonSeven.setBackground(wh);
        buttonSeven.addActionListener(controller);
        buttonSeven.setActionCommand("Seven");

        JButton buttonEight = new JButton("8");
        buttonEight.setBounds(75, 140, 60, 60);
        buttonEight.setFont(font);
        buttonEight.setForeground(java.awt.Color.BLACK);
        buttonEight.setBackground(wh);
        buttonEight.addActionListener(controller);
        buttonEight.setActionCommand("Eight");

        JButton buttonNine = new JButton("9");
        buttonNine.setBounds(140, 140, 60, 60);
        buttonNine.setFont(font);
        buttonNine.setForeground(java.awt.Color.BLACK);
        buttonNine.setBackground(wh);
        buttonNine.addActionListener(controller);
        buttonNine.setActionCommand("Nine");

        JButton buttonZero = new JButton("0");
        buttonZero.setBounds(75, 335, 60, 60);
        buttonZero.setFont(font);
        buttonZero.setForeground(java.awt.Color.BLACK);
        buttonZero.setBackground(wh);
        buttonZero.addActionListener(controller);
        buttonZero.setActionCommand("Zero");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(205, 140, 60, 60);
        buttonPlus.setFont(font);
        buttonPlus.setForeground(java.awt.Color.BLACK);
        buttonPlus.setBackground(bl);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(205, 205, 60, 60);
        buttonMinus.setFont(font);
        buttonMinus.setForeground(java.awt.Color.BLACK);
        buttonMinus.setBackground(bl);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");

        JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(10, 335, 60, 60);
        buttonPoint.setFont(font);
        buttonPoint.setForeground(java.awt.Color.BLACK);
        buttonPoint.setBackground(bl);
        buttonPoint.addActionListener(controller);
        buttonPoint.setActionCommand("Point");

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(10, 75, 60, 60);
        buttonClear.setFont(font);
        buttonClear.setForeground(java.awt.Color.BLACK);
        buttonClear.setBackground(bl);
        buttonClear.setBackground(rd);
        buttonClear.addActionListener(controller);
        buttonClear.setActionCommand("Clear");

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(140, 335, 60, 60);
        buttonEqual.setFont(font);
        buttonEqual.setForeground(java.awt.Color.BLACK);
        buttonEqual.setBackground(bl);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        JButton buttonSquare = new JButton("X2");
        buttonSquare.setBounds(140, 75, 60, 60);
        buttonSquare.setFont(font);
        buttonSquare.setForeground(java.awt.Color.BLACK);
        buttonSquare.setBackground(bl);
        buttonSquare.addActionListener(controller);
        buttonSquare.setActionCommand("x2");

        JButton buttonDiv = new JButton("/");
        buttonDiv.setBounds(205, 270, 60, 60);
        buttonDiv.setFont(font);
        buttonDiv.setForeground(java.awt.Color.BLACK);
        buttonDiv.setBackground(bl);
        buttonDiv.addActionListener(controller);
        buttonDiv.setActionCommand("Div");

        JButton buttonMult = new JButton("*");
        buttonMult.setBounds(205, 335, 60, 60);
        buttonMult.setFont(font);
        buttonMult.setForeground(java.awt.Color.BLACK);
        buttonMult.setBackground(bl);
        buttonMult.addActionListener(controller);
        buttonMult.setActionCommand("Mult");

        JButton buttonSqrt = new JButton("\u221A");
        buttonSqrt.setBounds(75, 75, 60, 60);
        buttonSqrt.setFont(font);
        buttonSqrt.setForeground(java.awt.Color.BLACK);
        buttonSqrt.setBackground(bl);
        buttonSqrt.addActionListener(controller);
        buttonSqrt.setActionCommand("SQRT");

        JButton buttonDel = new JButton("CE");
        buttonDel.setBounds(205, 75, 60, 60);
        buttonDel.setFont(font);
        buttonDel.setForeground(java.awt.Color.BLACK);
        buttonDel.setBackground(rd);
        buttonDel.addActionListener(controller);
        buttonDel.setActionCommand("CE");

        JFrame frame = new JFrame("Calculator");
        frame.setSize(290, 450);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);
        frame.add(buttonFive);
        frame.add(buttonSix);
        frame.add(buttonSeven);
        frame.add(buttonEight);
        frame.add(buttonNine);
        frame.add(buttonClear);
        frame.add(buttonZero);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonEqual);
        frame.add(buttonPoint);
        frame.add(buttonSquare);
        frame.add(buttonDiv);
        frame.add(buttonMult);
        frame.add(buttonSqrt);
        frame.add(buttonDel);
        frame.setVisible(true);

    }

    public void update(String text) {
        textField.setText(text);
    }
}