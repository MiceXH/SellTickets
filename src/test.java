/**
 * Created by mice on 2017/5/8.
 */
public class test {
    public static void main(String[] args){
        SellTicket runTicket = new SellTicket();
        Thread th1 = new Thread(runTicket,"1");
        Thread th2 = new Thread(runTicket,"2");
        Thread th3 = new Thread(runTicket,"3");
        Thread th4 = new Thread(runTicket,"4");
        Thread th5 = new Thread(runTicket,"5");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

    }
}
