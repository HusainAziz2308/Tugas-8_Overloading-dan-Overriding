
public class TesTugas1{
    public int average(int a, int b) {
        return (a + b) / 2;
    }
    
    public double average(double a, double b) {
        return (a + b) / 2;
    }
    
    public int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    public static void main(String args[]){
        TesTugas1 rn = new TesTugas1();
        System.out.println("Rerata nilai 21 dan 13 adalah : " + rn.average(21, 13));
        System.out.println("Rerata nilai 19.3 dan 39.5 adalah : " + rn.average(19.3, 39.5));
        System.out.println("Rerata nilai 123, 567 dan 744 adalah : " + rn.average(123, 567, 744));
    }
}

