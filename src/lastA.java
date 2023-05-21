public class lastA {
    public static void main(String[] args) {
        char[] word= {'a','n','d','a','l','u','z','j','a'};
        for (int i = word.length-1; i >=0 ; i--) {
            if(word[i] =='a'){
                System.out.println("Ostatnia litera A jest pod indeksem [0]["+i+"]");
                break;
            }

        }

    }
}