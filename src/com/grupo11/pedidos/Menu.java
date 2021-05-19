package com.grupo11.pedidos;

import com.grupo11.pedidos.Handler.Handlers;
import com.grupo11.pedidos.util.InOut;

public class Menu {
    public static void exibir()
    {
        while (true)
        {
            int escolha = InOut.leInt(fraseMenu(), "Menu de Opções");
            Handlers.direcionarEscolha(escolha);

            if (escolha == 0)
                break;
        }
    }

    private static String fraseMenu()
    {
        String textoMenu = "Informe sua opção a partir de seu número identificador: " + System.lineSeparator() +
                " * 1 - Criar pedido" + System.lineSeparator() +
                " * 2 - Buscar pedido" + System.lineSeparator() +
                " * 3 - Remover pedido" + System.lineSeparator() +
                System.lineSeparator() +
                " * 0 - Sair do programa";

        return textoMenu.toString();
    }
}
