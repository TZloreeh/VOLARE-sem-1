//thread R

public class R extends Thread {
  Semaphore sem1;
  Semaphore sem2;
  Semaphore sem3;
  Semaphore sem4;

  public R(Semaphore s1, Semaphore s2, Semaphore s3, Semaphore s4) {
    sem1 = s1;
    sem2 = s2;
    sem3 = s3;
    sem4 = s4;
  }

  @Override
  public void run() {
    sem1.P();
    System.out.println("o");
    sem2.V();
    sem4.P();
    System.out.println("e");
    sem4.V();
  }
}
