import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class back extends JFrame{
    private JLabel jlb1 = new JLabel();
    private JLabel jlb2 = new JLabel();
    private JLabel jlb3 = new JLabel();
    private Container cp ;
    private JPanel jpn = new JPanel();
    private ImageIcon icon1 = new ImageIcon("bg1.png");
    private ImageIcon icon2 = new ImageIcon("bg2.png");
    private Timer t1 ;
    private int lb1X = 0 , lb2X = 884 , lb3X = 1262 ;

    public back () {
        this.init();
    }

    private void init () {
        setBounds(50,50,1250,735);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpn);
        jpn.setLayout(null);

        jpn.add(jlb1);
        jlb1.setBounds(0,0,884,685);
        jlb1.setIcon(icon1);
        jpn.add(jlb2);
        jlb2.setBounds(880,0,380,685);
        jlb2.setIcon(icon2);
        jpn.add(jlb3);
        jlb3.setBounds(1258,0,884,685);
        jlb3.setIcon(icon1);

        t1 = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb1.setLocation(lb1X,0);
                jlb2.setLocation(lb2X,0);
                jlb3.setLocation(lb3X,0);
                if (lb1X <= -880){
                    jpn.remove(jlb1);
                    jpn.add(jlb1);
                    jlb1.setBounds(1258,0,884,685);
                    lb1X = 1258;
                }
                if (lb2X <= -374){
                    jpn.remove(jlb2);
                    jpn.add(jlb2);
                    jlb2.setBounds(1764,0,380,685);
                    lb2X = 1764;
                }
                if (lb3X <= -880){
                    jpn.remove(jlb3);
                    jpn.add(jlb3);
                    jlb3.setBounds(1258,0,884,685);
                    lb3X = 1258;
                }
                lb1X -= 1 ;
                lb2X -= 1 ;
                lb3X -= 1 ;
            }
        });

        t1.start();
    }
}
