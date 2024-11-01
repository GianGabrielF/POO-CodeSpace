package gg_Code;

import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Atividade4 {

    private Scanner keyboard = new Scanner(System.in);

    public void converteNumero(){
        char[] digitos = 
        {'0','1','2','3','4','5','6','7','8','9','A','B','C','D',
    'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
    'Y','Z','Γ','Δ','Θ','Ξ','Π','Σ','Φ','Ψ','Ω'};           
    
        System.out.println("Digite um numero: ");
        int n = this.keyboard.nextInt();

        System.out.println("Valor em decimal: " + n);
        System.out.println("Valor em binário: " + Integer.toBinaryString(n));
        System.out.println("Valor em Octal: " + Integer.toOctalString(n));
        System.out.println("Valor em hexadecimal: " + Integer.toHexString(n));
        
        System.out.println("\n Menu do Conversor: ");
        System.out.println("1-> Converter número para outra base");
        System.out.println("2-> Voltar ao menu principal");
        int opt = this.keyboard.nextInt();
        switch (opt) {
            case 1 -> {
                System.out.println("Digite qual a base se quer converter o número (de 1 até 45)");
                int base = this.keyboard.nextInt();
                while(base<=0 && base > 45){
                    System.out.println("base inadequada,tente novamente");
                    base = this.keyboard.nextInt();
                }
                char[] digitosBase = new char[base];
                for(int i=0;i<base;i++){
                    digitosBase[i]=digitos[i];
                }
                char[] casasDecimais = new char[10];
                int j = n/base;
                int i = 1;
                casasDecimais[0] = digitosBase[n%base];
                casasDecimais[i]=(j==1)? '1':'\0';
                while(j>1){
                    casasDecimais[i]= digitosBase[j%base];
                    j=j/base;
                    i++;
                    casasDecimais[i]=(j==1)? '1':'\0';
                }
                String numero = "";

                for(i=9;i>=0;i--){
                    if(casasDecimais[i]!='\0'){
                        if(!numero.isBlank()){
                            numero += Character.toString(casasDecimais[i]);
                        } else {
                            numero = Character.toString(casasDecimais[i]);
                        }
                    }
                    
                }
                System.out.println(numero);

            }

            
            case 2 ->System.out.println("Voltando ao menu principal");
            default -> System.out.println("Código inválido, voltando ao menu principal");
        }

    }

    public void verificaCaracter(){
        System.out.println("Digite um Caracter");
        char c = this.keyboard.next().charAt(0);
        String s;
        s = (Character.isLetter(c))?"É uma Letra":"Não é uma letra";
        System.out.println(s);
        s = (Character.isDigit(c))?"É um digito": "Não é um digito";
        System.out.println(s);
        s = (Character.isUpperCase(c))?"É uma letra maiúscula": "Não é uma letra maiúscula";
        System.out.println(s);
        s= (Character.isLowerCase(c))?"É uma letra minúscula": "Não é uma letra minúscula";
        System.out.println(s);
        s= (Character.isEmoji(c))?"É um emoji": "Não é um emoji";
        System.out.println(s);

        
    }

    public static void main(String[] args) {
        Atividade4 guia = new Atividade4();
        int option;

        do{

            System.out.println("\n1- Conversor de números");
            System.out.println("2- Verificador de Caracteres");
            System.out.println("3- Retorna ao menu");
            System.out.println("0- Sair");

            System.out.println("Digite a sua opcao");
            option = guia.keyboard.nextInt();

            switch (option) {
                case 1->guia.converteNumero();
                case 2->guia.verificaCaracter();
                case 3->System.out.println("Retornando ao menu inicial");   
                case 0->System.out.println("Saindo");
            
                default-> System.out.println("Código inválido,tente outro");
            }

        } while(option != 0);
    }
    
}
