package pcmania.modelo;

/*
 * Classe HardwareBasico
 * -------------------------
 * Representa um hardware básico que faz parte do computador.
 *
 * Exemplos:
 * - Processador: "Core i5"
 * - Memória RAM: "Memória RAM"
 * - HD: "HD"
 *
 * ATRIBUTOS:
 * - nome
 * - capacidade
 *
 * REGRAS:
 * - Todos os atributos devem ser private.
 * - nome representa o tipo/nome do hardware.
 * - capacidade deve ser um número inteiro.
 *      -> Processador: capacidade em MHz
 *      -> Memória RAM: capacidade em GB
 *      -> HD: capacidade em GB
 *
 * CONSTRUTOR:
 * - Criar construtor recebendo os atributos necessários.
 *
 * GETTERS/SETTERS:
 * - Criar somente os que realmente forem necessários
 *   para outras classes.
 *
 * IMPORTANTE:
 * - Esta classe apenas representa um hardware.
 * - Não deve possuir lógica de compra.
 */

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return nome + " (" + capacidade + ")";
    }
}