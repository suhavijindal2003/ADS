public class AbstractionByInterface {
    interface  abc{
        void ask();
        void run();
    }
    static class def implements abc{
        public void ask(){
            System.out.println("ask");
        }
        public void run(){
            System.out.println("run");
        }
    }
    public static void main(String[] args) {
        def d=new def();
        d.ask();
        d.run();
    }
}
