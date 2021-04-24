public class ReadingProblem{
    public static void main(String[] args) {
        Boolean reading = false;
        int ans = 0;
        for(int i=0; i<100000000; i++){
            if(reading){
                if(Math.random() >= 0.7){
                    ans+=1;
                }
                else{
                    reading = false;
                }
            }
            else{
                if(Math.random() >= 0.5){
                    ans+=1;
                    reading = true;
                }
            }
        
        }
        System.out.println(ans);
    }
}