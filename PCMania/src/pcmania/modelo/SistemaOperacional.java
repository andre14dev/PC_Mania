package pcmania.modelo;

/*
 * Classe SistemaOperacional
 * -------------------------
 * Representa o sistema operacional instalado no computador.
 *
 * ATRIBUTOS:
 * - nome
 * - tipo
 *
 * REGRAS:
 * - Todos os atributos devem ser private.
 * - nome representa o sistema operacional.
 *      Ex.: Windows 10
 * - tipo representa a arquitetura em bits.
 *      Ex.: 64
 *
 * CONSTRUTOR:
 * - Criar construtor recebendo os atributos necessários.
 *
 * GETTERS/SETTERS:
 * - Criar somente quando forem realmente necessários.
 *
 * IMPORTANTE:
 * - Esta classe apenas representa o sistema operacional.
 * - Não deve conter lógica de compra.
 */

public class SistemaOperacional {

    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;


    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + " bits)";
    }

}