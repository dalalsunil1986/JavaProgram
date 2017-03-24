package Methods;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import POJO.Fruit;

/*
 * Gets the list of Fruits and returns it by Grouping by Color
 */
public class GroupingBySize {

	public Map<String, List<Fruit>> groupingBySize(List<Fruit> list) {
		Map<String, List<Fruit>> filtered = list.stream().collect(Collectors.groupingBy(Fruit::getSize));

		return filtered;
	}

}
