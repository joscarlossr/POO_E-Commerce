package com.grupo11.pedidos.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido
{
    private int pedidoId;
    private Date dataEmissao;
    private float valorTotalCalculado;

    final private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    private List <ItemPedido> itens = new ArrayList<ItemPedido>();

    public Pedido(List<ItemPedido> itens) {
        this.dataEmissao = new Date();  // dataEmissao
        this.valorTotalCalculado = valorTotalCalculado;
        this.itens = itens;
    }

    public Pedido() {
        this.dataEmissao = new Date();

    }

    public int getPedidoId()
    {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId)
    {
        this.pedidoId = pedidoId;
    }

    public Date getDataEmissao()
    {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao)
    {
        this.dataEmissao = dataEmissao;
    }

    public float getValorTotalCalculado()
    {
        return valorTotalCalculado;
    }

    public void setValorTotalCalculado(float valorTotalCalculado)
    {
        this.valorTotalCalculado = valorTotalCalculado;
    }

    public ItemPedido buscarItemPedido(String item)
    {
        return new ItemPedido("", 0,0);
    }

    public void inserirItemPedido(String itemTitulo, int quant, float preco)
    {
        ItemPedido item = new ItemPedido(itemTitulo, quant, preco);
        this.itens.add(item);
    }

    public void removerItemPedido(String item)
    {

    }


    public float calcularPrecoTotal()
    {
        return 0;
    }

}
