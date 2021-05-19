package com.grupo11.pedidos.Handler;

import com.grupo11.pedidos.entity.ItemPedido;
import com.grupo11.pedidos.entity.Pedido;
import com.grupo11.pedidos.util.InOut;
import java.util.Date;
// instanciar itensPedido dentro do construtor de Pedido?
// Falta implementar o uso de get/set?

public class Handlers
{
    public static final String CADASTRO_DE_ITEM = "CADASTRO DE ITEM";
    public static final String ADICIONAR_ITEM = "ADICIONAR ITEM AO PEDIDO?";
    public static final String EXIBIR_PEDIDO = "EXIBIR PEDIDO";

    public static int direcionarEscolha(int escolha)
    {
        switch (escolha)
        {
            case 1: // Criar pedido
//                ItemPedido itens = new ItemPedido();
                Pedido pedido = new Pedido();
                boolean continuar = true;
                while(continuar)
                {
                    String nomeitem = InOut.leString("Nome do Item", CADASTRO_DE_ITEM);
                    int qtdItem = InOut.leInt("Quantidade do Item", CADASTRO_DE_ITEM);
                    float precoItem = InOut.leFloat("Preço Item", CADASTRO_DE_ITEM);

                    pedido.inserirItemPedido(nomeitem, qtdItem, precoItem);

                    continuar = InOut.leBoolean("Deseja adicionar mais itens ao pedido?", ADICIONAR_ITEM);

                }
                break;

            case 2: // Buscar pedido
                int pedidoId = InOut.leInt("Informe o id do pedido a ser exibido", EXIBIR_PEDIDO);

                InOut.MsgSemIcone(String.format("Pedido %d", pedidoId), "");
                break;

            case 3: // Remover pedido

                break;

            case 0: // Sair
                InOut.MsgDeInformacao("SISTEMA FINALIZADO", "O sistema foi finalizado.");

            default:
//                InOut.MsgDeErro(,"Opção inválida!");
        }

        return escolha;
    }
}
