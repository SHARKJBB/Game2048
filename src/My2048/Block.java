package My2048;

/**
 * Created by 捷宝宝 on 2017/5/18.
 */
import javax.swing.*;
import java.awt.*;
public class Block extends JLabel
{
    private int value;
    public Block()
    {
        value = 0;//初始化值为0
        setFont(new Font("font", Font.PLAIN, 40));//设定字体
        setBackground( Color.GRAY);//设定初始颜色为浅灰色
    }

    public int getValue()//获取值
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
        String text = String.valueOf(value);
        if (value != 0)
            setText(text);
        else
            setText("");//如果值为0则不显示
        setColor();
    }

    //根据值的不同设定不同的背景颜色、label字体
    public void setColor()
    {
        switch (value)
        {
            case 0:
                setBackground(Color.gray);
                break;
            case 2:
                setBackground(new Color(240, 252, 255));
                break;
            case 4:
                setBackground(new Color(243, 249, 241));
                break;
            case 8:
                setBackground(new Color(224, 240, 233));
                break;
            case 16:
                setBackground(new Color(192, 235, 215));
                break;
            case 32:
                setBackground(new Color(164, 226, 198));
                break;
            case 64:
                setBackground(new Color(127, 236, 173));
                break;
            case 128:
                setBackground(new Color(123, 207, 166));
                break;
            case 256:
                setBackground(new Color(96, 209, 184));
                break;
            case 512:
                setBackground(new Color(72, 192, 163));
                break;
            case 1024:
                setBackground(new Color(81, 154, 115));
                break;
            case 2048:
                setBackground(new Color(0, 155, 207));
                break;
            case 4096:
                setBackground(new Color(6, 82, 121));
                break;
        }
    }
}