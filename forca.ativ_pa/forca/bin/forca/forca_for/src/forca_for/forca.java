package forca_for;
import javax.swing.JOptionPane;

public class forca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palavra[] = new String [3]; 
		 String ten;
		 int c2;
		
		 for (int c=0; c<=3; c++) {
				
				palavra[c] = JOptionPane.showInputDialog("Digite uma palavra com 4 letras: ");
			}
		 for (int c2=0; c2 <= 6; c2++) {

			 ten = JOptionPane.showInputDialog("Digite uma letra, a palavra tem 4 letras: ");

			 if("ten" == "palavra") {

			 JOptionPane. showConfirmDialog(null, "A letra está correta");

			 else if("ten" != "palavra") {
			 JOptionPane.showConfirmDialog(null, "A letra não está correta ");

			 else {
			 JOptionPane.showConfirmDialog(null, "Voce perdeu ");

	}

}

			 }
			 