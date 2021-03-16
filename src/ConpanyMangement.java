
public class ConpanyMangement {
    public static void main (String[] args) {

       //Create instance
        EmployeeDADlmpl dao = EmployeeDADlmpl.getInstance();

        //display all employee data
        displayAllEmp(dao);

        //add naw employee
        //addNewEmp(dao);

    }
}

