
public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int marks[]={75,85,100,65,78,88};
		//int sum=0;
		//for(int i=0;i<=5;i++){
		//	if(marks[i]%2==0){
		//	sum=sum+marks[i];
		//	}
		//}
		//System.out.println(sum);
		
		//int marks[]={75,85,100,65,78,88};
		//int sum=0;
		//for(int i=0;i<=5;i++){
		//	if(marks[i]%2==1){
		//	sum=sum+marks[i];
		//	}
		//}
		//System.out.println(sum);
		int marks[]={75,85,100,65,78,88};
		int sum=0;
		for(int i=0;i<=5;i++){
			if(marks[i]%3==0){
			sum=sum+marks[i];
			}
		}
		System.out.println(sum);


	}

}
