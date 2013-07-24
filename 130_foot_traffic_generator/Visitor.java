public class Visitor {
    private boolean visiting;
    private int enterTime;
    private int exitTime;
    private int visitorNum;

    public Visitor(int num, int enterTime) {
        this.visiting = true;
        this.enterTime = enterTime;
        this.exitTime = 0;
        this.visitorNum = num;        
    }

    public boolean isVisiting() {
        return this.visiting;
    }
    
    public void setVisiting(boolean visitingStatus) {
        this.visiting = visitingStatus;
    }

    public int getEnterTime() {
        return this.enterTime;
    }
}
