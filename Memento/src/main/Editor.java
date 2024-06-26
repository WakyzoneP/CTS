package main;
import java.util.Deque;
import java.util.LinkedList;

import main.TextArea.Memento;

class Editor {
    private Deque<Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        stateHistory.push(textArea.save());
        textArea.set(text);
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }

    public void printText() {
        System.out.println(textArea);
    }
}
