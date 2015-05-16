import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;
public class userDefine extends JFrame implements ActionListener
{
	Label 行数,列数,雷数,分数;
	Label 说明1,说明2,说明3,说明4;
	TextField 行数1,列数1,雷数1,分数1;
	Panel 容器1,容器2,容器3;
	Button 确定,取消;
;   //userDefineWrongMessage 错误信息;
	public userDefine()
	{
		说明1=new Label("说明： 行数指的是设置雷区的行数");
		说明2=new Label("         列数指的是设置雷区的列数");
		说明3=new Label("         地雷数指的是设置总共的地雷数");
     	说明3=new Label("         地雷数指的是设置总共的地雷数");
		说明4=new Label("         分数指的是每赢一局得到的分数");
		行数=new Label("行数");
		列数=new Label("列数");
		雷数=new Label("雷数");
		分数=new Label("分数");
		行数1=new TextField(10);
	    列数1=new TextField(10);
	    雷数1=new TextField(10);
	    分数1=new TextField(10);
	    确定=new Button("确定");
        取消=new Button("取消");
	    容器1=new Panel();
	    容器2=new Panel();
	    容器3=new Panel();
	    //错误信息=new userDefineWrongMessage();
	    容器1.setLayout(new GridLayout(4,1));;
	    //容器2.setLayout(new GridLayout(3,2));
	    //容器3.setLayout(new FlowLayout(FlowLayout.RIGHT));
	   容器1.add(说明1);
	   容器1.add(说明2);
	   容器1.add(说明3);
	   容器1.add(说明4);
	   容器2.add(行数);
	   容器2.add(行数1);
	   容器2.add(列数);
	   容器2.add(列数1);
	   容器2.add(雷数);
	   容器2.add(雷数1);
	   容器2.add(分数);
	   容器2.add(分数1);
	   容器3.add(确定);
       容器3.add(取消); 
       
	   说明1.setFont(new Font("Arial",Font.BOLD,12));
       说明1.setForeground(new Color(255,0,0));
       说明2.setFont(new Font("Arial",Font.BOLD,12));
       说明2.setForeground(new Color(255,0,0));
       说明3.setFont(new Font("Arial",Font.BOLD,12));
       说明3.setForeground(new Color(255,0,0));
       说明4.setFont(new Font("Arial",Font.BOLD,12));
       说明4.setForeground(new Color(255,0,0));
        行数.setFont(new Font("Arial",Font.BOLD,12));
        列数.setFont(new Font("Arial",Font.BOLD,12));
        雷数.setFont(new Font("Arial",Font.BOLD,12));
        分数.setFont(new Font("Arial",Font.BOLD,12));
        确定.setFont(new Font("Arial",Font.BOLD,12));
        取消.setFont(new Font("Arial",Font.BOLD,12));
	    add(容器1,BorderLayout.NORTH);
	    add(容器2,BorderLayout.CENTER);
	    add(容器3,BorderLayout.SOUTH);
	    确定.addActionListener(this);
	    取消.addActionListener(this);
	    setTitle("自定义扫雷难度");
	    setResizable(true);
	    setVisible(false);
	   // setModal(true);
	    setBounds(100,100,320,220); 
	} 
	   public void setvisible(boolean b)
	    {
	    	setVisible(b);
	    }
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==确定)
		{
       try
      {   
		int m=Integer.parseInt(行数1.getText());
		int n=Integer.parseInt(列数1.getText());
		int p=Integer.parseInt(雷数1.getText());
		int q=Integer.parseInt(分数1.getText());
	    MineGame.mineArea.initMineArea(m,n,p,q);
		MineGame.mineArea.setBounds(100,100,18*m,18*n);
		setVisible(false);
      }
      catch(Exception a)
        {
           JOptionPane.showMessageDialog(this,"您输入的信息为空或有误!","警告对话框",JOptionPane.WARNING_MESSAGE);
        }	
	    }
	    else
	    {
	    	setVisible(false);
	    }
	}
}
