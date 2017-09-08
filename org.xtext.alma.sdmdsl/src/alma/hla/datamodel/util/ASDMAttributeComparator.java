package alma.hla.datamodel.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import alma.hla.datamodel.meta.asdm.ASDMAttribute;

public class ASDMAttributeComparator implements Comparator<ASDMAttribute>{
	
		
    
    private ASDMAttributeComparator() {        
    }
    
	@Override
	public int compare(ASDMAttribute o1, ASDMAttribute o2) {
		return (o1.getName().toLowerCase()).compareTo(o2.getName().toLowerCase());
	}
	
	public static List<ASDMAttribute> sort(List<ASDMAttribute> list){
		
		List<ASDMAttribute> sortedList = new ArrayList<ASDMAttribute>();

		
		for(ASDMAttribute attr : list){
			sortedList.add(attr);
		}
		
		Collections.sort(sortedList, new ASDMAttributeComparator());
		
		return sortedList;
		
	}
	
}