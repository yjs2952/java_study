package ch03;

public abstract class TemplateMethod {

    protected abstract void first();
    protected abstract void second();
    protected abstract void third();

    public String result() {
        first();
        second();
        third();
        return "";
    }
}
