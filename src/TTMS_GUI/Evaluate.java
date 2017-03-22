package TTMS_GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhangjiawen on 2017/3/22.
 */

/**
 * 用户评价界面
 * @author 王思柔
 */
public class Evaluate {

    public JPanel PingJia() {

        JPanel jPanel_zong = new JPanel();
        JPanel jPanel = new JPanel(new GridLayout(4,1));

        JPanel jPanel_use = new JPanel(new FlowLayout());//用户名
        JPanel jPanel_movie = new JPanel(new FlowLayout());//电影名
        JPanel jPanel_evaluate = new JPanel(new FlowLayout());//评价
        JPanel jPanel_ok = new JPanel(new FlowLayout());//确认

        JLabel jLabel_use = new JLabel("用户名");
        JLabel jLabel_movie = new JLabel("电影名");
        JLabel jLabel_evaluate = new JLabel("评价");

        JTextField use = new JTextField(15);
        JTextField movie = new JTextField(15);
        JTextField evaluate = new JTextField(20);
        evaluate.setSize(50,30);
        JButton ok = new JButton("提交");

        jPanel_use.add(jLabel_use);
        jPanel_use.add(use);
        jPanel_movie.add(jLabel_movie);
        jPanel_movie.add(movie);
        jPanel_evaluate.add(jLabel_evaluate);
        jPanel_evaluate.add(evaluate);
        jPanel_ok.add(ok);


        jPanel.add(jPanel_use);
        jPanel.add(jPanel_movie);
        jPanel.add(jPanel_evaluate);
        jPanel.add(jPanel_ok);

        jPanel_zong.add(jPanel);
        jPanel_zong.setVisible(true);

        return jPanel_zong;

    }
}