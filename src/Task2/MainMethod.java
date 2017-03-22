package Task2;

import java.util.ArrayList;

public class MainMethod {

	enum Color {
		RED, GREEN, YELLOW;
	}

	enum Type {
		SEEDED, SEEDLESS;
	}

	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<>();

		list.add(new Fruit(0, "Small", Type.SEEDED.toString(), Color.RED.toString()));
		list.add(new Fruit(1, "Medium", Type.SEEDLESS.toString(), Color.GREEN.toString()));
		list.add(new Fruit(2, "Small", Type.SEEDED.toString(), Color.YELLOW.toString()));
		list.add(new Fruit(3, "Big", Type.SEEDLESS.toString(), Color.GREEN.toString()));
		list.add(new Fruit(4, "Small", Type.SEEDLESS.toString(), Color.RED.toString()));
		list.add(new Fruit(5, "Big", Type.SEEDLESS.toString(), Color.YELLOW.toString()));
		list.add(new Fruit(6, "Big", Type.SEEDED.toString(), Color.RED.toString()));
		list.add(new Fruit(7, "Medium", Type.SEEDED.toString(), Color.RED.toString()));

		Logic l = new Logic();
		l.groupingItBySize(list);
		l.minAndMaxFruitsByColor(list);
		l.minAndMaxSizeByEachColorGroup(list);
	}
}
