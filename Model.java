import java.util.Stack;
import java.lang.String;

public class Model {

    private Viewer viewer;
    private String temp;
    private String leftValue;
    private String rightValue;
    private double answer;

    public Model(Viewer viewer) {
        this.viewer = viewer;
        temp = "";
        leftValue = "";
    }

    public String Rpn(String exp) {

        String str = "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            if (Character.isDigit(exp.charAt(i)))
                str = str + exp.charAt(i);

            if (getPriority(exp.charAt(i)) >= 1) {

                str = str + " ";

                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= getPriority(exp.charAt(i))) {
                        str = str + stack.pop();
                    } else
                        break;
                }
                stack.push(exp.charAt(i));
            }

        }
        while (!stack.empty()) {
            str = str + stack.pop();
        }

        return str;
    }

    public String calculate(String rpn) {

        Stack<String> stack = new Stack<>();

        String str;

        for (int i = 0; i < rpn.length(); i++) {

            if (rpn.charAt(i) == ' ')
                continue;

            if (Character.isDigit(rpn.charAt(i))) {

                str = "";
                while (rpn.charAt(i) != ' ' && Character.isDigit(rpn.charAt(i))) {

                    str = str + rpn.charAt(i++);
                    if (i == rpn.length())

                        break;

                }
                stack.push(str);
            }

            if (getPriority(rpn.charAt(i)) >= 1) {

                double b = Double.parseDouble(stack.pop());
                double a = Double.parseDouble(stack.pop());

                if (rpn.charAt(i) == '+')
                    stack.push("" + (a + b));
                if (rpn.charAt(i) == '-')
                    stack.push("" + (a - b));
                if (rpn.charAt(i) == '/')
                    stack.push("" + (a / b));
                if (rpn.charAt(i) == '*')
                    stack.push("" + (a * b));

            }
        }
        return stack.pop();
    }

    private static int getPriority(char operator) {
        switch (operator) {

        case '*':
        case '/':
            return 2;
        case '+':
        case '-':
            return 1;
        }
        return 0;
    }

    public void doAction(String command) {

        switch (command) {
        case "One":
            temp = temp + "1";
            break;

        case "Two":
            temp = temp + "2";
            break;

        case "Three":
            temp = temp + "3";
            break;

        case "Four":
            temp = temp + "4";
            break;

        case "Five":
            temp = temp + "5";
            break;

        case "Six":
            temp = temp + "6";
            break;

        case "Seven":
            temp = temp + "7";
            break;

        case "Eight":
            temp = temp + "8";
            break;

        case "Nine":
            temp = temp + "9";
            break;

        case "Zero":
            temp = temp + "0";
            break;

        case "Clear":
            temp = "";
            break;

        case "Plus":

            temp = temp + "+";
            break;

        case "Minus":

            temp = temp + "-";
            break;

        case "Mult":
            temp = temp + "*";
            break;

        case "Point":
            temp = temp + ".";
            if (temp == ".") {
                temp = temp + ".";
                answer = Double.parseDouble(temp);
                temp = "" + answer;
            }

            break;

        case "Div":
            temp = temp + "/";
            break;

        case "CE":
            temp = temp.substring(0, temp.length() - 1);
            break;

        case "x2":
            leftValue = temp;
            if (temp != "") {
                answer = Math.pow(Double.parseDouble(leftValue), 2);
                temp = "" + answer;
            }
            break;

        case "SQRT":
            leftValue = temp;
            if (temp != "") {
                answer = Math.sqrt(Double.parseDouble(leftValue));
                temp = "" + answer;
            }
            break;

        case "Equal":
            rightValue = temp;
            System.out.println(leftValue + " " + rightValue);
           
            temp = leftValue + rightValue;

            temp = calculate(Rpn(temp));

            break;
        }

        temp = temp.contains("Infinity") ? temp = "Деление на ноль" : temp;
        temp = temp.contains(".0") ? temp.replaceAll(".0*$", "") : temp;
        viewer.update(temp);

    }
}
