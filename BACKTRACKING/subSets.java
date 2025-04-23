public class subSets {
    public static void FindSubsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;
        }
        FindSubsets(str, ans+str.charAt(i), i+1);
        FindSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        FindSubsets(str, "", 0);
    }
}
