class Solution {
    public int totalFruit(int[] f) {
        int l=0;
        int r=0;
        int max=0;
        int n=f.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(f[r],map.getOrDefault(f[r],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(f[l],map.get(f[l])-1);
                    if(map.get(f[l])==0){
                        map.remove(f[l]);
                    }
                    l++;
                }

            }

            if(map.size()<=2){
                max=Math.max(max,r-l+1);

            }
            r++;
        }
        return max;
    }
}