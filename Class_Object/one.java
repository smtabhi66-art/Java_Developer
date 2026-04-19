class Computer {

    public void playMusic() {
        System.out.println("Music Playing...");

    }

    public String getMeAPen(int money) {
        if (money >= 10) {
            return "Pen";
        }
        return "NOPE";
    }
    public int add(int n1,int n2){
        return n1+n2;
    }   
    
    // METHOD OVERLOADING
    
     public int add(double n1,double n2){
        return n1+n2;
    }


}

public class one {
    public static void main(String[] args) {

        int paisa = 10;
        Computer obj1 = new Computer();
        obj1.playMusic();

        String respond = obj1.getMeAPen(paisa);

        int result = obj1.add(4, 4);
        System.out.println(result);
        System.out.println(respond);

    }
}