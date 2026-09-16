package pcmania.modelo;

/*
 * Classe MemoriaUSB
 * -------------------------
 * Representa a memória USB (pendrive) que acompanha
 * o computador como brinde.
 *
 * ATRIBUTOS:
 * - nome
 * - capacidade
 *
 * REGRAS:
 * - Todos os atributos devem ser private.
 * - nome representa o tipo/nome da memória USB.
 * - capacidade representa a capacidade em GB.
 *
 * CONSTRUTOR:
 * - Criar construtor recebendo os atributos necessários.
 *
 * GETTERS/SETTERS:
 * - Criar somente quando forem realmente necessários.
 *
 * IMPORTANTE:
 * - A MemoriaUSB é um componente associado ao computador.
 * - Não deve possuir lógica relacionada à compra.
 */

public class MemoriaUSB {

    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return nome + " " + capacidade + "GB";
    }
}
