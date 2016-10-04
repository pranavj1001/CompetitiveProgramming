//The Question for this solution can be found at https://www.hackerrank.com/challenges/prime-checker

import static java.lang.System.in;
class Prime {
    
    void checkPrime(int... params){
        String result = "";
        for (int x : params){
            if (isPrime(x)){
                result += x+" "; 
            }
        }
        if (result != ""){
            result = result.substring(0,result.length()-1);
            System.out.print(result);
        }
        System.out.println();
    }
    
    boolean isPrime(int x){
        if (x < 2){
            return false;
        }
        for (int i = 2; i < (x/2)+1; i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    
}
public class PrimeChecker {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
