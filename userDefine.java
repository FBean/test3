import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.JOptionPane;
public class userDefine extends JFrame implements ActionListener
{
	Label ����,����,����,����;
	Label ˵��1,˵��2,˵��3,˵��4;
	TextField ����1,����1,����1,����1;
	Panel ����1,����2,����3;
	Button ȷ��,ȡ��;
;   //userDefineWrongMessage ������Ϣ;
	public userDefine()
	{
		˵��1=new Label("˵���� ����ָ������������������");
		˵��2=new Label("         ����ָ������������������");
		˵��3=new Label("         ������ָ���������ܹ��ĵ�����");
     	˵��3=new Label("         ������ָ���������ܹ��ĵ�����");
		˵��4=new Label("         ����ָ����ÿӮһ�ֵõ��ķ���");
		����=new Label("����");
		����=new Label("����");
		����=new Label("����");
		����=new Label("����");
		����1=new TextField(10);
	    ����1=new TextField(10);
	    ����1=new TextField(10);
	    ����1=new TextField(10);
	    ȷ��=new Button("ȷ��");
        ȡ��=new Button("ȡ��");
	    ����1=new Panel();
	    ����2=new Panel();
	    ����3=new Panel();
	    //������Ϣ=new userDefineWrongMessage();
	    ����1.setLayout(new GridLayout(4,1));;
	    //����2.setLayout(new GridLayout(3,2));
	    //����3.setLayout(new FlowLayout(FlowLayout.RIGHT));
	   ����1.add(˵��1);
	   ����1.add(˵��2);
	   ����1.add(˵��3);
	   ����1.add(˵��4);
	   ����2.add(����);
	   ����2.add(����1);
	   ����2.add(����);
	   ����2.add(����1);
	   ����2.add(����);
	   ����2.add(����1);
	   ����2.add(����);
	   ����2.add(����1);
	   ����3.add(ȷ��);
       ����3.add(ȡ��); 
       
	   ˵��1.setFont(new Font("Arial",Font.BOLD,12));
       ˵��1.setForeground(new Color(255,0,0));
       ˵��2.setFont(new Font("Arial",Font.BOLD,12));
       ˵��2.setForeground(new Color(255,0,0));
       ˵��3.setFont(new Font("Arial",Font.BOLD,12));
       ˵��3.setForeground(new Color(255,0,0));
       ˵��4.setFont(new Font("Arial",Font.BOLD,12));
       ˵��4.setForeground(new Color(255,0,0));
        ����.setFont(new Font("Arial",Font.BOLD,12));
        ����.setFont(new Font("Arial",Font.BOLD,12));
        ����.setFont(new Font("Arial",Font.BOLD,12));
        ����.setFont(new Font("Arial",Font.BOLD,12));
        ȷ��.setFont(new Font("Arial",Font.BOLD,12));
        ȡ��.setFont(new Font("Arial",Font.BOLD,12));
	    add(����1,BorderLayout.NORTH);
	    add(����2,BorderLayout.CENTER);
	    add(����3,BorderLayout.SOUTH);
	    ȷ��.addActionListener(this);
	    ȡ��.addActionListener(this);
	    setTitle("�Զ���ɨ���Ѷ�");
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
		if(e.getSource()==ȷ��)
		{
       try
      {   
		int m=Integer.parseInt(����1.getText());
		int n=Integer.parseInt(����1.getText());
		int p=Integer.parseInt(����1.getText());
		int q=Integer.parseInt(����1.getText());
	    MineGame.mineArea.initMineArea(m,n,p,q);
		MineGame.mineArea.setBounds(100,100,18*m,18*n);
		setVisible(false);
      }
      catch(Exception a)
        {
           JOptionPane.showMessageDialog(this,"���������ϢΪ�ջ�����!","����Ի���",JOptionPane.WARNING_MESSAGE);
        }	
	    }
	    else
	    {
	    	setVisible(false);
	    }
	}
}
