
public class multiple {
	public static void main(String[] args){
		int i = 1;
		int multiple1 = 0;
		for(i=1;i<1000;i++)
		{
			if(i % 3 == 0 || i % 5 == 0 )
				multiple1 = multiple1+i;
		}
		System.out.println(multiple1);
	}
}
