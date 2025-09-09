class Solution{
    public static boolean isRotation(String s1, String s2){
        int n = s1.length();

        if(s1 == null || s2 == null){
            return true;
        }

        if(n != s2.length()){
            return false;
        }

        if(n <= 2){
            return true;
        }

        String leftPart = s1.substring(2) + s1.substring(0,2);
        String rightPart = s1.substring(n-2) + s1.substring(0, n-2);

        return s2.equals(leftPart) || s2.equals(rightPart);
    }
}