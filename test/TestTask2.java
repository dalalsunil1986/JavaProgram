import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import Methods.GroupingByColor;
import Methods.MinMaxByColor;
import Methods.MinMaxByEachColor;
import POJO.Fruit;

/*
 * Test Case for Task -2 
 * Testing Methods like GroupingBySize,MinMAxByColor,MinMaxByEachColor
 */

public class TestTask2 {

	GroupingByColor gc = new GroupingByColor();
	MinMaxByColor minMaxC = new MinMaxByColor();
	MinMaxByEachColor minMaxEC = new MinMaxByEachColor();

	@Test
	public void groupByColorTest() {
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit(1, "Small", "Seeded", "Green"));
		list.add(new Fruit(2, "Big", "Seedless", "Red"));
		list.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		list.add(new Fruit(4, "Medium", "Seedless", "Red"));
		list.add(new Fruit(5, "Big", "Seeded", "Green"));

		List<Fruit> expected = gc.groupingByColor(list);

		// local values to check it with exact o/p
		ArrayList<Fruit> localList = new ArrayList<>();
		localList.add(new Fruit(1, "Small", "Seeded", "Green"));
		localList.add(new Fruit(5, "Big", "Seeded", "Green"));
		localList.add(new Fruit(2, "Big", "Seedless", "Red"));
		localList.add(new Fruit(4, "Medium", "Seedless", "Red"));
		localList.add(new Fruit(3, "Small", "Seeded", "Yellow"));

		assertEquals(localList, expected);

	}

	@Test
	public void minMaxByColorTest() {
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit(1, "Small", "Seeded", "Green"));
		list.add(new Fruit(2, "Big", "Seedless", "Red"));
		list.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		list.add(new Fruit(4, "Medium", "Seedless", "Red"));
		list.add(new Fruit(5, "Big", "Seeded", "Green"));

		List<Fruit> expected = minMaxC.minAndMaxFruitsByColor(list);

		// local values to check it with exact o/p
		ArrayList<Fruit> localList = new ArrayList<>();
		localList.add(new Fruit(5, "Big", "Seeded", "Green"));
		localList.add(new Fruit(1, "Small", "Seeded", "Green"));
		localList.add(new Fruit(2, "Big", "Seedless", "Red"));
		localList.add(new Fruit(4, "Medium", "Seedless", "Red"));
		localList.add(new Fruit(3, "Small", "Seeded", "Yellow"));

		assertEquals(localList, expected);
	}

	@Test
	public void minMaxByEachColorTest() {
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit(1, "Small", "Seeded", "Green"));
		list.add(new Fruit(2, "Big", "Seedless", "Red"));
		list.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		list.add(new Fruit(4, "Medium", "Seedless", "Red"));
		list.add(new Fruit(5, "Big", "Seeded", "Green"));

		// locally storing the values from the method
		Map<String, List<Fruit>> bySizeResult = minMaxEC.minAndMaxSizeByEachColorGroup(list);

		// Creating Test Values for MinMaxByEachColor
		Map<String, List<Fruit>> bySizeTest = new HashMap<>();
		ArrayList<Fruit> redColor = new ArrayList<>();
		ArrayList<Fruit> greenColor = new ArrayList<>();
		ArrayList<Fruit> yellowColor = new ArrayList<>();
		greenColor.add(new Fruit(1, "Small", "Seeded", "Green"));
		greenColor.add(new Fruit(5, "Big", "Seeded", "Green"));
		redColor.add(new Fruit(2, "Big", "Seedless", "Red"));
		redColor.add(new Fruit(4, "Medium", "Seedless", "Red"));
		yellowColor.add(new Fruit(3, "Small", "Seeded", "Yellow"));
		bySizeTest.put("Green", greenColor);
		bySizeTest.put("Red", redColor);
		bySizeTest.put("Yellow", yellowColor);

		Assert.assertEquals("Reason", bySizeTest, bySizeResult);
	}

}
