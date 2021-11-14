import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

class Solution implements ActionListener {

    JFrame frame;
    JPanel panel;
    JTextArea textarea;
    JButton Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Add, Sub, Mult, Div, Clear, Dot, Equal, Mod;
    double firstNum, secondNum, res;
    int addc = 0, mulc = 0, divc = 0, subc = 0, modc = 0;

    public Solution() {
        frame = new JFrame();
        panel = new JPanel();
        textarea = new JTextArea(2, 10);
        One = new JButton();
        Two = new JButton();
        Three = new JButton();
        Four = new JButton();
        Five = new JButton();
        Six = new JButton();
        Seven = new JButton();
        Eight = new JButton();
        Nine = new JButton();
        Zero = new JButton();
        Add = new JButton();
        Sub = new JButton();
        Mult = new JButton();
        Div = new JButton();
        Mod = new JButton();
        Dot = new JButton();
        Equal = new JButton();
        Clear = new JButton();
        frame.setSize(350, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");

        frame.add(panel);
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(textarea);
        panel.add(One);
        panel.add(Two);
        panel.add(Three);
        panel.add(Four);
        panel.add(Five);
        panel.add(Six);
        panel.add(Seven);
        panel.add(Eight);
        panel.add(Nine);
        panel.add(Add);
        panel.add(Zero);
        panel.add(Sub);
        panel.add(Mult);
        panel.add(Div);
        panel.add(Mod);
        panel.add(Dot);
        panel.add(Equal);
        panel.add(Clear);

        textarea.setBackground(Color.WHITE);
        Border tborder = BorderFactory.createLineBorder(Color.BLACK, 3);
        textarea.setBorder(tborder);
        Font font = new Font("arial", Font.BOLD, 35);
        textarea.setFont(font);
        textarea.setForeground(Color.BLACK);

        textarea.setPreferredSize(new Dimension(2, 10));
        textarea.setLineWrap(true);

        One.setPreferredSize(new Dimension(100, 50));
        One.setIcon(new ImageIcon("One.png"));

        Two.setPreferredSize(new Dimension(100, 50));
        Two.setIcon(new ImageIcon("Two.png"));

        Three.setPreferredSize(new Dimension(100, 50));
        Three.setIcon(new ImageIcon("Three.png"));

        Four.setPreferredSize(new Dimension(100, 50));
        Four.setIcon(new ImageIcon("Four.png"));

        Five.setPreferredSize(new Dimension(100, 50));
        Five.setIcon(new ImageIcon("Five.png"));

        Six.setPreferredSize(new Dimension(100, 50));
        Six.setIcon(new ImageIcon("Six.png"));

        Seven.setPreferredSize(new Dimension(100, 50));
        Seven.setIcon(new ImageIcon("Seven.png"));

        Eight.setPreferredSize(new Dimension(100, 50));
        Eight.setIcon(new ImageIcon("Eight.png"));

        Nine.setPreferredSize(new Dimension(100, 50));
        Nine.setIcon(new ImageIcon("Nine.png"));

        Zero.setPreferredSize(new Dimension(100, 50));
        Zero.setIcon(new ImageIcon("Zero.png"));

        Add.setPreferredSize(new Dimension(100, 50));
        Add.setIcon(new ImageIcon("Add.png"));

        Sub.setPreferredSize(new Dimension(100, 50));
        Sub.setIcon(new ImageIcon("Sub.png"));

        Mult.setPreferredSize(new Dimension(100, 50));
        Mult.setIcon(new ImageIcon("Mult.png"));

        Div.setPreferredSize(new Dimension(100, 50));
        Div.setIcon(new ImageIcon("Div.png"));

        Mod.setPreferredSize(new Dimension(100, 50));
        Mod.setIcon(new ImageIcon("Mod.png"));
        Dot.setPreferredSize(new Dimension(100, 50));
        Dot.setIcon(new ImageIcon("Dot.png"));

        Equal.setPreferredSize(new Dimension(100, 50));
        Equal.setIcon(new ImageIcon("Equal.png"));

        Clear.setPreferredSize(new Dimension(100, 50));
        Clear.setIcon(new ImageIcon("Clear.png"));

        One.addActionListener((ActionListener) this);
        Two.addActionListener((ActionListener) this);
        Three.addActionListener((ActionListener) this);
        Four.addActionListener((ActionListener) this);
        Five.addActionListener((ActionListener) this);
        Six.addActionListener((ActionListener) this);
        Seven.addActionListener((ActionListener) this);
        Eight.addActionListener((ActionListener) this);
        Nine.addActionListener((ActionListener) this);
        Zero.addActionListener((ActionListener) this);
        Add.addActionListener((ActionListener) this);
        Sub.addActionListener((ActionListener) this);
        Mult.addActionListener((ActionListener) this);
        Div.addActionListener((ActionListener) this);
        Equal.addActionListener((ActionListener) this);
        Dot.addActionListener((ActionListener) this);
        Clear.addActionListener((ActionListener) this);
        Mod.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == Clear) {
            firstNum = 0.0;
            secondNum = 0.0;
            textarea.setText("");
        }
        if (source == One) {
            textarea.append("1");
        }
        if (source == Two) {
            textarea.append("2");
        }
        if (source == Three) {
            textarea.append("3");
        }
        if (source == Four) {
            textarea.append("4");
        }
        if (source == Five) {
            textarea.append("5");
        }
        if (source == Six) {
            textarea.append("6");
        }
        if (source == Seven) {
            textarea.append("7");
        }
        if (source == Eight) {
            textarea.append("8");
        }
        if (source == Nine) {
            textarea.append("9");
        }
        if (source == Zero) {
            textarea.append("0");
        }
        if (source == Add) {
            firstNum = number_reader();
            textarea.setText("+");
            addc = 1;
            subc = 0;
            mulc = 0;
            divc = 0;
            modc = 0;
        }
        if (source == Sub) {
            firstNum = number_reader();
            textarea.setText("");
            addc = 0;
            subc = 1;
            mulc = 0;
            divc = 0;
            modc = 0;
        }
        if (source == Mult) {
            firstNum = number_reader();
            textarea.setText("");
            addc = 0;
            subc = 0;
            mulc = 1;
            divc = 0;
            modc = 0;
        }
        if (source == Div) {
            firstNum = number_reader();
            textarea.setText("");
            addc = 0;
            subc = 0;
            mulc = 0;
            divc = 1;
            modc = 0;
        }
        if (source == Mod) {
            firstNum = number_reader();
            textarea.setText("");
            addc = 0;
            subc = 0;
            mulc = 0;
            divc = 0;
            modc = 1;
        }
        if (source == Dot) {
            textarea.append(".");
        }
        if (source == Equal) {
            secondNum = number_reader();
            if (addc > 0) {
                res = firstNum + secondNum;
                textarea.setText(Double.toString(res));
            }
            if (subc > 0) {
                res = firstNum - secondNum;
                textarea.setText(Double.toString(res));
            }
            if (mulc > 0) {
                res = firstNum * secondNum;
                textarea.setText(Double.toString(res));
            }
            if (divc > 0) {
                res = firstNum / secondNum;
                textarea.setText(Double.toString(res));
            }
            if (modc > 0) {
                res = firstNum % secondNum;
                textarea.setText(Double.toString(res));
            }
        }

    }

    public double number_reader() {
        double num1;
        String s;
        s = textarea.getText();
        num1 = Double.valueOf(s);
        return num1;
    }

}

public class Calculator {

    public static void main(String[] args) {
        Solution ob = new Solution();
    }

}
