import javax.swing.*;
import java.awt.*;

public class MouseMove extends JFrame {
    public static JLabel lab = new JLabel();

    public MouseMove() {
    }

    public static void main(String[] args) {
        // MouseMove fm=new MouseMove("����������");
        JFrame fm = new JFrame("����������");
        JPanel fp = new JPanel();
        fp.addMouseMotionListener(new myMouseListener());// ��������ϵ�����ƶ����м�����
        Container con = fm.getContentPane();
        fp.add(lab);
        con.add(fp);
        fm.setSize(200, 80);
        fm.setVisible(true);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            MouseMove.lab.setText("X: " + (int) point.getX() + ", Y: " + (int) point.getY());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e1) {
            }
        }
    }

}