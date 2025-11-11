import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int opcoes = 0;
        
       while(opcoes!=3){
            System.out.println("<-- Sistema Nota Fiscal -->");
            System.out.println("Escolha uma opcão a baixo");
            System.out.println();
            System.out.println("1- Nota Fiscal");
            System.out.println("2- Cadastrar");
            System.out.println("3- Sair");
            opcoes = input.nextInt();
            input.nextLine();
            
            System.out.println();
            if(opcoes ==1){
                System.out.println("Qual o seu regime?");
                System.out.println("Digite apenas o número equivalente.");
                System.out.print("1- Normal / 2- Simples: ");
                int regime = input.nextInt();
                input.nextLine();
                
                System.out.println();
                
                System.out.print("Nome do Cliente: ");
                String cliente = input.nextLine();
                input.nextLine();
                
                System.out.println();
                
                System.out.print("CPF/CNPJ: ");
                String cpfCnpj = input.nextLine();
                
                System.out.println();
                
                System.out.print("CFOP:");
                int cfop = input.nextInt();
                input.nextLine();
                
                System.out.println();
                
                
                if(regime ==1){
                    System.out.print("IPI: ");
                    int ipi = input.nextInt();
                    System.out.println();
                    System.out.print("ICMS: ");
                    int icms = input.nextInt();
                    System.out.println();
                    input.nextLine();
                    
                    while (true) {
                        System.out.print("Produto: ");
                        String produto = input.nextLine();
                        if (produto.isEmpty()) {
                           break;
                         }
    
                        System.out.print("Valor: R$ ");
                        double valor = input.nextDouble();
                         input.nextLine(); 
    
    
                        System.out.println("Produto adicionado!\n");
                    }
                    
                }
                else if(regime == 2){
                    System.out.println();
                        while (true) {
                        System.out.print("Produto: ");
                        String produto = input.nextLine();
                        if (produto.isEmpty()) {
                           break;
                         }
    
                        System.out.print("Valor: R$ ");
                        double valor = input.nextDouble();
                         input.nextLine(); 
    
                        
                    }
                }
            }
            
            if(opcoes == 2){
                System.out.println("Escolha uma das opções a baixo");
                System.out.println("1- Cadastrar Cliente");
                System.out.println("2- Cadastrar Vendedor");
                System.out.println("3- Cadastrar Transportadora");
                int escolha = input.nextInt();
                input.nextLine();
                
                if(escolha == 1){
                    System.out.print("Nome do Cliente: ");
                    String nomeCLiente = input.nextLine();
                    System.out.println();
                    System.out.print("Telefone: ");
                    String telefoneCliente = input.nextLine();
                    System.out.println();
                    System.out.print("Endereço: ");
                    String enderecoCliente = input.nextLine();
                    System.out.println();
                    System.out.print("Número: ");
                    int numeroEndereco = input.nextInt();
                    System.out.println("Cadastro concluído");
                }
                else if (escolha == 2){
                     System.out.print("Nome do Vendedor: ");
                    String nomeVendedor = input.nextLine();
                    System.out.println();
                    System.out.print("Telefone: ");
                    String telefoneVendedor = input.nextLine();
                    System.out.println();
                    System.out.print("Número crachá: ");
                    int numeroVendedor = input.nextInt();
                    System.out.println("Cadastro concluído");
                }
                else if (escolha ==3){
                   System.out.print("Nome da Transportadora: ");
                    String nomeTransportadora = input.nextLine();
                    System.out.println();
                    System.out.print("Telefone: ");
                    String telefoneTransportadora = input.nextLine();
                    System.out.println();
                    System.out.print("Endereço: ");
                    String enderecoTransportadora = input.nextLine();
                    System.out.println();
                    System.out.print("Número: ");
                    int numeroTransportadora = input.nextInt();
                    System.out.println("Cadastro concluído"); 
                }
                else{
                    System.out.println("Opção invalida");
                }
            }
            if(opcoes == 3){
                System.out.println("Encerrando o programa");
                System.exit(0);
            }
       }
    }
}
