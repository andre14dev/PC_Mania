package pcmania;

/*
 * Classe principal PCMania
 * -------------------------
 * Ponto de entrada do sistema
 *
 * Passo a passo esperado:
 *
 * 1) Dados estáticos (não vêm do usuário):
 *    Criar as 3 promoções (objetos Computador), cada uma com seus
 *    HardwareBasico (processador, memória RAM, HD), SistemaOperacional
 *    e MemoriaUSB de brinde, conforme a tabela do enunciado.
 *
 *    Lembrete:
 *    - Os dados das promoções são fixos.
 *    - Não devem ser solicitados ao usuário.
 *    - O preço de cada promoção depende da matrícula,
 *      conforme especificado no enunciado.
 *
 * 2) Criar o Cliente:
 *    - nome
 *    - cpf
 *
 * 3) Fluxo de compra (única parte com entrada de dados do usuário):
 *    - perguntar qual PC o cliente deseja comprar;
 *    - código 1 = Promoção 1;
 *    - código 2 = Promoção 2;
 *    - código 3 = Promoção 3;
 *    - código 0 = finalizar compra.
 *
 * 4) Repetir a pergunta:
 *    - permitir que o cliente compre mais de um computador;
 *    - guardar os computadores escolhidos;
 *    - pode utilizar ArrayList<Computador>.
 *
 * 5) Ao digitar 0:
 *    - finalizar o fluxo de compra;
 *    - transformar a lista de computadores comprados em array,
 *      caso seja necessário pelo metodo exigido;
 *    - calcular o total da compra;
 *    - exibir os dados do cliente;
 *    - exibir o total;
 *    - exibir a configuração de cada computador comprado;
 *    - chamar ProcessarPedido.processarPedido(...).
 *
 * IMPORTANTE:
 * - A PCMania é responsável pelo fluxo principal do programa.
 * - É aqui que deve ficar o Scanner.
 * - Os dados das promoções são estáticos.
 * - Não criar lógica desnecessária nas outras classes.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pcmania.modelo.Cliente;
import pcmania.modelo.Computador;
import pcmania.modelo.HardwareBasico;
import pcmania.modelo.MemoriaUSB;
import pcmania.modelo.SistemaOperacional;
import pcmania.util.ProcessarPedido;

public class PCMania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matricula = 967;

        Computador promocao1 = new Computador(
                "Apple", matricula,
                new HardwareBasico("Core i5", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500),
                new SistemaOperacional("macOS Sequoia", 64));
        promocao1.addMemoriaUSB(new MemoriaUSB("Pendrive", 16));

        Computador promocao2 = new Computador(
                "Samsung", matricula + 1,
                new HardwareBasico("Core i7", 3570),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000),
                new SistemaOperacional("Windows 8", 64));
        promocao2.addMemoriaUSB(new MemoriaUSB("Pendrive", 32));

        Computador promocao3 = new Computador(
                "Dell", matricula + 2,
                new HardwareBasico("Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000),
                new SistemaOperacional("Windows 10", 64));
        promocao3.addMemoriaUSB(new MemoriaUSB("Pendrive Extremo", 1000));

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        List<Computador> compras = new ArrayList<>();
        int codigo;
        do {
            System.out.println("\nEscolha o PC (1, 2 ou 3) ou 0 para finalizar:");
            codigo = scanner.nextInt();
            switch (codigo) {
                case 1:
                    compras.add(promocao1);
                    break;
                case 2:
                    compras.add(promocao2);
                    break;
                case 3:
                    compras.add(promocao3);
                    break;
                case 0:
                    System.out.println("Finalizando compra...\n\n");
                    break;
                default:
                    System.out.println("\n\nCódigo inválido.\n\n");
            }
        } while (codigo != 0);

        Computador[] computadoresComprados = compras.toArray(new Computador[0]);

        float total = cliente.calculaTotalCompra(computadoresComprados);

        System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());

        System.out.printf(new java.util.Locale("pt", "BR"),
                "Total da compra: R$ %.2f%n", total);

        System.out.println("\n\n===========================\n");
        ProcessarPedido.processarPedido(computadoresComprados);

        scanner.close();
    }
}