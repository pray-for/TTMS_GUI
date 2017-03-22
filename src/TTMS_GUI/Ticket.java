package TTMS_GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

/**
 * Created by zhangjiawen on 2017/3/20.
 */

public class Ticket {

//    private DefaultTableModel tableModel_jintina;
//    private JTable jTable_jintian;

    private DefaultTableModel tableModel_yingting;
    private JTable jTable_yingitng;

    public JTabbedPane Ticket(){
        JTabbedPane jTabbedPane_PiaoWuGuanLi = new JTabbedPane();

        String[] strings = {"电影名","今天售票数","总售票数"};
        Object[][] objects = {{"消失的爱人",39,500},{"盗墓笔记",20,100},
                {"大鱼海棠",30,429},{"你的名字",40,221},
                {"疯狂动物城",39,223},{"美人鱼",38,443},
                {"寒战",23,110}};

        String[] strings1 = {"放映厅名称","今天售票","总售票"};
        Object[][] objects1 = {{"1号放映厅",435,1996},{"2号放映厅",234,897},
                {"3号放映厅",354,1864},{"4号放映厅",345,9988}};


        jTabbedPane_PiaoWuGuanLi.add("剧目售票统计", JinTianSHouPiao(strings,objects));
        jTabbedPane_PiaoWuGuanLi.add("影厅售票统计",YingTingSHouPaio(strings1,objects1));

        jTabbedPane_PiaoWuGuanLi.setTabPlacement(JTabbedPane.TOP);

        return jTabbedPane_PiaoWuGuanLi;
    }

    /**
     * 票房统计界面
     * @author 董孟愿
     */
    public JPanel JinTianSHouPiao(String[] biaotou,Object[][] chengyuan){
//        JPanel jPanel = new JPanel();
//
//        jPanel.setLayout(new GridBagLayout());
//        GridBagConstraints gridBagConstraints = new GridBagConstraints();
//        Insets insets = new Insets(10, 5, 0, 5);
//        gridBagConstraints.insets = insets;
//
//        JLabel jLabel = new JLabel("剧目售票统计");
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 0;
//        jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
//        jPanel.add(jLabel, gridBagConstraints);
//
//        gridBagConstraints.fill = GridBagConstraints.BOTH;
//        jTable_jintian = ZhiBiao_jintian(biaotou,chengyuan);
//
//
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 1;
//        gridBagConstraints.weightx = 120;
//        gridBagConstraints.weighty = 100;
//        JScrollPane jScrollPane = new JScrollPane();
//        jScrollPane.setViewportView(jTable_jintian);
//        jPanel.add(jScrollPane, gridBagConstraints);
//
//        JPanel jPanel5 = new JPanel();
//
//        gridBagConstraints.gridx=0;
//        gridBagConstraints.gridy=2;
//        gridBagConstraints.weightx = 10;
//        gridBagConstraints.weighty = 10;
//        jPanel.add(jPanel5, gridBagConstraints);
//
//        return jPanel;

        DefaultTableModel model = null;
        JTable table = null;
        JButton addBtn = null;

        JPanel jPanel_zong = new JPanel();
        JPanel jpanel = new JPanel();
        JPanel jpanel1 = new JPanel();
        jPanel_zong.setLayout(null);             //空布局
        jpanel.setLayout(null);
        jpanel.setBounds(0, 0, 500, 60);   //设定位置坐标


        String[][] datas = {};       //二维数组存储销售信息
        String[] titles = { "影片名", "单价","销售数量","总销售额","删除" };
        model = new DefaultTableModel(datas, titles);
        String[] a = {"消失的爱人","40","800","24000","删除"};
        model.addRow(a);
        String[] b = {"盗墓笔记","30","200","70000","删除"};
        model.addRow(b);
        String[] c = {"大鱼海棠","40","100","3000","删除"};
        model.addRow(c);
        String[] d = {"你的名字","30","200","6000","删除"};
        model.addRow(d);
        String[] e = {"疯狂动物城","40","100","3500","删除"};
        model.addRow(e);
        String[] f = {"美人鱼","40","100","3500","删除"};
        model.addRow(f);
        String[] g = {"寒战","30","100","3500","删除"};
        model.addRow(g);

        JLabel jLabel_title = new JLabel("剧目售票统计");
        jLabel_title.setFont(new java.awt.Font("Dialog", 1, 25));
        jLabel_title.setBounds(200,0,500,50);
        table = new JTable(model);
        JLabel jlabel = new JLabel("影片名称:");
        JTextArea jtext = new JTextArea();       //添加输入框
        jlabel.setBounds(30,40,60,30);
        jtext.setBounds(100, 45, 150, 20);
        addBtn = new JButton("查看票房");
        addBtn.setBounds(400,40,120,30);
        JButton jbutton = new JButton("查看选座");
        jbutton.setBounds(400,300,100,30);
        jpanel.add(jLabel_title);
        jpanel.add(jlabel);
        jpanel.add(jtext);
        jpanel.add(addBtn);
        jpanel1.setBounds(0,100,550,400);
        jPanel_zong.add(jpanel);
        jpanel1.add(new JScrollPane(table));
        jPanel_zong.add(jpanel1);
        jPanel_zong.add(jbutton);

        return jPanel_zong;
    }

    public JPanel YingTingSHouPaio(String[] biaotou,Object[][] chengyuan){
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("影厅售票统计");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
        jPanel.add(jLabel, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        jTable_yingitng = ZhiBiao_yingting(biaotou,chengyuan);


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 120;
        gridBagConstraints.weighty = 100;
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable_yingitng);
        jPanel.add(jScrollPane, gridBagConstraints);


        JPanel jPanel5 = new JPanel();

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;
    }


//    public JTable ZhiBiao_jintian(String[] biaotou,Object[][] chengyuan){
//
//        tableModel_jintina = new DefaultTableModel(chengyuan, biaotou);
//        JTable jTable1 = new JTable(tableModel_jintina);
//        jTable1.setRowHeight(30);
//
//        DefaultTableCellRenderer r   =   new   DefaultTableCellRenderer();
//        r.setHorizontalAlignment(JLabel.CENTER);
//        jTable1.setDefaultRenderer(Object.class,   r);
//
//        //设置表头居中
//        JTableHeader tbh = jTable1.getTableHeader();
//        DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
//        renderer.setHorizontalAlignment(SwingConstants.CENTER);
//
//        return jTable1;
//    }


    public JTable ZhiBiao_yingting(String[] biaotou,Object[][] chengyuan){

        tableModel_yingting = new DefaultTableModel(chengyuan, biaotou);
        JTable jTable1 = new JTable(tableModel_yingting);
        jTable1.setRowHeight(30);

        DefaultTableCellRenderer   r   =   new   DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(Object.class,   r);

        //设置表头居中
        JTableHeader tbh = jTable1.getTableHeader();
        DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        return jTable1;
    }

}

