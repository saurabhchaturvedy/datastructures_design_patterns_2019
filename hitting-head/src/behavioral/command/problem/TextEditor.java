package behavioral.command.problem;

public class TextEditor {

	private String text;

	private String undoText;

	private void setText(String text) {
		this.text = text;
		this.undoText = text;
	}

	private void clearText() {
		this.text = "";
	}

	private void undoText() {
		this.text = this.undoText;
	}

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		textEditor.setText("hello !!!");
		textEditor.clearText();
		System.out.println("Text is " + textEditor.text);
		textEditor.undoText();
		System.out.println("Text is " + textEditor.text);
		textEditor.clearText();
		System.out.println("Text is " + textEditor.text);
		textEditor.setText("saurabh");
		textEditor.undoText();
		System.out.println("Text is " + textEditor.text);
	}
}
