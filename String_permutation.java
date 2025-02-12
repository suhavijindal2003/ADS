
public class String_permutation {
  
    public static void main(String[] args) {
        String s="abcd";
        System.out.println("permutation of "+s+" is: ");
        generate(s, "");
    }



    public static void generate(String s,String perm){
        if(s.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            String rem=s.substring(0, i)+s.substring(i+1);
            generate(rem, perm+ch);
        }
    }
}
//question 784,5