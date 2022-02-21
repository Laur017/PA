public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);
        
        int sum = 0;
        int nr = 0;
        
        n*=3;
        n+=Integer.parseInt("10101",2);
        n+=Integer.parseInt("FF",16);
        n*=6;
        
        while(n > 0)  
            {  
                nr = n % 10;  
                sum =sum + nr;
                n /= 10;  
            }  
            
        if (sum > 9) {
            nr = sum % 10;
            sum /= 10;
            sum += nr;
        }
        
        System.out.println("Willy-nilly, this semester I will learn " + languages[sum]);
     }
}