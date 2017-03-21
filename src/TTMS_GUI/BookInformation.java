package TTMS_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhangjiawen on 2017/3/20.
 */
public class BookInformation {

    private JTabbedPane jTabbedPane_Book;//订票界面的Tab，用于选择演出厅序号

    private String seat;//座位
    private JLabel jLabel_seat1 = new JLabel();

    private JButton[][] buttons1;


    public JPanel BookInformation(){//订票信息
        JPanel jPanel = new JPanel();

        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(5,5,5,5);
        gridBagConstraints.insets = insets;

        JPanel jPanel2 = DianYingPIaoXinxi();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        gridBagConstraints.weightx=100;
        gridBagConstraints.weighty=15;
        jPanel.add(jPanel2,gridBagConstraints);

        JTabbedPane jPanel3 = Theater();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=1;
        gridBagConstraints.weightx=100;
        gridBagConstraints.weighty=100;
        jPanel.add(jPanel3,gridBagConstraints);


        return jPanel;
    }


    public JPanel DianYingPIaoXinxi(){
        JPanel jPanel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(5,5,5,5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("演出厅座位表");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
        jPanel.add(jLabel, gridBagConstraints);

        JPanel jPanel44 = new JPanel();
        jPanel44.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 2));
        JButton jButton_dingpiao = new JButton("订票");
        jButton_dingpiao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog( null,"订票成功！");
            }
        });
        jPanel.add(jButton_dingpiao);

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayout(2,1));

        JPanel jPanel21 = new JPanel();
        jPanel21.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
        return jPanel;
    }



    public JScrollPane YingTingXinXi(int a,int b){

        JPanel jPanel_Zuowei = Seat(a,b);
        JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);

        return jScrollPane;
    }

    public JTabbedPane Theater(){
        jTabbedPane_Book = new JTabbedPane();

        jTabbedPane_Book.add("1号演出厅",YanChuTing1());
        jTabbedPane_Book.add("2号演出厅",YanChuTing1());
        jTabbedPane_Book.add("3号演出厅",YanChuTing1());
        jTabbedPane_Book.add("4号演出厅",YanChuTing1());

        return jTabbedPane_Book;
    }

    public JPanel Seat(int a,int b){
        JPanel jPanel_shengchengZuowei = new JPanel();
        jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
        int i;
        int j;
        ImageIcon icon = new ImageIcon("F:\\JavaProgram\\RenJiJieMian\\src\\seat_white.png");
        ImageIcon icon_red = new ImageIcon("F:\\JavaProgram\\RenJiJieMian\\src\\seat_red.png");
        buttons1 = new JButton[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                buttons1[i][j] = new JButton();
                if ((i==2&&j==3)||(i==5&&j==5)||(i==7&&j==2)){
                    buttons1[i][j].setIcon(icon_red);
                }else {
                    buttons1[i][j].setIcon(icon);
                }

                buttons1[i][j].addActionListener(new ActionListener() {
                    int a;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton button = (JButton) e.getSource();
                        jLabel_seat1.setText(button.getName());
                        jLabel_seat1.setFont(new java.awt.Font("Dialog", 1, 20));
                        a++;
                        if (a%2!=0) {
                            button.setBackground(Color.green);
                        }
                    }
                });
                jPanel_shengchengZuowei.add(buttons1[i][j]);
            }
        }

        return jPanel_shengchengZuowei;
    }


    public JPanel YanChuTing1(){

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JPanel jPanel3 = Seat_Picture(8,11);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 80;
        gridBagConstraints.weighty = 100;
        jPanel.add(jPanel3, gridBagConstraints);

        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayout(8, 1));


        JPanel jPanel45 = new JPanel();
        jPanel45.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));

        JPanel jPanel43 = new JPanel();
        jPanel43.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 2));
        jLabel_seat1.setText(seat);
        jPanel43.add(jLabel_seat1);

        jPanel4.add(jPanel45);
        jPanel4.add(jPanel43);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        jPanel.add(jPanel4, gridBagConstraints);

        JPanel jPanel5 = new JPanel();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;
    }


    public JPanel Seat_Picture(int a,int b){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 10, 10, 1);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel, gridBagConstraints);

        JLabel jLabel3 = new JLabel();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel.add(jLabel3, gridBagConstraints);

        JPanel jPanel2 = new JPanel();
        JLabel jLabel2 = new JLabel("银幕");
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jLabel2);
        jPanel.add(jPanel2, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JScrollPane jScrollPane = YingTingXinXi(a,b);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 100;
        gridBagConstraints.weighty = 100;
        gridBagConstraints.gridwidth = 2;
        jPanel.add(jScrollPane, gridBagConstraints);

        return jPanel;
    }
}
