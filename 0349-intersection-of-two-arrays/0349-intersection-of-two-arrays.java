class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         
         ArrayList<Integer> list = new ArrayList<>() ;

        // convert one array into hashset , therefore it will have only unique elements
        HashSet<Integer> set = new HashSet<>() ;
        for( int i = 0 ; i < nums1.length ; i++){
            set.add(nums1[i]) ;
        }

        //ab ek array me unique element hai , to ham har unique element ko check karenge
        //dusre set se ki usme hai ya nhi.

        for(int i = 0 ; i < nums2.length ; i++){
            if( set.contains(nums2[i])){
                list.add(nums2[i]) ;
                set.remove(nums2[i]) ; // jo ek baar agaya use set se delete krdo taki repeat na ho
            }
        }

        //convert the list into array
        int[] ans = new int[list.size()] ; 
        for(int i= 0 ; i < list.size() ; i++){
            ans[i] = list.get(i) ;
        }

        return ans; 
    }
}