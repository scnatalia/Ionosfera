package proyectoentropía;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 * @author al171800
 */
public class ProyectoEntropía
{
    public static void main(String[] args)
    {
        String n = null;
        int t,i,cont=0,cont2=0,h=0;
        Scanner entrada=new Scanner(System.in);
        try
        {   
            FileReader input=new FileReader("BBDD.csv");
            BufferedReader binput=new BufferedReader(input);
            n=binput.readLine();
            for(i=0;i<n.length();i++)
            {
                if(n.charAt(i)==',')
                {
                    cont++;
                }
            }
            cont++;
            String j[]=new String[cont];
            for(i=0;i<cont;i++)
            {
                j[i]="";
            }
            i=0;
            for(h=0;h<n.length();h++)
            {
                if(n.charAt(h)!=',')
                {
                    j[i]=j[i]+n.charAt(h);
                }
                else
                {
                    i++;
                }
            }
            while(n!=null)
            {
                 n=binput.readLine();
                if (n==null)
                {
                    cont2=cont2-1;
                }
                else
                {
                     cont2++;
                   // System.out.println(" "+n);
                }
              
            }
            String k[][]=new String[cont2][cont]; 
            binput.close();
        }
        catch(IOException e)
        {
            System.out.println("\nNo se pudo cargar el archivo\n");
        }   
        System.out.println(""+cont2);
    }
    
}
