package proyectoentropía;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;
/**
 * @author al171800
 */
public class ProyectoEntropía
{
    public static void main(String[] args)
    {
        String n = null, name=null;
        int t,i = 0,contCOLUMNAS=0,contRENGLONES=0,h=0,j2,band,i1,i2,y,f,c1 = 0,b;//contCOLUMNAS=columnas,contRENGLONES=renglones,
        double H,e=0.5;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Hola, ingresa el nombre del archivo exactamente como lo encuentres en el explorador de archivos");
        name=entrada.nextLine();
        name=name+".csv";
        String ENCABEZADO[]; //encabezado
        String DATOS[][] = null; //todos los datos 
        String SIMBOLOS[][]=null;//simbolos diferentes
        AplicarFormula a=new AplicarFormula();
        
        try
        {   
            FileReader input=new FileReader(name);
            BufferedReader binput=new BufferedReader(input);
            n=binput.readLine();
            for(i=0;i<n.length();i++)
            {
                if(n.charAt(i)==',')
                {
                    contCOLUMNAS++;
                }
            }
            contCOLUMNAS++;
            ENCABEZADO=new String[contCOLUMNAS];
            for(i=0;i<contCOLUMNAS;i++)
            {
                ENCABEZADO[i]="";
            }
            i=0;
            
            for(h=0;h<n.length();h++)
            {
                if(n.charAt(h)!=',')
                {
                    ENCABEZADO[i]=ENCABEZADO[i]+n.charAt(h);
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
                    contRENGLONES=contRENGLONES-1;
                }
                else
                {
                     contRENGLONES++;
                   // System.out.println(""+n);
                }
                
            }
            DATOS= new String[contRENGLONES][contCOLUMNAS];
            binput.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nNo se pudo cargar el archivo\n");
        }
        try //AQUI VALE VERDOLAGA
        {
            FileReader input=new FileReader(name);
            BufferedReader binput=new BufferedReader(input);
            binput.readLine();
            for(t=0;t<contRENGLONES;t++)
            {
                for(h=0;h<contCOLUMNAS;h++)
                {
                    DATOS[t][h]="";
                }
            }
            for(t=0;t<contRENGLONES;t++)
            {
                n=binput.readLine();
                i=0;
                for(h=0;h<n.length()-1;h++)
                {
                    if(n.charAt(h)!=',')
                    {
                        DATOS[t][i]= DATOS[t][i]+n.charAt(h);
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }
        
        
        catch(IOException ex)
        {
            System.out.println("\nNo se pudo cargar el archivo\n");
        }
        
        
          
        /*if(cont>1)
                    {
                        d[i][0]=k[i1][0];
                    }
                    */
        //Recorrer el arreglo de datos
        i=1;
        H=a.Entropia(contCOLUMNAS, SIMBOLOS, DATOS, contRENGLONES, i);
        while(H>e)
        {
            H=H-a.Entropia(contCOLUMNAS, SIMBOLOS, DATOS, contRENGLONES, i);
            i++;
        }
        
    }   
}

/* 
El barbas se la come 
*/