
public class Pilha {
	private int usuarios[];
	private int top;
	
	Pilha(){
		usuarios = new int[15];
		usuarios[0] = 15; 
		top = -1;
	}
	
	public boolean inserir(int novo) {
		if(vagas() > 0) {
			usuarios[15 - vagas()] = novo;
			top ++;
			return true;
		}
		System.out.println("Não há espaço suficiente na pilha para novos elementos.");
		return false;
	}

	public boolean retirar() {
		if (top<0) {
			return false;
		}
		usuarios[top] = 0;
		top --;
		return true;
	}
	
	public int vagas() {
		return usuarios.length - top - 1;
	}
	
	
	public int cabeca() {
		if(top < 0) {
			return -99;
		} else {
			return usuarios[top];
		}
	}
	
	public void mostrar() {
		for(int i = 0; i <= top; i++) {
			System.out.print(usuarios[i] + "");
		}
	}
	
}
