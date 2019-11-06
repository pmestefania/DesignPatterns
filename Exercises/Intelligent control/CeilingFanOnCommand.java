public class CeilingFanOnCommand implements Command {
    CeilingFan ceiling;
    
    public CeilingFanOnCommand(CeilingFan ceiling) {
        this.ceiling = ceiling;
    }

    public void execute() {
        ceiling.high();        
    }
}