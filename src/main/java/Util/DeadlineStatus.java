/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
// import javax.swing.table.DefaultTableCellRenderer;
import Model.Task;
import java.text.SimpleDateFormat;

/**
 *
 * @author alexa
 */
public class DeadlineStatus extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        label.setHorizontalAlignment( JLabel.CENTER );

        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);

        
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
          
        Date currentDate = new Date();
        Date dateTask = new Date(task.getDeadline().getTime());
        
        if (sdformat.format(currentDate).equals(sdformat.format(dateTask))) {
            
            label.setBackground(Color.YELLOW);
            label.setForeground(Color.BLACK);
            
        } else {
            label.setForeground(Color.WHITE);
            
            if (dateTask.after(currentDate)) {
                
                System.setProperty("after", "0X06DB4F");
                
                label.setBackground(Color.getColor("after"));
                
            } else {
                
                label.setBackground(Color.RED);
                
            }
            
        }

        return label;
    }
}
