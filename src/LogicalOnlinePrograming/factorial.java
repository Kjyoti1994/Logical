package LogicalOnlinePrograming;

public class factorial 
{
public static void main(String[] args) {
	int num=6;
	int fact=1; //6,30,120,360
	for(int i=num; i>=1;i--)
	{
		fact=fact*i; //1*6=6 
		// 6*5=30
		//30*4=120
		//120*3=360
		// 360*2=720
	}
	System.out.println(fact);
}
}
