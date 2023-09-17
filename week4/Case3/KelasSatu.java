class KelasSatu
{
    {
        System.out.println("Instance baru dibuat! :)");
    }
    static
    {
        System.out.println("Yang ini hanya sekali, dan di awal! :)");
    }
    public KelasSatu(int i)
    {
        System.out.println("Dengan Parameter, nilainya " + i);
    }
    public KelasSatu()
    {
        System.out.println("Tanpa parameter! :)");
    }
}