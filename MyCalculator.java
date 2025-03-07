import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator implements ActionListener {
    JFrame frame;
    JTextField displayText;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bMul,bDiv,bClr,bDel,bEql,b0,bDec;
    static double a=0,b=0,result=0;
    static int operator =0;
    MyCalculator(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,600,600);
        frame.setResizable(false);
        Font font =new Font("Ariel",Font.PLAIN,16);
        displayText = new JTextField();
        displayText.setBounds(20,20,550,90);
//        displayText.setBackground(Color.gray);
        displayText.setFont(font);
        frame.add(displayText);
        b0 =new JButton("0");
        b1 =new JButton("1");
        b2 =new JButton("2");
        b3 =new JButton("3");
        b4 =new JButton("4");
        b5 =new JButton("5");
        b6 =new JButton("6");
        b7 =new JButton("7");
        b8 =new JButton("8");
        b9 =new JButton("9");
        bAdd =new JButton("+");
        bSub =new JButton("-");
        bMul =new JButton("*");
        bDec =new JButton(".");
        bDel =new JButton("Del");
        bDiv =new JButton("/");
        bClr =new JButton("Clear");
        bEql =new JButton("=");
        b0.setFont(font);
        b0.addActionListener(this);
        b1.setFont(font);
        b1.addActionListener(this);
        b2.setFont(font);
        b2.addActionListener(this);
        b3.setFont(font);
        b3.addActionListener(this);
        b4.setFont(font);
        b4.addActionListener(this);
        b5.setFont(font);
        b5.addActionListener(this);
        b6.setFont(font);
        b6.addActionListener(this);
        b7.setFont(font);
        b7.addActionListener(this);
        b8.setFont(font);
        b8.addActionListener(this);
        b9.setFont(font);
        b9.addActionListener(this);
        bAdd.setFont(font);
        bAdd.addActionListener(this);
        bSub.setFont(font);
        bSub.addActionListener(this);
        bMul.setFont(font);
        bMul.addActionListener(this);
        bDiv.setFont(font);
        bDiv.addActionListener(this);
        bEql.setFont(font);
        bEql.addActionListener(this);
        bClr.setFont(font);
        bClr.addActionListener(this);
        bDel.setFont(font);
        bDel.addActionListener(this);
        bDec.setFont(font);
        bDec.addActionListener(this);
        b0.setBounds(20,150,180,40);
        frame.add(b0);
        b1.setBounds(210,150,170,40);
        frame.add(b1);
        b2.setBounds(390,150,180,40);
        frame.add(b2);
        b3.setBounds(20,200,180,40);//b1
        frame.add(b3);
        b4.setBounds(210,200,170,40);//b2
        frame.add(b4);
        b5.setBounds(390,200,180,40);//b3
        frame.add(b5);
        b6.setBounds(20,250,180,40);//c1
        frame.add(b6);
        b7.setBounds(210,250,170,40);//c2
        frame.add(b7);
        b8.setBounds(390,250,180,40);//c3
        frame.add(b8);
        b9.setBounds(20,300,180,40);//d1
        frame.add(b9);
        bAdd.setBounds(210,300,170,40);//d2
        frame.add(bAdd);
        bSub.setBounds(390,300,180,40);//d3
        frame.add(bSub);
        bMul.setBounds(20,350,180,40);//e1
        frame.add(bMul);
        bDiv.setBounds(210,350,170,40);//e2
        frame.add(bDiv);
        bDel.setBounds(390,350,180,40);//e3
        frame.add(bDel);
        bDec.setBounds(20,400,180,40);//f1
        frame.add(bDec);
        bEql.setBounds(210,400,170,40);//f2
        frame.add(bEql);
        bClr.setBounds(390,400,180,40);//f3
        frame.add(bClr);

    }

    public static void main(String[] args) {
        new MyCalculator();
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b0){
            displayText.setText(displayText.getText().concat("0"));
        }
        if (e.getSource()==b1){
            displayText.setText(displayText.getText().concat("1"));
        }
        if (e.getSource()==b2){
            displayText.setText(displayText.getText().concat("2"));
        }
        if (e.getSource()==b3){
            displayText.setText(displayText.getText().concat("3"));
        }
        if (e.getSource()==b4){
            displayText.setText(displayText.getText().concat("4"));
        }
        if (e.getSource()==b5){
            displayText.setText(displayText.getText().concat("5"));
        }
        if (e.getSource()==b6){
            displayText.setText(displayText.getText().concat("6"));
        }
        if (e.getSource()==b7){
            displayText.setText(displayText.getText().concat("7"));
        }
        if (e.getSource()==b8){
            displayText.setText(displayText.getText().concat("8"));
        }
        if (e.getSource()==b9){
            displayText.setText(displayText.getText().concat("9"));
        }
        if (e.getSource()==bAdd){
            a=Double.parseDouble(displayText.getText());
            operator = 1;
            displayText.setText("");
        }
        if (e.getSource()==bSub){
            a=Double.parseDouble(displayText.getText());
            operator = 2;
            displayText.setText("");
        }
        if (e.getSource()==bMul){
            a=Double.parseDouble(displayText.getText());
            operator = 3;
            displayText.setText("");
        }
        if (e.getSource()==bDiv){
            a=Double.parseDouble(displayText.getText());
            operator = 4;
            displayText.setText("");
        }
        if (e.getSource()==bDec){
            displayText.setText(displayText.getText().concat("."));
        }
        if (e.getSource()==bEql){
            b=Double.parseDouble(displayText.getText());
            switch (operator){
                case 1:result=a+b;
                break;
                case 2:result=a-b;
                break;
                case 3:result=a*b;
                break;
                case 4:result=a/b;
                break;
            }
            displayText.setText(""+result);
        }
        if (e.getSource()==bDel){
            String s =displayText.getText();
            displayText.setText("");
            for (int i=0;i<s.length()-1;i++){
                displayText.setText(displayText.getText()+s.charAt(i));
            }
        }
        if (e.getSource()==bClr){
            displayText.setText("");
        }
    }
}
