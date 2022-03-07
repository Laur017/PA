public class Compulsory {
    static int sumOfNumber(int n) {
        int sum = 0;
        int nr = 0;
        while(n > 0)
        {
            nr = n % 10;
            sum = sum + nr;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);

        n*=3;
        n+=Integer.parseInt("10101",2);
        n+=Integer.parseInt("FF",16);
        n*=6;

        int x = sumOfNumber(n);
        while (x>9){
            x = sumOfNumber(x);
        }

        System.out.println("Willy-nilly, this semester I will learn " + languages[x]);
    }
}
