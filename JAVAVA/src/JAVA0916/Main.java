package JAVA0916;

import java.util.*;
import javax.swing.text.AbstractDocument.BranchElement;
import java.io.*;
 
public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine()); //�����Է� 
        int [][] arr =new int [n][2];
        int [] ranking  =new int[n];
       
        for(int i=0;i<n;i++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            ranking[i]=1;
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
                    ranking[i]++;
                }
            }
        }
        for(int i=0;i<n;i++) {
            bw.write(ranking[i]+" ");
        }
        bw.flush();
        bw.close();
    }
}
