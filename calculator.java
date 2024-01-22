import javax.swing.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class calculator implements ActionListener {
    // result sreen
    private static JTextField result;
    // Addition, abstraction, proliferation, division, radical, Exponentiation,
    // quota
    private static JButton addition, abstraction, proliferation, division, radical, exponentiation;
    // ------------------info----------------
    private static JButton info;
    private static JLabel info1, info2, info3, info4, info5, info6, info7;
    // ------------Letters-----------------
    private static JButton A, B, C, D, E, F;
    // back_space, clean_screen,
    private static JButton back_space, clean;
    // Numbers
    private static JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    // ----------------------------Conversions---------------------------
    private static JButton decimal_t_hexadecimal, decimal_t_binary, ascci1;
    private static JButton binary_t_hexadecimal, binary_t_decimal;
    private static JButton hexadecimal_t_binary, hexadecimal_t_decimal;
    // -----------------------final1--------------------------------------
    private static JButton final1;

    private static Color Cclean = new Color(1, 192, 192);
    private static Color cnumbers = new Color(36, 192, 227); // 100,150,255

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tsolakidis");

        // ----------------------------Conversions---------------------------
        decimal_t_hexadecimal = new JButton("Decimal to Hexadecimal");
        decimal_t_hexadecimal.setFont(new Font("Verdana", Font.BOLD, 12));
        decimal_t_hexadecimal.addActionListener(new calculator());
        decimal_t_hexadecimal.setBounds(360, 45, 200, 50);
        decimal_t_hexadecimal.addMouseListener(new MouseAdapter() {
            Color color = decimal_t_hexadecimal.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = decimal_t_hexadecimal.getBackground();
                decimal_t_hexadecimal.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                decimal_t_hexadecimal.setBackground(color);
            }
        });
        frame.add(decimal_t_hexadecimal);

        decimal_t_binary = new JButton("Decimal to Binary");
        decimal_t_binary.setFont(new Font("Verdana", Font.BOLD, 12));
        decimal_t_binary.addActionListener(new calculator());
        decimal_t_binary.setBounds(360, 100, 200, 50);
        decimal_t_binary.addMouseListener(new MouseAdapter() {
            Color color = decimal_t_binary.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = decimal_t_binary.getBackground();
                decimal_t_binary.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                decimal_t_binary.setBackground(color);
            }
        });
        frame.add(decimal_t_binary);

        binary_t_hexadecimal = new JButton("Binary to Hexadecimal");
        binary_t_hexadecimal.setFont(new Font("Verdana", Font.BOLD, 12));
        binary_t_hexadecimal.addActionListener(new calculator());
        binary_t_hexadecimal.setBounds(360, 155, 200, 50);
        binary_t_hexadecimal.addMouseListener(new MouseAdapter() {
            Color color = binary_t_hexadecimal.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = binary_t_hexadecimal.getBackground();
                binary_t_hexadecimal.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                binary_t_hexadecimal.setBackground(color);
            }
        });
        frame.add(binary_t_hexadecimal);

        binary_t_decimal = new JButton("Binary to Decimal");
        binary_t_decimal.setFont(new Font("Verdana", Font.BOLD, 12));
        binary_t_decimal.addActionListener(new calculator());
        binary_t_decimal.setBounds(360, 210, 200, 50);
        binary_t_decimal.addMouseListener(new MouseAdapter() {
            Color color = binary_t_decimal.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = binary_t_decimal.getBackground();
                binary_t_decimal.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                binary_t_decimal.setBackground(color);
            }
        });
        frame.add(binary_t_decimal);

        hexadecimal_t_binary = new JButton("Hexadecimal to Binary");
        hexadecimal_t_binary.setFont(new Font("Verdana", Font.BOLD, 12));
        hexadecimal_t_binary.addActionListener(new calculator());
        hexadecimal_t_binary.setBounds(360, 265, 200, 50);
        hexadecimal_t_binary.addMouseListener(new MouseAdapter() {
            Color color = hexadecimal_t_binary.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = hexadecimal_t_binary.getBackground();
                hexadecimal_t_binary.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                hexadecimal_t_binary.setBackground(color);
            }
        });
        frame.add(hexadecimal_t_binary);

        hexadecimal_t_decimal = new JButton("Hexadecimal to Decimal");
        hexadecimal_t_decimal.setFont(new Font("Verdana", Font.BOLD, 12));
        hexadecimal_t_decimal.addActionListener(new calculator());
        hexadecimal_t_decimal.setBounds(360, 320, 200, 50);
        hexadecimal_t_decimal.addMouseListener(new MouseAdapter() {
            Color color = hexadecimal_t_decimal.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = hexadecimal_t_decimal.getBackground();
                hexadecimal_t_decimal.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                hexadecimal_t_decimal.setBackground(color);
            }
        });
        frame.add(hexadecimal_t_decimal);
        // -----------------------------------------------------------------
        exponentiation = new JButton("^");
        exponentiation.setFont(new Font("Verdana", Font.BOLD, 17));
        exponentiation.addActionListener(new calculator());
        exponentiation.setBounds(175, 155, 50, 50);
        exponentiation.addMouseListener(new MouseAdapter() {
            Color color = exponentiation.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = exponentiation.getBackground();
                exponentiation.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                exponentiation.setBackground(color);
            }
        });
        frame.add(exponentiation);

        radical = new JButton("√");
        radical.setFont(new Font("Verdana", Font.BOLD, 17));
        radical.addActionListener(new calculator());
        radical.setBounds(235, 155, 50, 50);
        radical.addMouseListener(new MouseAdapter() {
            Color color = radical.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = radical.getBackground();
                radical.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                radical.setBackground(color);
            }
        });
        frame.add(radical);

        addition = new JButton("+");
        addition.setFont(new Font("Verdana", Font.BOLD, 17));
        addition.addActionListener(new calculator());
        addition.setBounds(175, 45, 50, 50);
        addition.addMouseListener(new MouseAdapter() {
            Color color = addition.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = addition.getBackground();
                addition.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                addition.setBackground(color);
            }
        });
        frame.add(addition);

        abstraction = new JButton("-");
        abstraction.setFont(new Font("Verdana", Font.BOLD, 17));
        abstraction.addActionListener(new calculator());
        abstraction.setBounds(235, 45, 50, 50);
        abstraction.addMouseListener(new MouseAdapter() {
            Color color = abstraction.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = abstraction.getBackground();
                abstraction.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                abstraction.setBackground(color);
            }
        });
        frame.add(abstraction);

        division = new JButton(":");
        division.setFont(new Font("Verdana", Font.BOLD, 17));
        division.addActionListener(new calculator());
        division.setBounds(175, 100, 50, 50);
        division.addMouseListener(new MouseAdapter() {
            Color color = division.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = division.getBackground();
                division.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                division.setBackground(color);
            }
        });
        frame.add(division);

        proliferation = new JButton("*");
        proliferation.setFont(new Font("Verdana", Font.BOLD, 17));
        proliferation.addActionListener(new calculator());
        proliferation.setBounds(235, 100, 50, 50);
        proliferation.addMouseListener(new MouseAdapter() {
            Color color = proliferation.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = proliferation.getBackground();
                proliferation.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                proliferation.setBackground(color);
            }
        });
        frame.add(proliferation);

        // ---------------------NUMbers---------------------
        num1 = new JButton("1");
        num1.setFont(new Font("Verdana", Font.BOLD, 17));
        num1.addActionListener(new calculator());
        num1.setBounds(5, 45, 50, 50);
        num1.addMouseListener(new MouseAdapter() {
            Color color = num1.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num1.getBackground();
                num1.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num1.setBackground(color);
            }
        });

        num2 = new JButton("2");
        num2.setFont(new Font("Verdana", Font.BOLD, 17));
        num2.addActionListener(new calculator());
        num2.setBounds(60, 45, 50, 50);
        num2.addMouseListener(new MouseAdapter() {
            Color color = num2.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num2.getBackground();
                num2.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num2.setBackground(color);
            }
        });
        num3 = new JButton("3");
        num3.setFont(new Font("Verdana", Font.BOLD, 17));
        num3.addActionListener(new calculator());
        num3.setBounds(115, 45, 50, 50);
        num3.addMouseListener(new MouseAdapter() {
            Color color = num3.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num3.getBackground();
                num3.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num3.setBackground(color);
            }
        });
        num4 = new JButton("4");
        num4.setFont(new Font("Verdana", Font.BOLD, 17));
        num4.addActionListener(new calculator());
        num4.setBounds(5, 100, 50, 50);
        num4.addMouseListener(new MouseAdapter() {
            Color color = num4.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num4.getBackground();
                num4.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num4.setBackground(color);
            }
        });
        num5 = new JButton("5");
        num5.setFont(new Font("Verdana", Font.BOLD, 17));
        num5.addActionListener(new calculator());
        num5.setBounds(60, 100, 50, 50);
        num5.addMouseListener(new MouseAdapter() {
            Color color = num5.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num5.getBackground();
                num5.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num5.setBackground(color);
            }
        });
        num6 = new JButton("6");
        num6.setFont(new Font("Verdana", Font.BOLD, 17));
        num6.addActionListener(new calculator());
        num6.setBounds(115, 100, 50, 50);
        num6.addMouseListener(new MouseAdapter() {
            Color color = num6.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num6.getBackground();
                num6.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num6.setBackground(color);
            }
        });
        num7 = new JButton("7");
        num7.setFont(new Font("Verdana", Font.BOLD, 17));
        num7.addActionListener(new calculator());
        num7.setBounds(5, 155, 50, 50);
        num7.addMouseListener(new MouseAdapter() {
            Color color = num7.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num7.getBackground();
                num7.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num7.setBackground(color);
            }
        });
        num8 = new JButton("8");
        num8.setFont(new Font("Verdana", Font.BOLD, 17));
        num8.addActionListener(new calculator());
        num8.setBounds(60, 155, 50, 50);
        num8.addMouseListener(new MouseAdapter() {
            Color color = num8.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num8.getBackground();
                num8.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num8.setBackground(color);
            }
        });
        num9 = new JButton("9");
        num9.setFont(new Font("Verdana", Font.BOLD, 17));
        num9.addActionListener(new calculator());
        num9.setBounds(115, 155, 50, 50);
        num9.addMouseListener(new MouseAdapter() {
            Color color = num9.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num9.getBackground();
                num9.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num9.setBackground(color);
            }
        });
        num0 = new JButton("0");
        num0.setFont(new Font("Verdana", Font.BOLD, 17));
        num0.addActionListener(new calculator());
        num0.setBounds(60, 210, 50, 50);
        num0.addMouseListener(new MouseAdapter() {
            Color color = num0.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = num0.getBackground();
                num0.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                num0.setBackground(color);
            }
        });
        // ----------------------Letters------------------------------------
        A = new JButton("A");
        A.setFont(new Font("Verdana", Font.BOLD, 17));
        A.addActionListener(new calculator());
        A.setBounds(300, 45, 50, 50);
        A.addMouseListener(new MouseAdapter() {
            Color color = A.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = A.getBackground();
                A.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                A.setBackground(color);
            }
        });
        frame.add(A);

        B = new JButton("B");
        B.setFont(new Font("Verdana", Font.BOLD, 17));
        B.addActionListener(new calculator());
        B.setBounds(300, 100, 50, 50);
        B.addMouseListener(new MouseAdapter() {
            Color color = B.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = B.getBackground();
                B.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                B.setBackground(color);
            }
        });
        frame.add(B);

        C = new JButton("C");
        C.setFont(new Font("Verdana", Font.BOLD, 17));
        C.addActionListener(new calculator());
        C.setBounds(300, 155, 50, 50);
        C.addMouseListener(new MouseAdapter() {
            Color color = C.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = C.getBackground();
                C.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                C.setBackground(color);
            }
        });
        frame.add(C);

        D = new JButton("D");
        D.setFont(new Font("Verdana", Font.BOLD, 17));
        D.addActionListener(new calculator());
        D.setBounds(300, 210, 50, 50);
        D.addMouseListener(new MouseAdapter() {
            Color color = D.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = D.getBackground();
                D.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                D.setBackground(color);
            }
        });
        frame.add(D);

        E = new JButton("E");
        E.setFont(new Font("Verdana", Font.BOLD, 17));
        E.addActionListener(new calculator());
        E.setBounds(300, 265, 50, 50);
        E.addMouseListener(new MouseAdapter() {
            Color color = E.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = E.getBackground();
                E.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                E.setBackground(color);
            }
        });
        frame.add(E);

        F = new JButton("F");
        F.setFont(new Font("Verdana", Font.BOLD, 17));
        F.addActionListener(new calculator());
        F.setBounds(300, 320, 50, 50);
        F.addMouseListener(new MouseAdapter() {
            Color color = F.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = F.getBackground();
                F.setBackground(cnumbers);
            }

            public void mouseExited(MouseEvent me) {
                F.setBackground(color);
            }
        });
        frame.add(F);
        // -------------------------result------------------------------
        final1 = new JButton("=");
        final1.setFont(new Font("Verdana", Font.BOLD, 17));
        final1.addActionListener(new calculator());
        final1.setBounds(115, 210, 50, 50);
        final1.addMouseListener(new MouseAdapter() {
            Color color = final1.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = final1.getBackground();
                final1.setBackground(Color.green);
            }

            public void mouseExited(MouseEvent me) {
                final1.setBackground(color);
            }
        });
        frame.add(final1);
        // -------------------Clean all------------------------
        clean = new JButton("CLEAN");
        clean.setFont(new Font("Verdana", Font.BOLD, 17));
        clean.addActionListener(new calculator());
        clean.setBounds(5, 265, 160, 50);
        clean.addMouseListener(new MouseAdapter() {
            Color color = clean.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = clean.getBackground();
                clean.setBackground(Cclean);
            }

            public void mouseExited(MouseEvent me) {
                clean.setBackground(color);
            }
        });
        frame.add(clean);
        // --------------------Back space--------------------------
        back_space = new JButton("C");
        back_space.setFont(new Font("Verdana", Font.BOLD, 17));
        back_space.addActionListener(new calculator());
        back_space.setBounds(5, 210, 50, 50);
        back_space.addMouseListener(new MouseAdapter() {
            Color color = back_space.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = back_space.getBackground();
                back_space.setBackground(Color.red);
            }

            public void mouseExited(MouseEvent me) {
                back_space.setBackground(color);
            }
        });
        frame.add(back_space);

        // --------------------info------------------------
        info = new JButton("ΠΛΗΡΟΦΟΡΙΕΣ");
        info.setFont(new Font("Verdana", Font.BOLD, 12));
        info.addActionListener(new calculator());
        info.setBounds(5, 320, 280, 50);
        info.addMouseListener(new MouseAdapter() {
            Color color = info.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = info.getBackground();
                info.setBackground(Cclean);
            }

            public void mouseExited(MouseEvent me) {
                info.setBackground(color);
            }
        });
        frame.add(info);
        // -------------------Assci-----------------------
        ascci1 = new JButton("ASSCI");
        ascci1.setFont(new Font("Verdana", Font.BOLD, 17));
        ascci1.addActionListener(new calculator());
        ascci1.setBounds(175, 210, 110, 105);
        ascci1.addMouseListener(new MouseAdapter() {
            Color color = ascci1.getBackground();

            public void mouseEntered(MouseEvent me) {
                color = ascci1.getBackground();
                ascci1.setBackground(Cclean);
            }

            public void mouseExited(MouseEvent me) {
                ascci1.setBackground(color);
            }
        });
        frame.add(ascci1);

        /*
         * // ------------Result Screen-----------------------
         * result = new JLabel();
         * result.setText("");
         * result.setBounds(0,0,570,40);
         * result.setForeground(Color.black);
         * result.setOpaque(true);
         * result.setBackground(Color.cyan);
         * result.setFont(new Font("Verdana", Font.BOLD, 15));
         * frame.add(result);
         */
        result = new JTextField();
        result.setText("");
        result.setBounds(0, 0, 570, 40);
        result.setForeground(Color.black);
        result.setOpaque(true);
        result.setBackground(Color.cyan);
        result.setFont(new Font("Verdana", Font.BOLD, 15));
        frame.add(result);

        // ------------Frame-----------------------------
        frame.setSize(585, 415);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(num1);
        frame.add(num2);
        frame.add(num3);
        frame.add(num4);
        frame.add(num5);
        frame.add(num6);
        frame.add(num7);
        frame.add(num8);
        frame.add(num9);
        frame.add(num0);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // ------------------------------------------------------------------------------------------------------
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == num1) {
            String w = result.getText();
            result.setText(w + "1");
        } else if (e.getSource() == num2) {
            String w = result.getText();
            result.setText(w + "2");
        } else if (e.getSource() == num3) {
            String w = result.getText();
            result.setText(w + "3");
        } else if (e.getSource() == num4) {
            String w = result.getText();
            result.setText(w + "4");
        } else if (e.getSource() == num5) {
            String w = result.getText();
            result.setText(w + "5");
        } else if (e.getSource() == num6) {
            String w = result.getText();
            result.setText(w + "6");
        } else if (e.getSource() == num7) {
            String w = result.getText();
            result.setText(w + "7");
        } else if (e.getSource() == num8) {
            String w = result.getText();
            result.setText(w + "8");
        } else if (e.getSource() == num9) {
            String w = result.getText();
            result.setText(w + "9");
        } else if (e.getSource() == num0) {
            String w = result.getText();
            int x = w.length();
            if (x != 0) {
                char h = w.charAt(x - 1);
                String s = String.valueOf(h);
                if (s.equals(":")) {
                    result.setText("Cannot divide by zero");
                } else {
                    result.setText(w + "0");
                }
            } else {
                result.setText(w + "0");
            }
        } else if (e.getSource() == A) {
            String w = result.getText();
            result.setText(w + "A");
        } else if (e.getSource() == B) {
            String w = result.getText();
            result.setText(w + "B");
        } else if (e.getSource() == C) {
            String w = result.getText();
            result.setText(w + "C");
        } else if (e.getSource() == D) {
            String w = result.getText();
            result.setText(w + "D");
        } else if (e.getSource() == E) {
            String w = result.getText();
            result.setText(w + "E");
        } else if (e.getSource() == F) {
            String w = result.getText();
            result.setText(w + "F");
        }

        if (e.getSource() == addition) {
            String w = result.getText();
            result.setText(w + "+");
        } else if (e.getSource() == abstraction) {
            String w = result.getText();
            result.setText(w + "-");
        } else if (e.getSource() == division) {
            String w = result.getText();
            result.setText(w + ":");
        } else if (e.getSource() == proliferation) {
            String w = result.getText();
            result.setText(w + "*");
        } else if (e.getSource() == exponentiation) {
            String w = result.getText();
            result.setText(w + "^");
        } else if (e.getSource() == radical) {
            String w = result.getText();
            result.setText(w + "√");
        } else if (e.getSource() == ascci1) {
            String w = result.getText();
            char character = w.charAt(0);
            int ascii2 = (int) character;
            String sassci = String.valueOf(ascii2);
            result.setText(sassci);
        }

        // ------------frame-----------------------------
        if (e.getSource() == info) {
            JFrame frame2 = new JFrame("Information");
            info1 = new JLabel();
            info1.setText("1ο ΕΠΑΛ ΚΑΛΑΜΑΡΙΑΣ");
            info1.setBounds(40, 0, 200, 40);
            info1.setForeground(Color.black);
            info1.setFont(new Font("Verdana", Font.BOLD, 15));
            frame2.add(info1);

            info2 = new JLabel();
            info2.setText("ΕΤΟΣ 2020-2021");
            info2.setBounds(65, 50, 200, 40);
            info2.setForeground(Color.black);
            info2.setFont(new Font("Verdana", Font.BOLD, 15));
            frame2.add(info2);

            info3 = new JLabel();
            info3.setText("ΚΟΜΠΙΟΥΤΕΡΑΚΙ");
            info3.setBounds(65, 80, 200, 40);
            info3.setForeground(Color.black);
            info3.setFont(new Font("Verdana", Font.BOLD, 15));
            frame2.add(info3);

            info4 = new JLabel();
            info4.setText("--------------ΜΑΘΗΤΗΣ--------------");
            info4.setBounds(0, 150, 300, 40);
            info4.setForeground(Color.black);
            info4.setFont(new Font("Verdana", Font.BOLD, 15));
            frame2.add(info4);

            info5 = new JLabel();
            info5.setText("ΤΣΟΛΑΚΙΔΗΣ ΒΑΣΙΛΗΣ");
            info5.setBounds(50, 180, 200, 40);
            info5.setForeground(Color.black);
            info5.setFont(new Font("Verdana", Font.BOLD, 15));
            frame2.add(info5);

            info6 = new JLabel();
            info6.setText("Copyright  © TSOLAKIDIS BASILIS");
            info6.setBounds(5, 260, 300, 40);
            info6.setForeground(Color.black);
            info6.setFont(new Font("Verdana", Font.BOLD, 13));
            frame2.add(info6);

            info7 = new JLabel();
            info7.setText("All Rights Reserved");
            info7.setBounds(5, 280, 300, 40);
            info7.setForeground(Color.black);
            info7.setFont(new Font("Verdana", Font.BOLD, 15));
            frame2.add(info7);

            frame2.setSize(295, 350);
            frame2.getContentPane().setBackground(Color.cyan);
            frame2.setLayout(null);
            frame2.setVisible(true);
            frame2.setLocationRelativeTo(null);
        }
        // ----------------------------------------------
        if (e.getSource() == final1) {
            String w = result.getText();
            String stixio = "";
            char h = w.charAt(0);
            String s = String.valueOf(h);
            List<String> stoixeia = new ArrayList<>();
            int x = w.length();
            for (int i = 0; i < x; i++) {

                h = w.charAt(i);
                s = String.valueOf(h);
                if (s.equals("*")) {
                    stoixeia.add(stixio);
                    stoixeia.add("*");
                    stixio = "";
                } else if (s.equals(":")) {
                    stoixeia.add(stixio);
                    stoixeia.add(":");
                    stixio = "";
                } else if (s.equals("+")) {
                    stoixeia.add(stixio);
                    stoixeia.add("+");
                    stixio = "";
                } else if (s.equals("-")) {
                    stoixeia.add(stixio);
                    stoixeia.add("-");
                    stixio = "";
                } else if (s.equals("^")) {
                    stoixeia.add(stixio);
                    stoixeia.add("^");
                    stixio = "";
                } else if (s.equals("√")) {
                    stoixeia.add(stixio);
                    stoixeia.add("√");
                    stixio = "";
                } else if (s.equals("(")) {
                    stoixeia.add("(");
                    stixio = "";
                } else if (s.equals(")")) {
                    stoixeia.add(stixio);
                    stoixeia.add(")");
                    stixio = "";
                } else {
                    stixio = stixio + s;
                }
            }
            stoixeia.add(stixio);

            String plin = stoixeia.get(1);
            // JOptionPane.showMessageDialog(null,stoixeia);
            if (stoixeia.size() > 3) {
                if (plin.equals("-") && stoixeia.get(3) == "√") {
                    stoixeia.remove(0);
                    Double rizoto = Double.parseDouble(stoixeia.get(3));
                    Double sum8 = Double.valueOf(Math.sqrt(rizoto));
                    sum8 = -sum8;
                    String n = String.valueOf(sum8);
                    stoixeia.remove(0);
                    stoixeia.remove(0);
                    stoixeia.remove(0);
                    stoixeia.remove(0);
                    stoixeia.add(0, n);
                } else if (plin.equals("-")) {
                    stoixeia.remove(0);
                    Double rizoto = Double.parseDouble(stoixeia.get(3));
                    rizoto = -rizoto;
                    String n = String.valueOf(rizoto);
                    stoixeia.remove(0);
                    stoixeia.remove(0);
                    stoixeia.add(0, n);

                }
            }
            int plithos = stoixeia.size();
            double pollaplas = 1;
            int count = 1;
            while (count < plithos) {
                if (stoixeia.get(count).equals("^")) {
                    String steixio1 = stoixeia.get(count - 1);
                    String steixio2 = stoixeia.get(count + 1);
                    double Dsteixio1 = Double.parseDouble(steixio1);
                    double Dsteixio2 = Double.parseDouble(steixio2);
                    pollaplas = Double.valueOf(Math.pow(Dsteixio1, Dsteixio2));
                    stoixeia.remove(count + 1);
                    stoixeia.remove(count);
                    stoixeia.remove(count - 1);
                    String Spollaplas = String.valueOf(pollaplas);
                    stoixeia.add(count - 1, Spollaplas);
                    plithos = stoixeia.size();
                    count = 0;
                }
                count += 1;
            }
            count = 1;
            while (count < plithos) {
                if (stoixeia.get(count).equals("√")) {
                    String steixio2 = stoixeia.get(count + 1);
                    double Dsteixio2 = Double.parseDouble(steixio2);
                    pollaplas = Double.valueOf(Math.sqrt(Dsteixio2));
                    stoixeia.remove(count + 1);
                    stoixeia.remove(count);
                    stoixeia.remove(count - 1);
                    String Spollaplas = String.valueOf(pollaplas);
                    stoixeia.add(count - 1, Spollaplas);
                    plithos = stoixeia.size();
                    count = 0;
                }
                count += 1;
            }
            count = 1;
            while (count < plithos) {
                if (stoixeia.get(count).equals("*")) {
                    String steixio1 = stoixeia.get(count - 1);
                    String steixio2 = stoixeia.get(count + 1);
                    double Dsteixio1 = Double.parseDouble(steixio1);
                    double Dsteixio2 = Double.parseDouble(steixio2);
                    pollaplas = Dsteixio1 * Dsteixio2;
                    stoixeia.remove(count + 1);
                    stoixeia.remove(count);
                    stoixeia.remove(count - 1);
                    String Spollaplas = String.valueOf(pollaplas);
                    stoixeia.add(count - 1, Spollaplas);
                    plithos = stoixeia.size();
                    count = 0;
                }
                count += 1;
            }
            count = 1;
            while (count < plithos) {
                if (stoixeia.get(count).equals(":")) {
                    String steixio1 = stoixeia.get(count - 1);
                    String steixio2 = stoixeia.get(count + 1);
                    double Dsteixio1 = Double.parseDouble(steixio1);
                    double Dsteixio2 = Double.parseDouble(steixio2);
                    pollaplas = Dsteixio1 / Dsteixio2;
                    stoixeia.remove(count + 1);
                    stoixeia.remove(count);
                    stoixeia.remove(count - 1);
                    String Spollaplas = String.valueOf(pollaplas);
                    stoixeia.add(count - 1, Spollaplas);
                    plithos = stoixeia.size();
                    count = 0;
                }
                count += 1;
            }
            count = 1;
            while (count < plithos) {
                if (stoixeia.get(count).equals("+")) {
                    String steixio1 = stoixeia.get(count - 1);
                    String steixio2 = stoixeia.get(count + 1);
                    double Dsteixio1 = Double.parseDouble(steixio1);
                    double Dsteixio2 = Double.parseDouble(steixio2);
                    pollaplas = Dsteixio1 + Dsteixio2;
                    stoixeia.remove(count + 1);
                    stoixeia.remove(count);
                    stoixeia.remove(count - 1);
                    String Spollaplas = String.valueOf(pollaplas);
                    stoixeia.add(count - 1, Spollaplas);
                    plithos = stoixeia.size();
                    count = 0;
                }
                count += 1;
            }
            count = 1;
            while (count < plithos) {
                if (stoixeia.get(count).equals("-")) {
                    String steixio1 = stoixeia.get(count - 1);
                    String steixio2 = stoixeia.get(count + 1);
                    double Dsteixio1 = Double.parseDouble(steixio1);
                    double Dsteixio2 = Double.parseDouble(steixio2);
                    pollaplas = Dsteixio1 - Dsteixio2;
                    stoixeia.remove(count + 1);
                    stoixeia.remove(count);
                    stoixeia.remove(count - 1);
                    String Spollaplas = String.valueOf(pollaplas);
                    stoixeia.add(count - 1, Spollaplas);
                    plithos = stoixeia.size();
                    count = 0;
                }
                count += 1;
            }
            String apotelesma = stoixeia.get(0);
            result.setText(apotelesma);
        }
        // ======================binary_t_hexadecimal======================
        else if (e.getSource() == binary_t_hexadecimal) {
            String apotelesma = "";
            String number = result.getText();
            int diadiko = 0;
            String w = result.getText();
            int all = w.length();
            for (int i = 0; i < all; i++) {
                char h = w.charAt(i);
                String s = String.valueOf(h);
                if (s.equals("1") || s.equals("0")) {
                    diadiko += 1;
                }
            }
            if (diadiko == all) {
                if (all % 4 != 0) {
                    if (all % 4 == 1) {
                        number = "0" + "0" + "0" + number;
                    } else if (all % 4 == 2) {
                        number = "0" + "0" + number;
                    } else {
                        number = "0" + "0" + "0" + number;
                    }
                }
                int thesi = 0;
                all = number.length();
                int p3 = all - 1;
                for (int i = p3; i > 2; i = i - 4) {
                    int sum2 = 0;
                    thesi = 1;
                    for (int j = 0; j < 4; j++) {
                        char h = number.charAt(p3);
                        String s = String.valueOf(h);
                        if (s.equals("1")) {
                            sum2 = sum2 + thesi;
                        }
                        thesi = thesi * 2;
                        p3 = p3 - 1;
                    }
                    if (sum2 > 9) {
                        if (sum2 == 10) {
                            apotelesma = "A" + apotelesma;
                        } else if (sum2 == 11) {
                            apotelesma = "B" + apotelesma;
                        } else if (sum2 == 12) {
                            apotelesma = "C" + apotelesma;
                        } else if (sum2 == 13) {
                            apotelesma = "D" + apotelesma;
                        } else if (sum2 == 14) {
                            apotelesma = "E" + apotelesma;
                        } else if (sum2 == 15) {
                            apotelesma = "F" + apotelesma;
                        }
                    } else {
                        String s1 = String.valueOf(sum2);
                        apotelesma = s1 + apotelesma;
                    }
                }
                result.setText(apotelesma);
            } else {
                result.setText("ERROR");
            }
        }
        // ========================decimal_t_hexadecimal=================================
        else if (e.getSource() == decimal_t_hexadecimal) {

            int check = 0;
            String w = result.getText();
            int all = w.length();
            for (int i = 0; i < all; i++) {
                char h = w.charAt(i);
                String s = String.valueOf(h);
                if (s.equals("A") || s.equals("B") || s.equals("C") || s.equals("D") || s.equals("E")
                        || s.equals("F")) {
                    check += 1;
                }
            }
            if (check == 0) {
                String apotelesma = "";
                String number = result.getText();
                int bnumber = Integer.parseInt(number);
                int bnumber2 = Integer.parseInt(number);
                int ypo = bnumber % 16;
                int ypo2 = bnumber2 / 16;
                int t = 1;
                while (ypo2 != 0) {
                    ypo2 = ypo2 / 16;
                    t = t + 1;
                }
                int r = 0;
                while (r < t) {
                    if (ypo > 9) {
                        if (ypo == 10) {
                            apotelesma = "A" + apotelesma;
                        } else if (ypo == 11) {
                            apotelesma = "B" + apotelesma;
                        } else if (ypo == 12) {
                            apotelesma = "C" + apotelesma;
                        } else if (ypo == 13) {
                            apotelesma = "D" + apotelesma;
                        } else if (ypo == 14) {
                            apotelesma = "E" + apotelesma;
                        } else if (ypo == 15) {
                            apotelesma = "F" + apotelesma;
                        }
                    } else {
                        String s1 = String.valueOf(ypo);
                        apotelesma = s1 + apotelesma;
                    }
                    bnumber = bnumber / 16;
                    ypo = bnumber % 16;
                    r = r + 1;
                }
                result.setText(apotelesma);
            } else {
                result.setText("ERROR");
            }
        }
        // ==================binary_t_decimal==================
        else if (e.getSource() == binary_t_decimal) {
            String apotelesma = "";
            String number = result.getText();
            int diadiko = 0;
            String w = result.getText();
            int all = w.length();
            for (int i = 0; i < all; i++) {
                char h = w.charAt(i);
                String s = String.valueOf(h);
                if (s.equals("1") || s.equals("0")) {
                    diadiko += 1;
                }
            }
            if (diadiko == all) {
                if (all % 4 != 0) {
                    if (all % 4 == 1) {
                        number = "0" + "0" + "0" + number;
                    } else if (all % 4 == 2) {
                        number = "0" + "0" + number;
                    } else {
                        number = "0" + "0" + "0" + number;
                    }
                }
                int decimal = Integer.parseInt(number, 2);
                apotelesma = String.valueOf(decimal);
                result.setText(apotelesma);
            } else {
                result.setText("ERROR");
            }
        }
        // -----------------------------hexadecimal_t_decimal--------------------
        else if (e.getSource() == hexadecimal_t_decimal) {
            String apotelesma = "";
            String number = result.getText();
            if (apotelesma.equals("")) {
                String digits = "0123456789ABCDEF";
                number = number.toUpperCase();
                int val = 0;
                for (int i = 0; i < number.length(); i++) {
                    char c = number.charAt(i);
                    int d = digits.indexOf(c);
                    val = 16 * val + d;
                }
                apotelesma = String.valueOf(val);
            }
            result.setText(apotelesma);
        }
        // =======================hexadecimal_t_binary==========================
        else if (e.getSource() == hexadecimal_t_binary) {
            String w = result.getText();
            int num = (Integer.parseInt(w, 16));
            String num2 = (Integer.toBinaryString(num));
            String apotelesma = String.valueOf(num2);
            result.setText(apotelesma);
        }

        // ========================decimal_t_binary====================
        else if (e.getSource() == decimal_t_binary) {
            int check = 0;
            String w = result.getText();
            int all = w.length();
            for (int i = 0; i < all; i++) {
                char h = w.charAt(i);
                String s = String.valueOf(h);
                if (s.equals("A") || s.equals("B") || s.equals("C") || s.equals("D") || s.equals("E")
                        || s.equals("F")) {
                    check += 1;
                }
            }
            if (check == 0) {
                int num = Integer.parseInt(w);
                String apotelesma = (Integer.toBinaryString(num));
                result.setText(apotelesma);
            } else {
                result.setText("ERROR");
            }
        }
        // ========================Back space==========================
        if (e.getSource() == back_space) {
            String word = "";
            String number = result.getText();
            int all = number.length();
            for (int i = 0; i < all - 1; i++) {
                char h = number.charAt(i);
                String s = String.valueOf(h);
                word = word + s;
            }
            result.setText(word);
        }
        // ========================clean==========================
        if (e.getSource() == clean) {
            result.setText("");
        }
    }
}