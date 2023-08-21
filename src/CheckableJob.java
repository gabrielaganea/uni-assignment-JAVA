public class CheckableJob extends Job implements Checkable
{
    //override the constructor
    public CheckableJob(String numberIn, String nameIn, String locationIn)
    {
        super(numberIn, nameIn, locationIn);
    }
    
    @Override
    public boolean check()
    {
        //check that the Job Number is exactly 7 characters long
        if(getJobNumber().length() != 7)
        {
            return false;
        }
        
        //check that the Number starts with F3
        if((getJobNumber().indexOf("F")) != 0 || (getJobNumber().indexOf("3")) != 1)
        {
            return false;
        }
        
        //check that the next characters are all digits
        for(int i=2; i<=6; i++)
        {
            if(!Character.isDigit(getJobNumber().charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}
