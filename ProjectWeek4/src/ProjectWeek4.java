import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProjectWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Anne");
		employeeNames.add("Bob");
		employeeNames.add("Tom");
		employeeNames.add("Andy");
		employeeNames.add("Stan");
		
		//HashSet
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		//HashMap
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i++));
		}
		
		//Print HashMap
		Set<Integer> employeeKeys = employeeMap.keySet();
		for (int employeeKey: employeeKeys) {
			System.out.println(employeeKey + ": " + employeeMap.get(employeeKey));
		}
		
		//StringBuilder idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
		
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		
		System.out.println(idsBuilder.toString());
		
		//StringBuilder namesBuilder
		StringBuilder namesBuilder = new StringBuilder();
		
		for (String employeeName: employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
		System.out.println(namesBuilder.toString());
		
	}

}
