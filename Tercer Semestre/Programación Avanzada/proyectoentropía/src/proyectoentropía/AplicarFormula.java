package proyectoentropía;

public class AplicarFormula
{
    private double max=0;
    private double sumatot;
    private double suma1;
    private double suma2;
    private int band;
    
    public double Entropia(int COLtot, String d[][], String k[][],int Renglotot,int simbolos)
    {
        for(int i=0;i<COLtot;i++)
        {
            sumatot=0;
            for(int i2=0;i2<Renglotot;i2++)
            {
                for(int i3=0;i3<simbolos;i3++)
                {
                    if(d[i3][i]==k[i2][i]) 
                    {
                        band=1;
                    }
                    else
                    {
                        band=0;
                    }
                    suma1=suma1+(band/Renglotot);
                }
                for(int i4=0;i4<simbolos;i4++)
                {
                    if(d[i4][i]==k[i4][i]) 
                    {
                        band=1;
                    }
                    else
                    {
                        band=0;
                    }
                    suma2=suma2+(band/Renglotot);
                }
                sumatot=sumatot+(suma1*(Math.log10(suma2) / Math.log10(2)));//tal vez sea base 2 
            }
            if(sumatot>max)
            {
                max=sumatot;
            }
        }
        return max;
    }
}