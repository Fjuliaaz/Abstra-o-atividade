package br.senai.sp.jandira.model;

public abstract class Programador extends Funcionarios {

    public Programador(String nome, int id, double salarioBase, int horasExtras){
        super(nome,id,salarioBase);
        this.horasExtras = horasExtras;
    }
    @Override
    public double salarioBase() {
        return salarioBase() + (horasExtras * 30);
    }

    public int horasExtras(){
        return horasExtras;
    }
}
