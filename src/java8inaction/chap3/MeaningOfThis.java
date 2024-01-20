package java8inaction.chap3;

public class MeaningOfThis {
    public final int value=4;
    public static void main(String[] args) {
        MeaningOfThis meaningOfThis = new MeaningOfThis();
        meaningOfThis.doIt();
    }

    private void doIt() {
        int value = 6;
        Runnable runnable = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value= 10;
                System.out.println(this.value);
            }
        };
        runnable.run();

        Runnable runnable1 = () -> {
            System.out.println("Hello world runnable 1");
        };
        runnable1.run();

        new Thread(()-> {
            System.out.println("Hello world from thread");
        })
        .start();

        Runnable lambdaRunnable = () ->{
            System.out.println("Hello world from Runnable ");
        };
        lambdaRunnable.run();
    }
}
