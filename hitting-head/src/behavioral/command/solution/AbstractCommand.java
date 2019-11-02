package behavioral.command.solution;

public abstract class AbstractCommand implements Command {

	private TextEditor textEditor;

	public AbstractCommand(TextEditor textEditor) {
		// TODO Auto-generated constructor stub
		this.textEditor = textEditor;
	}

	public TextEditor getTextEditor() {
		return textEditor;
	}

}
