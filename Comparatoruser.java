package program;

import java.util.*;

class Comparatoruser{
public static void main(String[] args) {
				Comparator<Integer> c=new Comparator<Integer>()
				{
					public int compare(Integer i, Integer j)
					{
						if(i%10 > j%10)
							return 1;
						else 
							return -1;
					}	
					
				};

			
			
		// TODO Auto-generated method stub
		List<Integer> li =new ArrayList<Integer>();
		
		li.add(12);
		li.add(25);
		li.add(81);
		li.add(01);
		li.add(60);
		Collections.sort(li,c);
		System.out.println(li);
	}

}