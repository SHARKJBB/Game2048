package My2048;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 捷宝宝 on 2017/5/18.
 */
public class MainFrame extends JFrame {
    //设定游戏窗口
    public MainFrame() {
        setTitle("Game4096");//设置标题
        setSize(400, 400);//设定窗口大小
//设定窗口起始位置
// 方法一：设定窗口左上角坐标位置
//  setLocation(500, 200);
// 方法二：在屏幕中间弹出
        // 取得屏幕的宽度
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        // 取得屏幕的高度
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        setLocation((width - 400) / 2, (height - 400) / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//保证窗口关闭后程序结束运行

        //设定布局方式为GridLayout型
        getContentPane().setLayout(new GridLayout(4, 4, 5, 5));
        new Operation(this);
        this.setVisible(true);//设为可视
    }

    public static void main(String args[]) //程序入口点
    {
        try {
//            UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceRavenGraphiteLookAndFeel");//设定UI
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//            SwingUtilities.updateComponentTreeUI(bar);
        } //接受抛出的异常
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);//设定Frame的缺省外观
        new MainFrame();
    }
}
