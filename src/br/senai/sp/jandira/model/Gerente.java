package br.senai.sp.jandira.model;

public abstract class Gerente extends Funcionarios{


    private double salarioBase;
    private double bonus;

    public Gerente(String nome, int id, double salarioBase, double bonus) {
        super(nome,id,salarioBase);
        this.bonus = bonus;
    }
    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
    public double getBonus(){
        return bonus;
    }
}
