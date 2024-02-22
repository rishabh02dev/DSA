class Solution {
    public int[] arrayRankTransform(int[] arr) {
         HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    int temp = 1;
    int brr[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      brr[i] = arr[i];
    }
    
    Arrays.sort(brr);
    for (int i = 0; i < arr.length; i++) {
      //if element is previously not store in the map
      if (mp.get(brr[i]) == null) {
        mp.put(brr[i], temp);
        temp++;
      }
    }

    for(int i =0 ; i<arr.length; i++){
        arr[i] = mp.get(arr[i]);
    }
    return arr;
    }
}