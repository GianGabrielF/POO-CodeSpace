package gg_Code;

public class Carro { //declaração de classe e o nome dela

    double potencia; //atributo do carro, representado como um número em double
    String cor; //atributo do carro, representando a cor dele como uma string de texto

    public static void main(String[] args) { // declaração de que o programa irá funcionar,ou seja,conversar com o computador
                                            // a partir daqui
        // declara um novo carro
        Carro ford = new Carro(); 
        // declara outro novo carro
        Carro fusca = new Carro();

        //define as características do carro Ford
        ford.potencia = 12.0; 
        ford.cor = "Vermelho";

        //define as características do carro Fusca
        fusca.potencia = 6.0; 
        fusca.cor = "Azul";

        //mostra as características de cada carro respectivamente
        System.out.println("ford: " + ford.cor + " " + ford.potencia); 
        System.out.println("fusca: " + fusca.cor + " " + fusca.potencia);
    }
    
}
