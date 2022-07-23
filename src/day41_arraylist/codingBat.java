package day41_arraylist;

public class codingBat {
    public String withoutX2(String str) {
        String s="";
        char first=str.charAt(0);
        char second=str.charAt(1);
        if(str.length()>=2){

            if(first=='x'&&second=='x'){
                s+=str.substring(2);
            }else if(first=='x'&&second!='x'){
                s+=str.substring(1);
            }else if(first!='x'&&second=='x'){
                s+=str.charAt(0)+str.substring(2);
            }else if(first!='x'&&second!='x'){
                s+=str;
            }
        }else if(str.length()==1){
            if(first=='x'){
                s+="";
            }else if(first!='x'){
                s+=str;
            }
        }else{
            s+="";
        }
        return s;
    }


}



