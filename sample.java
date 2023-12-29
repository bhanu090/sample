package practice;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
 
public enum GenderType {
	MALE(1), FEMALE(2), OTHERS(3);
	private int index;
	private static Map<Integer, GenderType> map = new HashMap<>();
	GenderType(int index) {
		this.index = index;
	}
	static {
		for (GenderType serviceType : GenderType.values()) {
			map.put(serviceType.index, serviceType);
		}
	}
 
//	public static GenderType valueOf(int serviceType) {
//		return (GenderType) map.get(serviceType);
//	}
//	public static Integer indexOf(String gender) {
//		map.forEach((k,v)-> {
//			if(v.equalsIgnoreCase(gender)) {
//				return k;
//			}
//		});
//		return null;
//	}
	public static Integer getIndex(String genderString) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue().name().equalsIgnoreCase(genderString))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
	public int getIndex() {
		return this.index;
	}
	public static Map getMap() {
		return map;
	}
}
 
 
class Test{
	public static void main(String[] args) {
//		int no = GenderType.FEMALE.getIndex();
//		System.out.println(GenderType.MALE);
//		for(GenderType gender : GenderType.values()) {
//			System.out.println(gender.getIndex()+"-"+gender);
//		}
//		System.out.println(GenderType.getMap());
		Integer in = GenderType.getIndex("male");
		System.out.println(in);
	}
}
