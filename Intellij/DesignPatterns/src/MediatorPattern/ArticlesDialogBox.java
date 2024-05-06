package MediatorPattern;

public class ArticlesDialogBox extends DialogBox {
    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextbox = new TextBox(this);
    private Button saveButton = new Button(this);



    public void simulateUserInteracting(){
        articlesListBox.setSelection("Article 1 Boi");
        System.out.println("Textbox: " + titleTextbox.getContent());
        System.out.println("Butto: " + saveButton.isEnabled());
    }
    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox){
            articleSelected();
        }else if (control == titleTextbox){
            titleChanged();
        }
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
