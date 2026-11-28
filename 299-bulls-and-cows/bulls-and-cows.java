class Solution {
    public String getHint(String secret, String guess) {
        // StringBuffer sb1 = new StringBuffer(secret);
        // StringBuffer sb2 = new StringBuffer(guess);
        // int cb = 0, cc = 0, i = 0;
        // while(i<sb1.length()){
        //     if(sb1.charAt(i)==sb2.charAt(i)){
        //         cb++;
        //         sb1.deleteCharAt(i);
        //         sb2.deleteCharAt(i);
        //     }else{
        //         i++;
        //     }
        // }
        
        // if(sb1.length()!=0 || sb2.length()!=0){
        //     secret = sb1.toString();
        //     char c1[] = secret.toCharArray();
        //     Arrays.sort(c1);
        //     secret = new String(c1);

        //     guess = sb2.toString();
        //     c1 = guess.toCharArray();
        //     Arrays.sort(c1);
        //     guess = new String(c1);
        
        //     i=0;
        //     int j=0;
        //     while(i<secret.length() && j<guess.length()){
        //         if(secret.charAt(i)==guess.charAt(j)){
        //             cc++;
        //             i++;
        //             j++;
        //         }
        //         else if(secret.charAt(i)<guess.charAt(j)) i++;
        //         else j++;
        //     }
        // }
        // StringBuffer fin = new StringBuffer();
        // fin.append(cb);
        // fin.append("A");
        // fin.append(cc);
        // fin.append("B");
        // System.out.println(secret+" "+guess);
        // return fin.toString();
                int bulls=0;
        int[] freq1=new int[10];
        int[] freq2=new int[10];
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            freq1[secret.charAt(i)-48]++;
            freq2[guess.charAt(i)-48]++;
        }  
        int cows=0;  
        for(int i=0;i<freq1.length;i++){
            cows+=Math.min(freq1[i],freq2[i]);
        }
        cows=cows-bulls;

        return ""+bulls+"A"+cows+"B";
        

    }
}