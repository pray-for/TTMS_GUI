package TTMS_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by zhangjiawen on 2017/3/10.
 */
public class Login extends JFrame{

    private JButton jButton_Login;
    private JButton jButton_register;
    private JTextField textField_name;
    private JPasswordField textField_password;
    private JButton jButton_Login1;
    private JButton jButton_register1;
    private JTextField textField_name1;
    private JPasswordField textField_password1;


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Login login = new Login();
        login.showLogin();//调用登录界面
    }

    public void showLogin(){

        this.setTitle("剧院票务管理系统");
        this.setSize(500, 360);			//大小
        this.setLocationRelativeTo(null);		//窗体出现居中
        this.setDefaultCloseOperation(3);		//设置关闭操作
        this.setResizable(true);


        JPanel jPanel_user = new JPanel();//用户面板
        JPanel jPanel_Administer = new JPanel();//管理员面板

        /**
         * 用户登录界面
         */

        jButton_Login = new JButton("登录");//给登录&注册按钮创建对象
        jButton_register = new JButton("注册");

        textField_name = new JTextField(15);//给用户名&密码框创建对象
        textField_password = new JPasswordField(15);

        JLabel jLabel_name = new JLabel("用户名");//给用户名&密码标签创建对象
        JLabel jLabel_password = new JLabel("密  码");

        JPanel jPanel_Login = new JPanel();//给登录&注册&按钮面板创建对象
        JPanel jPanel_password = new JPanel();
        JPanel jPanel_button = new JPanel();

        jPanel_Login.setLayout(new FlowLayout());//给各个面板添加布局以及内容
        jPanel_Login.add(jLabel_name);
        jPanel_Login.add(textField_name);

        jPanel_password.setLayout(new FlowLayout());
        jPanel_password.add(jLabel_password);
        jPanel_password.add(textField_password);

        jPanel_button.setLayout(new FlowLayout());
        jPanel_button.add(jButton_Login);
        jPanel_button.add(jButton_register);

        JPanel jPanel_null = new JPanel();//创建一个新的面板，用于放置用户名&密码&按钮&标题面板
        JPanel jPanel_yi = new JPanel();//创建一个新的面板，用于放置用户名&密码&按钮面板
        jPanel_yi.setLayout(new GridLayout(3, 1));
        jPanel_yi.add(jPanel_null);
        jPanel_yi.add(jPanel_Login);
        jPanel_yi.add(jPanel_password);

        JPanel jPanel_title = new JPanel();//设置标题面板
        jPanel_title.setLayout(new GridLayout(1,3, 10, 10));
        jPanel_title.setBackground(Color.lightGray);

        JPanel jPanel_word = new JPanel();//设置文字面板
        jPanel_word.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        jPanel_word.setBackground(Color.lightGray);

        JLabel jLabel_welcome = new JLabel("欢迎进入剧院票务管理系统");
        jLabel_welcome.setFont(new java.awt.Font("Dialog", 1, 25));
        jLabel_welcome.setForeground(Color.black);
        jPanel_word.add(jLabel_welcome);
        jPanel_title.add(jPanel_word);

        /**
         * 管理员登录界面
         */

        jButton_Login1 = new JButton("登录");//给登录&注册按钮创建对象
        jButton_register1 = new JButton("注册");

        textField_name1 = new JTextField(15);//给用户名&密码框创建对象
        textField_password1 = new JPasswordField(15);

        JLabel jLabel_name1 = new JLabel("用户名");//给用户名&密码标签创建对象
        JLabel jLabel_password1 = new JLabel("密  码");

        JPanel jPanel_Login1 = new JPanel();//给登录&注册&按钮面板创建对象
        JPanel jPanel_password1 = new JPanel();
        JPanel jPanel_button1 = new JPanel();

        jPanel_Login1.setLayout(new FlowLayout());//给各个面板添加布局以及内容
        jPanel_Login1.add(jLabel_name1);
        jPanel_Login1.add(textField_name1);

        jPanel_password1.setLayout(new FlowLayout());
        jPanel_password1.add(jLabel_password1);
        jPanel_password1.add(textField_password1);

        jPanel_button1.setLayout(new FlowLayout());
        jPanel_button1.add(jButton_Login1);
        jPanel_button1.add(jButton_register1);

        JPanel jPanel_null1 = new JPanel();//创建一个新的面板，用于放置用户名&密码&按钮&标题面板
        JPanel jPanel_yi1 = new JPanel();//创建一个新的面板，用于放置用户名&密码&按钮面板
        jPanel_yi1.setLayout(new GridLayout(3, 1));
        jPanel_yi1.add(jPanel_null1);
        jPanel_yi1.add(jPanel_Login1);
        jPanel_yi1.add(jPanel_password1);

        JPanel jPanel_title1 = new JPanel();//设置标题面板
        jPanel_title1.setLayout(new GridLayout(1,3, 10, 10));
        jPanel_title1.setBackground(Color.gray);

        JPanel jPanel_word1 = new JPanel();//设置文字面板
        jPanel_word1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
        jPanel_word1.setBackground(Color.gray);

        JLabel jLabel_welcome1 = new JLabel("欢迎进入剧院票务管理系统");
        jLabel_welcome1.setFont(new java.awt.Font("Dialog", 1, 25));
        jLabel_welcome1.setForeground(Color.black);
        jPanel_word1.add(jLabel_welcome1);
        jPanel_title1.add(jPanel_word1);


        /**
         * 为用户&管理员界面添加完整布局
         */
        jPanel_user.setLayout(new GridLayout(3, 1));
        jPanel_user.add(jPanel_title);
        jPanel_user.add(jPanel_yi);
        jPanel_user.add(jPanel_button);
        jPanel_user.setBackground(Color.blue);

        jPanel_Administer.setLayout(new GridLayout(3, 1));
        jPanel_Administer.add(jPanel_title1);
        jPanel_Administer.add(jPanel_yi1);
        jPanel_Administer.add(jPanel_button1);
        jPanel_Administer.setBackground(Color.blue);

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("用户登录", jPanel_user);
        jTabbedPane.add("管理员登录", jPanel_Administer);
        jTabbedPane.setTabPlacement(JTabbedPane.TOP);
        jTabbedPane.setBackground(Color.lightGray);

        this.setLayout(new GridLayout(1, 1));
        this.add(jTabbedPane);
        this.setVisible(true);


        jButton_Login.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                dispose();
                //用户登录入口,进入售票窗口
                User user = new User();
            }
        });
        jButton_Login1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                dispose();
                //管理员登录入口
                Manage manage = new Manage();
            }
        });

    }
}
