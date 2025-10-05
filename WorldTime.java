public class WorldTime{
    public static void main(String[ ]args){
   int utcHour=12;/*suppose UTC time is 12:00 noon*/
   System.out.println("San Francisco:"+(utcHour-7)+":00");
   System.out.println("New York:"+(utcHour-4)+":00");
   System.out.println("UTC:"+utcHour +":00");
   System.out.println("London:"+(utcHour+1)+":00");
   System.out.println("Dubai:"+(utcHour+4)+":00");
   System.out.println("Bangalore:"+(utcHour+5)+":30");
   System.out.println("Singapore:"+(utcHour+8)+":00");
   System.out.println("Tokyo"+(utcHour+9)+":00");
   System.out.println("Sydney:"+(utcHour+10)+":00");
   System.out.println("Wallington:"+(utcHour + 12)+":00");
     }
}
