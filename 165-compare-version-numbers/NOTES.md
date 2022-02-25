StringBuilder versionnew1= new StringBuilder(version1);
StringBuilder versionnew2= new StringBuilder(version2);
for(int i=1;i<versionnew1.length();i++){
if(versionnew1.charAt(i)=='0'){
versionnew1.deleteCharAt(i--);
}
for(int i=1;i<versionnew2.length();i++){
if(versionnew2.charAt(i)=='0')
versionnew2.deleteCharAt(i--);
}
System.out.println(versionnew1.toString().equals(versionnew2.toString()));
System.out.println(versionnew1);
System.out.println(versionnew2);
return versionnew1.toString().equals(versionnew2.toString()) ? 0: 1;