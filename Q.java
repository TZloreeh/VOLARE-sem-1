//thread Q

public class Q extends Thread {
  Semaphore sem1;
  Semaphore sem2;
  Semaphore sem3;
  Semaphore sem4;

  public Q(Semaphore s1, Semaphore s2, Semaphore s3, Semaphore s4) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
  }

  @Override
  public void run() {
    sem3.P();
    System.out.println("a");
    System.out.println("r");
    sem4.V();
  }
}
