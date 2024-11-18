import java.util.Scanner;

public class Contador 
{    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int parametroUm = input.nextInt();
        int parametroDois = input.nextInt();

        try 
        {
            contar(parametroUm, parametroDois);
        } 
        catch (ParametrosInvalidosException e) 
        { 
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        input.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException 
    {
        if(parametroUm > parametroDois) {
            
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++) 
        {
            System.out.println(i + 1);
        }
    }
}
