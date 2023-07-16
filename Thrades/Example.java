class Example {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setPriority(Thread.MAX_PRIORITY);
        t.setName("Example");
        System.out.println(t);
    }
}
