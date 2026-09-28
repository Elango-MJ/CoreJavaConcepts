package InterviewQuestions4;

public class secondMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,0,2,5,1,45,46,-4,6,7,5,-9,-9,45};
        int max=Integer.MIN_VALUE, secondMax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE, secondMin=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<min){
                secondMin=min;
                min=num;
            }else if(num>min && num<secondMin){
                secondMin=num;
            }
            if(num>max){
                secondMax=max;
                max=num;
            }else if(num<max && num>secondMax){
                secondMax=num;
            }
        }
       
            System.out.println(secondMin);
            System.out.println(secondMax);

	}

}
