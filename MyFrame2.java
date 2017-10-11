import javax.swing.*;

public class MyFrame2 extends JFrame{

	public MyFrame2() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame2 f=new MyFrame2();//main()이 MyFrame2 안으로 이동
	}

}
