package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Task1.Fruit.Type;
import Task1.Fruit.Color;

/*
 * I have a list with fruits, Fruit has 2 properties (id, type, size and color)
   Type and color are pre-defined set of properties	
   
   I need to group the fruits by size
   Find the small and big size fruits

 */
public class MainMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Fruit> list = new ArrayList<>();

		list.add(new Fruit(0, "Small", Type.SEEDED.name(), Color.RED.name()));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How many Objects have to create");
		int size = Integer.parseInt(br.readLine());
		
		for()

		Logic l = new Logic();
		l.groupingItBySize(list);

		l.minAndMaxSize(list);

	}
}
