
public static boolean isDivisible(int n, int m) {
    if (n%m == 0) { 
			return true;
		}
		return false;
}


public static boolean isTriangle(int l1, int l2, int l3){
  if (l1 > (l2 + l3)) {
			return false;
		} else if (l2 > (l1 + l3)) {
			return false;
		} else if (l3 > (l1 + l2)) {
			return false;
		} else {
			return true;
		}
	}

public static int ack(int m, int n){
  if (m = 0){
   return n + 1
  } 
  else if( n = 0){
    return (m−1, 1)
  } else {
    return ack(m - 1, ack(m, n - 1)); 
  }
    
  }
    
  
}