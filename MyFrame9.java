import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class MyFrame9 extends JFrame{

	JButton b1;
    private JButton b2, b3;

    public MyFrame9() {
          setTitle("Absolute Position Test");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setSize(400, 200);
          JPanel p = new JPanel();
          p.setLayout(null);//배치 관리자를 null로 설정한다

          b1 = new JButton("Button #1");
          p.add(b1);
          b2 = new JButton("Button #2");
          p.add(b2);
          b3 = new JButton("Button #3");
          p.add(b3);
          
          b1.setBounds(20, 5, 95, 30);//절대 위치와 크기를 지정
          b2.setBounds(55, 45, 105, 70);
          b3.setBounds(180, 15, 105, 90);
          add(p);
          setVisible(true);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame9 f=new MyFrame9();
	}

}
