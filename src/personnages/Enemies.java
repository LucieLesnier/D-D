package personnages;

import java.util.ArrayList;
import java.util.List;

import donjon.ObjectBoardGame;

public class Enemies extends Personnages {
	List<Enemies> lambdaEnemy = new ArrayList<Enemies>();

	public Enemies(String name, int life, int power) {
		super(name, life, power);
	}
	
	public Enemies() {
	
	}


	public void EnemiesLambda() {
		
		
		lambdaEnemy.add(new Enemies("Zombie", randomLife(), randomPower()));
		lambdaEnemy.add(new Enemies("Goblin", randomLife(), randomPower()));
		lambdaEnemy.add(new Enemies("Lapin", randomLife(), randomPower()));
		lambdaEnemy.add(new Enemies("Nounours", randomLife(), randomPower()));
		lambdaEnemy.add(new Enemies("Loup Garou", randomLife(), randomPower()));
		lambdaEnemy.add(new Enemies ("Burger", randomLife(), randomPower()));
		lambdaEnemy.add(new Enemies("Bébé Psychopathe", randomLife(), randomPower()));
		
		
		for (Enemies lambdaEnemy : lambdaEnemy) {
			System.out.println(lambdaEnemy.getName() + " " + lambdaEnemy.getPower() + " " + lambdaEnemy.getLife());
		}
		
		
	}
	 public int randomLife() {
		 int life = 5 + (int) (Math.random() * ((10 - 5) + 1));
		 return life;
	 }
	 public int randomPower() {
		 int power= 5 + (int) (Math.random() * ((10 - 5) + 1));
		 return power;
	 }

}
