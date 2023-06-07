import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    // I create User Interface Using Java Swing
    // this are the button i have design by GUI
    private JPanel Calculator;
    private JTextField display;
    private JButton btn7;
    private JButton btnCL;
    private JButton btn4;
    private JButton btn1;
    private JButton btnDot;
    private JButton btnMultiply;
    private JButton btnMinus;
    private JButton btnMod;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btnAC;
    private JButton btnDiv;
    private JButton btnPlus;
    private JButton btnEqual;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btn00;
    private JButton btn0;
    private JButton btnRoot;
    private JButton btnSqr;
    private JButton btnCube;

    private JButton btnSin;
    private JButton btnMax;
    private JButton btnMin;
    private JButton btnCos;
    private JButton btnTan;



    // Here I Initialize a, b and ans Variable
    double a, b, ans;

    // Here I Initialize ia, ib and ians Variable
    long ia = 0, ib=0, ians=0;
    String operator;

    public Calculator() {

        // Here create an ActionListener - To perform action after click on button

        // ActionListener display buttons value on screen after clicking on button
        // Here implement action listener for btn1
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn1.getText());
            }
        });

        // Implementation of AC button Here
        // Here AC button used to clear all value and display become null
        btnAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });

        // Implementation of button 2 Here
        // use to display value 2 on screen
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn2.getText());
            }
        });

        // Implementation of button 3 here
        // use to display value 3 on screen
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn3.getText());
            }
        });

        // Implementation of button 4 here
        // use to display value 4 on screen
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn4.getText());
            }
        });

        // Implementation of button 5 here
        // use to display value 5 on screen
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn5.getText());
            }
        });

        // Implementation of button 6 here
        // use to display value 6 on screen
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn6.getText());
            }
        });

        // Implementation of button 7 here
        // use to display value 7 on screen
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn7.getText());
            }
        });

        // Implementation of button 8 here
        // use to display value 8 on screen
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn8.getText());
            }
        });

        // Implementation of button 9 here
        // use to display value 9 on screen
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn9.getText());
            }
        });

        // Implementation of button 0 here
        // use to display value 0 on screen
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn0.getText());
            }
        });

        // Implementation of button double 0 here
        // use to display value 00 on screen
        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + btn00.getText());
            }
        });

        // Implementation of dot button here
        // use to print decimal on screen
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!display.getText().contains(".")) {
                    display.setText(display.getText() + btnDot.getText());
                }
            }
        });


        // Implementation of plus operator here
        // use to do sum operation or add two value
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                operator = "+";
                display.setText("");
            }
        });

        // Implementation of minus operator here
        // use to do subtract operation or subtract two value
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());

                operator = "-";
                display.setText("");
            }
        });

        // Implementation of multiply operator here
        // use to do multiply operation or multiply two value
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                operator = "x";
                display.setText("");
            }
        });

        // Implementation of division operator here
        // use to do division here or divide two value
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(display.getText());
                operator = "/";
                display.setText("");
            }
        });

        // Implementation of clear button here
        // used to delete values from back
        btnCL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null; //first backspace variable initialize with null

                //If length of the number on the display greater than 0 only that time I have to performed delete operation
                //if length is zero their is no value to delete thats why i have to first check length of the displayed values
                if(display.getText().length() > 0){
                    StringBuilder sb = new StringBuilder(display.getText());   // By using stringBuilder I stored displyed number
                    sb.deleteCharAt(sb.length()-1);   // here I start delete the value from back
                    backspace = String.valueOf(sb);   // Here stored value in string and display on screen
                    display.setText(backspace);
                }
            }
        });

        // Implementation of Square operator here
        // Square button used to square of the given value
        btnSqr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText()); // Here I convert String to Double using parseDouble function
                ia = (long)(a);
                operator = "sqr"; // stored performing operation here
            }
        });

        // Implementation of cube button here
        // It will give me the cube of the given number
        btnCube.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                ia = (long)(a);
                operator = "pow";

                display.setText(""); // set display text null beacause to store another number directly

            }
        });

        // Implementation of modulo operator here
        // modulo operator give me the remainder of the twp values
        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText()); // conversion of STring to double
                operator = "%"; // store operator will have to performe here
                display.setText(""); // display text null to store another number and convert string to double direclty
            }
        });
        // Implement root function here
        btnRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(display.getText());
                operator = "√";
            }
        });

        // tan(x) implement here
        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(display.getText());
                operator = "tan";
            }
        });

        // cos(x) implement here
        btnCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                operator = "cos";
            }
        });

        // sin(x) implement here
        btnSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                operator = "sin";
            }
        });

        // max function give me the max value among two numbers
        // when click on the max button it shsow the max value on screen as a answer
        btnMax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                operator = "max";

                display.setText("");
            }
        });

        // min function give me the min value among two numbers
        // when click on the min button it show the min value on screen as a answer
        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(display.getText());
                operator = "min";
                display.setText("");
            }
        });


        // Implementation of equal to button here
        // this button give me the answer of the two numbers according to the operator
        // By using if else condition I implement this

        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(display.getText());

                // According to the operator call such  as '+', '-', '*', '/', '%', max, min, "sin", "tan",
                // "cos" etc. I display result of Addition, subtraction, multiplication, division, modulo etc
                // According to that any opearator condition match that respective function calculate the ans and display on the screen

                if(operator == "+"){
                    ans = plus(a, b); // calling plus function here and store the result getting from the plus function in ans variable
                }
                else if (operator == "-") {
                    ans = minus(a, b); // calling minus function here and store the result getting from the minus function in ans variable
                }
                else if (operator == "x") {

                    ans = multiply(a, b);  // calling multiply function here and store the result in ans getting from the multiply function
                }
                else if (operator == "/") {
                    ans = divide(a, b);    // calling divide function here and store the result getting from the divide function
                }
                else if (operator == "pow") {
                    String s = display.getText(); // get the number from the display

                    b = Double.parseDouble(s); // convert String to double here
                    ib = (long)(b); // typecast to  long
                    ians = (long)Math.pow(ia, ib); // use power function to calculate answer
                    display.setText(Long.toString(ians)); // answer display on screen
                    return;
                }
                else if (operator == "sqr") {
                    ians = ia * ia;
                    display.setText(Long.toString(ians)); // convert long to string and display on screen
                    return;
                }
                else if (operator == "√") {
                    // Square root implements here
                    ans = Math.sqrt(a); // here use Math.sqrt() function to get result
                } else if (operator == "tan") {
                    ans = Math.tan(a);   //here use Math.tan() function to get result
                }
                else if (operator == "cos") {
                    ans = Math.tan(a);   // here use Math.cos() function to get result
                }
                else if (operator == "sin") {
                    ans = Math.sin(a);   // here use Math.sin() function to get result
                }
                else if (operator == "max") {
                    b = Double.parseDouble(display.getText());

                    ans = Math.max(a,b); // use max function here
                }
                else if (operator == "min") {
                    b = Double.parseDouble(display.getText());

                    ans = Math.min(a,b); // use min function here
                }
                else{
                    ans = modulo(a, b);  // calling modulo function here
                }

                String s = String.valueOf(ans); // convert to string here
                int count = 0;
                // Here I calculate count of the digit after decimal point
                // for that I run for loop here from backside untill not getting decimal point in ans and then break the loop
                for(int i=s.length()-1; i>=0; i--){
                    if(s.charAt(i) != '.') count++;
                    else break;
                }

                // If count is equal to 1 then here convert double to long and disply on screen
                // if count greater than 1 directly display answer on sreeen
                if(count==1){
                    ians = (long) (ans);
                    display.setText(String.valueOf(ians));
                }
                else{
                    display.setText(String.valueOf(ans));
                }
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    // Here implements plus(), minus(), multiply(), divide() and modulo() function and return result
    double plus(double a, double b){
        return a + b;
    }
    double minus(double a, double b){

        return a - b;
    }
    double multiply(double a, double b){

        return a * b;
    }

    double divide(double a, double b){

        return a / b;
    }
    double modulo(double a, double b){

        return a % b;
    }
}
