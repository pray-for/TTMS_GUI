package TTMS_GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhangjiawen on 2017/3/20.
 */

/**
 * 显示影片信息界面
 * @author 韦梦亭
 */
public class MovieInformation {

    public JTabbedPane MovieInformation() {
        String[] strings_new = {"影片名称", "时长", "开始放映日期", "结束放映日期"
                , "票价"};
        Object[][] objects_new = {{"消失的爱人", 88, "2017年3月16日", "2017年4月17日", 40},
                {"盗墓笔记", 90, "2017年3月16日", "2017年4月17日", 30},
                {"大鱼海棠", 120, "2017年3月13日", "2017年4月11日", 40},
                {"你的名字", 120, "2017年3月17日", "2017年4月19日", 30},
                {"疯狂动物城", 100, "2017年3月12日", "2017年4月15日", 40},
                {"美人鱼", 120, "2017年3月13日", "2017年4月19日", 40},
                {"寒战", 120, "2017年3月16日", "2017年4月17日", 30}};

        JTabbedPane jTabbedPane_movie = new JTabbedPane();
        Movie movie = new Movie();
        jTabbedPane_movie.add("最新影片", movie.Movie_New(strings_new, objects_new));
        jTabbedPane_movie.setTabPlacement(JTabbedPane.TOP);

        return jTabbedPane_movie;
    }
}

    class Movie{

        private DefaultTableModel tableModel_new;//新品
        private JTable jTable_new;

        public JPanel Movie_New(String[] biaotou,Object[][] chengyuan){
            JPanel jPanel = new JPanel();

            jPanel.setLayout(new GridBagLayout());
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            Insets insets = new Insets(10, 5, 0, 5);
            gridBagConstraints.insets = insets;

            JLabel jLabel = new JLabel("最新影片");
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            jLabel.setFont(new java.awt.Font("Dialog", 1, 25));
            jPanel.add(jLabel, gridBagConstraints);

            gridBagConstraints.fill = GridBagConstraints.BOTH;
            jTable_new = List(biaotou,chengyuan);

            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.weightx = 150;
            gridBagConstraints.weighty = 120;
            JScrollPane jScrollPane = new JScrollPane();
            jScrollPane.setViewportView(jTable_new);
            jPanel.add(jScrollPane, gridBagConstraints);


            JPanel jPanel5 = new JPanel();

            gridBagConstraints.gridx=0;
            gridBagConstraints.gridy=2;
            gridBagConstraints.weightx = 10;
            gridBagConstraints.weighty = 10;
            jPanel.add(jPanel5, gridBagConstraints);

            JButton jButton = new JButton();//确认电影按钮
            gridBagConstraints.gridx=0;
            gridBagConstraints.gridy=2;
            gridBagConstraints.weightx = 10;
            gridBagConstraints.weighty = 5;
            jButton.setText("确认");
            jPanel5.add(jButton , gridBagConstraints);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //进入选座界面
//                    BookInformation bookInformation = new BookInformation();
//                    bookInformation.BookInformation();
                }
            });

            return jPanel;
        }


        public JTable List(String[] biaotou,Object[][] chengyuan){

            tableModel_new = new DefaultTableModel(chengyuan, biaotou);
            JTable jTable1 = new JTable(tableModel_new);

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


    }
