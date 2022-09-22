public class Main {

    public static void main(String[] args) {

        printPartOfWord("København",1,4);
    }

    static void printPartOfWord(String x, int a, int b){

        System.out.println(x.substring(a,b+1));
    }

}