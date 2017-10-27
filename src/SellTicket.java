
public class SellTicket implements Runnable {
    private int ticketCount = 100;
    //Object mutex = new Object();
    public void sellTicket(){
        synchronized (this){
            if(ticketCount > 0){
                System.out.println(Thread.currentThread().getName()+"卖了第"+(100 - ticketCount+1)+"张票");
                ticketCount--;
            }
            else {
                System.out.println("sale out");
                return;
            }


        }
    }
    public void run(){
        while(ticketCount > 0){
            sellTicket();
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
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
