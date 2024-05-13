package collections_pro;

import java.util.Scanner;

public class teacher 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your roll number:");
		int rollno=sc.nextInt();
		if(rollno%4==1)
		{
			
			System.out.println("Its belongs to group Sapphire");
		}
		else if(rollno%4==2)
		{
			System.out.println("Its belongs to group Perl");
		}
		else if(rollno%4==3)
		{
			System.out.println("Its belongs to group Ruby");
		}
		else if(rollno%4==0)
		{
			System.out.println("Its belongs to group Emerald");
		}
	}

}
