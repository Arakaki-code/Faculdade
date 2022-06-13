import javax.swing.*;
class ProgRepeticao {
	public static void main (String entrada[]){
		int tabuada;
		char op=0;
		String msg="", msgEntr="Digite 1 repeticao For\nDigite 2 repeticao While\nDigite 3 repeticao Do/While";
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro: "));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch (op){
			case '1':{
				msg = msg + tabuada + " pelo For:\n";
				for (int i=1; i<=10;i=i+1){
					msg = msg +tabuada + " x " + i + " = "+tabuada*i + "\n";
					
				}

				break;
			}
			case '2':{
				msg = msg + "tabuada do " + tabuada + "pelo While: \n;";
				int i = 1;
				while(i<=10){
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
					i = i + 1;

				}
				break;
			}
			case '3': {
				msg = msg + "tabuada do " + tabuada + "pelo Do/While:\n\n";
				int i = 1;
				do {
					msg = msg + tabuada + " x "+ i + " = " + tabuada*i + "\n";
					i=i+1;

				} while(i<=10);
				break;
			}
			default: JOptionPane.showMessageDialog(null, "Opcao Invalida");
		}
	}
}