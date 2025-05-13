package Lab2.L2Q3;

import java.util.List;

public class CompareMax {
	public static <T extends Comparable<T>> T maximum(T o1, T o2, T o3) {
		return List.of(o1, o2, o3).stream().max((a, b) -> a.compareTo(b)).get();
	}
	
	public static <T extends Comparable<T>> T maximal(T o1, T o2, T o3) {
		// Credit to: https://github.com/y33-j3T/WIA1002-Data-Structure/
		if (o1.compareTo(o2)> 0 && o1.compareTo(o3) > 0)
            return o1;
        else if (o2.compareTo(o1) > 0 && o2.compareTo(o3) > 0)
            return o2;
        else if (o3.compareTo(o1)> 0 && o3.compareTo(o2)> 0)
            return o3;
        else
            return null;
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		// Credit to: https://github.com/afrieirham/WIA1002-Data-Structure-Lab/
        T max = a;
        if(b.compareTo(max) > 0) max = b;
        if(c.compareTo(max) > 0) max = c;
        return max;
    }
}
