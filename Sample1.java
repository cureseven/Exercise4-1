import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Human
{
 int h;
 int w;
 void show() {
  System.out.println("BMIは"+(w/((h*0.01)*(h*0.01)))+"です。");
 }
}
public class Sample1{
 public static void main(String[] args)  throws IOException{
  Human h = new Human();
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  System.out.println("身長[cm]を入力してください。");
  h.h = Integer.parseInt(br.readLine());
  System.out.println("体重[kg]を入力してください。");
  h.w = Integer.parseInt(br.readLine());
//   System.out.println(h.h); 
//   System.out.println(h.w); 
//   System.out.println(h.w/(h.h*0.01)*(h.h*0.01)); 

  h.show(); 
  }
}