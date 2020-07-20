package media;

public class Television {
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = false;
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    
}
