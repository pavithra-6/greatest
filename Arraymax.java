package sumave1;
import java.util.Scanner;
public class Arraymax {

	public static void main(String[] args) {
		int n=0,temp=0;
		System.out.println("enter the array you want");
		Scanner y=new Scanner(System.in);
		n=y.nextInt();
		System.out.println("enter the all elements");
		int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=y.nextInt();
}
for(int j=0;j<n;j++){
	if(a[j]>temp){
		temp=a[j];
	}
	
}
System.out.println("the max number of an array is:"+temp);
	}
}
