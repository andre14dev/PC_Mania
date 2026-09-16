
/*
 * Classe Computador
 * -------------------------
 * Representa um computador disponível para compra.
 *
 * ATRIBUTOS:
 * - marca
 * - preco
 *
 * O computador também possui/agrega:
 * - Hardwares básicos
 *      -> processador
 *      -> memória RAM
 *      -> HD
 * - Sistema Operacional
 * - Memória USB (pendrive)
 *
 * REGRAS:
 * - Todos os atributos devem ser private.
 * - Criar construtor com os parâmetros necessários.
 * - Não criar getters/setters sem necessidade.
 *
 * MÉTODOS:
 *
 * 1) mostraPCConfig()
 *    - Deve mostrar na tela a configuração completa do computador:
 *      marca, preço, processador, memória RAM, HD,
 *      sistema operacional e pendrive.
 *
 * 2) addMemoriaUSB(MemoriaUSB musb)
 *    - Deve adicionar uma MemoriaUSB ao computador.
 *
 * IMPORTANTE:
 * - Esta classe representa o PC.
 * - Não deve conter o menu de escolha do cliente.
 * - Não deve pedir dados pelo Scanner.
 */
package pcmania.modelo;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico processador;
    private HardwareBasico memoriaRam;
    private HardwareBasico hd;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB; // 0..1: no máximo um pendrive de brinde não esquece isso dnv kkk

    public Computador(String marca, float preco, HardwareBasico processador,
                      HardwareBasico memoriaRam, HardwareBasico hd,
                      SistemaOperacional sistemaOperacional) {
        this.marca = marca;
        this.preco = preco;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.hd = hd;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaUSB = null;
    }

    public void addMemoriaUSB(MemoriaUSB memoriaUSB) {
        this.memoriaUSB = memoriaUSB;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);

        System.out.printf(new java.util.Locale("pt", "BR"),
                "Preço: R$ %.2f%n", preco);

        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRam);
        System.out.println("HD: " + hd);
        System.out.println("Sistema Operacional: " + sistemaOperacional);

        if (memoriaUSB != null) {
            System.out.println("Brinde: " + memoriaUSB);
        }

        System.out.println("------------------------------");
    }

    public float getPreco() {
        return preco;
    }
}