package TTMS_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhangjiawen on 2017/3/20.
 */

public class YanChuTing{

    public JLabel jLabel_weizhi1 = new JLabel();



    public JTabbedPane YanChuTing(){

        JTabbedPane jTabbedPane_yingyuanguanli = new JTabbedPane();
        jTabbedPane_yingyuanguanli.add("演出厅信息",YanChuTingXiXin());

        return jTabbedPane_yingyuanguanli;
    }
    public JTabbedPane YanChuTingXiXin(){
        JTabbedPane jTabbedPane_yanchutingxixin = new JTabbedPane();
        jTabbedPane_yanchutingxixin.setTabPlacement(SwingConstants.RIGHT);

        jTabbedPane_yanchutingxixin.add("1号演出厅",YanChuTing1());
        jTabbedPane_yanchutingxixin.add("2号演出厅",YanChuTing1());
        jTabbedPane_yanchutingxixin.add("3号演出厅",YanChuTing1());
        jTabbedPane_yanchutingxixin.add("4号演出厅",YanChuTing1());

        return jTabbedPane_yanchutingxixin;
    }

    public JPanel ShnegChengZuoWei(int a,int b){
        JPanel jPanel_shengchengZuowei = new JPanel();
        jPanel_shengchengZuowei.setLayout(new GridLayout(a, b,10,10));
        int i;
        int j;
        ImageIcon icon_white = new ImageIcon("F:\\JavaProgram\\RenJiJieMian\\src\\seat_white.png");
        ImageIcon icon_red = new ImageIcon("F:\\JavaProgram\\RenJiJieMian\\src\\seat_red.png");
        ImageIcon icon_green = new ImageIcon("F:\\JavaProgram\\RenJiJieMian\\src\\seat_green.png");
        JButton[][] buttons = new JButton[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j] = new JButton();
                if ((i==2&&j==3)||(i==5&&j==5)||(i==7&&j==2)){
                    buttons[i][j].setIcon(icon_red);
                }else {
                    buttons[i][j].setIcon(icon_white);
                }
                buttons[i][j].addActionListener(new ActionListener() {
                    int a;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        JButton button = (JButton) e.getSource();
                        a++;
                        if (a%2!=0) {
                            button.setBackground(Color.red);
                        }
                    }
                });
                jPanel_shengchengZuowei.add(buttons[i][j]);
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

        JLabel jLabel = new JLabel("演出厅座位表");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
        jPanel.add(jLabel, gridBagConstraints);


        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JPanel jPanel3 = NiaoKanTu(8,11);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 120;
        gridBagConstraints.weighty = 100;
        jPanel.add(jPanel3, gridBagConstraints);

        JPanel jPanel5 = new JPanel();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.gridwidth=2;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;
    }

    public JScrollPane YingTingXinXi(int a,int b){

        JPanel jPanel_Zuowei = ShnegChengZuoWei(a,b);
        JScrollPane jScrollPane = new JScrollPane(jPanel_Zuowei);

        return jScrollPane;
    }

    public JPanel NiaoKanTu(int a,int b){
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
        gridBagConstraints.weightx = 120;
        gridBagConstraints.weighty = 120;
        gridBagConstraints.gridwidth = 2;
        jPanel.add(jScrollPane, gridBagConstraints);

        return jPanel;
    }


}
