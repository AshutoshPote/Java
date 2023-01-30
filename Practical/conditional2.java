    public  class Nestedcondition {
      public  static  void main(String args[]) {
         int marks = 40;
         String res;
         if(marks==40){
            res = "Average";
         }else if(marks>40){
            res = "Above average";
         }else{
            res = "Below average";
         }       
        System.out.println(res);
      }
     }