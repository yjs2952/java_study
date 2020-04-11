package ch03;

public class TemplateMethodImpl extends TemplateMethod {
    @Override
    protected void first() {
        System.out.println("첫번째");
    }

    @Override
    protected void second() {
        System.out.println("두번째");
    }

    @Override
    protected void third() {
        System.out.println("세번째");
    }
}
