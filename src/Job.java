import java.io.Serializable;

public class Job implements Serializable
{
    //the atributes
    private String JobNumber;
    private String ClientName;
    private String JobLocation;
    private double JobPrice;
    private String JobStatus;
    private int JobRate;
    private String EmpNumber;
    
    //the constructor
    public Job(String numberIn, String nameIn, String locationIn)
    {
        JobNumber = numberIn;
        ClientName = nameIn;
        JobLocation = locationIn;
        JobStatus = "Unassigned";
        EmpNumber = "NA";
    }
    
    //other methods
    
    public String getJobNumber()
    {
	return JobNumber;
    }
    
    public String getClientName()
    {
	return ClientName;
    }
    
    public String getJobLocation()
    {
	return JobLocation;
    }
    
    public double getPrice()
    {
        return JobPrice;
    }
    
    public String getJobStatus()
    {
	return JobStatus;
    }
    
    public String getEmpNumber()
    {
	return EmpNumber;
    }
    
    public int getJobRating()
    {
	return JobRate;
    }
    
    //to change the status of a job
    public void changeJobStatus(String statusIn)
    {
	JobStatus = statusIn;
    }
    
    //add the price to a completed job
    public void addPrice(double priceIn)
    {
        JobPrice = priceIn;
    }
    
    //write the Employee Number of the cleaner assigned to the job
    public void assignEmployeeToJob(String EmpNumberIn)
    {
	EmpNumber = EmpNumberIn;
    }
    
    //add the rating of a completed job
    public void addJobrating (int rateIn)
    {
        JobRate = rateIn;
    }
    
    public String toString()
    {
        return "[NUMBER: " + JobNumber + "] [CLIENT NAME: " + ClientName + "] [LOCATION: " + JobLocation + "] [Price: £" + JobPrice + "] [STATUS: " + JobStatus + "] [JOB RATING: " + JobRate + " STARS] [CLEANER NUMBER: " + EmpNumber + "]\n";
    }
}
