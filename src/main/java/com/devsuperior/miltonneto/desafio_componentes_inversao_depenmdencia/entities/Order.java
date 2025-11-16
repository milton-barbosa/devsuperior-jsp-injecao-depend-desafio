package com.devsuperior.miltonneto.desafio_componentes_inversao_depenmdencia.entities;

public class Order {
    private static final double PRECENTUAL_100 = 100.0;
    private Integer code;
    private Double basic;
    private Double discount;

    public Order() {}

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public double valorLiquido(){
        return this.basic * ( 1 - this.discount/PRECENTUAL_100);
    }

    @Override
    public String toString() {
        return "Order{" +
                "code=" + code +
                ", basic=" + basic +
                ", discount=" + discount +
                '}';
    }
}
