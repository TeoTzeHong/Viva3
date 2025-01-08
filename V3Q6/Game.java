/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q6;

import java.util.Random;


public class Game {
    String[] runestones = {"Water", "Fire", "Earth", "Light", "Dark"};
    
    public void battle(Team team, Villain enemy){
        team.resetTeamHp();
        enemy.resetHp();
        enemy.resetCd();
        
        int round = 1;
        while(true){
            System.out.println("Round " + round++);
            
            boolean enemyAttacked = false;
            if(enemy.currentCd == 1 && enemy.HP > 0){
                enemy.resetCd();
                System.out.println("Enemy's current CD: " + enemy.currentCd);
                enemyAttacked = true;
            }else{
                enemy.decreaseCd();
                System.out.println("Enemy's current CD: " + enemy.currentCd);
            }

            Random rand = new Random();
            System.out.println("RuneStones dissolved:");
            String[] rsDissolved = new String[3];
            for(int i = 0; i < 3; i++){
                int randomElement = rand.nextInt(0, 5);
                System.out.println(" - " + (rsDissolved[i] = runestones[randomElement]));
            }
            System.out.println();

            boolean attacked = false;
            for(int i = 0; i < 4; i++){
                String hero_element = team.heroList[i].element;
                int rsMult = 0;
                for(int j = 0; j < 3; j++){
                    if(hero_element.equals(rsDissolved[j])){
                        rsMult++;
                        attacked = true;
                    }
                }
                if(rsMult != 0){
                    enemy.getDamaged(team.heroList[i].calculateDamage(enemy, rsMult));
                }
            }
            if(!attacked){
                System.out.println("No hero attacked in this round");
            }
            if(enemyAttacked){
                team.getDamaged(enemy.ATK);
                System.out.printf("%s dealt %.1f damage to the team%n", enemy.name, enemy.ATK);
            }
            System.out.println();

            System.out.println("Team's remaining HP: " + team.HP);
            System.out.println("Enemy's remaining HP: " + enemy.HP);
            System.out.println();
            
            if(enemy.HP <= 0 ){
                System.out.println("The team won!");
                return;
            }else if(team.HP <= 0){
                System.out.println("The team lose.");
                return;
            }
        }
    }
}
