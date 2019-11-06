public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.off();
        hottub.cool();
        //hottub.bubblesOff();
    }
}