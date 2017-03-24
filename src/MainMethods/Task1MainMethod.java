package MainMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import Methods.GroupingBySize;
import Methods.MinAndMaxFruit;
import POJO.Fruit;
import POJO.Fruit.Color;
import POJO.Fruit.Type;

/*
  Problem - 1:
  -------------
	  # I have a list with fruits, Fruit has 2 properties (id, type, size and color)
	  # Type and color are pre-defined set of properties	
	   
	  # I need to group the fruits by size
	  # Find the small and big size fruits

 */
public class Task1MainMethod {

	static Logger log = Logger.getLogger(Task1MainMethod.class.getName());

	public static void main(String[] args) throws NumberFormatException, IOException {
		BasicConfigurator.configure();

		ArrayList<Fruit> list = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		log.info("How many Objects have to create");
		int size = Integer.parseInt(br.readLine());

		for (int i = 0; i < size; i++) {
			log.info("Enter fruit Id:");
			Integer fruitId = Integer.parseInt(br.readLine());
			log.info("Type fruit Size:");
			log.info("\n1.Small 2.Medium 3.Big");
			String fruitSize = br.readLine();
			log.info("Select fruit Type:");
			log.info("\n1.Seeded 2.Seedless");
			Integer fruitTypeChoice = Integer.parseInt(br.readLine());
			String fruitType = null;
			switch (fruitTypeChoice) {
			case 1:
				fruitType = Type.SEEDED.name();
				break;
			case 2:
				fruitType = Type.SEEDLESS.name();
				break;
			default:
				log.warn("Invalid Choice");
			}
			log.info("Select fruit Color:");
			log.info("\n1.Red 2.Green 3.Yellow");
			Integer fruitColorChoice = Integer.parseInt(br.readLine());
			String fruitColor = null;
			switch (fruitColorChoice) {
			case 1:
				fruitColor = Color.RED.name();
				break;
			case 2:
				fruitColor = Color.GREEN.name();
				break;
			case 3:
				fruitColor = Color.YELLOW.name();
				break;
			default:
				log.warn("Invalid Choice");
			}

			list.add(new Fruit(fruitId, fruitSize, fruitType, fruitColor));
		}

		Map<String, List<Fruit>> minMaxResult = new MinAndMaxFruit().minAndMaxFruit(list);

		log.info("Min and Max Size");
		for (Entry<String, List<Fruit>> f : minMaxResult.entrySet()) {
			log.info(f.getKey());
			for (Fruit fr : f.getValue()) {
				{
					log.info(fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitType());

				}
			}
		}
		Map<String, List<Fruit>> bySizeResult = new GroupingBySize().groupingBySize(list);
		log.info("Grouping By Size");
		for (Entry<String, List<Fruit>> f : bySizeResult.entrySet()) {
			log.info(f.getKey());
			for (Fruit fr : f.getValue()) {
				{
					log.info(fr.getId() + "\t" + fr.getSize() + "\t" + fr.getFruitType());

				}
			}
		}

	}
}
