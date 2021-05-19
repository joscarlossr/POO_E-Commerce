package com.grupo11.pedidos.entity;

public class ItemPedido
{
    private String item;
    private int quantidade;
    private float precoUnitario;

    public ItemPedido(String item, int quantidade, float precoUnitario)
    {
        this.item = item;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getItem()
    {
        return item;
    }

    public void setItem(String item)
    {
        this.item = item;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario()
    {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario)
    {
        this.precoUnitario = precoUnitario;
    }

}
