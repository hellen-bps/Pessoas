package vetor;

import java.util.*;

public class criarPessoa {
	
	public static void main(String[] args) {
		pessoa[]  vetorPessoas = new pessoa[5];
		
	//criando pessoa
		vetorPessoas[0] = new pessoa ("Eduardo", "Salvador", "(71) 95678-1234");
		vetorPessoas[1] = new pessoa ("Daniela", "Curitiba", "(41) 91234-5678");
		vetorPessoas[2] = new pessoa ("Camila", "Belo Horizonte", "(31) 98765-4321");
		vetorPessoas[3] = new pessoa ("Ana", "São Paulo", "(11) 92301-4403");
		vetorPessoas[4] = new pessoa ("Bruno", "Rio de Janeiro", "(21) 99876-5432");
		
	//listar pessoa
		System.out.println("Listando pessoas");
		
		Arrays.sort(vetorPessoas, Comparator.comparing(pessoa::getNome));

        // Exibe os elementos ordenados
		System.out.println("Listando pessoas");
        for (int i = 0; i < vetorPessoas.length; i++) {
            System.out.println("Posição " + i + ": " + vetorPessoas[i]);
        }
	}
}