package Methods;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import POJO.Fruit;

/*
 * Gets the list of Fruits and returns 
 * the Minimum and Maximum Size of Fruit By Each Color
 */
public class MinMaxByEachColor {

	public Map<String, List<Fruit>> minAndMaxSizeByEachColorGroup(List<Fruit> list) {
		Map<String, List<Fruit>> filtered = list.stream().collect(Collectors.groupingBy(Fruit::getFruitColor));
		return filtered;
	}
}
