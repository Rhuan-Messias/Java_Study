import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSetCollection {

	public static void main(String[] args) {
		// set é a interface, e possui esses três tipos de collection
		// hash ordena pela ordem do hashcode
		// linked ordena na ordem de inserção
		// Tree ordena pela ordem alfabética ou numérica
		// A interface Set não permite inserir elementos duplicados (apenas ignora eles)
		
		Set<String> c_hashSet = new HashSet<>();
		Set<String> c_linkedHashSet = new LinkedHashSet<>();
		Set<String> c_treeSet = new TreeSet<>();
		
		c_hashSet.add("Banana");
		c_hashSet.add("Maça");
		c_hashSet.add("Laranja");
		
		c_linkedHashSet.add("Banana");
		c_linkedHashSet.add("Maça");
		c_linkedHashSet.add("Laranja");
		
		c_treeSet.add("Banana");
		c_treeSet.add("Maça");
		c_treeSet.add("Laranja");
		
		System.out.println("HashSet: " + c_hashSet);
		System.out.println("LinkedHashSet: " + c_linkedHashSet);
		System.out.println("TreeSet: " + c_treeSet);
	}

}
