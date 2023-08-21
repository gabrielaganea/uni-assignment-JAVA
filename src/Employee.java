import java.io.Serializable;

public class Employee implements Serializable
{
    //the attributes
    private String EmpNumber;
    private String EmpName;
    private String EmpDate;
    private String EmpPosition;
    private String EmpStatus;
    private int TotalJobs = 0;
    
    //the Constructor
    public Employee(String numberIn, String nameIn, String dateIn, String positionIn)
    {
        EmpNumber = numberIn;
        EmpName = nameIn;
        EmpDate = dateIn;
        EmpPosition = positionIn;
        EmpStatus = "Active";
    }
    
    //other methods
    
    public String getEmployeeNumber()
    {
	return EmpNumber;
    }
    
    public String getEmployeeName()
    {
	return EmpName;
    }
    
    public String getDateOfEmployment()
    {
	return EmpDate;
    }
    
    public String getEmployeePosition()
    {
	return EmpPosition;
    }
    
    public String getEmployeeStatus()
    {
	return EmpStatus;
    }
    
    //to change the status of an employee; when an employee is sick or on holiday
    public void changeEmployeeStatus(String statusIn)
    {
	EmpStatus = statusIn;
    }
    
    public String toString()
    {
        return "[NUMBER: " + EmpNumber + "] [NAME: " + EmpName + "] [EMPLOYMENT DATE: " + EmpDate + "] [POSITION: " + EmpPosition + "] [STATUS: " + EmpStatus + "]\n";
    }
    
    //once a cleaner complets a job, it will be added to his total
    public void addJob()
    {
        TotalJobs = TotalJobs + 1;
    }
    
    public int getTotalJobs ()
    {
        return TotalJobs;
    }
    
}
