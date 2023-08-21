/*
Rodica Ganea - 1923920
Cn4005 Advanced Programming
Coursework part 1
*/

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu
{

    public static void main(String[] args) 
    {
        
        String choice;
        
        //creating the employee list
        List <Employee> EmployeeList = new ArrayList<>();
        
        //add objects to the list
        EmployeeList.add(new Employee("859758", "Ted Streem", "17/05/2007", "Cleaner"));
        EmployeeList.add(new Employee("872194", "Gabe Austin", "12/05/2007", "Cleaner"));
        EmployeeList.add(new Employee("883942", "Jonas Richerson", "22/07/2007", "Cleaner"));
        EmployeeList.add(new Employee("873489", "Jane Richerson", "10/08/2007", "Cleaner"));
        EmployeeList.add(new Employee("800025", "Noelle Silva", "30/06/2008", "Receptionist"));
        EmployeeList.add(new Employee("847283", "Cody Miller", "17/10/2008", "Cleaner"));
        EmployeeList.add(new Employee("814384", "Cristina Alexa", "05/05/2009", "Cleaner"));
        EmployeeList.add(new Employee("817038", "Kelsey Jordan", "23/09/2009", "Manager"));
        EmployeeList.add(new Employee("804923", "Marie Lawrence", "18/03/2010", "Cleaner"));
        EmployeeList.add(new Employee("834801", "Leon Jefferson", "03/08/2012", "Cleaner"));
        EmployeeList.add(new Employee("802946", "Harvey Green", "29/04/2012", "Cleaner"));
        EmployeeList.add(new Employee("801946", "Holly Brick", "30/01/2013", "Cleaner"));
        EmployeeList.add(new Employee("810674", "Austin Black", "11/02/2014", "Receptionist"));
        EmployeeList.add(new Employee("818492", "Jiovani Zanin", "13/04/2014", "Cleaner"));
        EmployeeList.add(new Employee("856291", "Hellen Trahan", "31/08/2014", "Manager"));
        
        
        //change the status for a few employees
        (EmployeeList.get(3)).changeEmployeeStatus("Inactive");
        (EmployeeList.get(9)).changeEmployeeStatus("Inactive");
        (EmployeeList.get(10)).changeEmployeeStatus("Inactive");
        (EmployeeList.get(11)).changeEmployeeStatus("Inactive");
        
        
        //creating the jobs list
        List <Job> JobList = new ArrayList<>();
        
        //adding jobs to the list
        JobList.add(new Job("F357624", "Marcus Harper", "Bekton, London"));
        JobList.add(new Job("F318736", "Julia Miller", "Killburn, London"));
        JobList.add(new Job("F392753", "Eddie Hemmings", "Camden Road, London"));
        JobList.add(new Job("F373892", "Lucia Aster", "Bekton, London"));
        JobList.add(new Job("F382123", "Anna Marcus", "Leyton, London"));
        JobList.add(new Job("F304634", "Luke Evans", "Aldgate, London"));
        JobList.add(new Job("F309352", "Robert Adams", "Bethnal Green, London"));
        JobList.add(new Job("F302863", "Sarah Gerald", "Holborn, London"));
        JobList.add(new Job("F396592", "Sophie Jackson", "Kingsbury, London"));
        JobList.add(new Job("F345295", "Annabeth Vereena", "Leyton, London"));
        JobList.add(new Job("F392648", "Leo Valdez", "Stratford, London"));
        JobList.add(new Job("F326782", "Hannah Milligan", "Aldgate, London"));
        JobList.add(new Job("F318649", "Gavin Reynolds", "Sheperd's Bush, London"));
        JobList.add(new Job("F359224", "Lily Morales", "Waterloo, London"));
        JobList.add(new Job("F345591", "Chris Roberts", "Bethnal Green, London"));
        JobList.add(new Job("F319692", "Harry Williams", "Killburn, London"));
        JobList.add(new Job("F314798", "Marco Maretis", "Westminster, London"));
        JobList.add(new Job("F386284", "Elizabeth Willie", "Leyton, London"));
        JobList.add(new Job("F383975", "Allan Carrie", "Euston, London"));
        JobList.add(new Job("F379643", "Aelena Noel", "Royal Oak, London"));
        
        
        //change the status of a few jobs
        (JobList.get(0)).changeJobStatus("Completed");
        (JobList.get(1)).changeJobStatus("Completed");
        (JobList.get(2)).changeJobStatus("Completed");
        (JobList.get(4)).changeJobStatus("Assigned");
        (JobList.get(5)).changeJobStatus("Completed");
        (JobList.get(6)).changeJobStatus("Assigned");
        (JobList.get(7)).changeJobStatus("Completed");
        (JobList.get(8)).changeJobStatus("Completed");
        (JobList.get(9)).changeJobStatus("Completed");
        (JobList.get(10)).changeJobStatus("Completed");
        (JobList.get(11)).changeJobStatus("Assigned");
        (JobList.get(12)).changeJobStatus("Assigned");
        (JobList.get(14)).changeJobStatus("Completed");
        (JobList.get(15)).changeJobStatus("Completed");
        (JobList.get(17)).changeJobStatus("Completed");
        (JobList.get(18)).changeJobStatus("Completed");
        (JobList.get(19)).changeJobStatus("Completed");

        //add the price for completed jobs
        JobList.get(0).addPrice(59.99);
        (JobList.get(1)).addPrice(129.99);
        (JobList.get(2)).addPrice(73.25);
        (JobList.get(5)).addPrice(40.99);
        (JobList.get(7)).addPrice(94.75);
        (JobList.get(8)).addPrice(70.22);
        (JobList.get(9)).addPrice(145.89);
        (JobList.get(10)).addPrice(60.80);
        (JobList.get(14)).addPrice(95.51);
        (JobList.get(15)).addPrice(82.65);
        (JobList.get(17)).addPrice(99.90);
        (JobList.get(18)).addPrice(63.88);
        (JobList.get(19)).addPrice(105.99);
        
        
        //asign Employees to Jobs
        (JobList.get(0)).assignEmployeeToJob("814384");
        (JobList.get(1)).assignEmployeeToJob("802946");
        (JobList.get(2)).assignEmployeeToJob("818492");
        (JobList.get(4)).assignEmployeeToJob("859758");
        (JobList.get(5)).assignEmployeeToJob("834801");
        (JobList.get(6)).assignEmployeeToJob("804923");
        (JobList.get(7)).assignEmployeeToJob("873489");
        (JobList.get(8)).assignEmployeeToJob("801946");
        (JobList.get(9)).assignEmployeeToJob("847283");
        (JobList.get(10)).assignEmployeeToJob("872194");
        (JobList.get(11)).assignEmployeeToJob("804923");
        (JobList.get(12)).assignEmployeeToJob("883942");
        (JobList.get(14)).assignEmployeeToJob("804923");
        (JobList.get(15)).assignEmployeeToJob("804923");
        (JobList.get(17)).assignEmployeeToJob("883942");
        (JobList.get(18)).assignEmployeeToJob("847283");
        (JobList.get(19)).assignEmployeeToJob("801946");
        
        
        //add to the total of completed jobs for each cleaner
        for(int i=0; i<JobList.size(); i++)
        {
            if("Completed".equals(JobList.get(i).getJobStatus()))
            {
                for(int j=0; j<EmployeeList.size(); j++)
                {
                    if((JobList.get(i).getEmpNumber()).equals(EmployeeList.get(j).getEmployeeNumber()))
                    {
                        EmployeeList.get(j).addJob();
                        break;
                    }
                }
            }
        }
        
        
        //set the rating for each completed job
        (JobList.get(0)).addJobrating(4);
        (JobList.get(1)).addJobrating(3);
        (JobList.get(2)).addJobrating(4);
        (JobList.get(5)).addJobrating(5);
        (JobList.get(7)).addJobrating(3);
        (JobList.get(8)).addJobrating(2);
        (JobList.get(9)).addJobrating(4);
        (JobList.get(10)).addJobrating(5);
        (JobList.get(14)).addJobrating(3);
        (JobList.get(15)).addJobrating(3);
        (JobList.get(17)).addJobrating(4);
        (JobList.get(18)).addJobrating(5);
        (JobList.get(19)).addJobrating(2);
        
        //readin the lists from files
        //first time the application is run, it will say that no files where read because they have not been written yet
        readListE(EmployeeList);
        readListJ(JobList);
        
        
        // creating the Menu
        do
        {
            System.out.println("1. See Employee List");
            System.out.println("2. See Job List");
            System.out.println("3. Search for an Employee");
            System.out.println("4. Search for a specific Job");
            System.out.println("5. Assign Cleaner to a Job");
            System.out.println("6. Change status of a Job to complete");
            System.out.println("7. Change status of an Employee");
            System.out.println("8. See how many Jobs a Cleaner has completed");
            System.out.println("9. See all the jobs assigned to a Cleaner. Completed jobs included.");
            System.out.println("10. Add an Employee");
            System.out.println("11. Add a Job");
            System.out.println("12. Remove an Employee");
            System.out.println("13. Remove a Job");
            System.out.println("14. Save and Quit");
            
            choice = EasyScanner.nextString();
            switch(choice)
            {
                case"1":System.out.println("\nEMPLOYEE LIST \n");
                        System.out.println(EmployeeList + "\n"); 
                        
                        break;
                        
                case"2":System.out.println("\nJOBS LIST \n");
                        System.out.println(JobList + "\n");
                        
                        break;
                        
                case"3":int EmpNo1;
                        System.out.println("\nWrite the Number of the Employee whose details you would like to see." + "\n" + "If you do not know the Number, please write 'list'(no caps) to get the EMPLOYEE LIST and choose the Number from there. \n");
                        
                        EmpNo1=getIndexE(EmployeeList); //we call the getIndexE method to get the position in the array of the employee with the given employee number
                        
                        System.out.println(EmployeeList.get(EmpNo1));
                        
                        break;
                        
                case"4":System.out.println();
                        int JobNo1;
                        System.out.println("Write the Job Number to see its details." + "\n" + "If you do not know the Number, please write 'list'(no caps) to get the JOBS LIST and choose the Number from there. \n");
                        
                        JobNo1=getIndexJ(JobList); //we call the getIndexJ method to get the position in the array of the job with the given job number
                        
                        System.out.println(JobList.get(JobNo1));
                                
                        break;
                            
                case"5":System.out.println();
                        int JobNo2, EmpNo2;
                                
                        //ask for the job number 
                        System.out.println("Write the Job Number." + "\n" + "If you do not know the Number, please write 'list'(no caps) to get the JOBS LIST and choose the Number from there. \n");
                        JobNo2=getIndexJ(JobList);
                              
                        //ask for the employee number
                        System.out.println("Write the Number of the Employee to be assigned to this job." + "\n" + "If you do not know the Number, please write 'list'(no caps) to get the EMPLOYEE LIST and choose the Number from there. \n");
                        EmpNo2=getIndexE(EmployeeList);
                        
                        //assign the employee to the job using the assignEmployeeToJob method and then change the job status to 'Assigned'
                        (JobList.get(JobNo2)).assignEmployeeToJob(EmployeeList.get(EmpNo2).getEmployeeNumber());
                        (JobList.get(JobNo2)).changeJobStatus("Assigned");

                                
                        System.out.println("Job #" + JobList.get(JobNo2).getJobNumber() + " has been assigned to cleaner #" + EmployeeList.get(EmpNo2).getEmployeeNumber() + "\n");
                        break;
                                
                case"6":System.out.println();
                        String AssigEmpNo;
                        int JobNo3, ratingIn;
                        double priceIn;
                        
                        System.out.println("Write the Job Number." + "\n" + "If you do not know the Number, please write 'list'(no caps) to get the JOBS LIST and choose the Number from there. \n");
                        JobNo3=getIndexJ(JobList);
                        JobList.get(JobNo3).changeJobStatus("Complete");
                        
                        //now that the job is complete, the price and rating should be added
                        System.out.println("Add the price of the job. \n");
                        priceIn = EasyScanner.nextDouble();
                        System.out.println();
                        JobList.get(JobNo3).addPrice(priceIn);
                                
                        System.out.println("Add the rating of the job. It must be a number from 1 to 5. \n");
                        ratingIn = EasyScanner.nextInt();
                        System.out.println();
                        JobList.get(JobNo3).addJobrating(ratingIn);
                        
                        //the number of the employee that was assigned to this job is taken in order to add the job to his total of completed jobs
                        AssigEmpNo = JobList.get(JobNo3).getEmpNumber();
                        
                        //search the employee list until the employee with the coresponding employee number is found and then the job is added to his total
                        for(int i=0; i<EmployeeList.size(); i++)
                        {
                            if(AssigEmpNo.equals(EmployeeList.get(i).getEmployeeNumber()))
                            {
                                EmployeeList.get(i).addJob();
                                break;
                            }
                        }
                                
                        System.out.println("Job #" + JobList.get(JobNo3).getJobNumber() + " status has been changed to Complete, the price has been set to £" + priceIn + " and its rating has been set to " + ratingIn + " STARS. \n");
                                
                        break;
                        
                case"7":System.out.println();
                        String einput1;
                        int EmpNo3, y=0;
                        System.out.println();
                        
                        System.out.println("Type the number of the Employee whose status you want to change. \n");
                        EmpNo3 = getIndexE(EmployeeList);
                        System.out.println();
                        
                        //a loop has been created in order to make sure that the input is valid
                        do
                        {
                            System.out.println("Type 'Inactive' or 'Active' to change the status. \n");
                            einput1 = EasyScanner.nextString();
                            System.out.println();
                            
                            //if the user types 'inactive'
                            if("Inactive".equals(einput1) || "inactive".equals(einput1))
                            {
                                EmployeeList.get(EmpNo3).changeEmployeeStatus("Inactive");
                                System.out.println("Employee #" + EmployeeList.get(EmpNo3).getEmployeeNumber() + " had their status changed to Inactive.");
                                y=1;
                            }
                            
                            //if the user types 'active'
                            else if("Active".equals(einput1) || "active".equals(einput1))
                            {
                                EmployeeList.get(EmpNo3).changeEmployeeStatus("Active");
                                System.out.println("Employee #" + EmployeeList.get(EmpNo3).getEmployeeNumber() + " had their status changed to Active");
                                y=1;
                            }
                            
                            //if the user types anything other than the two options
                            if (y==0)
                            {
                                System.out.println("Please try again");
                            }
                            
                        } while (y==0);
                        
                        break;
                        
                case"8":int EmpNo4;
                        
                        System.out.println("\nType the number of the Employee. Typle 'list' if you want to see the list of Employees. \n");
                        EmpNo4 = getIndexE(EmployeeList);
                        
                        System.out.println("\nThe number of jobs completed by Employee #" + EmployeeList.get(EmpNo4).getEmployeeNumber() + " is " + EmployeeList.get(EmpNo4).getTotalJobs() + ". \n");
                        
                        break;
                        
                case"9":String einput2;
                        
                        System.out.println("\n Type the number of the Employee. Typle 'list' if you want to see the list of Employees. \n");
                        einput2=EasyScanner.nextString();
                        System.out.println();
                        
                        //goes through the job list and finds all the jobs that have this employee as the assigned cleaner
                        for(int i=0; i<JobList.size(); i++)
                        {
                            if(einput2.equals(JobList.get(i).getEmpNumber()))
                            {
                                System.out.println(JobList.get(i));
                            }
                        }
                        break;
                
                case"10":String EmpNoIn, FNameIn, LNameIn, DayIn, MonthIn, YearIn, DoeIn, PosIn, NameIn;
                        int z=0;
                        
                        System.out.println("\nType the number given to the new Employee. Make sure that the number has exactly 6 DIGITS and starts with an 8 (eg. 800000). \n");
                        EmpNoIn = EasyScanner.nextString();
                        
                        System.out.println("\nType the FIRST name of the Employee. \n");
                        FNameIn = EasyScanner.nextString();
                        
                        System.out.println("\nType the LAST name of the Employee. \n");
                        LNameIn = EasyScanner.nextString();
                        
                        NameIn = FNameIn + " " + LNameIn;
                        
                        System.out.println("\nType the date of employement.\n" + "Day: ");
                        DayIn = EasyScanner.nextString();
                        System.out.println("\nMonth: ");
                        MonthIn = EasyScanner.nextString();
                        System.out.println("\nYear: ");
                        YearIn = EasyScanner.nextString();
                        
                        DoeIn = DayIn + "/" + MonthIn + "/" + YearIn;
                        
                        System.out.println("\nType the position given to the Employee (eg. Cleaner, Manager). \n");
                        PosIn = EasyScanner.nextString();
                        System.out.println();
                        
                        /*creates a CheckableEmployee object with the input from the user so that its validity 
                        can is checked before it is added to the list*/
                        CheckableEmployee employee = new CheckableEmployee(EmpNoIn, NameIn, DoeIn, PosIn);
                        
                        //this for loop is to check if the Employee Number is alredy assigned to an Employee
                        for(int i=0; i<EmployeeList.size(); i++)
                        {
                            if(EmpNoIn.equals(EmployeeList.get(i).getEmployeeNumber()))
                            {
                                z=1;
                                break;
                            }
                        }
                        
                        /*if the number is good the employee will be added to the list
                        if not, a message will be shown on the screen and the user will be asked to try again*/
                        if(checkValidity(employee) && z==0)
                        {
                            EmployeeList.add(employee);
                            System.out.println("Employee added successfully.");
                        }
                        else if(z==1)
                        {
                            System.out.println("This number is already assigned to another Employee. Please try again. ");
                        }
                        else
                        {
                            System.out.println("Invalid Number. Please try again.");
                        }
                        break;
                        
                case"11":System.out.println();
                        String JobNoIn, CFNameIn, CLNameIn, CNameIn, ZoneIn, CityIn, LocationIn;
                        int s=0;
                        
                        System.out.println("Type the number given to the Job. The number MUST start with'F3' and follow with 5 DIGITS after. (eg. F300000 \n");
                        JobNoIn = EasyScanner.nextString();
                        System.out.println();
                        
                        System.out.println("Write the Client's FIRST name. \n");
                        CFNameIn = EasyScanner.nextString();
                        System.out.println();
                         
                        System.out.println("Write the Client's LAST name. \n");
                        CLNameIn = EasyScanner.nextString();
                        System.out.println();
                         
                        CNameIn = CFNameIn + " " + CLNameIn;
                         
                        System.out.println("Write the location of the job. \n" + "Zone: ");
                        ZoneIn = EasyScanner.nextString();
                        System.out.println();
                        System.out.println("City: \n");
                        CityIn = EasyScanner.nextString();
                        System.out.println();
                         
                        LocationIn = ZoneIn + ", " + CityIn;
                        
                        //a CheckableJob object is created using the input given by the user
                        CheckableJob job = new CheckableJob(JobNoIn, CNameIn, LocationIn);
                         
                        //the for loop is to see whether other jobs have the same number as the one given
                        for(int i=0; i<JobList.size(); i++)
                        {
                            if(JobNoIn.equals(JobList.get(i).getJobNumber()))
                            {
                                s=1;
                                break;
                            }
                        }
                        
                        //the validity of the new job is checked to see if is good to add in the list
                        if(checkValidity(job) && s==0)
                        {
                            
                            JobList.add(job);
                            System.out.println("Job added successfully.");
                        }
                        else if(s==1)
                        {
                            System.out.println("This number is already assigned to another Job. Please try again. ");
                        }
                        else
                        {
                            System.out.println("Invalid Number. Please try again.");
                        }
                        break;
                        
                case"12":int EmpNo5;
                    
                        System.out.println("\nType the number of the Employee. \n");
                        EmpNo5 = getIndexE(EmployeeList);
                        
                        EmployeeList.remove(EmpNo5);
                        
                        System.out.println("Employee removed succesfully. \n");
                        break;
                        
                case"13":int JobNo4;
                    
                        System.out.println("\nType the number of the Job. \n");
                        JobNo4 = getIndexJ(JobList);
                        
                        JobList.remove(JobNo4);
                        
                        System.out.println(" Job removed succesfully. \n");
                        break;
                        
                case"14":System.out.println("Goodbye!");
                
                        //write to the files
                        writeListE(EmployeeList);
                        writeListJ(JobList);
                        
                        break;
                
                default : System.out.print("\nPlease choose a number from 1 - 14 only\n ");
            }
        } while(!"14".equals(choice));
        
    }
    
    //method to check the validity of the inserted number
    private static boolean checkValidity(Checkable objectIn)
    {
        return objectIn.check();
    }
    
    //method to get the Index of the Employee with the given number
    private static int getIndexE(List<Employee> Employeelist)
    {
        String einput;
        int EmpNo=-1;
        
        do
        {
            einput = EasyScanner.nextString();
            System.out.println();
        
            //if the user wants to see the list of employees before typing a number
            if("list".equals(einput))
            {
                for(int i=0; i<Employeelist.size(); i++)
                {
                    System.out.println("[ID: " + (Employeelist.get(i)).getEmployeeNumber() + "] [NAME: " + (Employeelist.get(i)).getEmployeeName() + "] [POSITION: " + (Employeelist.get(i)).getEmployeePosition() + "] [STATUS: " + (Employeelist.get(i)).getEmployeeStatus() + "] \n\n");
                }
                    System.out.println("Write the Number of the Employee. \n");
                    einput = EasyScanner.nextString();
                    System.out.println();
            }
            
            //gives the position in the array of the employee with the given number
            for(int i=0; i<Employeelist.size(); i++)
            {
                if(einput.equals((Employeelist.get(i)).getEmployeeNumber()))
                {
                    EmpNo = i;
                    break;
                }
            }
            
            //if the number is not assigned to an employee
            if(EmpNo==-1)
            {
                System.out.println("Invalid Number. Try again. If you need to see the list again type 'list' (no caps) \n");
            }
                            
        }while (EmpNo==-1);
        
        return EmpNo;
    }
    
    //method to get the Index of the Job with the given number
    private static int getIndexJ( List<Job> Joblist)
    {
        String jinput;
        int JobNo=-1;
        
        do
        {
            jinput = EasyScanner.nextString();
            System.out.println();
            
            //if the user wants to see the job list before typing the number
            if("list".equals(jinput))
            {
                for(int i=0; i<Joblist.size(); i++)
                {
                    System.out.println("[ID: " + (Joblist.get(i)).getJobNumber() + "] [STATUS: " + (Joblist.get(i)).getJobStatus() + "] [CLEANER ID: " + (Joblist.get(i)).getEmpNumber() + "] \n\n");
                }
                    System.out.println("Write the Job Number. \n");
                    jinput = EasyScanner.nextString();
                    System.out.println();
            }

            //searches for the position of the job with the given number
            for(int i=0; i<Joblist.size(); i++)
            {
                if(jinput.equals((Joblist.get(i)).getJobNumber()))
                {
                    JobNo = i;
                    break;
                }
            }
            
            //if the number is not assigned to any job
            if(JobNo==-1)
            {
                System.out.println("Invalid Number. Try again. If you need to see the list again type 'list' (no caps) \n");
            }
                            
        }while (JobNo==-1);
        
        return JobNo;
    }
    
    //method for writing the Employees file
    static void writeListE(List<Employee> carListIn)
    {
        try
            (   
		FileOutputStream empFile = new FileOutputStream("Employees.dat");
                ObjectOutputStream empStream = new ObjectOutputStream(empFile);
            )
        {
         
            for(Employee item : carListIn)
            {
                empStream.writeObject(item);
            }

        }
        catch(IOException e)
        {
            System.out.println("There was a problem writing the file");
        }
    }
	
    
    //method for weiting the Jobs file
    static void writeListJ(List<Job> jobListIn)
    {
        try(   
		FileOutputStream jobFile = new FileOutputStream("Jobs.dat");
                ObjectOutputStream jobStream = new ObjectOutputStream(jobFile);
			  )
        {
         
            for(Job item : jobListIn)
            {
                jobStream.writeObject(item);
            }

        }
        catch(IOException e)
        {
            System.out.println("There was a problem writing the file");
        }
    }
    
    //method for reading the Employees file
    static void readListE(List<Employee> EmpListIn)
    {
        boolean endOfFile = false;
        Employee tempEmp;
         
        try( 
               FileInputStream empFile = new FileInputStream("Employees.dat");
               ObjectInputStream empStream = new ObjectInputStream(empFile);
            )
         {
           
            tempEmp =  (Employee) empStream.readObject();
            while(endOfFile != true)
            {
                try
                 {
                     EmpListIn.add(tempEmp);
                    tempEmp = (Employee) empStream.readObject();
                }

                catch(EOFException  e)
                {
                    endOfFile = true;
                }
            }
           
         }

         catch(FileNotFoundException e)
         {
            System.out.println("\nNo file was read");
         }

         catch(ClassNotFoundException e) 
         {
            System.out.println("\nTrying to read an object of an unknown class");
         }

         catch(StreamCorruptedException e)
         {
            System.out.println("\nUnreadable file format");
         }

         catch(IOException e)
         {
            System.out.println("There was a problem reading the file");
         }

    }
    
    //method for reading the Jobs file
    static void readListJ(List<Job> JobListIn)
    {
        boolean endOfFile = false;
        Job tempJob;
         
        try( 
               FileInputStream jobFile = new FileInputStream("Jobs.dat");
               ObjectInputStream jobStream = new ObjectInputStream(jobFile);
            )
         {
           
            tempJob =  (Job) jobStream.readObject();
            while(endOfFile != true)
            {
                try
                 {
                    JobListIn.add(tempJob);
                    tempJob = (Job) jobStream.readObject();
                }

                catch(EOFException  e)
                {
                    endOfFile = true;
                }
            }
           
         }

         catch(FileNotFoundException e)
         {
            System.out.println("\nNo file was read");
         }

         catch(ClassNotFoundException e)
         {
            System.out.println("\nTrying to read an object of an unknown class");
         }

         catch(StreamCorruptedException e)
         {
            System.out.println("\nUnreadable file format");
         }

         catch(IOException e)
         {
            System.out.println("There was a problem reading the file");
         }

    }

}


