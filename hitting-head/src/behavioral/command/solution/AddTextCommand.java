package behavioral.command.solution;

public class AddTextCommand extends AbstractCommand {

	private String textToAdd;
	private String undoText;

	public AddTextCommand(TextEditor textEditor, String textToAdd) {
		super(textEditor);
		this.textToAdd = textToAdd;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		undoText = getTextEditor().getText();
		getTextEditor().setText(textToAdd);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		getTextEditor().setText(undoText);
	}

}
