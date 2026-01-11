class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb= new StringBuilder();
        while(columnNumber > 0){
            int x=columnNumber%26;
            if(x==0){
                x=26;
                columnNumber-=x;
            }else columnNumber-=x;
            sb.append((char)(x-1+'A'));
            columnNumber=columnNumber/26;
        }
        return sb.reverse().toString();
    }
}