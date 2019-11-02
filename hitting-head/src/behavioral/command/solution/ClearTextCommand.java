package behavioral.command.solution;

public class ClearTextCommand extends AbstractCommand {
	
	
	private String undoText;

	public ClearTextCommand(TextEditor textEditor) {
		super(textEditor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		   undoText = getTextEditor().getText();
           getTextEditor().setText("");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		getTextEditor().setText(undoText);
	}

}
