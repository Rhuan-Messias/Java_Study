import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class ExemploSetCollection {

	public static void main(String[] args) {
		// set é a interface, e possui esses três tipos de collection
		// hash ordena pela ordem do hashcode
		// linked ordena na ordem de inserção
		// Tree ordena pela ordem alfabética ou numérica
		// Set ignora caso insira repetido
		
		Set<String> c_hashSet = new HashSet<>();
		Set<String> c_linkedHashSet = new LinkedHashSet<>();
		Set<String> c_treeSet = new TreeSet<>();
		
		Set<String> c_total = new HashSet<>();
		
		c_hashSet.add("Banana");
		c_hashSet.add("Maça");
		c_hashSet.add("Laranja");
		
		c_linkedHashSet.add("Banana");
		c_linkedHashSet.add("Maça");
		c_linkedHashSet.add("Laranja");
		
		c_treeSet.add("Banana");
		c_treeSet.add("Maça");
		c_treeSet.add("Laranja");
		
		c_total.addAll(c_hashSet);
		c_total.addAll(c_linkedHashSet);
		c_total.addAll(c_treeSet);
		
		System.out.println("HashSet: " + c_hashSet);
		System.out.println("LinkedHashSet: " + c_linkedHashSet);
		System.out.println("TreeSet: " + c_treeSet);
		
		System.out.println("HashSet: " + c_total);
	}

}
