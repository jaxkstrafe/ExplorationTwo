
public class BruteForce {

    public int BruteForceNearlyIdentical(int[] a){

        int longest = 0;

        for(int i = 0; i < a.length; i++){
            int count = 0;
            boolean nextPresent = false;

            for(int j = 0; j < a.length; j++){
                if(a[j] == a[i]){
                    count++;
                    nextPresent = true;
                }
                else if (a[j] + 1 == a[i]){
                    count++;
                    nextPresent = true;
                }
            }

            if(nextPresent){
                longest = Math.max(count, longest);
            }
        }

        return longest;

    }
}