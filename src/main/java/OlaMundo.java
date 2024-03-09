import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args){
        System.out.println("Olá, Mundo!");

        String teste;
        float n;
        Empregado empregado = new Empregado();  // empregado é um tipo,  o new guarda um espaço na memeria
        empregado.setSalario(1000f);   //f --- 
        System.out.println(empregado.getSalario());
    
        Empregado e2 = new Empregado();
        e2.setSalario(2000f);

        e2.setName("20000f");

        String valor = "4000";
        double d = 909009;
        float f = (float) d;
        float f2 = Float.valueOf(valor);
        String s2 = String.valueOf(d);
        System.out.println(s2);


        if(f2 >= 4000){
            System.out.println("valor maior q 4000");        
        
        } else {
            System.out.println("valor menor q 4000");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String resposta = s.nextLine();
        System.out.println("Boa noite" + resposta);

    }
}