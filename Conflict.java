import java.util.*;

public class Conflict {
	public static void main(String... args) {
    
    int rand = 0;
		for(int x=0;x<10;x++){
			rand = new java.util.Random().nextInt(101);
			System.out.println(rand);
     }

		for(int i = 30 ; i > 0 ; i-- ){
		System.out.println(i);
	}
}
}
