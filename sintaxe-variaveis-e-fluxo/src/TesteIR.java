public class TesteIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        //ifs aqui
        float IR = 0;
        int valor = 0;
        if(salario >= 1900.0 && salario <= 2800.0){
        	IR = 7.5f;
        	valor = 142;
        }
        if(salario >= 2800.0 && salario <= 3751.0){
        	IR = 15;
        	valor = 350;
        }
        if(salario >= 3751.01 && salario <= 4664.0){
        	IR = 22.5f;
        	valor = 636;
        }
        
        System.out.println("O salário de R$" + salario + ", a alíquota é de " + (int)IR + "% e a declaração no valor de R$" + (int)valor);
    }
}