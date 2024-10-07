package funcoesstring;

public class FuncoesString {

	public static void main(String[] args) {
		String original = "abcd FGHIJ ABC abc DEFG";
		
		// convertendo em letras minúsculas
		String s01 = original.toLowerCase();
		System.out.println(s01);
		
		// convertendo em letras maiúsculas
		String s02 = original.toUpperCase();
		System.out.println(s02);
		
		// eliminar espaços da string
		String s03 = original.trim();
		System.out.println(s03);
		
		// pegando somente um caractere de uma posição em diante - neste caso, caractere na posição 2
		String s04 = original.substring(2);
		System.out.println(s04);
		
		// Pegando um caractere tal até outro caractere tak
		String s05 = original.substring(2, 7);
		System.out.println(s05);
		
		// Trocando as letras com replace, primeira letra será trocada pela segunda
		String s06 = original.replace('a', 'x'); // trocar toda letra a por x
		System.out.println(s06);
		
		// Trocando varias strings ao mesmo tempo com replace
		String s07 = original.replace("abc", "xyz");
		System.out.println(s07);
		
		// Onde estão os indices?
		int i = original.indexOf("bc");
		System.out.println(i);
		// Ultimos indices
		int j = original.lastIndexOf("bc");
		System.out.println(j);
		
		// Usando o split para cortar as splits
		String s = "potato apple lemon";
		String[] vect = s.split(" "); // Aqui vai separar por espaço.
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		// Acima vai digitir e imprimir a variavel s em três partes.		
		

	}

}
