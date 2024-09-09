package view;

import javax.swing.JOptionPane;
import controller.ConvertController;

public class Main 
{

	public static void main(String[] args) 
	{
		
		int n = 0;
		
		while (n > 1000 || n <= 0)
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("digite o numero a ser convertido para binário"));
			
			if (n > 1000 || n < 0)
			{
				System.out.println("valor invalido");
			}
		}	
		
		ConvertController c = new ConvertController();
		String bin = c.DectoBin(n);
			
		System.out.println("o valor decimal: " + n + ", em binario é: " + bin);	
	
	}
}
