package CommandPattern.Editor;

//First time I've ever extended an interface
interface UndoableCommand extends Command {
    void unexecute();
}
