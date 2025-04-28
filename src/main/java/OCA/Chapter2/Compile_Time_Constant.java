package OCA.Chapter2;

public class Compile_Time_Constant {
    public static void main(String[] args) {
        Compile_Time_Constant c = new Compile_Time_Constant();
        c.getSortOrder("1","2","");
    }

    private  void getSortOrder(String firstname, final String lastname,final String notCompTimeConstantEvenItIsFinal){
        String middleName = "Patricia";
        final String finalButNotAssignedYet;
        final String finalButNotAssignedAsNull;// Not compile time constant until it assigned
        final String finalAndAssigned = "";

//        switch (notCompTimeConstantEvenItIsFinal){
//            case "5": // Literal is comp. time constant, not dynamic, we cannot change once it is declared
//                System.out.println();
//            case middleName: // Constant expression required
//                System.out.println();
//            case lastname: // Constant expression required, even it is final
//                System.out.println();
//            case finalButNotAssignedYet: // Variable 'finalButNotAssignedYet' might not have been initialized
//                System.out.println();
//            case finalButNotAssignedAsNull: // Variable 'finalButNotAssignedAsNull' might not have been initialized
//                System.out.println();
//            case finalAndAssigned:
//                System.out.println();
//        }
    }
}
