import java.util.Scanner;
public class B3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ac=0;
        int ec=0;
        int ic=0;
        int oc=0;
        int uc=0;
       while(true){
        System.out.print("Enter Sen:");
        String s = sc.nextLine();
       
        if(s.equalsIgnoreCase("quit")){
            break;
        }
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            switch (ch) {
                case 'a','A': ac++;
                        break;
                case 'e','E':ec++;
                break;
                case 'i','I':ic++;
                break;
                case 'o','O':oc++;
                break;
                case 'u','U':uc++;
                break;
            
            }
            // if(ch=='A' || ch=='a'){
            //     ac++;
            // }
            // if(ch=='E' || ch=='e'){
            //     ec++;
            // }
            // if(ch=='I' || ch=='i'){
            //     ic++;
            // }
            // if(ch=='O' || ch=='o'){
            //     oc++;
            // }
            // if(ch=='U' || ch=='u'){
            //     uc++;
            // }
        }
       }
       System.out.println("A count:"+ac+"  "+"E count:"+ec+"  "+"I count:"+ic+"  "+"O count:"+oc+"  "+"U count:"+uc);
       sc.close();
    }
}