public class LoudFish extends Fish
{
    
    public String loudSpeak ()
    {
        return super.speak() + "" + super.speak();
    }

   
}
