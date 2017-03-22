package TTMS_GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

/**
 * Created by zhangjiawen on 2017/3/20.
 */

/**
 * 剧目管理界面
 * @author 张鸽
 */

public class JuMuGuanLi {

    public JTabbedPane JuMuGuanLi(){

        String[] strings_xinpin  = {"影片名称","时长","开始放映日期","结束放映日期","票价"};
        Object[][] objects_xinpin = {{"消失的爱人",88, "2017年3月16日","2017年4月17日",40},
                {"盗墓笔记",90,"2017年3月16日","2017年4月17日",30},
                {"大鱼海棠",120,"2017年3月13日","2017年4月11日",40},
                {"你的名字",120,"2017年3月17日","2017年4月19日",30},
                {"疯狂动物城",100,"2017年3月12日","2017年4月15日",40},
                {"美人鱼",120,"2017年3月13日","2017年4月19日",40},
                {"寒战",120,"2017年3月16日","2017年4月17日",30}};


        JTabbedPane jTabbedPane_jumuguanli = new JTabbedPane();
        JuMu juMu = new JuMu();
        jTabbedPane_jumuguanli.add("最新影片", juMu.JuMu_XinPin(strings_xinpin, objects_xinpin));
        jTabbedPane_jumuguanli.setTabPlacement(JTabbedPane.TOP);

        return jTabbedPane_jumuguanli;
    }

}
class JuMu{

    private DefaultTableModel tableModel_xinpin;
    private JTable jTable_Xinpin;
    private JTextField jTextField_xinpin_mingcheng;
    private JTextField jTextField_xinpin_shichang;
    private JTextField jTextField_xinpin_kaishifangyingriqi;
    private JTextField jTextField_xinpin_jieshufangyingriqi;
    private JTextField jTextField_xinpin_piaojia;


    public JPanel JuMu_XinPin(String[] biaotou,Object[][] chengyuan){
        JPanel jPanel = new JPanel();

        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        Insets insets = new Insets(10, 5, 0, 5);
        gridBagConstraints.insets = insets;

        JLabel jLabel = new JLabel("新品列表");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
        jPanel.add(jLabel, gridBagConstraints);

        gridBagConstraints.fill = GridBagConstraints.BOTH;
        jTable_Xinpin = ZhiBiao_xinpin(biaotou,chengyuan);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 150;
        gridBagConstraints.weighty = 120;
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(jTable_Xinpin);
        jPanel.add(jScrollPane, gridBagConstraints);


        JPanel jPanel5 = new JPanel();

        jPanel5.setLayout(new GridLayout(3,0));

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout());

        jPanel2.add(new JLabel("影片名称:"));
        jTextField_xinpin_mingcheng = new JTextField(10);
        jPanel2.add(jTextField_xinpin_mingcheng);

        jPanel2.add(new JLabel("时长:"));
        jTextField_xinpin_shichang = new JTextField(10);
        jPanel2.add(jTextField_xinpin_shichang);

        jPanel2.add(new JLabel("票价:"));
        jTextField_xinpin_piaojia = new JTextField(10);
        jPanel2.add(jTextField_xinpin_piaojia);

        JPanel jPanel22 = new JPanel();
        jPanel2.setLayout(new FlowLayout());

        jPanel22.add(new JLabel("结束放映日期:"));
        jTextField_xinpin_jieshufangyingriqi = new JTextField(15);
        jPanel22.add(jTextField_xinpin_jieshufangyingriqi);

        jPanel22.add(new JLabel("开始放映日期:"));
        jTextField_xinpin_kaishifangyingriqi = new JTextField(15);
        jPanel22.add(jTextField_xinpin_kaishifangyingriqi);

        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new FlowLayout());

        final JButton jButton_jumu_zengjia = new JButton("添加影片");
        final JButton jButton_jumu_Xiuagi = new JButton("修改影片");
        final JButton jButton_jumu_shanchu = new JButton("删除影片");


        jPanel3.add(jButton_jumu_zengjia);
        jPanel3.add(jButton_jumu_Xiuagi);
        jPanel3.add(jButton_jumu_shanchu);

        jPanel5.add(jPanel2);
        jPanel5.add(jPanel22);
        jPanel5.add(jPanel3);

        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=2;
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;
        jPanel.add(jPanel5, gridBagConstraints);

        return jPanel;
    }


    public JTable ZhiBiao_xinpin(String[] biaotou,Object[][] chengyuan){

        tableModel_xinpin = new DefaultTableModel(chengyuan, biaotou);
        JTable jTable1 = new JTable(tableModel_xinpin);
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
