class Calculator
{
    public void playMusic()

    {
        System.out.println("Music Loading....");
        System.out.println("Bangla Songs....");
        System.out.println("English Songs....");

    }

    public String getMeAPen(int cost)
    {

        if (cost >= 10)
        {
            return "Get the Pen";
        }
        else
        {
        return "Sorry Brother";
        }
    }
}





public class demo
{



public static void main (String[] args)
{
    Calculator calc = new Calculator();
            calc.playMusic();
            String r = calc.getMeAPen(9); 
            System.out.println(r);

}

}