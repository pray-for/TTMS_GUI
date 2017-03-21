package TTMS_GUI;


import javax.swing.*;


/**
 * Created by zhangjiawen on 2017/3/20.
 */
public class Manage extends JFrame{

    public Manage(){
        this.setTitle("剧院票务管理系统");
        this.setSize(800, 550);			//大小
        this.setLocationRelativeTo(null);		//窗体出现居中
        this.setDefaultCloseOperation(3);		//设置关闭操作
        this.setResizable(true);

        YanChuTing yanchuting = new YanChuTing();
        Ticket ticket = new Ticket();
        JuMuGuanLi juMuGuanLi = new JuMuGuanLi();

        JTabbedPane jTabbedPane = new JTabbedPane();

        jTabbedPane.add("演出厅管理",yanchuting.YanChuTing());
        jTabbedPane.add("票务管理", ticket.Ticket());
        jTabbedPane.add("剧目管理", juMuGuanLi.JuMuGuanLi());

        jTabbedPane.setTabPlacement(JTabbedPane.LEFT);
        this.add(jTabbedPane);
        this.setVisible(true);
    }


}
