class MyParrent {
    int x, y;
    
    MyParrent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addMe(int x, int y) {
        return this.x + x + this.y + y;
    }
p
    public int addMe(MyParrent myPar) {
        return addMe(myPar.x, myPar.y);
    }
}

class MyChild extends MyParrent {
    int z;

    MyChild(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    public int addMe(int x, int y, int z) {
        return this.x + x + this.y + y + this.z + z;
    }

    public int addMe(MyChild myChi) {
        return addMe(myChi.x, myChi.y, myChi.z);
    }

    public int addMe(int x, int y) {
        return this.x + x + this.y + y;
    }
}

public class MySomeOne {
    public static void main(String[] args) {
        MyChild myChi = new MyChild(10, 20, 30);
        MyParrent myPar = new MyParrent(10, 20);

        int x = myChi.addMe(10, 20, 30);
        int y = myChi.addMe(myChi);
        int z = myPar.addMe(myPar);

        System.out.println(x + y + z);
    }
}
