import java.util.Random;
import java.util.Scanner;

public class TesteDeSenhaSegurancaComIfeRandom{
    public static void main(String[] args) {
      
        System.out.println("esta funcionando");
        
       Login("","",0,0);

    }


    public static void Login (String nome, String senha, int visu, int TestePT){
        Scanner tc = new Scanner (System.in);
        Random Al = new Random ();

        System.out.println("Digite um login");
        nome = tc.nextLine();

        System.out.println("Digite uma senha");
        senha = tc.nextLine();
        

        

        int p, t, r ; {
            p= Al.nextInt(10);
            t=Al.nextInt(10);
            r=(p+t);
            }  
            System.out.println("deseja visualizar a senha |1=> Sim|2=> Não|?");
             visu = tc.nextInt();

             System.out.println ("Faça o teste de seguranca" + p + "+" + t + ":");
            TestePT = tc.nextInt();
   
            
            if(visu == 1 &&  TestePT == r){
               System.out.println("acesso permitido");
               System.out.println(senha);
            }else{
               if (visu == 2 && TestePT != r){
                   System.out.println("acesso negado");
                   System.out.println("***********");
               }
            }

       tc.close();
      


    }



   
}