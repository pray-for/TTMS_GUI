package TTMS_GUI;

import javax.swing.*;

/**
 * Created by zhangjiawen on 2017/3/20.
 */
public class User extends JFrame {

    public User(){
        this.setTitle("剧院票务管理系统");
        this.setSize(800, 550);			//大小
        this.setLocationRelativeTo(null);		//窗体出现居中
        this.setDefaultCloseOperation(3);		//设置关闭操作
        this.setResizable(true);

        MovieInformation movieInformation = new MovieInformation();
        BookInformation book = new BookInformation();
        Evaluate evaluate = new Evaluate();

        JTabbedPane jTabbedPane = new JTabbedPane();

        jTabbedPane.add("影片信息" , movieInformation.MovieInformation());
        jTabbedPane.add("订票" , book.BookInformation());
        jTabbedPane.add("评价" , evaluate.PingJia());



        jTabbedPane.setTabPlacement(JTabbedPane.LEFT);
        this.add(jTabbedPane);
        this.setVisible(true);
    }

}
