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

    private DefaultTableModel tableModel_jintina;
    private JTable jTable_jintian;

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

    public JPanel JinTianSHouPiao(String[] biaotou,Object[][] chengyuan){
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("剧目售票统计");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
        jPanel.add(jLabel, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        jTable_jintian = ZhiBiao_jintian(biaotou,chengyuan);


        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 120;
        gridBagConstraints.weighty = 100;
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable_jintian);
        jPanel.add(jScrollPane, gridBagConstraints);

        JPanel jPanel5 = new JPanel();

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;
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


    public JTable ZhiBiao_jintian(String[] biaotou,Object[][] chengyuan){

        tableModel_jintina = new DefaultTableModel(chengyuan, biaotou);
        JTable jTable1 = new JTable(tableModel_jintina);
        jTable1.setRowHeight(30);

        DefaultTableCellRenderer r   =   new   DefaultTableCellRenderer();
        r.setHorizontalAlignment(JLabel.CENTER);
        jTable1.setDefaultRenderer(Object.class,   r);

        //设置表头居中
        JTableHeader tbh = jTable1.getTableHeader();
        DefaultTableCellRenderer  renderer = (DefaultTableCellRenderer)tbh.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        return jTable1;
    }


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

