import java.util.Arrays;

public class course {
    public static void main(String[] args) {
        byte [] massiv=new byte[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        byte  a=0;
        byte n=0;
        byte [] masiv=new byte[3];
        for (int i=massiv.length-1;i>=0;i--){
            a=massiv[i];
            masiv[n]=massiv[i];
            n+=1;
            //System.out.println(masiv[i]);
        }

        System.out.println(Arrays.toString(masiv));

    }
}
