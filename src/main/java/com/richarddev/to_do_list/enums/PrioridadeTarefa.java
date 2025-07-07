package com.richarddev.to_do_list.Enums;

public enum PrioridadeTarefa {
    BAIXA(1), MEDIA(2), ALTA(3);

    private final int order;

    PrioridadeTarefa(int order){
        this.order = order;
    }

    public int getOrder(){
        return order;
    }

}
