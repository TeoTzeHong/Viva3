/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q6;

import java.util.Random;


public class Team {
    Hero[] deck;
    Hero[] heroList;
    double HP;
    
    public Team(Hero[] heroes){
        this.deck = heroes;
    }
    
    public void formTeam(){
        heroList = new Hero[4];
        
        for(int i = 0; i < 4; i++){
            Random rand = new Random();
            int randomIdx = rand.nextInt(0, deck.length); 
                
            heroList[i] = deck[randomIdx];
            deck[randomIdx] = null;
            HP += heroList[i].HP;

            Hero[] temp = new Hero[deck.length-1];
            int tempIdx = 0;
            for(Hero hero : deck){
                if(hero != null){
                    temp[tempIdx] = hero;
                    tempIdx++;
                }
            }
            deck = temp;
        }
        
        System.out.println("Team's HP: " + HP);
        System.out.println();
    }
    
    public double getDamaged(double damage){
        HP -= damage;
        
        if(HP < 0){
            return 0;
        }
        
        return HP;
    }
    
    public void resetTeamHp(){
        HP = 0;
        for(Hero hero : heroList){
            HP += hero.HP;
        }
    }
    
    public String TeamtoString(){

        String Team="";
        for(int i = 0; i < heroList.length; i++){
            Team+="Hero ";
            Team+=(i+1);
            Team+="\n";
            Team+=heroList[i].toString();
            Team+="\n";
        }
        
        return Team;
    }
}
