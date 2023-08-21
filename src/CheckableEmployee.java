public class CheckableEmployee extends Employee implements Checkable
{
    //override the constructor
    public CheckableEmployee(String numberIn, String nameIn, String dateIn, String positionIn)
    {
        super(numberIn, nameIn, dateIn, positionIn);
    }
    
    @Override
    public boolean check()
    {
        //check that the Employee Number is exaclty 6 characters long
        if(getEmployeeNumber().length() != 6)
        {
            return false;
        }
        
        //check that the Employee Number starts with an 8
        if((getEmployeeNumber().indexOf("8")) != 0)
        {
            return false;
        }
        
        //check that the Employee Number contains only digits
        for(int i=0; i<=5; i++)
        {
            if(!Character.isDigit(getEmployeeNumber().charAt(i)))
            {
                return false;
            }
        }
        
        return true;
    }
    
}
