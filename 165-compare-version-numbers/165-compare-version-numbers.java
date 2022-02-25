class Solution {
    public int compareVersion(String version1, String version2) {
        
            if(version1.equals(version2)) return 0;
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        for(; i < v1.length && i < v2.length; i++){
            if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[i])) return 1;
            else if(Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])) return -1;
        }
        if(v1.length == v2.length) return 0;
        String[] rest = v1.length > v2.length ? v1 : v2;
        for(; i < rest.length; i++){
            if(Integer.valueOf(rest[i]) > 0){
                if(v1.length > v2.length) return 1;
                else return -1;
            }
        }
        return 0;
    }
}
    
   