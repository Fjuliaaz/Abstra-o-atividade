package br.senai.sp.jandira.model;

abstract class Funcionarios{

    public String nome;
    public int id;
    public double salarioBase;
    public int horasExtras;

    public Funcionarios(String nome, int id, double salarioBase){
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;

    }

    public abstract double calcularSalario();
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Funcionarios(String nome, int id, double salarioBase, int horasExtras) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public abstract double salarioBase();
}
