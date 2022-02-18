class Solution {
public String removeKdigits(String num, int k) {
StringBuilder str = new StringBuilder(num);
int min=Integer.MAX_VALUE;
String number= removedigits(str,0,k,k,min);
return number;
}
public static String removedigits(StringBuilder s, int start, int end,int k, int min){
String str="";
String originalStr=s;
if(end<=s.length()){
for(int i=start; i<k;i++){
s.deleteCharAt(i);
}
System.out.println("String "+s);
​
int num=Integer.parseInt(s.toString());
if(num<min)
min=num;
System.out.println(min);
removedigits(originalStr,start+1,end+1,k,min);
}
else{
str=String.valueOf(min);//Now it will return "10"
return str;
}
return str;
}
}