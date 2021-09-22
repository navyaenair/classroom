import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class classroom implements Action {

    /**
     *
     */
    private static final int _0 = 0;
    boolean isOperatorClicked = false;
    String oldValue;
    JFrame jf;
    int op = _0;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton CLRButton;
    JButton FOURButton;
    JButton FIVEButton;
    JButton SIXButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton addButton;
    JButton subButton;

    public classroom() {
        jf = new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 35));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 35));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 35));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        CLRButton = new JButton("C");
        CLRButton.setBounds(430, 130, 80, 80);
        CLRButton.setFont(new Font("Arial", Font.PLAIN, 35));
        CLRButton.addActionListener(this);
        jf.add(CLRButton);

        FOURButton = new JButton("4");
        FOURButton.setBounds(30, 230, 80, 80);
        FOURButton.setFont(new Font("Arial", Font.PLAIN, 35));
        FOURButton.addActionListener(this);
        jf.add(FOURButton);

        FIVEButton = new JButton("5");
        FIVEButton.setBounds(130, 230, 80, 80);
        FIVEButton.setFont(new Font("Arial", Font.PLAIN, 35));
        FIVEButton.addActionListener(this);
        jf.add(FIVEButton);

        SIXButton = new JButton("6");
        SIXButton.setBounds(230, 230, 80, 80);
        SIXButton.setFont(new Font("Arial", Font.PLAIN, 35));
        SIXButton.addActionListener(this);
        jf.add(SIXButton);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 35));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 35));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 35));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 35));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 35));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 35));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 35));
        divButton.addActionListener(this);
        jf.add(divButton);

        mulButton = new JButton("*");
        mulButton.setBounds(330, 230, 80, 80);
        mulButton.setFont(new Font("Arial", Font.PLAIN, 35));
        mulButton.addActionListener(this);
        jf.add(mulButton);

        addButton = new JButton("+");
        addButton.setBounds(330, 330, 80, 80);
        addButton.setFont(new Font("Arial", Font.PLAIN, 35));
        addButton.addActionListener(this);
        jf.add(addButton);

        subButton = new JButton("-");
        subButton.setBounds(330, 430, 80, 80);
        subButton.setFont(new Font("Arial", Font.PLAIN, 35));
        subButton.addActionListener(this);
        jf.add(subButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new classroom();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jf.getContentPane().setBackground(Color.pink);
        if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        } else if (e.getSource() == eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        }

        else if (e.getSource() == FOURButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (e.getSource() == FIVEButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        } else if (e.getSource() == SIXButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (e.getSource() == equalButton) {
            String newValue = displayLabel.getText();
            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);
            float result = 0;
            switch (op) {
                case 1:
                    result = oldValueF / newValueF;
                    displayLabel.setText((result + ""));
                    break;
                case 2:
                    result = oldValueF * newValueF;
                    displayLabel.setText((result + ""));
                    break;
                case 3:
                    result = oldValueF + newValueF;
                    displayLabel.setText((result + ""));
                    break;
                case 4:
                    result = oldValueF - newValueF;
                    displayLabel.setText((result + ""));
                    break;

            }
            displayLabel.setText(displayLabel.getText() + "");
        } else if (e.getSource() == divButton) {
            op = 1;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            displayLabel.setText(displayLabel.getText() + "/");
        } else if (e.getSource() == mulButton) {
            op = 2;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            displayLabel.setText(displayLabel.getText() + "*");
        } else if (e.getSource() == addButton) {
            op = 3;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            displayLabel.setText(displayLabel.getText() + "+");
        } else if (e.getSource() == subButton) {
            op = 4;
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            displayLabel.setText(displayLabel.getText() + "-");
        } else if (e.getSource() == CLRButton) {
            displayLabel.setText("");
        }

    }

    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub

    }
}
