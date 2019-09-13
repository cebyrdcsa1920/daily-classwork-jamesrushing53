public class PetRunner
{
    public static void main(String[] args)
    {
        Pet myBeaux = new Pet();
        myBeaux.gainWeight(1.69);
        System.out.println(myBeaux.getWeight());
        myBeaux.exercise(3.4);
        System.out.println(myBeaux.getWeight());
    }
}