public class CeilingFanOffCommand implements Command {
    CeilingFan ceiling;
    
    public CeilingFanOffCommand(CeilingFan ceiling) {
        this.ceiling = ceiling;
    }

    public void execute() {
        ceiling.off();        
    }
}