package BitManipulation;

class FirstLetterAppearTwice {
    public static void main(String[] args) {
        String s = "abcdd";

        int mask = 0;
        for(char c: s.toCharArray()){
            int bit = 1<< c-'a';
            if((mask&bit) !=0){
                System.out.println(c);
                break;
            }
            mask |= bit;
        }


        // Set<Character> set = new HashSet<>();
        // for(char c: s.toCharArray()){
        //     if(set.contains(c)){
        //         System.out.println(c);
        //         break;
        //     }
        //     set.add(c);
        // }
    }

}
