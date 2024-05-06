package MediatorPattern;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextbox = new TextBox();
    private Button saveButton = new Button();


    public ArticlesDialogBox(){
        //Lambda
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextbox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteracting(){
        articlesListBox.setSelection("Article 1 Boi");
        System.out.println("Textbox: " + titleTextbox.getContent());
        System.out.println("Butto: " + saveButton.isEnabled());
    }

    private void articleSelected(){
        titleTextbox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged(){
        var content = titleTextbox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
