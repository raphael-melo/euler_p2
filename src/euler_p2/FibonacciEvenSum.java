package euler_p2;

public class FibonacciEvenSum {

	public static int sumFibonnaciEven(int upperLimit){
//		1, 2, 3, 5, 8, 13, 21, 34, 55, 89
		
		int first = 1;
		int second = 2;
		
		int result = 0;
		while(first < upperLimit){
			if((first % 2) == 0){
				result += first;
			}
			int aux = first + second;
			first = second;
			second = aux;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumFibonnaciEven(4000000));
	}

}
