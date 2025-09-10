class Solution{
    public static int solve(String s){
        String temp = s+s;

        int idx = temp.indexOf(s, 1);

        if(idx != -1 && idx < s.length()){
            return 1;
        }

        return 0;
    }
}