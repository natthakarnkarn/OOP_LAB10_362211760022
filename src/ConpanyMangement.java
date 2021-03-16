
public class ConpanyMangement {
    public static void main (String[] args) {

       //Create instance
        EmployeeDADlmpl dao = EmployeeDADlmpl.getInstance();

        //display all employee data
        displayAllEmp(dao);

        //add naw emp loyee
        //addNewEmp(dao);


    }
}

