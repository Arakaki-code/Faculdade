import javax.swing.*;

class ProgDecisao{
	public static void main(String entrada[]){
		int num;
		char op=0;
		String msg = "" , msgEntr="Digite 1 para Par/Impar\nDigite 2 para positivo/negativo";
	
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
	
		switch(op){
			case '1': {
				if (num % 2 == 0) {
					msg = msg + num + "é par.\n";
				} 
				else {
					msg = msg +num+ "é impar\n";
				}
				JOptionPane.showMessageDialog(null,msg);
				break;
			}
			case '2': {
				if (num > 0){
					msg =msg +num+ "é positivo\n";
				} 
				else {
					msg = msg + num+ "é negativo\n";
				}
				JOptionPane.showMessageDialog(null,msg);
				break;
			}
			default: JOptionPane.showMessageDialog(null,"Opção invalidade, calculos nao realizados");
		
		}
		System.exit(0);
	}
}