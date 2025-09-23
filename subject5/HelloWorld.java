package subject5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class HelloWorld {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        
        System.out.println("이름을 입력하세요: ");
        String name = br.readLine();
        System.out.println("학번을 입력하세요: ");
        int stdnum = Integer.parseInt(br.readLine());

        System.out.println("<출력>");
        System.out.println("이름: " + name);
        System.out.println("학번: " + stdnum);

        bw.flush();
        bw.close();
        br.close();
    }
}
