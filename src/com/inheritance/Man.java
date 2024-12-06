package com.inheritance;

public class Man extends Emp{

    int incentive;
    int bonus;

    public Man(int incentive, int bonus) {
        this.incentive = incentive;
        this.bonus = bonus;
    }

    public Man(int id, String name, int incentive, int bonus) {
        super(id, name);
        this.incentive = incentive;
        this.bonus = bonus;
    }

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
      Emp emp = new Emp(1,"Ashok");
      Man man = new Man(2,2);
      man.setId(2);
      man.setName("Ashok");
        System.out.println(man.id);
        System.out.println(man.name);
    }
}
