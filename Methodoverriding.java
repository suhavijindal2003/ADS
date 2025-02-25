public class Methodoverriding {
    public static void main(String[] args) {
        abc a=new abc();
        abc d=new def();
        a.baatein();
        d.baatein();
        a.good();
        d.good();
    }
}
class abc{
    void baatein(){
        System.out.println("I Don't talk");
    }
    void  good(){
        System.out.println("I am Good!");
    }
}
class def extends  abc{
    @Override
    void baatein(){
        System.out.println("I talk");
    }
    @Override
    void  good(){
        System.out.println("I am Good");
    }
}
