import java.util.Random;
public class Homework
{
    public static void main(String[] args) {
        verificareInput(args);

        int n = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        int alphaLen = args.length - 2;
    }

    public static void verificareInput(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("Insuficiente argumente.");
            System.exit(-1);
        }
        try
        {
            Integer.parseInt(args[0]);
            Integer.parseInt(args[1]);
        } catch (NumberFormatException e)
        {
            System.out.println("Argument invalid");
            System.exit(-1);
        }

        for (int i = 2; i < args.length; i ++)
        {
            if(args[i].length() != 1)
            {
                System.out.println("Lungimea argumentului e invalida");
                System.exit(-1);
            }
            if(!Character.isUpperCase(args[i].charAt(0)))
            {
                System.out.println("Caracter invalid ");
                System.exit(-1);
            }
        }
    }}