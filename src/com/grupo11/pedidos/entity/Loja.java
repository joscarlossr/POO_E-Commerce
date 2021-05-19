package com.grupo11.pedidos.entity;
// listarPedidos()?

import java.util.HashMap;

public class Loja
{
    private HashMap<Integer, Pedido> pedidos = new HashMap<Integer, Pedido>();
    private Funcionario func;

    public void inserirPedido(Pedido pedido)
    {
        int pedidoId = pedidos.size() + 1;
        pedidos.put(pedidoId, pedido);
    }

    public void buscarPedido()
    {

    }

    public void removerPedido()
    {

    }
}
