package mmj;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class bEntrar {
	
	public void actionPerformed(ActionEvent e) {
		
		if(true) {
			
			
			
	ViewMenu telaDeMenu = new ViewMenu();
	telaDeMenu.setVisible(true);
	
		}else{ 
			JOptionPane.showMessageDialog(null, e, "SENHA OU USUARIO INCORRETO",0);
		}
	}
}
