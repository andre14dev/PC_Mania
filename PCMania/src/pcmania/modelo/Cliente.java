package pcmania.modelo;

/*
 * Classe Cliente
 * -------------------------
 * Representa o cliente que está realizando a compra.
 *
 * ATRIBUTOS:
 * - nome
 * - cpf
 *
 * REGRAS:
 * - Todos os atributos devem ser private.
 * - Criar o construtor:
 *      Cliente(String nome, String cpf)
 * - Criar getters/setters somente se forem realmente necessários.
 *
 * MÉTODOS:
 *
 * 1) calculaTotalCompra()
 *    - Deve calcular o valor total dos computadores comprados
 *      pelo cliente.
 *    - O método deve trabalhar com os computadores que foram
 *      comprados pelo cliente.
 *
 * IMPORTANTE:
 * - A classe Cliente não deve controlar o fluxo de entrada
 *   de dados do programa.
 * - A escolha dos computadores é responsabilidade da PCMania.
 */


public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(Computador[] computadoresComprados) {
        float total = 0f;
        for (Computador c : computadoresComprados) {
            total += c.getPreco();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}