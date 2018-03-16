package navigateOnSystem2;

/**
 * Created by pinq on 16.03.18.
 */
public class CommandPreparation {

    public String prepareCommand(String commandToPrepare){
        if(commandToPrepare == null || commandToPrepare.length()==0){
            return " ";
        }
        if(commandToPrepare.startsWith("cd")){
            String[] commandToArray = commandToPrepare.trim().split(" ");
            if(commandToArray.length >1){
                return "cd";
            }
            else{
                return"cd..";
            }
        }

        return " ";
    }


}
