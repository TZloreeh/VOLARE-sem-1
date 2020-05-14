//main exec

class Main {
  public static void main(String[] args) {
    Semaphore sem1 = new Semaphore(0);
    Semaphore sem2 = new Semaphore(0);
    Semaphore sem3 = new Semaphore(0);
    Semaphore sem4 = new Semaphore(0);

    //init thread 
    Thread P = new P(sem1, sem2, sem3, sem  4);
    Thread Q = new Q(sem1, sem2, sem3, sem4);
    Thread R = new R(sem1, sem2, sem3, sem4);

    //starting thread 
    P.start();
    Q.start();
    R.start();
  }
}
