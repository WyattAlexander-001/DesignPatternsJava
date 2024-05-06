package MediatorPattern;
// Think star pattern, all GUI elements talk to the main menu
public class Main {
    public static void main (String[] args){
        System.out.println("Mediator Pattern:");
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteracting();

    }
}
