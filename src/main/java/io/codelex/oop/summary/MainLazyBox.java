package io.codelex.oop.summary;

public class MainLazyBox {
    public static void main(String[] args) {

        LazyBox<Integer> box = new LazyBox<>(MainLazyBox::doLargeCalculation);
        printOutBoxContents(box);

        Integer result = 0;
        for (int i = 0; i < 10000; i++) {
            result = box.get();
        }
        System.out.println(result);

        LazyBox<String> textBox = box.map((Object::toString));
        LazyBox<String> upperTextBox = textBox.map(String::toUpperCase);

        String result2 = upperTextBox.get();
        System.out.println(result2);

    }

    public static Integer doLargeCalculation() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return 153;
    }

    public static <A> void printOutBoxContents(LazyBox<Integer> box) {
        System.out.println(box.get());
    }
}
