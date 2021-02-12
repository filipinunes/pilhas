import javax.swing.JOptionPane;

public class usaPilha {
	
	public static void main(String[] args) {
		Pilha teste = new Pilha();
		int opt;
		do {
			String input = JOptionPane.showInputDialog("Menu "
					+ "\n1 - inserir "
					+ "\n2 - retirar "
					+ "\n3 - mostrar"
					+ "\n4 - vagas"
					+ "\n5 - cabeça"
					+ "\n9 - sair");
			opt = Integer.parseInt(input);
			
			switch(opt) {
			case 1:
				String novo = JOptionPane.showInputDialog("Digite o novo elemento da pilha");
				int novoInt = Integer.parseInt(novo);
				teste.inserir(novoInt);
				break;
			case 2: 
				teste.retirar();
				break;
			case 3: 
				teste.mostrar();
				break;
			case 4: 
				System.out.println(teste.vagas());
				break;
			case 5: 
				System.out.println(teste.cabeca());
				break;
			}
		
		} while(opt != 9);
		

	}
}
