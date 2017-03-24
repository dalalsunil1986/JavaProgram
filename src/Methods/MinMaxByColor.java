package Methods;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import POJO.Fruit;

/*
 *  returning the Minimum and Maximum Size of Fruit by Colors
 */
public class MinMaxByColor implements Comparator<Fruit> {

	public List<Fruit> minAndMaxFruitsByColor(List<Fruit> list) {

		List<Fruit> sorted = list;

		Collections.sort(sorted, new MinMaxByColor());

		return sorted;
	}

	@Override
	public int compare(Fruit f1, Fruit f2) {
		// TODO Auto-generated method stub

		int color = f1.getSize().compareTo(f2.getSize());
		if (f1.getFruitColor().equals(f2.getFruitColor())) {
			return color;
		}
		return f1.getFruitColor().compareTo(f2.getFruitColor());
	}

}
