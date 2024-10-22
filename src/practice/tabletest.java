/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author IT
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class tabletest {
    

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Basic JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Data for the table (2D array)
        

        // Column names
        String[] columnNames = {"ID", "Name", "Age"};

        // Create the JTable with the data and column names
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        JTable table=new JTable(model);
        for(int i=0;i<20;i++)
        {
            String id,name,age;
            id=String.valueOf(i);
            name="user"+i;
            age="20"+i;
            model.addRow(new Object[]{id,name,age});
        }
        // Add the table to a JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane (with the table) to the frame
        frame.add(scrollPane);

        // Display the frame
        frame.setVisible(true);
    }
}
