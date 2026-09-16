package pcmania.util;

/*
 * Classe ProcessarPedido
 * -------------------------
 * Classe utilitária responsável por finalizar/processar
 * o pedido realizado pelo cliente.
 *
 * REGRAS:
 * - A classe deve possuir um metodo estático.
 * - O metodo deve receber o array de computadores
 *   comprados pelo cliente.
 *
 * MeTODO:
 *
 * processarPedido(...)
 *    - Recebe os computadores comprados.
 *    - Exibe a mensagem:
 *
 *          "Pedido enviado..."
 *
 * IMPORTANTE:
 * - Esta classe não deve pedir dados ao usuário.
 * - Não deve possuir Scanner.
 * - Não deve controlar o menu de compra.
 * - Sua função é somente representar o processamento/finalização
 *   do pedido.
 */


import pcmania.modelo.Computador;

public class ProcessarPedido {

    private ProcessarPedido() {
    }

    public static void processarPedido(Computador[] computadoresComprados) {
        for (Computador c : computadoresComprados) {
            c.mostraPCConfigs();
        }
        System.out.println("Pedido enviado...");
    }
}