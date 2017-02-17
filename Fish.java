public class Fish extends Pet
{
    private int years;
    
    public Fish()
    {
      super("Andrew");
      years = 74;
    }

    public Fish(String fishname)
    {
        super(fishname);
        years = 74;
    }
    
    public String speak()
    {
       return "Glub";  
    }
    
    public int age()
    {
        return years;
    }
}
    