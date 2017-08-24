

public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    
    public Libro(String tituloI, String autorI, int paginasI)
    {
        titulo=tituloI;
        autor=autorI;
        paginas=paginasI;
        numeroDeReferencia = "";
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
    public int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
        String cadDet = "";
        cadDet = cadDet +"Titulo:";
        cadDet = cadDet + titulo;
        cadDet = cadDet +",";
        cadDet = cadDet + "Autor:";
        cadDet = cadDet + autor;
        cadDet = cadDet +",";
        cadDet = cadDet + "Paginas:";
        cadDet = cadDet + paginas;
        cadDet = cadDet +",";
        cadDet = cadDet + "Numero de Referencia:";
        if(numeroDeReferencia.length()!=0)
        {
           cadDet = cadDet + numeroDeReferencia; 
        }
        else
        {
            cadDet = cadDet + "ZZZ";
        }
        cadDet = cadDet +".";
        return cadDet;
    }
    
    public void cambiaNumRef(String nuevaRef)
    {
        if(numeroDeReferencia.length()>2)
        {
            numeroDeReferencia = nuevaRef;
        }
    }
    
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
}
