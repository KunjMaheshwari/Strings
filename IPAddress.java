class Solution{
    public static boolean isValid(String parts){
        if(parts.length() > 15 || parts.length() < 7){
            return false;
        }

        String part[] = parts.split("\\.");

        if(part.length != 4){
            return false;
        }

        for(String p : part){
            if(p.isEmpty() || p.length() > 3){
                return false;
            }

            if(p.charAt(0) == '0' && p.length() > 1){
                return false;
            }

            for(char ch : p.toCharArray()){
                if(!Character.isDigit(ch)){
                    return false;
                }
            }

            int num = Integer.parseInt(p);

            if(num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }
}