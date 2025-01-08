/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q6;


public class Hero {
    String name;
    String element;
    double HP;
    double ATK;
    
    public Hero(String name, String element, double HP, double ATK){
        this.name = name;
        this.element = element;
        this.HP = HP;
        this.ATK = ATK;
    }
    
    public double calculateDamage(Villain enemy, int rsMultiplier){
        double dominanceMultiplier = 1;
        String enemy_element = enemy.element;
        for(int i = 0; i < 4; i++)
        {
            if(enemy_element.equals("Water") && element.equals("Earth") ||
               enemy_element.equals("Fire") && element.equals("Water") ||
               enemy_element.equals("Earth") && element.equals("Fire") ||
               enemy_element.equals("Light") && element.equals("Dark"))
                dominanceMultiplier = 1.5;
            else if(enemy_element.equals("Water") && element.equals("Fire") ||
                     enemy_element.equals("Fire") && element.equals("Earth") ||
                     enemy_element.equals("Earth") && element.equals("Water"))
                dominanceMultiplier = 0.5;
        }
        
        double damage = ATK * dominanceMultiplier * rsMultiplier - enemy.DEF;
        
        if(damage < 1)
            damage = 1;
        
        System.out.printf("%s dealt %.1f damage to %s%n", name, damage, enemy.name);
        
        return damage;
    }
    
    public String HerotoString(){
        return "Hero{" +
                "name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", healthPoints=" + HP +
                ", attack=" + ATK +
                '}';
    }
}
