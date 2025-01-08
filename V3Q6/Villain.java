/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q6;


public class Villain {
     String name;
     String element;
     double maxHP;
     double HP;
     double ATK;
     double DEF;
     double initialCd;
     double currentCd;
    
    public Villain(String name, String element, double maxHP, double ATK, double DEF, double initialCd){
        this.name= name;
        this.element=element;
        this.maxHP=maxHP;
        //this.HP=maxHP;
        this.ATK=ATK;
        this.DEF=DEF;
        this.initialCd=initialCd;
        //this.currentCd=initialCd;
    }
    
    public double getDamaged(double damage){
        this.HP-=damage;
        if(this.HP<0)
            this.HP=0;
        return this.HP;
    }
    
    public void resetHp(){
        this.HP=this.maxHP;
    }
    
    public void decreaseCd(){
        this.currentCd -= 1;
    }
    
    public void resetCd(){
        this.currentCd=this.initialCd;
    }
    
    public String VillaintoString(){
        return "Enemy's remaining HP: " + this.HP;
    }
}
