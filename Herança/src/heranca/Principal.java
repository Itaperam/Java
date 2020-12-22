package heranca;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Animal animal = new Animal();
		
		cachorro.cor = "preto";
		cachorro.nome = "Spike";
		cachorro.tamanho = 20;
		
		System.out.println("Nome: "+ cachorro.nome);
		System.out.println("Cor: "+ cachorro.cor);
		System.out.println("Tamanho: "+ cachorro.tamanho);
		
		cachorro.movimento();
		
		//animal.movimento();

	}

}
