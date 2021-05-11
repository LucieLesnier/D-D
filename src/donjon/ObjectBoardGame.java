package donjon;

import java.util.ArrayList;
import java.util.List;

import equipment.Weaponry;

public class ObjectBoardGame extends Weaponry {
	List<ObjectBoardGame> lambdaWeapon = new ArrayList<ObjectBoardGame>();

	public ObjectBoardGame(String name, int power) {
		super(name, power);

	}

	public void objectAdd() {

		lambdaWeapon.add(new ObjectBoardGame("Une massue", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une épée magique", random()));
		lambdaWeapon.add(new ObjectBoardGame("Un Panda", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une morning star", random()));
		lambdaWeapon.add(new ObjectBoardGame("Un bouclier magique", random()));
		lambdaWeapon.add(new ObjectBoardGame("Un génie", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une source de pouvoir", random()));
		lambdaWeapon.add(new ObjectBoardGame("Un fusil à pompe", random()));
		lambdaWeapon.add(new ObjectBoardGame("Un lapin", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une potion de vie", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une flûte", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une partition", random()));
		lambdaWeapon.add(new ObjectBoardGame("Un dragon", random()));
		lambdaWeapon.add(new ObjectBoardGame("Ta mamie préférée", random()));
		lambdaWeapon.add(new ObjectBoardGame("Une licorne", random()));

		for (ObjectBoardGame lambdaObject : lambdaWeapon) {
			System.out.println(lambdaObject.getName() + " " + lambdaObject.getPower());
		}

	}

	public int random() {
		int newPower = 1 + (int) (Math.random() * ((3 - 1) + 1));
		return newPower;

	}

}
