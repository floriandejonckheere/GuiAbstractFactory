package domein;

public class Screen {

    private final GuiFactory factory;
    
    private Button button;
    private Label label;
    
    public Screen(GuiFactory factory) {
        this.factory = factory;
    }

    public void addButton() {
        this.button = factory.createButton();
    }

    public void addLabel() {
        this.label = factory.createLabel();
    }

    public void viewComponents() {
        this.button.click();
        this.label.read();
    }
}
