/*
@Rodica Ganea
1923920
Assignment Part 2
*/

import java.text.NumberFormat;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.ArrayList;
import java.util.List;

class EmployeeList
{
    private ArrayList<Employee> elist;
    public final int MaxE;
    
    public EmployeeList(int maxIn)
    {
        elist = new ArrayList<>();
        MaxE = maxIn;
    }
    
    public boolean addEmployee(Employee empIn)
    {
        if(!isFull())
        {
            elist.add(empIn);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean removeEmployee(String empNum)
    {
        Employee findE = search(empNum);
        if(findE != null)
        {
            elist.remove(findE);
            return true;
        }
        else
            return false;
    }
    
    public Employee search(String empNum)
    {
        for(Employee currentEmployee: elist)
        {
            if(empNum.equals(currentEmployee.getEmployeeNumber()))
            {
                return currentEmployee;
            }
        }
        return null;
    }
    
    public Employee getEmployee(int positionIn)
    {
        if(positionIn<1 || positionIn>getTotal())
        {
            return null;
        }
        else
        {
            return elist.get(positionIn -1);
        }
    }
    
    public boolean isEmpty()
    {
        return elist.isEmpty();
    }
    
    public boolean isFull()
    {
        return elist.size() == MaxE;
    }
    
    public int getTotal()
    {
        return elist.size();
    }
    
    @Override
    public String toString()
    {
        return elist.toString();
    }
}

class JobList
{
    private ArrayList<Job> jlist;
    public final int MaxJ;
    
    public JobList(int maxIn)
    {
        jlist = new ArrayList<>();
        MaxJ = maxIn;
    }
    
    public boolean addJob(Job JobIn)
    {
        if(!isFull())
        {
            jlist.add(JobIn);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean removeJob(String jobNum)
    {
        Job findJ = search(jobNum);
        if(findJ != null)
        {
            jlist.remove(findJ);
            return true;
        }
        else
            return false;
    }
    
    public Job search(String jobNum)
    {
        for(Job currentJob: jlist)
        {
            if(jobNum.equals(currentJob.getJobNumber()))
            {
                return currentJob;
            }
        }
        return null;
    }
    
    public Job getJob(int positionIn)
    {
        if(positionIn<1 || positionIn>getTotal())
        {
            return null;
        }
        else
        {
            return jlist.get(positionIn -1);
        }
    }
    
    public boolean isEmpty()
    {
        return jlist.isEmpty();
    }
    
    public boolean isFull()
    {
        return jlist.size() == MaxJ;
    }
    
    public int getTotal()
    {
        return jlist.size();
    }
    
    @Override
    public String toString()
    {
        return jlist.toString();
    }
}

public class CleaningCompany extends Application 
{
    //creating the lists
    private EmployeeList eList;
    private JobList jList;
    
    //setting the width and height
    private final int WIDTH = 1200;
    private final int HEIGHT = 700;
    
    //creating the labels and text fields
    private Label headingLabel = new Label("Cleaning Company");
    private Label empNumLabel = new Label("Employee Number");
    private TextField empNumField = new TextField();
    private Label NameLabel = new Label("Employee Name");
    private TextField NameField = new TextField();
    private Label DateLabel = new Label("Date of Employment");
    private TextField DayField = new TextField();
    private TextField MonthField = new TextField();
    private TextField YearField = new TextField();
    private Label PositionLabel = new Label("Position");
    private TextField PositionField = new TextField();
    private Label eStatusLabel = new Label("Status");
    private TextField eStatusField = new TextField();
    private Button ElistButton = new Button("See Employee List");
    private Button EsearchButton = new Button("Search Employee");
    private Button EchangeButton = new Button("Change Status");
    private Button EcompButton = new Button("Total of Completed Jobs");
    private Button EjobsButton = new Button("See All Jobs");
    private Button EaddButton = new Button("Add Employee");
    private Button EremoveButton = new Button("Remove Employee");
    private TextArea displayArea1 = new TextArea();
    private Label jobNumLabel = new Label("Job Number");
    private TextField jobNumField = new TextField();
    private Label cNameLabel = new Label("Client Name");
    private TextField cNameField = new TextField();
    private Label locationLabel = new Label("Location");
    private TextField ZoneField = new TextField();
    private TextField CityField = new TextField();
    private Label PriceLabel = new Label("Price");
    private TextField PriceField = new TextField();
    private Label jStatusLabel = new Label("Status");
    private TextField jStatusField = new TextField();
    private Label RateLabel = new Label("Rating");
    private TextField RateField = new TextField();
    private Label empNumLabel2 = new Label("Employee Number");
    private TextField empNumField2 = new TextField();
    private Button JlistButton = new Button("See Job List");
    private Button JsearchButton = new Button("Search Job");
    private Button JassignButton = new Button("Assign Cleaner");
    private Button JchangeButton = new Button("Change Status to complete");
    private Button JaddButton = new Button("Add Job");
    private Button JremoveButton = new Button("Remove Job");
    private TextArea displayArea2 = new TextArea();
    
    @Override
    public void start(Stage stage) 
    {
        eList = new EmployeeList(100);
        jList = new JobList(100);
        
        //creating some employees
        eList.addEmployee(new Employee("859758", "Ted Streem", "17/05/2007", "Cleaner"));
        eList.addEmployee(new Employee("872194", "Gabe Austin", "12/05/2007", "Cleaner"));
        eList.addEmployee(new Employee("883942", "Jonas Richerson", "22/07/2007", "Cleaner"));
        eList.addEmployee(new Employee("873489", "Jane Richerson", "10/08/2007", "Cleaner"));
        eList.addEmployee(new Employee("800025", "Noelle Silva", "30/06/2008", "Receptionist"));
        eList.addEmployee(new Employee("847283", "Cody Miller", "17/10/2008", "Cleaner"));
        eList.addEmployee(new Employee("814384", "Cristina Alexa", "05/05/2009", "Cleaner"));
        eList.addEmployee(new Employee("817038", "Kelsey Jordan", "23/09/2009", "Manager"));
        eList.addEmployee(new Employee("804923", "Marie Lawrence", "18/03/2010", "Cleaner"));
        eList.addEmployee(new Employee("834801", "Leon Jefferson", "03/08/2012", "Cleaner"));
        eList.addEmployee(new Employee("802946", "Harvey Green", "29/04/2012", "Cleaner"));
        eList.addEmployee(new Employee("801946", "Holly Brick", "30/01/2013", "Cleaner"));
        eList.addEmployee(new Employee("810674", "Austin Black", "11/02/2014", "Receptionist"));
        eList.addEmployee(new Employee("818492", "Jiovani Zanin", "13/04/2014", "Cleaner"));
        eList.addEmployee(new Employee("856291", "Hellen Trahan", "31/08/2014", "Manager"));
        
        
        //change the status for a few employees
        eList.getEmployee(4).changeEmployeeStatus("Inactive");
        eList.getEmployee(10).changeEmployeeStatus("Inactive");
        eList.getEmployee(11).changeEmployeeStatus("Inactive");
        eList.getEmployee(12).changeEmployeeStatus("Inactive");
        
        //adding jobs to the list
        jList.addJob(new Job("F357624", "Marcus Harper", "Bekton, London"));
        jList.addJob(new Job("F318736", "Julia Miller", "Killburn, London"));
        jList.addJob(new Job("F392753", "Eddie Hemmings", "Camden Road, London"));
        jList.addJob(new Job("F373892", "Lucia Aster", "Bekton, London"));
        jList.addJob(new Job("F382123", "Anna Marcus", "Leyton, London"));
        jList.addJob(new Job("F304634", "Luke Evans", "Aldgate, London"));
        jList.addJob(new Job("F309352", "Robert Adams", "Bethnal Green, London"));
        jList.addJob(new Job("F302863", "Sarah Gerald", "Holborn, London"));
        jList.addJob(new Job("F396592", "Sophie Jackson", "Kingsbury, London"));
        jList.addJob(new Job("F345295", "Annabeth Vereena", "Leyton, London"));
        jList.addJob(new Job("F392648", "Leo Valdez", "Stratford, London"));
        jList.addJob(new Job("F326782", "Hannah Milligan", "Aldgate, London"));
        jList.addJob(new Job("F318649", "Gavin Reynolds", "Sheperd's Bush, London"));
        jList.addJob(new Job("F359224", "Lily Morales", "Waterloo, London"));
        jList.addJob(new Job("F345591", "Chris Roberts", "Bethnal Green, London"));
        jList.addJob(new Job("F319692", "Harry Williams", "Killburn, London"));
        jList.addJob(new Job("F314798", "Marco Maretis", "Westminster, London"));
        jList.addJob(new Job("F386284", "Elizabeth Willie", "Leyton, London"));
        jList.addJob(new Job("F383975", "Allan Carrie", "Euston, London"));
        jList.addJob(new Job("F379643", "Aelena Noel", "Royal Oak, London"));
        
        
        //change the status of a few jobs
        jList.getJob(1).changeJobStatus("Completed");
        jList.getJob(2).changeJobStatus("Completed");
        jList.getJob(3).changeJobStatus("Completed");
        jList.getJob(5).changeJobStatus("Assigned");
        jList.getJob(6).changeJobStatus("Completed");
        jList.getJob(7).changeJobStatus("Assigned");
        jList.getJob(8).changeJobStatus("Completed");
        jList.getJob(9).changeJobStatus("Completed");
        jList.getJob(10).changeJobStatus("Completed");
        jList.getJob(11).changeJobStatus("Completed");
        jList.getJob(12).changeJobStatus("Assigned");
        jList.getJob(13).changeJobStatus("Assigned");
        jList.getJob(15).changeJobStatus("Completed");
        jList.getJob(16).changeJobStatus("Completed");
        jList.getJob(18).changeJobStatus("Completed");
        jList.getJob(19).changeJobStatus("Completed");
        jList.getJob(20).changeJobStatus("Completed");

        //add the price for completed jobs
        jList.getJob(1).addPrice(59.99);
        jList.getJob(2).addPrice(129.99);
        jList.getJob(3).addPrice(73.25);
        jList.getJob(6).addPrice(40.99);
        jList.getJob(8).addPrice(94.75);
        jList.getJob(9).addPrice(70.22);
        jList.getJob(10).addPrice(145.89);
        jList.getJob(11).addPrice(60.80);
        jList.getJob(15).addPrice(95.51);
        jList.getJob(16).addPrice(82.65);
        jList.getJob(18).addPrice(99.90);
        jList.getJob(19).addPrice(63.88);
        jList.getJob(20).addPrice(105.99);
        
        
        //asign Employees to Jobs
        jList.getJob(1).assignEmployeeToJob("814384");
        jList.getJob(2).assignEmployeeToJob("802946");
        jList.getJob(3).assignEmployeeToJob("818492");
        jList.getJob(5).assignEmployeeToJob("859758");
        jList.getJob(6).assignEmployeeToJob("834801");
        jList.getJob(7).assignEmployeeToJob("804923");
        jList.getJob(8).assignEmployeeToJob("873489");
        jList.getJob(9).assignEmployeeToJob("801946");
        jList.getJob(10).assignEmployeeToJob("847283");
        jList.getJob(11).assignEmployeeToJob("872194");
        jList.getJob(12).assignEmployeeToJob("804923");
        jList.getJob(13).assignEmployeeToJob("883942");
        jList.getJob(15).assignEmployeeToJob("804923");
        jList.getJob(16).assignEmployeeToJob("804923");
        jList.getJob(18).assignEmployeeToJob("883942");
        jList.getJob(19).assignEmployeeToJob("847283");
        jList.getJob(20).assignEmployeeToJob("801946");
        
        
        //add to the total of completed jobs for each cleaner
        for(int i=1; i<jList.getTotal(); i++)
        {
            if("Completed".equals(jList.getJob(i).getJobStatus()))
            {
                for(int j=1; j<eList.getTotal(); j++)
                {
                    if((jList.getJob(i).getEmpNumber()).equals(eList.getEmployee(j).getEmployeeNumber()))
                    {
                        eList.getEmployee(j).addJob();
                        break;
                    }
                }
            }
        }
        
        
        //set the rating for each completed job
        jList.getJob(1).addJobrating(4);
        jList.getJob(2).addJobrating(3);
        jList.getJob(3).addJobrating(4);
        jList.getJob(6).addJobrating(5);
        jList.getJob(8).addJobrating(3);
        jList.getJob(9).addJobrating(2);
        jList.getJob(10).addJobrating(4);
        jList.getJob(11).addJobrating(5);
        jList.getJob(15).addJobrating(3);
        jList.getJob(16).addJobrating(3);
        jList.getJob(18).addJobrating(4);
        jList.getJob(19).addJobrating(5);
        jList.getJob(20).addJobrating(2);
        
        HBox employeeDetails1 = new HBox (20);
        HBox employeeDetails2 = new HBox (20);
        HBox employeeButtons = new HBox (20);
        HBox jobDetails1 = new HBox (20);
        HBox jobDetails2 = new HBox (20);
        HBox jobButtons = new HBox (20);
       
        //creating sections
        employeeDetails1.getChildren().addAll(empNumLabel, empNumField, NameLabel, NameField, DateLabel, DayField, MonthField, YearField);
        employeeDetails2.getChildren().addAll(PositionLabel, PositionField, eStatusLabel, eStatusField);
        employeeButtons.getChildren().addAll(ElistButton, EsearchButton, EchangeButton, EcompButton, EjobsButton, EaddButton, EremoveButton);
        jobDetails1.getChildren().addAll(jobNumLabel, jobNumField, cNameLabel, cNameField, locationLabel, ZoneField, CityField, PriceLabel, PriceField);
        jobDetails2.getChildren().addAll(jStatusLabel, jStatusField, RateLabel, RateField, empNumLabel2, empNumField2);
        jobButtons.getChildren().addAll(JlistButton, JsearchButton, JassignButton, JchangeButton, JaddButton, JremoveButton);
       
        VBox root = new VBox(10);
       
        root.getChildren().addAll(headingLabel, employeeDetails1, employeeDetails2, employeeButtons, displayArea1, jobDetails1, jobDetails2, jobButtons, displayArea2);
       
        Scene scene = new Scene(root, Color.BROWN);
       
        //designing it
        Font font = new Font("Calibri", 40);
        headingLabel.setFont(font);
       
        employeeDetails1.setAlignment(Pos.CENTER);
        employeeDetails2.setAlignment(Pos.CENTER);
        employeeButtons.setAlignment(Pos.CENTER);
        jobDetails1.setAlignment(Pos.CENTER);
        jobDetails2.setAlignment(Pos.CENTER);
        jobButtons.setAlignment(Pos.CENTER);
       
        root.setAlignment(Pos.CENTER);
        
        //designing a few text fields
        DayField.setMinWidth(70);
        DayField.setMaxWidth(70);
        
        MonthField.setMinWidth(70);
        MonthField.setMaxWidth(70);
        
        YearField.setMinWidth(70);
        YearField.setMaxWidth(70);
        
        ZoneField.setMinWidth(100);
        ZoneField.setMaxWidth(100);
        
        CityField.setMinWidth(100);
        CityField.setMaxWidth(100);
        
        jobNumField.setMinWidth(120);
        jobNumField.setMaxWidth(120);
        
        cNameField.setMinWidth(120);
        cNameField.setMaxWidth(120);
        
        PriceField.setMinWidth(70);
        PriceField.setMaxWidth(70);
        
        RateField.setMinWidth(70);
        RateField.setMaxWidth(70);
       
        employeeDetails1.setMinWidth(1000);
        employeeDetails1.setMaxWidth(1000);
        
        employeeDetails2.setMinWidth(1000);
        employeeDetails2.setMaxWidth(1000);
       
        employeeButtons.setMinWidth(WIDTH);
        employeeButtons.setMaxWidth(WIDTH);
       
        jobDetails1.setMinWidth(1000);
        jobDetails1.setMaxWidth(1000);
        
        jobDetails2.setMinWidth(1000);
        jobDetails2.setMaxWidth(1000);
       
        jobButtons.setMinWidth(WIDTH);
        jobButtons.setMaxWidth(WIDTH);
        
        root.setMinSize(WIDTH, HEIGHT);
        root.setMaxSize(WIDTH, HEIGHT);
       
        displayArea1.setMaxSize(WIDTH - 80, HEIGHT/5);
        displayArea2.setMaxSize(WIDTH - 80, HEIGHT/5);
       
        stage.setWidth(WIDTH);
        stage.setHeight(HEIGHT);
       
        BorderStroke style = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(2));
        root.setBorder(new Border(style));
        root.setBackground(Background.EMPTY);
       
        //designing the buttons
        ElistButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        EsearchButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        EchangeButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        EcompButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        EjobsButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        EaddButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        EremoveButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        
        JlistButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        JsearchButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        JassignButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        JchangeButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        JaddButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        JremoveButton.setBackground(new Background(new BackgroundFill(Color.BURLYWOOD, new CornerRadii(5), Insets.EMPTY)));
        
        //buttons instructions
        ElistButton.setOnAction(e -> displaylistE());
        EsearchButton.setOnAction(e -> searchE());
        EchangeButton.setOnAction(e -> changeE());
        EcompButton.setOnAction(e -> compjobsE());
        EjobsButton.setOnAction(e -> alljobsE());
        EaddButton.setOnAction(e -> addE());
        EremoveButton.setOnAction(e -> removeE());
        
        JlistButton.setOnAction(e -> displaylistJ());
        JsearchButton.setOnAction(e -> searchJ());
        JassignButton.setOnAction(e -> assignJ());
        JchangeButton.setOnAction(e -> changeJ());
        JaddButton.setOnAction(e -> addJ());
        JremoveButton.setOnAction(e -> removeJ());
                
        stage.setScene(scene);
        stage.setTitle("Cleaning Company");
        stage.setResizable(false);
        stage.show();
    }
    
    private static boolean checkValidity(Checkable objectIn)
    {
        return objectIn.check();
    }
    
    //display the employee list
    private void displaylistE()
    {
        if(eList.isEmpty())
        {
            displayArea1.setText("The list is empty.");
        }
        else
        {
            displayArea1.setText("EMPLOYEE LIST" + "\n" + eList.toString());
        }
    }
    
    //search an employee
    private void searchE()
    {
        String empNum = empNumField.getText();
        
        if(empNum.length()==0)
        {
            displayArea1.setText("Employee Number must be entered");
        }
        else if(eList.search(empNum) == null)
        {
            displayArea1.setText("Incorrect Employee Number. Try Again!");
        }
        else
        {
            displayArea1.setText(eList.search(empNum).toString());
        }
    }
    
    //change status of employee
    public void changeE()
    {
        String empNum = empNumField.getText();
        String empStatus = eStatusField.getText();
        
        if(empNum.length()==0  || empStatus.length()==0)
        {
            displayArea1.setText("Employee Number and Status(active or inactive) must be entered");
        }
        
        else if(eList.search(empNum) == null)
        {
            displayArea1.setText("Incorrect Employee Number. Try Again!");
        }
        
        else if("Inactive".equals(empStatus) || "inactive".equals(empStatus))
        {
            eList.search(empNum).changeEmployeeStatus("Inactive");
            displayArea1.setText("Employee #" + eList.search(empNum).getEmployeeNumber() + " had their status changed to Inactive.");
        }
                            
        else if("Active".equals(empStatus) || "active".equals(empStatus))
        {
            eList.search(empNum).changeEmployeeStatus("Active");
            displayArea1.setText("Employee #" + eList.search(empNum).getEmployeeNumber() + " had their status changed to Active");
        }
    }
    
    //display the number of all completed jobs of an employee
    public void compjobsE()
    {
        String empNum = empNumField.getText();
        
        if(empNum.length()==0)
        {
            displayArea1.setText("Employee Number must be entered");
        }
        else if(eList.search(empNum) == null)
        {
            displayArea1.setText("Incorrect Employee Number. Try Again!");
        }
        else
        {
            displayArea1.setText("\nThe number of jobs completed by Employee #" + eList.search(empNum).getEmployeeNumber() + " is " + eList.search(empNum).getTotalJobs() + ". \n");
        }
    }
    
    //display a list of all the jobs assigned to an employee
    public void alljobsE()
    {
        String empNum = empNumField.getText();
        
        if(empNum.length()==0)
        {
            displayArea1.setText("Employee Number must be entered");
        }
        else if(eList.search(empNum) == null)
        {
            displayArea1.setText("Incorrect Employee Number. Try Again!");
        }
        else
        {
            JobList list = new JobList(100);
            for(int i=1; i<jList.getTotal(); i++)
            {
                if(empNum.equals(jList.getJob(i).getEmpNumber()))
                {
                    list.addJob(jList.getJob(i));
                }
            }
            displayArea1.setText(list.toString());
        }
    }
    
    //add an employee
    public void addE()
    {
        String empNum = empNumField.getText();
        String empName = NameField.getText();
        String empDay = DayField.getText();
        String empMonth = MonthField.getText();
        String empYear = YearField.getText();
        String empPosition = PositionField.getText();
        String empDate;
        int z=0;
        
        empDate=empDay + "/" + empMonth + "/" + empYear;
        
        if(empNum.length()==0 || empName.length()==0 || empDay.length()==0 || empMonth.length()==0 || empYear.length()==0 || empPosition.length()==0)
        {
            displayArea1.setText("You must enter the Employee Number, the name, date and position.");
        }
        else
        {
            if(eList.search(empNum) != null)
            {
                z=1;
            }

            CheckableEmployee employee = new CheckableEmployee(empNum, empName, empDate, empPosition);

            if(checkValidity(employee) && z==0)
            {
                eList.addEmployee(employee);
                displayArea1.setText("Employee added successfully.");
            }
            else if(z==1)
            {
                displayArea1.setText("This number is already assigned to another Employee. Please try again. ");
            }
                else
            {
                displayArea1.setText("Invalid Number. Please try again.");
            }
        }
    }
    
    //remove an employee
    public void removeE()
    {
        String empNum = empNumField.getText();
        
        if(empNum.length()==0)
        {
            displayArea1.setText("Employee Number must be entered");
        }
        else if(eList.search(empNum) == null)
        {
            displayArea1.setText("Incorrect Employee Number. Try Again!");
        }
        else
        {
            eList.removeEmployee(empNum);
            displayArea1.setText("Employee removed succesfully.");
        }
    }
    
    //display the jobs list
    private void displaylistJ()
    {
        if(jList.isEmpty())
        {
            displayArea2.setText("The list is empty.");
        }
        else
        {
            displayArea2.setText("JOBS LIST" + "\n" + jList.toString());
        }
    }
    
    //search a job
    private void searchJ()
    {
        String jobNum = jobNumField.getText();
        
        if(jobNum.length()==0)
        {
            displayArea2.setText("Job Number must be entered");
        }
        else if(jList.search(jobNum) == null)
        {
            displayArea2.setText("Incorrect Job Number. Try Again!");
        }
        else
        {
            displayArea2.setText(jList.search(jobNum).toString());
        }
    }
    
    //assign an employee to the job
    private void assignJ()
    {
        String jobNum = jobNumField.getText();
        String empNum = empNumField2.getText();
        
        if(jobNum.length()==0 || empNum.length()==0)
        {
            displayArea2.setText("Enter the Job Number and the number of the Employee assigned to the job.");
        }
        else if(jList.search(jobNum) == null)
        {
            displayArea2.setText("Incorrect Job Number. Try Again!");
        }
        else if(eList.search(empNum) == null)
        {
            displayArea2.setText("Incorrect Employee Number. Try Again!");
        }
        else
        {
            jList.search(jobNum).assignEmployeeToJob(eList.search(empNum).getEmployeeNumber());
            jList.search(jobNum).changeJobStatus("Assigned");
            displayArea2.setText("Employee #" + empNum + " was assigned to job #" + jobNum);
        }
    }
    
    //change status of a job to complete
    public void changeJ()
    {
        String jobNum = jobNumField.getText();
        String jobPrice = PriceField.getText();
        String jobRate = RateField.getText();
        String empNum;
        
        if(jobNum.length()==0 || jobPrice.length()==0 || jobRate.length()==0)
        {
            displayArea2.setText("Enter Job Number, price and rating(from 1-5).");
        }
        
        else if(jList.search(jobNum) == null)
        {
            displayArea2.setText("Incorrect Job Number. Try Again!");
        }
        
        else
        {
            jList.search(jobNum).changeJobStatus("Completed");
            jList.search(jobNum).addPrice(Double.parseDouble(jobPrice));
            jList.search(jobNum).addJobrating(Integer.parseInt(jobRate));
            
            empNum = jList.search(jobNum).getEmpNumber();
            eList.search(empNum).addJob();
            
            displayArea2.setText("Job #" + jobNum + " status has been changed to Complete, the price has been set to £" + jobPrice + " and its rating has been set to " + jobRate + " STARS.");
        }
    }
    
    //add a job
    public void addJ()
    {
        String jobNum = jobNumField.getText();
        String clientName = cNameField.getText();
        String jobZone = ZoneField.getText();
        String jobCity = CityField.getText();
        String jobLoc;
        int z=0;
        
        jobLoc=jobZone + ", " + jobCity;
        
        if(jobNum.length()==0 || clientName.length()==0 || jobZone.length()==0 || jobCity.length()==0)
        {
            displayArea2.setText("You must enter the Job Number, the client's name and location.");
        }
        else
        {
            if(jList.search(jobNum) != null)
            {
                z=1;
            }

            CheckableJob job = new CheckableJob(jobNum, clientName, jobLoc);

            if(checkValidity(job) && z==0)
            {
                jList.addJob(job);
                displayArea2.setText("Job added successfully.");
            }
            else if(z==1)
            {
                displayArea2.setText("This number is already assigned to another Job. Please try again. ");
            }
                else
            {
                displayArea2.setText("Invalid Number. Please try again.");
            }
        }
    }
    
    //remove a job
    public void removeJ()
    {
        String jobNum = jobNumField.getText();
        
        if(jobNum.length()==0)
        {
            displayArea2.setText("Job Number must be entered");
        }
        else if(jList.search(jobNum) == null)
        {
            displayArea2.setText("Incorrect Job Number. Try Again!");
        }
        else
        {
            jList.removeJob(jobNum);
            displayArea2.setText("Job removed succesfully.");
        }
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
