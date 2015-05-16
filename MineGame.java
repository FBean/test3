import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.io.*;

import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;

public class MineGame extends JFrame implements ActionListener
{
     JMenuBar bar;
     JMenu fileMenu,fileMenu1;////////////////////////
     JMenuItem level1,level2,level3,hero;
     JMenuItem seting,rule,exit;////////////////////////
     static MineArea mineArea=null;
     File Ó¢ÐÛ°ñ=new File("Ó¢ÐÛ°ñ.txt");
     Hashtable hashtable=null;
     ShowRecord showHeroRecord=null;
     userDefine userdefine=new userDefine();///////////////    
     ruleShow ruleshow;////////////////
   
    
     MineGame()
     {
         mineArea=new MineArea(16,16,40,1);
         add(mineArea,BorderLayout.CENTER);
         bar=new JMenuBar();
         
         fileMenu=new JMenu("ÓÎÏ·");
         fileMenu.setMnemonic(KeyEvent.VK_G);
         
         fileMenu1=new JMenu("°ïÖú");//////////////////
         fileMenu1.setMnemonic(KeyEvent.VK_H);/////////////////////
         level1=new JMenuItem("level1",KeyEvent.VK_P);////////////////
         level1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));/////////////
         level2=new JMenuItem("level2",KeyEvent.VK_M);//////////////
         level2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));//////////
         level3=new JMenuItem("level3(H)",KeyEvent.VK_H);//////////
         level3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));/////////
         hero=new JMenuItem("hero",KeyEvent.VK_B);  //////////////
         hero.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));/////////
         seting=new JMenuItem("seting",KeyEvent.VK_S);///////////////
         seting.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));//////////
         rule=new JMenuItem("rule",KeyEvent.VK_R);////////////////
         rule.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));////////        
         exit=new JMenuItem("exit",KeyEvent.VK_E);
         exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));//////////        
         ruleshow=new ruleShow();//////////////        
         fileMenu.add(level1);
         fileMenu.add(level2);
         fileMenu.add(level3);
         fileMenu.add(seting);///////////////////
         fileMenu.add(hero);         
         fileMenu.add(exit);
         fileMenu1.add(rule);//////////////////////        
         bar.add(fileMenu);
         bar.add(fileMenu1);/////////////////////////////
         setJMenuBar(bar);
         level1.addActionListener(this);
         level2.addActionListener(this);
         level3.addActionListener(this);
         hero.addActionListener(this);
         seting.addActionListener(this);///////////////        
         rule.addActionListener(this);//////////////        
         exit.addActionListener(this);
   
         hashtable=new Hashtable();
         hashtable.put("level1","level1#"+999+"#ÄäÃû"); 
         hashtable.put("level2","level2#"+999+"#ÄäÃû");
         hashtable.put("level3","level3#"+999+"#ÄäÃû");
         if(!Ó¢ÐÛ°ñ.exists()) 
         {
            try
            { FileOutputStream out=new FileOutputStream(Ó¢ÐÛ°ñ);
                 ObjectOutputStream objectOut=new ObjectOutputStream(out);
                 objectOut.writeObject(hashtable);
                 objectOut.close();
                 out.close();
            }
            catch(IOException e){}
        }
        showHeroRecord=new ShowRecord(this,hashtable);
        setBounds(100,100,280,380);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
     }
   
     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==level1){
              mineArea.initMineArea(8,8,10,1);
              setBounds(100,100,360,340); 
        }
        if(e.getSource()==level2){
              mineArea.initMineArea(16,16,40,2);
              setBounds(100,100,320,420);
        }
        if(e.getSource()==level3){
              mineArea.initMineArea(22,22,99,3);
              setBounds(100,100,390,450);
        }
        if(e.getSource()==seting)////////////////
         {
         	userdefine.setvisible(true);//////////////
         }
         if(e.getSource()==rule)///////////////
          {
          	ruleshow.setVisible(true);////////////
          }         
        if(e.getSource()==hero){ 
          if(showHeroRecord!=null)
           showHeroRecord.setVisible(true);
        }
          if(e.getSource()==exit){ 
        System.exit(0);
       }
   }
    public static void main(String args[])
    {
        new MineGame();
}  
}
