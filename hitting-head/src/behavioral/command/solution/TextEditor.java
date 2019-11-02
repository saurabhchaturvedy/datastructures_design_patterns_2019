package behavioral.command.solution;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {

	private String text;

	private Queue<Command> commands = new LinkedList<>();

	private void executeCommand(Command command) {
		command.action();
		commands.add(command);
	}

	private void undo() {
		Command poll = commands.poll();
		if (poll != null) {
			poll.undo();
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Queue<Command> getCommands() {
		return commands;
	}

	public void setCommands(Queue<Command> commands) {
		this.commands = commands;
	}

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		textEditor.setText("India one");
		ClearTextCommand clearTextCommand = new ClearTextCommand(textEditor);
		textEditor.executeCommand(clearTextCommand);
		System.out.println("text =" + textEditor.getText());
		AddTextCommand addTextCommand = new AddTextCommand(textEditor, "text AGain");
		textEditor.executeCommand(addTextCommand);
		System.out.println("text =" + textEditor.getText());
		textEditor.executeCommand(clearTextCommand);
		System.out.println("text >>>> " + textEditor.getText());
		textEditor.undo();
		System.out.println("text >>>> " + textEditor.getText());
	}
}
