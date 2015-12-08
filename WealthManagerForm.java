import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class WealthManagerForm extends JFrame{

    Vector<String> Asset = new Vector<String>(10,1);
    
    //Asset.add(Asset.getName);
    
    public void Setup(){
        this.createJFrame();
        this.createMenuBar();
    }
    
    
    public JFrame createJFrame(){
        JFrame frame = new JFrame("Wealth Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbAssets = new JLabel("Assets");
        JLabel lbDetails = new JLabel("Asset Details");
        JComboBox comboTypesList = new JComboBox();
	comboTypesList.setSelectedIndex(2);
	comboTypesList.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
		JComboBox jcmbType = (JComboBox) e.getSource();
            }
        });
        frame.add(lbAssets);
        frame.add(lbDetails);
        
        
        return frame;
    }
    
    
    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
 
        menuBar = new JMenuBar();
 
        menu = new JMenu("New");
        menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
        menuBar.add(menu);
 
        menuItem = new JMenuItem("Bank Account");
        menuItem.getAccessibleContext().setAccessibleDescription("T");
        menuItem.addActionListener(new MenuActionListener());
        menu.add(menuItem);

        menuItem = new JMenuItem("Stock");
        menuItem.getAccessibleContext().setAccessibleDescription("");
        menuItem.addActionListener(new MenuActionListener());
        menu.add(menuItem);

        menuItem = new JMenuItem("Car");
        menuItem.getAccessibleContext().setAccessibleDescription("");
        menuItem.addActionListener(new MenuActionListener());
        menu.add(menuItem);

        return menuBar;
    }
    
    class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        
        }

    }

    
    
    
    
}
