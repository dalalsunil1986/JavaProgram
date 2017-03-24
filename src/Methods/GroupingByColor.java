package Methods;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import POJO.Fruit;

/*
 * Gets the list of Fruits and returns it by Grouping by Color
 */

public class GroupingByColor implements Comparator<Fruit> {

	public List<Fruit> groupingByColor(List<Fruit> list) {
		List<Fruit> sorted = list;
		Collections.sort(list, new GroupingByColor());
		return sorted;
	}

	@Override
	public int compare(Fruit o1, Fruit o2) {

		return o1.getFruitColor().compareTo(o2.getFruitColor());
	}

}
