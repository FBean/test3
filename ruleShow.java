import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
public class ruleShow extends JFrame implements ActionListener

{
	JLabel la1;
	JLabel la2;
	JLabel la3;
	JLabel la4;
	JButton bu1;
	Container Con1,Con2,Con3;
	ruleShow()
	{  

	   setTitle("��Ϸ����");
	   la1=new JLabel("ɨ����Ϸ�Ĺ������£�");
	   la1.setForeground(new Color(255,0,0));
	   la1.setSize(200,26);
	   la2=new JLabel("1,��Ϸ���������������׼������ͼ�ʱ��");
	   la3=new JLabel("2,ͨ�����������ڿ�����,����ڿ����ǵ��ף����������Ϸ.");
	   la4=new JLabel("3,��������ϳ�������,��ʾ������Χ�İ˸������й��ж��ٿŵ���.");
	   bu1=new JButton("�ر�");
	   Con1=new Container();
	   Con2=new Container();
	   Con3=new Container();
	   Con1.setLayout(new GridLayout(4,1));
	   Con3.setLayout(new FlowLayout());
	   Con2.setLayout(new FlowLayout());
	   bu1.addActionListener(this);
	   setLayout(new FlowLayout());
	   Con2.add(la1);
	   Con1.add(la2);
	   Con1.add(la3);
	   Con1.add(la4);
	   Con3.add(bu1);
	   add(Con2,BorderLayout.NORTH);
	   add(Con1,BorderLayout.CENTER);
	   add(Con3,BorderLayout.SOUTH);
	   setBounds(100,100,420,200);
	   setVisible(false);
	   validate();
	   	addWindowListener(new WindowAdapter()
		{
		
		public void windowClosing(WindowEvent k)
		{
			setVisible(false);
		}
		}
		);   
	}
	public void actionPerformed(ActionEvent e)
	{
          setVisible(false);		
	}
}
