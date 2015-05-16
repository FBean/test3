import javax.swing.*;
import java.awt.*;
public class BlockView extends JPanel{ 
     JLabel blockNameOrIcon; //用来显示Block对象的name、number和mineIcon属性
     JButton blockCover;     //用来遮挡blockNameOrIcon.
     CardLayout card;        //卡片式布局
     BlockView(){
        card=new CardLayout();
        setLayout(card);
        blockNameOrIcon=new JLabel("",JLabel.CENTER);
        blockNameOrIcon.setFont(new Font("Arial",Font.BOLD,12));;////////////////
        blockNameOrIcon.setHorizontalTextPosition(AbstractButton.CENTER);
        blockNameOrIcon.setVerticalTextPosition(AbstractButton.CENTER); 
        blockCover=new JButton(); 
        add("cover",blockCover);
        add("view",blockNameOrIcon);
     }
     public void giveView(Block block){
        if(block.isMine){
           blockNameOrIcon.setText(block.getName());
           blockNameOrIcon.setIcon(block.getMineicon());
        }
        else {
           int n=block.getAroundMineNumber();
           setBackground(new Color(0,0,122));
           if(n>=1)
           {
           
             blockNameOrIcon.setText(""+n);
               if(n==1)//////////////
                  blockNameOrIcon.setForeground(new Color(255,0,0));////////
               if(n==2)////
               blockNameOrIcon.setForeground(new Color(0,0,255));////////
               if(n==3)
               blockNameOrIcon.setForeground(new Color(0,255,0));///
               if(n==4)///
               blockNameOrIcon.setForeground(new Color(125,200,200));////
               if(n==5)//
               blockNameOrIcon.setForeground(new Color(200,0,50));/////
             }
           else
             blockNameOrIcon.setText(" ");
        }
     }
     public void seeBlockNameOrIcon(){
        card.show(this,"view");
        validate();
     }
     public void seeBlockCover(){
        card.show(this,"cover");
        validate();
     }
     public JButton getBlockCover(){
        return blockCover;
     } 
}
