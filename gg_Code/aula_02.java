package gg_Code;

public class aula_02 {
    // Atributo (característica da peça)
    int numeroDePinos;

    public static void main(String[] args) {
        // Criando um objeto (uma peça Lego real)
        aula_02 minhaPeca = new aula_02();
        
        // Definindo o atributo (característica da peça)
        minhaPeca.numeroDePinos = 4;
        
        // Mostrando a característica da peça
        System.out.println("Minha peça Lego tem " + minhaPeca.numeroDePinos + " pinos");
    }
}
