import javax.swing.*;

class exe16 {
	
	public static void somatoria(int vetor[]){
		int calc = 0;
		for (int i = 0; i < vetor.length;i++){
			calc = calc + vetor[i];
		}
		JOptionPane.showMessageDialog(null,"A somatoria é: " + calc);
	}
	
	public static int produto(int vetor[]){
		int p=1;
		for (int i = 0; i < vetor.length;i++){
			p = p * vetor[i];
		}
		return p;
	}
	
	public static void main(String entrada[]){
		int vetor[]= new int[5];
		int prod;
		String msg = "vetor= ";
		
		for(int i = 0; i < vetor.length; i++){
			vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para vetor na posicao " + i));
			msg = msg + vetor[i] + "  ";
		}

		JOptionPane.showMessageDialog(null,msg);
		
		somatoria(vetor);
		prod = produto(vetor);
		JOptionPane.showMessageDialog(null,"a produtoria é: " + prod);
	}
}