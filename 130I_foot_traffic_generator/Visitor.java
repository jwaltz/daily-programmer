public class Visitor {

    private int enterTime;
    private int visitorNum;

    public Visitor(int num, int enterTime) {
        this.enterTime = enterTime;
        this.visitorNum = num;        
    }

    public int getNum() {
        return this.visitorNum;
    }

    public int getEnterTime() {
        return this.enterTime;
    }
}
