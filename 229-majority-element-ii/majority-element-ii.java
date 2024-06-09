class Solution {
    public List<Integer> majorityElement(int[] v) {
        List<Integer> ls  = new ArrayList<>();
        
        //sbse phle majority element more than n/2 vala logic apply karengee
        int n = v.length;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt1 = 0, cnt2 = 0;

        for(int i=0; i<n; i++){
            if(cnt1==0 && ele2!=v[i]){
                cnt1 = 1;
                ele1 = v[i];
            }
            else if(cnt2==0 && ele1!=v[i]){
                cnt2 = 1;
                ele2 = v[i];
            }
            else if(v[i]==ele1) cnt1++;
            else if(v[i]==ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }

        //now we are manually checking the ele1 and ele2

        cnt1 = 0 ; cnt2 = 0 ;
        for(int i=0; i<n; i++){
            if(v[i]==ele1) cnt1++;
            if(v[i]==ele2) cnt2++;
        }

        int mini = (int)(n/3) +1;
        if(cnt1>=mini) ls.add(ele1);
        if(cnt2>=mini) ls.add(ele2);

        return ls;
    }
}