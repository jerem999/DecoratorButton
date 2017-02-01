public abstract class WindowDecorator implements WindowInterface{
    protected TestButton button;
    public WindowDecorator(TestButton button){
        this.button = button;
    }

    @Override
    public TestButton get() {
        return this.button;
    }
}
