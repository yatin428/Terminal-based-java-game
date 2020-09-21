import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class imp extends JFrame {
	 
	private JTextField i1;
	private JTextField i2;
	private JTextField i3;
    private JPasswordField passwordField;
    
    public imp() {
    	
    	super("Yatin");
    	setLayout(new FlowLayout());
    	
    	i1=new JTextField(15);
    	add(i1);
    	i2=new JTextField("Enter Text area");
    	add(i2);
    	i3=new JTextField("uneditable",20);
    	i3.setEditable(false);
    	add(i3);
    	passwordField =new JPasswordField("mypass");
    	add(passwordField);
    	
    	thehandler handler=new thehandler();
    	i1.addActionListener(handler);
    	i2.addActionListener(handler);

    	i3.addActionListener(handler);
    	passwordField.addActionListener(handler);
        
    }
    private class thehandler implements ActionListener{
    	public void actionPerformed(ActionEvent event) {
    		
    		String string ="";
    		
    		if(event.getSource()==i1)
    			string=String.format("field 1: %s",event.getActionCommand());
    		else if(event.getSource()==i2)
    		    string=String.format("field 2: %s",event.getActionCommand());
    		    else if(event.getSource()==i3)
    		    	string=String.format("field 3: %s",event.getActionCommand());
    		    else if(event.getSource()==passwordField)
    		    	string=String.format("password field is %s ",event.getActionCommand());
    		
    		JOptionPane.showMessageDialog(null,string);
    	
    }

}
}
